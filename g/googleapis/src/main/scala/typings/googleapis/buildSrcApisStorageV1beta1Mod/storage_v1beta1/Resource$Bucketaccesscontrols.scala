package typings.googleapis.buildSrcApisStorageV1beta1Mod.storage_v1beta1

import typings.gaxios.buildSrcCommonMod.GaxiosPromise
import typings.googleapisDashCommon.buildSrcApiMod.APIRequestContext
import typings.googleapisDashCommon.buildSrcApiMod.BodyResponseCallback
import typings.googleapisDashCommon.buildSrcApiMod.MethodOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("googleapis/build/src/apis/storage/v1beta1", "storage_v1beta1.Resource$Bucketaccesscontrols")
@js.native
class Resource$Bucketaccesscontrols protected () extends js.Object {
  def this(context: APIRequestContext) = this()
  var context: APIRequestContext = js.native
  /**
    * storage.bucketAccessControls.delete
    * @desc Deletes the ACL entry for the specified entity on the specified
    * bucket.
    * @alias storage.bucketAccessControls.delete
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.bucket Name of a bucket.
    * @param {string} params.entity The entity holding the permission. Can be user-userId, user-emailAddress, group-groupId, group-emailAddress, allUsers, or allAuthenticatedUsers.
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def delete(): GaxiosPromise[Unit] = js.native
  def delete(callback: BodyResponseCallback[Unit]): Unit = js.native
  def delete(params: ParamsDollarResourceDollarBucketaccesscontrolsDollarDelete): GaxiosPromise[Unit] = js.native
  def delete(
    params: ParamsDollarResourceDollarBucketaccesscontrolsDollarDelete,
    callback: BodyResponseCallback[Unit]
  ): Unit = js.native
  def delete(
    params: ParamsDollarResourceDollarBucketaccesscontrolsDollarDelete,
    options: BodyResponseCallback[Unit],
    callback: BodyResponseCallback[Unit]
  ): Unit = js.native
  def delete(params: ParamsDollarResourceDollarBucketaccesscontrolsDollarDelete, options: MethodOptions): GaxiosPromise[Unit] = js.native
  def delete(
    params: ParamsDollarResourceDollarBucketaccesscontrolsDollarDelete,
    options: MethodOptions,
    callback: BodyResponseCallback[Unit]
  ): Unit = js.native
  /**
    * storage.bucketAccessControls.get
    * @desc Returns the ACL entry for the specified entity on the specified
    * bucket.
    * @alias storage.bucketAccessControls.get
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.bucket Name of a bucket.
    * @param {string} params.entity The entity holding the permission. Can be user-userId, user-emailAddress, group-groupId, group-emailAddress, allUsers, or allAuthenticatedUsers.
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def get(): GaxiosPromise[Schema$BucketAccessControl] = js.native
  def get(callback: BodyResponseCallback[Schema$BucketAccessControl]): Unit = js.native
  def get(params: ParamsDollarResourceDollarBucketaccesscontrolsDollarGet): GaxiosPromise[Schema$BucketAccessControl] = js.native
  def get(
    params: ParamsDollarResourceDollarBucketaccesscontrolsDollarGet,
    callback: BodyResponseCallback[Schema$BucketAccessControl]
  ): Unit = js.native
  def get(
    params: ParamsDollarResourceDollarBucketaccesscontrolsDollarGet,
    options: BodyResponseCallback[Schema$BucketAccessControl],
    callback: BodyResponseCallback[Schema$BucketAccessControl]
  ): Unit = js.native
  def get(params: ParamsDollarResourceDollarBucketaccesscontrolsDollarGet, options: MethodOptions): GaxiosPromise[Schema$BucketAccessControl] = js.native
  def get(
    params: ParamsDollarResourceDollarBucketaccesscontrolsDollarGet,
    options: MethodOptions,
    callback: BodyResponseCallback[Schema$BucketAccessControl]
  ): Unit = js.native
  /**
    * storage.bucketAccessControls.insert
    * @desc Creates a new ACL entry on the specified bucket.
    * @alias storage.bucketAccessControls.insert
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.bucket Name of a bucket.
    * @param {().BucketAccessControl} params.resource Request body data
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def insert(): GaxiosPromise[Schema$BucketAccessControl] = js.native
  def insert(callback: BodyResponseCallback[Schema$BucketAccessControl]): Unit = js.native
  def insert(params: ParamsDollarResourceDollarBucketaccesscontrolsDollarInsert): GaxiosPromise[Schema$BucketAccessControl] = js.native
  def insert(
    params: ParamsDollarResourceDollarBucketaccesscontrolsDollarInsert,
    callback: BodyResponseCallback[Schema$BucketAccessControl]
  ): Unit = js.native
  def insert(
    params: ParamsDollarResourceDollarBucketaccesscontrolsDollarInsert,
    options: BodyResponseCallback[Schema$BucketAccessControl],
    callback: BodyResponseCallback[Schema$BucketAccessControl]
  ): Unit = js.native
  def insert(params: ParamsDollarResourceDollarBucketaccesscontrolsDollarInsert, options: MethodOptions): GaxiosPromise[Schema$BucketAccessControl] = js.native
  def insert(
    params: ParamsDollarResourceDollarBucketaccesscontrolsDollarInsert,
    options: MethodOptions,
    callback: BodyResponseCallback[Schema$BucketAccessControl]
  ): Unit = js.native
  /**
    * storage.bucketAccessControls.list
    * @desc Retrieves ACL entries on the specified bucket.
    * @alias storage.bucketAccessControls.list
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.bucket Name of a bucket.
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def list(): GaxiosPromise[Schema$BucketAccessControls] = js.native
  def list(callback: BodyResponseCallback[Schema$BucketAccessControls]): Unit = js.native
  def list(params: ParamsDollarResourceDollarBucketaccesscontrolsDollarList): GaxiosPromise[Schema$BucketAccessControls] = js.native
  def list(
    params: ParamsDollarResourceDollarBucketaccesscontrolsDollarList,
    callback: BodyResponseCallback[Schema$BucketAccessControls]
  ): Unit = js.native
  def list(
    params: ParamsDollarResourceDollarBucketaccesscontrolsDollarList,
    options: BodyResponseCallback[Schema$BucketAccessControls],
    callback: BodyResponseCallback[Schema$BucketAccessControls]
  ): Unit = js.native
  def list(params: ParamsDollarResourceDollarBucketaccesscontrolsDollarList, options: MethodOptions): GaxiosPromise[Schema$BucketAccessControls] = js.native
  def list(
    params: ParamsDollarResourceDollarBucketaccesscontrolsDollarList,
    options: MethodOptions,
    callback: BodyResponseCallback[Schema$BucketAccessControls]
  ): Unit = js.native
  /**
    * storage.bucketAccessControls.patch
    * @desc Updates an ACL entry on the specified bucket. This method supports
    * patch semantics.
    * @alias storage.bucketAccessControls.patch
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.bucket Name of a bucket.
    * @param {string} params.entity The entity holding the permission. Can be user-userId, user-emailAddress, group-groupId, group-emailAddress, allUsers, or allAuthenticatedUsers.
    * @param {().BucketAccessControl} params.resource Request body data
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def patch(): GaxiosPromise[Schema$BucketAccessControl] = js.native
  def patch(callback: BodyResponseCallback[Schema$BucketAccessControl]): Unit = js.native
  def patch(params: ParamsDollarResourceDollarBucketaccesscontrolsDollarPatch): GaxiosPromise[Schema$BucketAccessControl] = js.native
  def patch(
    params: ParamsDollarResourceDollarBucketaccesscontrolsDollarPatch,
    callback: BodyResponseCallback[Schema$BucketAccessControl]
  ): Unit = js.native
  def patch(
    params: ParamsDollarResourceDollarBucketaccesscontrolsDollarPatch,
    options: BodyResponseCallback[Schema$BucketAccessControl],
    callback: BodyResponseCallback[Schema$BucketAccessControl]
  ): Unit = js.native
  def patch(params: ParamsDollarResourceDollarBucketaccesscontrolsDollarPatch, options: MethodOptions): GaxiosPromise[Schema$BucketAccessControl] = js.native
  def patch(
    params: ParamsDollarResourceDollarBucketaccesscontrolsDollarPatch,
    options: MethodOptions,
    callback: BodyResponseCallback[Schema$BucketAccessControl]
  ): Unit = js.native
  /**
    * storage.bucketAccessControls.update
    * @desc Updates an ACL entry on the specified bucket.
    * @alias storage.bucketAccessControls.update
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.bucket Name of a bucket.
    * @param {string} params.entity The entity holding the permission. Can be user-userId, user-emailAddress, group-groupId, group-emailAddress, allUsers, or allAuthenticatedUsers.
    * @param {().BucketAccessControl} params.resource Request body data
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def update(): GaxiosPromise[Schema$BucketAccessControl] = js.native
  def update(callback: BodyResponseCallback[Schema$BucketAccessControl]): Unit = js.native
  def update(params: ParamsDollarResourceDollarBucketaccesscontrolsDollarUpdate): GaxiosPromise[Schema$BucketAccessControl] = js.native
  def update(
    params: ParamsDollarResourceDollarBucketaccesscontrolsDollarUpdate,
    callback: BodyResponseCallback[Schema$BucketAccessControl]
  ): Unit = js.native
  def update(
    params: ParamsDollarResourceDollarBucketaccesscontrolsDollarUpdate,
    options: BodyResponseCallback[Schema$BucketAccessControl],
    callback: BodyResponseCallback[Schema$BucketAccessControl]
  ): Unit = js.native
  def update(params: ParamsDollarResourceDollarBucketaccesscontrolsDollarUpdate, options: MethodOptions): GaxiosPromise[Schema$BucketAccessControl] = js.native
  def update(
    params: ParamsDollarResourceDollarBucketaccesscontrolsDollarUpdate,
    options: MethodOptions,
    callback: BodyResponseCallback[Schema$BucketAccessControl]
  ): Unit = js.native
}

