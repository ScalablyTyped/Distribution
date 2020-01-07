package typings.googleapis.buildSrcApisStorageV1beta2Mod.storage_v1beta2

import typings.gaxios.buildSrcCommonMod.GaxiosPromise
import typings.googleapisDashCommon.buildSrcApiMod.APIRequestContext
import typings.googleapisDashCommon.buildSrcApiMod.BodyResponseCallback
import typings.googleapisDashCommon.buildSrcApiMod.MethodOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("googleapis/build/src/apis/storage/v1beta2", "storage_v1beta2.Resource$Objects")
@js.native
class Resource$Objects protected () extends js.Object {
  def this(context: APIRequestContext) = this()
  var context: APIRequestContext = js.native
  /**
    * storage.objects.compose
    * @desc Concatenates a list of existing objects into a new object in the
    * same bucket.
    * @alias storage.objects.compose
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.destinationBucket Name of the bucket containing the source objects. The destination object is stored in this bucket.
    * @param {string} params.destinationObject Name of the new object.
    * @param {string=} params.ifGenerationMatch Makes the operation conditional on whether the object's current generation matches the given value.
    * @param {string=} params.ifMetagenerationMatch Makes the operation conditional on whether the object's current metageneration matches the given value.
    * @param {().ComposeRequest} params.resource Request body data
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def compose(): GaxiosPromise[Schema$Object] = js.native
  def compose(callback: BodyResponseCallback[Schema$Object]): Unit = js.native
  def compose(params: ParamsDollarResourceDollarObjectsDollarCompose): GaxiosPromise[Schema$Object] = js.native
  def compose(
    params: ParamsDollarResourceDollarObjectsDollarCompose,
    callback: BodyResponseCallback[Schema$Object]
  ): Unit = js.native
  def compose(
    params: ParamsDollarResourceDollarObjectsDollarCompose,
    options: BodyResponseCallback[Schema$Object],
    callback: BodyResponseCallback[Schema$Object]
  ): Unit = js.native
  def compose(params: ParamsDollarResourceDollarObjectsDollarCompose, options: MethodOptions): GaxiosPromise[Schema$Object] = js.native
  def compose(
    params: ParamsDollarResourceDollarObjectsDollarCompose,
    options: MethodOptions,
    callback: BodyResponseCallback[Schema$Object]
  ): Unit = js.native
  /**
    * storage.objects.copy
    * @desc Copies an object to a destination in the same location. Optionally
    * overrides metadata.
    * @alias storage.objects.copy
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.destinationBucket Name of the bucket in which to store the new object. Overrides the provided object metadata's bucket value, if any.
    * @param {string} params.destinationObject Name of the new object. Required when the object metadata is not otherwise provided. Overrides the object metadata's name value, if any.
    * @param {string=} params.ifGenerationMatch Makes the operation conditional on whether the destination object's current generation matches the given value.
    * @param {string=} params.ifGenerationNotMatch Makes the operation conditional on whether the destination object's current generation does not match the given value.
    * @param {string=} params.ifMetagenerationMatch Makes the operation conditional on whether the destination object's current metageneration matches the given value.
    * @param {string=} params.ifMetagenerationNotMatch Makes the operation conditional on whether the destination object's current metageneration does not match the given value.
    * @param {string=} params.ifSourceGenerationMatch Makes the operation conditional on whether the source object's generation matches the given value.
    * @param {string=} params.ifSourceGenerationNotMatch Makes the operation conditional on whether the source object's generation does not match the given value.
    * @param {string=} params.ifSourceMetagenerationMatch Makes the operation conditional on whether the source object's current metageneration matches the given value.
    * @param {string=} params.ifSourceMetagenerationNotMatch Makes the operation conditional on whether the source object's current metageneration does not match the given value.
    * @param {string=} params.projection Set of properties to return. Defaults to noAcl, unless the object resource specifies the acl property, when it defaults to full.
    * @param {string} params.sourceBucket Name of the bucket in which to find the source object.
    * @param {string=} params.sourceGeneration If present, selects a specific revision of the source object (as opposed to the latest version, the default).
    * @param {string} params.sourceObject Name of the source object.
    * @param {().Object} params.resource Request body data
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def copy(): GaxiosPromise[Schema$Object] = js.native
  def copy(callback: BodyResponseCallback[Schema$Object]): Unit = js.native
  def copy(params: ParamsDollarResourceDollarObjectsDollarCopy): GaxiosPromise[Schema$Object] = js.native
  def copy(params: ParamsDollarResourceDollarObjectsDollarCopy, callback: BodyResponseCallback[Schema$Object]): Unit = js.native
  def copy(
    params: ParamsDollarResourceDollarObjectsDollarCopy,
    options: BodyResponseCallback[Schema$Object],
    callback: BodyResponseCallback[Schema$Object]
  ): Unit = js.native
  def copy(params: ParamsDollarResourceDollarObjectsDollarCopy, options: MethodOptions): GaxiosPromise[Schema$Object] = js.native
  def copy(
    params: ParamsDollarResourceDollarObjectsDollarCopy,
    options: MethodOptions,
    callback: BodyResponseCallback[Schema$Object]
  ): Unit = js.native
  /**
    * storage.objects.delete
    * @desc Deletes data blobs and associated metadata. Deletions are permanent
    * if versioning is not enabled for the bucket, or if the generation
    * parameter is used.
    * @alias storage.objects.delete
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.bucket Name of the bucket in which the object resides.
    * @param {string=} params.generation If present, permanently deletes a specific revision of this object (as opposed to the latest version, the default).
    * @param {string=} params.ifGenerationMatch Makes the operation conditional on whether the object's current generation matches the given value.
    * @param {string=} params.ifGenerationNotMatch Makes the operation conditional on whether the object's current generation does not match the given value.
    * @param {string=} params.ifMetagenerationMatch Makes the operation conditional on whether the object's current metageneration matches the given value.
    * @param {string=} params.ifMetagenerationNotMatch Makes the operation conditional on whether the object's current metageneration does not match the given value.
    * @param {string} params.object Name of the object.
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def delete(): GaxiosPromise[Unit] = js.native
  def delete(callback: BodyResponseCallback[Unit]): Unit = js.native
  def delete(params: ParamsDollarResourceDollarObjectsDollarDelete): GaxiosPromise[Unit] = js.native
  def delete(params: ParamsDollarResourceDollarObjectsDollarDelete, callback: BodyResponseCallback[Unit]): Unit = js.native
  def delete(
    params: ParamsDollarResourceDollarObjectsDollarDelete,
    options: BodyResponseCallback[Unit],
    callback: BodyResponseCallback[Unit]
  ): Unit = js.native
  def delete(params: ParamsDollarResourceDollarObjectsDollarDelete, options: MethodOptions): GaxiosPromise[Unit] = js.native
  def delete(
    params: ParamsDollarResourceDollarObjectsDollarDelete,
    options: MethodOptions,
    callback: BodyResponseCallback[Unit]
  ): Unit = js.native
  /**
    * storage.objects.get
    * @desc Retrieves objects or their associated metadata.
    * @alias storage.objects.get
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.bucket Name of the bucket in which the object resides.
    * @param {string=} params.generation If present, selects a specific revision of this object (as opposed to the latest version, the default).
    * @param {string=} params.ifGenerationMatch Makes the operation conditional on whether the object's generation matches the given value.
    * @param {string=} params.ifGenerationNotMatch Makes the operation conditional on whether the object's generation does not match the given value.
    * @param {string=} params.ifMetagenerationMatch Makes the operation conditional on whether the object's current metageneration matches the given value.
    * @param {string=} params.ifMetagenerationNotMatch Makes the operation conditional on whether the object's current metageneration does not match the given value.
    * @param {string} params.object Name of the object.
    * @param {string=} params.projection Set of properties to return. Defaults to noAcl.
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def get(): GaxiosPromise[Schema$Object] = js.native
  def get(callback: BodyResponseCallback[Schema$Object]): Unit = js.native
  def get(params: ParamsDollarResourceDollarObjectsDollarGet): GaxiosPromise[Schema$Object] = js.native
  def get(params: ParamsDollarResourceDollarObjectsDollarGet, callback: BodyResponseCallback[Schema$Object]): Unit = js.native
  def get(
    params: ParamsDollarResourceDollarObjectsDollarGet,
    options: BodyResponseCallback[Schema$Object],
    callback: BodyResponseCallback[Schema$Object]
  ): Unit = js.native
  def get(params: ParamsDollarResourceDollarObjectsDollarGet, options: MethodOptions): GaxiosPromise[Schema$Object] = js.native
  def get(
    params: ParamsDollarResourceDollarObjectsDollarGet,
    options: MethodOptions,
    callback: BodyResponseCallback[Schema$Object]
  ): Unit = js.native
  /**
    * storage.objects.insert
    * @desc Stores new data blobs and associated metadata.
    * @alias storage.objects.insert
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.bucket Name of the bucket in which to store the new object. Overrides the provided object metadata's bucket value, if any.
    * @param {string=} params.ifGenerationMatch Makes the operation conditional on whether the object's current generation matches the given value.
    * @param {string=} params.ifGenerationNotMatch Makes the operation conditional on whether the object's current generation does not match the given value.
    * @param {string=} params.ifMetagenerationMatch Makes the operation conditional on whether the object's current metageneration matches the given value.
    * @param {string=} params.ifMetagenerationNotMatch Makes the operation conditional on whether the object's current metageneration does not match the given value.
    * @param {string=} params.name Name of the object. Required when the object metadata is not otherwise provided. Overrides the object metadata's name value, if any.
    * @param {string=} params.projection Set of properties to return. Defaults to noAcl, unless the object resource specifies the acl property, when it defaults to full.
    * @param  {object} params.resource Media resource metadata
    * @param {object} params.media Media object
    * @param {string} params.media.mimeType Media mime-type
    * @param {string|object} params.media.body Media body contents
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def insert(): GaxiosPromise[Schema$Object] = js.native
  def insert(callback: BodyResponseCallback[Schema$Object]): Unit = js.native
  def insert(params: ParamsDollarResourceDollarObjectsDollarInsert): GaxiosPromise[Schema$Object] = js.native
  def insert(
    params: ParamsDollarResourceDollarObjectsDollarInsert,
    callback: BodyResponseCallback[Schema$Object]
  ): Unit = js.native
  def insert(
    params: ParamsDollarResourceDollarObjectsDollarInsert,
    options: BodyResponseCallback[Schema$Object],
    callback: BodyResponseCallback[Schema$Object]
  ): Unit = js.native
  def insert(params: ParamsDollarResourceDollarObjectsDollarInsert, options: MethodOptions): GaxiosPromise[Schema$Object] = js.native
  def insert(
    params: ParamsDollarResourceDollarObjectsDollarInsert,
    options: MethodOptions,
    callback: BodyResponseCallback[Schema$Object]
  ): Unit = js.native
  /**
    * storage.objects.list
    * @desc Retrieves a list of objects matching the criteria.
    * @alias storage.objects.list
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.bucket Name of the bucket in which to look for objects.
    * @param {string=} params.delimiter Returns results in a directory-like mode. items will contain only objects whose names, aside from the prefix, do not contain delimiter. Objects whose names, aside from the prefix, contain delimiter will have their name, truncated after the delimiter, returned in prefixes. Duplicate prefixes are omitted.
    * @param {integer=} params.maxResults Maximum number of items plus prefixes to return. As duplicate prefixes are omitted, fewer total results may be returned than requested.
    * @param {string=} params.pageToken A previously-returned page token representing part of the larger set of results to view.
    * @param {string=} params.prefix Filter results to objects whose names begin with this prefix.
    * @param {string=} params.projection Set of properties to return. Defaults to noAcl.
    * @param {boolean=} params.versions If true, lists all versions of a file as distinct results.
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def list(): GaxiosPromise[Schema$Objects] = js.native
  def list(callback: BodyResponseCallback[Schema$Objects]): Unit = js.native
  def list(params: ParamsDollarResourceDollarObjectsDollarList): GaxiosPromise[Schema$Objects] = js.native
  def list(
    params: ParamsDollarResourceDollarObjectsDollarList,
    callback: BodyResponseCallback[Schema$Objects]
  ): Unit = js.native
  def list(
    params: ParamsDollarResourceDollarObjectsDollarList,
    options: BodyResponseCallback[Schema$Objects],
    callback: BodyResponseCallback[Schema$Objects]
  ): Unit = js.native
  def list(params: ParamsDollarResourceDollarObjectsDollarList, options: MethodOptions): GaxiosPromise[Schema$Objects] = js.native
  def list(
    params: ParamsDollarResourceDollarObjectsDollarList,
    options: MethodOptions,
    callback: BodyResponseCallback[Schema$Objects]
  ): Unit = js.native
  /**
    * storage.objects.patch
    * @desc Updates a data blob's associated metadata. This method supports
    * patch semantics.
    * @alias storage.objects.patch
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.bucket Name of the bucket in which the object resides.
    * @param {string=} params.generation If present, selects a specific revision of this object (as opposed to the latest version, the default).
    * @param {string=} params.ifGenerationMatch Makes the operation conditional on whether the object's current generation matches the given value.
    * @param {string=} params.ifGenerationNotMatch Makes the operation conditional on whether the object's current generation does not match the given value.
    * @param {string=} params.ifMetagenerationMatch Makes the operation conditional on whether the object's current metageneration matches the given value.
    * @param {string=} params.ifMetagenerationNotMatch Makes the operation conditional on whether the object's current metageneration does not match the given value.
    * @param {string} params.object Name of the object.
    * @param {string=} params.projection Set of properties to return. Defaults to full.
    * @param {().Object} params.resource Request body data
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def patch(): GaxiosPromise[Schema$Object] = js.native
  def patch(callback: BodyResponseCallback[Schema$Object]): Unit = js.native
  def patch(params: ParamsDollarResourceDollarObjectsDollarPatch): GaxiosPromise[Schema$Object] = js.native
  def patch(
    params: ParamsDollarResourceDollarObjectsDollarPatch,
    callback: BodyResponseCallback[Schema$Object]
  ): Unit = js.native
  def patch(
    params: ParamsDollarResourceDollarObjectsDollarPatch,
    options: BodyResponseCallback[Schema$Object],
    callback: BodyResponseCallback[Schema$Object]
  ): Unit = js.native
  def patch(params: ParamsDollarResourceDollarObjectsDollarPatch, options: MethodOptions): GaxiosPromise[Schema$Object] = js.native
  def patch(
    params: ParamsDollarResourceDollarObjectsDollarPatch,
    options: MethodOptions,
    callback: BodyResponseCallback[Schema$Object]
  ): Unit = js.native
  /**
    * storage.objects.update
    * @desc Updates a data blob's associated metadata.
    * @alias storage.objects.update
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.bucket Name of the bucket in which the object resides.
    * @param {string=} params.generation If present, selects a specific revision of this object (as opposed to the latest version, the default).
    * @param {string=} params.ifGenerationMatch Makes the operation conditional on whether the object's current generation matches the given value.
    * @param {string=} params.ifGenerationNotMatch Makes the operation conditional on whether the object's current generation does not match the given value.
    * @param {string=} params.ifMetagenerationMatch Makes the operation conditional on whether the object's current metageneration matches the given value.
    * @param {string=} params.ifMetagenerationNotMatch Makes the operation conditional on whether the object's current metageneration does not match the given value.
    * @param {string} params.object Name of the object.
    * @param {string=} params.projection Set of properties to return. Defaults to full.
    * @param {().Object} params.resource Request body data
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def update(): GaxiosPromise[Schema$Object] = js.native
  def update(callback: BodyResponseCallback[Schema$Object]): Unit = js.native
  def update(params: ParamsDollarResourceDollarObjectsDollarUpdate): GaxiosPromise[Schema$Object] = js.native
  def update(
    params: ParamsDollarResourceDollarObjectsDollarUpdate,
    callback: BodyResponseCallback[Schema$Object]
  ): Unit = js.native
  def update(
    params: ParamsDollarResourceDollarObjectsDollarUpdate,
    options: BodyResponseCallback[Schema$Object],
    callback: BodyResponseCallback[Schema$Object]
  ): Unit = js.native
  def update(params: ParamsDollarResourceDollarObjectsDollarUpdate, options: MethodOptions): GaxiosPromise[Schema$Object] = js.native
  def update(
    params: ParamsDollarResourceDollarObjectsDollarUpdate,
    options: MethodOptions,
    callback: BodyResponseCallback[Schema$Object]
  ): Unit = js.native
  /**
    * storage.objects.watchAll
    * @desc Watch for changes on all objects in a bucket.
    * @alias storage.objects.watchAll
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.bucket Name of the bucket in which to look for objects.
    * @param {string=} params.delimiter Returns results in a directory-like mode. items will contain only objects whose names, aside from the prefix, do not contain delimiter. Objects whose names, aside from the prefix, contain delimiter will have their name, truncated after the delimiter, returned in prefixes. Duplicate prefixes are omitted.
    * @param {integer=} params.maxResults Maximum number of items plus prefixes to return. As duplicate prefixes are omitted, fewer total results may be returned than requested.
    * @param {string=} params.pageToken A previously-returned page token representing part of the larger set of results to view.
    * @param {string=} params.prefix Filter results to objects whose names begin with this prefix.
    * @param {string=} params.projection Set of properties to return. Defaults to noAcl.
    * @param {boolean=} params.versions If true, lists all versions of a file as distinct results.
    * @param {().Channel} params.resource Request body data
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def watchAll(): GaxiosPromise[Schema$Channel] = js.native
  def watchAll(callback: BodyResponseCallback[Schema$Channel]): Unit = js.native
  def watchAll(params: ParamsDollarResourceDollarObjectsDollarWatchall): GaxiosPromise[Schema$Channel] = js.native
  def watchAll(
    params: ParamsDollarResourceDollarObjectsDollarWatchall,
    callback: BodyResponseCallback[Schema$Channel]
  ): Unit = js.native
  def watchAll(
    params: ParamsDollarResourceDollarObjectsDollarWatchall,
    options: BodyResponseCallback[Schema$Channel],
    callback: BodyResponseCallback[Schema$Channel]
  ): Unit = js.native
  def watchAll(params: ParamsDollarResourceDollarObjectsDollarWatchall, options: MethodOptions): GaxiosPromise[Schema$Channel] = js.native
  def watchAll(
    params: ParamsDollarResourceDollarObjectsDollarWatchall,
    options: MethodOptions,
    callback: BodyResponseCallback[Schema$Channel]
  ): Unit = js.native
}

