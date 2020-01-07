package typings.googleapis.buildSrcApisStorageV1beta2Mod.storage_v1beta2

import typings.gaxios.buildSrcCommonMod.GaxiosPromise
import typings.googleapisDashCommon.buildSrcApiMod.APIRequestContext
import typings.googleapisDashCommon.buildSrcApiMod.BodyResponseCallback
import typings.googleapisDashCommon.buildSrcApiMod.MethodOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("googleapis/build/src/apis/storage/v1beta2", "storage_v1beta2.Resource$Buckets")
@js.native
class Resource$Buckets protected () extends js.Object {
  def this(context: APIRequestContext) = this()
  var context: APIRequestContext = js.native
  /**
    * storage.buckets.delete
    * @desc Permanently deletes an empty bucket.
    * @alias storage.buckets.delete
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.bucket Name of a bucket.
    * @param {string=} params.ifMetagenerationMatch Makes the return of the bucket metadata conditional on whether the bucket's current metageneration matches the given value.
    * @param {string=} params.ifMetagenerationNotMatch Makes the return of the bucket metadata conditional on whether the bucket's current metageneration does not match the given value.
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def delete(): GaxiosPromise[Unit] = js.native
  def delete(callback: BodyResponseCallback[Unit]): Unit = js.native
  def delete(params: ParamsDollarResourceDollarBucketsDollarDelete): GaxiosPromise[Unit] = js.native
  def delete(params: ParamsDollarResourceDollarBucketsDollarDelete, callback: BodyResponseCallback[Unit]): Unit = js.native
  def delete(
    params: ParamsDollarResourceDollarBucketsDollarDelete,
    options: BodyResponseCallback[Unit],
    callback: BodyResponseCallback[Unit]
  ): Unit = js.native
  def delete(params: ParamsDollarResourceDollarBucketsDollarDelete, options: MethodOptions): GaxiosPromise[Unit] = js.native
  def delete(
    params: ParamsDollarResourceDollarBucketsDollarDelete,
    options: MethodOptions,
    callback: BodyResponseCallback[Unit]
  ): Unit = js.native
  /**
    * storage.buckets.get
    * @desc Returns metadata for the specified bucket.
    * @alias storage.buckets.get
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.bucket Name of a bucket.
    * @param {string=} params.ifMetagenerationMatch Makes the return of the bucket metadata conditional on whether the bucket's current metageneration matches the given value.
    * @param {string=} params.ifMetagenerationNotMatch Makes the return of the bucket metadata conditional on whether the bucket's current metageneration does not match the given value.
    * @param {string=} params.projection Set of properties to return. Defaults to noAcl.
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def get(): GaxiosPromise[Schema$Bucket] = js.native
  def get(callback: BodyResponseCallback[Schema$Bucket]): Unit = js.native
  def get(params: ParamsDollarResourceDollarBucketsDollarGet): GaxiosPromise[Schema$Bucket] = js.native
  def get(params: ParamsDollarResourceDollarBucketsDollarGet, callback: BodyResponseCallback[Schema$Bucket]): Unit = js.native
  def get(
    params: ParamsDollarResourceDollarBucketsDollarGet,
    options: BodyResponseCallback[Schema$Bucket],
    callback: BodyResponseCallback[Schema$Bucket]
  ): Unit = js.native
  def get(params: ParamsDollarResourceDollarBucketsDollarGet, options: MethodOptions): GaxiosPromise[Schema$Bucket] = js.native
  def get(
    params: ParamsDollarResourceDollarBucketsDollarGet,
    options: MethodOptions,
    callback: BodyResponseCallback[Schema$Bucket]
  ): Unit = js.native
  /**
    * storage.buckets.insert
    * @desc Creates a new bucket.
    * @alias storage.buckets.insert
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.project A valid API project identifier.
    * @param {string=} params.projection Set of properties to return. Defaults to noAcl, unless the bucket resource specifies acl or defaultObjectAcl properties, when it defaults to full.
    * @param {().Bucket} params.resource Request body data
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def insert(): GaxiosPromise[Schema$Bucket] = js.native
  def insert(callback: BodyResponseCallback[Schema$Bucket]): Unit = js.native
  def insert(params: ParamsDollarResourceDollarBucketsDollarInsert): GaxiosPromise[Schema$Bucket] = js.native
  def insert(
    params: ParamsDollarResourceDollarBucketsDollarInsert,
    callback: BodyResponseCallback[Schema$Bucket]
  ): Unit = js.native
  def insert(
    params: ParamsDollarResourceDollarBucketsDollarInsert,
    options: BodyResponseCallback[Schema$Bucket],
    callback: BodyResponseCallback[Schema$Bucket]
  ): Unit = js.native
  def insert(params: ParamsDollarResourceDollarBucketsDollarInsert, options: MethodOptions): GaxiosPromise[Schema$Bucket] = js.native
  def insert(
    params: ParamsDollarResourceDollarBucketsDollarInsert,
    options: MethodOptions,
    callback: BodyResponseCallback[Schema$Bucket]
  ): Unit = js.native
  /**
    * storage.buckets.list
    * @desc Retrieves a list of buckets for a given project.
    * @alias storage.buckets.list
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {integer=} params.maxResults Maximum number of buckets to return.
    * @param {string=} params.pageToken A previously-returned page token representing part of the larger set of results to view.
    * @param {string} params.project A valid API project identifier.
    * @param {string=} params.projection Set of properties to return. Defaults to noAcl.
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def list(): GaxiosPromise[Schema$Buckets] = js.native
  def list(callback: BodyResponseCallback[Schema$Buckets]): Unit = js.native
  def list(params: ParamsDollarResourceDollarBucketsDollarList): GaxiosPromise[Schema$Buckets] = js.native
  def list(
    params: ParamsDollarResourceDollarBucketsDollarList,
    callback: BodyResponseCallback[Schema$Buckets]
  ): Unit = js.native
  def list(
    params: ParamsDollarResourceDollarBucketsDollarList,
    options: BodyResponseCallback[Schema$Buckets],
    callback: BodyResponseCallback[Schema$Buckets]
  ): Unit = js.native
  def list(params: ParamsDollarResourceDollarBucketsDollarList, options: MethodOptions): GaxiosPromise[Schema$Buckets] = js.native
  def list(
    params: ParamsDollarResourceDollarBucketsDollarList,
    options: MethodOptions,
    callback: BodyResponseCallback[Schema$Buckets]
  ): Unit = js.native
  /**
    * storage.buckets.patch
    * @desc Updates a bucket. This method supports patch semantics.
    * @alias storage.buckets.patch
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.bucket Name of a bucket.
    * @param {string=} params.ifMetagenerationMatch Makes the return of the bucket metadata conditional on whether the bucket's current metageneration matches the given value.
    * @param {string=} params.ifMetagenerationNotMatch Makes the return of the bucket metadata conditional on whether the bucket's current metageneration does not match the given value.
    * @param {string=} params.projection Set of properties to return. Defaults to full.
    * @param {().Bucket} params.resource Request body data
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def patch(): GaxiosPromise[Schema$Bucket] = js.native
  def patch(callback: BodyResponseCallback[Schema$Bucket]): Unit = js.native
  def patch(params: ParamsDollarResourceDollarBucketsDollarPatch): GaxiosPromise[Schema$Bucket] = js.native
  def patch(
    params: ParamsDollarResourceDollarBucketsDollarPatch,
    callback: BodyResponseCallback[Schema$Bucket]
  ): Unit = js.native
  def patch(
    params: ParamsDollarResourceDollarBucketsDollarPatch,
    options: BodyResponseCallback[Schema$Bucket],
    callback: BodyResponseCallback[Schema$Bucket]
  ): Unit = js.native
  def patch(params: ParamsDollarResourceDollarBucketsDollarPatch, options: MethodOptions): GaxiosPromise[Schema$Bucket] = js.native
  def patch(
    params: ParamsDollarResourceDollarBucketsDollarPatch,
    options: MethodOptions,
    callback: BodyResponseCallback[Schema$Bucket]
  ): Unit = js.native
  /**
    * storage.buckets.update
    * @desc Updates a bucket.
    * @alias storage.buckets.update
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.bucket Name of a bucket.
    * @param {string=} params.ifMetagenerationMatch Makes the return of the bucket metadata conditional on whether the bucket's current metageneration matches the given value.
    * @param {string=} params.ifMetagenerationNotMatch Makes the return of the bucket metadata conditional on whether the bucket's current metageneration does not match the given value.
    * @param {string=} params.projection Set of properties to return. Defaults to full.
    * @param {().Bucket} params.resource Request body data
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def update(): GaxiosPromise[Schema$Bucket] = js.native
  def update(callback: BodyResponseCallback[Schema$Bucket]): Unit = js.native
  def update(params: ParamsDollarResourceDollarBucketsDollarUpdate): GaxiosPromise[Schema$Bucket] = js.native
  def update(
    params: ParamsDollarResourceDollarBucketsDollarUpdate,
    callback: BodyResponseCallback[Schema$Bucket]
  ): Unit = js.native
  def update(
    params: ParamsDollarResourceDollarBucketsDollarUpdate,
    options: BodyResponseCallback[Schema$Bucket],
    callback: BodyResponseCallback[Schema$Bucket]
  ): Unit = js.native
  def update(params: ParamsDollarResourceDollarBucketsDollarUpdate, options: MethodOptions): GaxiosPromise[Schema$Bucket] = js.native
  def update(
    params: ParamsDollarResourceDollarBucketsDollarUpdate,
    options: MethodOptions,
    callback: BodyResponseCallback[Schema$Bucket]
  ): Unit = js.native
}

