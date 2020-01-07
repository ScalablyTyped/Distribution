package typings.googleapis.buildSrcApisStorageV1beta1Mod.storage_v1beta1

import typings.gaxios.buildSrcCommonMod.GaxiosPromise
import typings.googleapisDashCommon.buildSrcApiMod.APIRequestContext
import typings.googleapisDashCommon.buildSrcApiMod.BodyResponseCallback
import typings.googleapisDashCommon.buildSrcApiMod.MethodOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("googleapis/build/src/apis/storage/v1beta1", "storage_v1beta1.Resource$Objectaccesscontrols")
@js.native
class Resource$Objectaccesscontrols protected () extends js.Object {
  def this(context: APIRequestContext) = this()
  var context: APIRequestContext = js.native
  /**
    * storage.objectAccessControls.delete
    * @desc Deletes the ACL entry for the specified entity on the specified
    * object.
    * @alias storage.objectAccessControls.delete
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.bucket Name of a bucket.
    * @param {string} params.entity The entity holding the permission. Can be user-userId, user-emailAddress, group-groupId, group-emailAddress, allUsers, or allAuthenticatedUsers.
    * @param {string} params.object Name of the object.
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def delete(): GaxiosPromise[Unit] = js.native
  def delete(callback: BodyResponseCallback[Unit]): Unit = js.native
  def delete(params: ParamsDollarResourceDollarObjectaccesscontrolsDollarDelete): GaxiosPromise[Unit] = js.native
  def delete(
    params: ParamsDollarResourceDollarObjectaccesscontrolsDollarDelete,
    callback: BodyResponseCallback[Unit]
  ): Unit = js.native
  def delete(
    params: ParamsDollarResourceDollarObjectaccesscontrolsDollarDelete,
    options: BodyResponseCallback[Unit],
    callback: BodyResponseCallback[Unit]
  ): Unit = js.native
  def delete(params: ParamsDollarResourceDollarObjectaccesscontrolsDollarDelete, options: MethodOptions): GaxiosPromise[Unit] = js.native
  def delete(
    params: ParamsDollarResourceDollarObjectaccesscontrolsDollarDelete,
    options: MethodOptions,
    callback: BodyResponseCallback[Unit]
  ): Unit = js.native
  /**
    * storage.objectAccessControls.get
    * @desc Returns the ACL entry for the specified entity on the specified
    * object.
    * @alias storage.objectAccessControls.get
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.bucket Name of a bucket.
    * @param {string} params.entity The entity holding the permission. Can be user-userId, user-emailAddress, group-groupId, group-emailAddress, allUsers, or allAuthenticatedUsers.
    * @param {string} params.object Name of the object.
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def get(): GaxiosPromise[Schema$ObjectAccessControl] = js.native
  def get(callback: BodyResponseCallback[Schema$ObjectAccessControl]): Unit = js.native
  def get(params: ParamsDollarResourceDollarObjectaccesscontrolsDollarGet): GaxiosPromise[Schema$ObjectAccessControl] = js.native
  def get(
    params: ParamsDollarResourceDollarObjectaccesscontrolsDollarGet,
    callback: BodyResponseCallback[Schema$ObjectAccessControl]
  ): Unit = js.native
  def get(
    params: ParamsDollarResourceDollarObjectaccesscontrolsDollarGet,
    options: BodyResponseCallback[Schema$ObjectAccessControl],
    callback: BodyResponseCallback[Schema$ObjectAccessControl]
  ): Unit = js.native
  def get(params: ParamsDollarResourceDollarObjectaccesscontrolsDollarGet, options: MethodOptions): GaxiosPromise[Schema$ObjectAccessControl] = js.native
  def get(
    params: ParamsDollarResourceDollarObjectaccesscontrolsDollarGet,
    options: MethodOptions,
    callback: BodyResponseCallback[Schema$ObjectAccessControl]
  ): Unit = js.native
  /**
    * storage.objectAccessControls.insert
    * @desc Creates a new ACL entry on the specified object.
    * @alias storage.objectAccessControls.insert
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.bucket Name of a bucket.
    * @param {string} params.object Name of the object.
    * @param {().ObjectAccessControl} params.resource Request body data
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def insert(): GaxiosPromise[Schema$ObjectAccessControl] = js.native
  def insert(callback: BodyResponseCallback[Schema$ObjectAccessControl]): Unit = js.native
  def insert(params: ParamsDollarResourceDollarObjectaccesscontrolsDollarInsert): GaxiosPromise[Schema$ObjectAccessControl] = js.native
  def insert(
    params: ParamsDollarResourceDollarObjectaccesscontrolsDollarInsert,
    callback: BodyResponseCallback[Schema$ObjectAccessControl]
  ): Unit = js.native
  def insert(
    params: ParamsDollarResourceDollarObjectaccesscontrolsDollarInsert,
    options: BodyResponseCallback[Schema$ObjectAccessControl],
    callback: BodyResponseCallback[Schema$ObjectAccessControl]
  ): Unit = js.native
  def insert(params: ParamsDollarResourceDollarObjectaccesscontrolsDollarInsert, options: MethodOptions): GaxiosPromise[Schema$ObjectAccessControl] = js.native
  def insert(
    params: ParamsDollarResourceDollarObjectaccesscontrolsDollarInsert,
    options: MethodOptions,
    callback: BodyResponseCallback[Schema$ObjectAccessControl]
  ): Unit = js.native
  /**
    * storage.objectAccessControls.list
    * @desc Retrieves ACL entries on the specified object.
    * @alias storage.objectAccessControls.list
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.bucket Name of a bucket.
    * @param {string} params.object Name of the object.
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def list(): GaxiosPromise[Schema$ObjectAccessControls] = js.native
  def list(callback: BodyResponseCallback[Schema$ObjectAccessControls]): Unit = js.native
  def list(params: ParamsDollarResourceDollarObjectaccesscontrolsDollarList): GaxiosPromise[Schema$ObjectAccessControls] = js.native
  def list(
    params: ParamsDollarResourceDollarObjectaccesscontrolsDollarList,
    callback: BodyResponseCallback[Schema$ObjectAccessControls]
  ): Unit = js.native
  def list(
    params: ParamsDollarResourceDollarObjectaccesscontrolsDollarList,
    options: BodyResponseCallback[Schema$ObjectAccessControls],
    callback: BodyResponseCallback[Schema$ObjectAccessControls]
  ): Unit = js.native
  def list(params: ParamsDollarResourceDollarObjectaccesscontrolsDollarList, options: MethodOptions): GaxiosPromise[Schema$ObjectAccessControls] = js.native
  def list(
    params: ParamsDollarResourceDollarObjectaccesscontrolsDollarList,
    options: MethodOptions,
    callback: BodyResponseCallback[Schema$ObjectAccessControls]
  ): Unit = js.native
  /**
    * storage.objectAccessControls.patch
    * @desc Updates an ACL entry on the specified object. This method supports
    * patch semantics.
    * @alias storage.objectAccessControls.patch
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.bucket Name of a bucket.
    * @param {string} params.entity The entity holding the permission. Can be user-userId, user-emailAddress, group-groupId, group-emailAddress, allUsers, or allAuthenticatedUsers.
    * @param {string} params.object Name of the object.
    * @param {().ObjectAccessControl} params.resource Request body data
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def patch(): GaxiosPromise[Schema$ObjectAccessControl] = js.native
  def patch(callback: BodyResponseCallback[Schema$ObjectAccessControl]): Unit = js.native
  def patch(params: ParamsDollarResourceDollarObjectaccesscontrolsDollarPatch): GaxiosPromise[Schema$ObjectAccessControl] = js.native
  def patch(
    params: ParamsDollarResourceDollarObjectaccesscontrolsDollarPatch,
    callback: BodyResponseCallback[Schema$ObjectAccessControl]
  ): Unit = js.native
  def patch(
    params: ParamsDollarResourceDollarObjectaccesscontrolsDollarPatch,
    options: BodyResponseCallback[Schema$ObjectAccessControl],
    callback: BodyResponseCallback[Schema$ObjectAccessControl]
  ): Unit = js.native
  def patch(params: ParamsDollarResourceDollarObjectaccesscontrolsDollarPatch, options: MethodOptions): GaxiosPromise[Schema$ObjectAccessControl] = js.native
  def patch(
    params: ParamsDollarResourceDollarObjectaccesscontrolsDollarPatch,
    options: MethodOptions,
    callback: BodyResponseCallback[Schema$ObjectAccessControl]
  ): Unit = js.native
  /**
    * storage.objectAccessControls.update
    * @desc Updates an ACL entry on the specified object.
    * @alias storage.objectAccessControls.update
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.bucket Name of a bucket.
    * @param {string} params.entity The entity holding the permission. Can be user-userId, user-emailAddress, group-groupId, group-emailAddress, allUsers, or allAuthenticatedUsers.
    * @param {string} params.object Name of the object.
    * @param {().ObjectAccessControl} params.resource Request body data
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def update(): GaxiosPromise[Schema$ObjectAccessControl] = js.native
  def update(callback: BodyResponseCallback[Schema$ObjectAccessControl]): Unit = js.native
  def update(params: ParamsDollarResourceDollarObjectaccesscontrolsDollarUpdate): GaxiosPromise[Schema$ObjectAccessControl] = js.native
  def update(
    params: ParamsDollarResourceDollarObjectaccesscontrolsDollarUpdate,
    callback: BodyResponseCallback[Schema$ObjectAccessControl]
  ): Unit = js.native
  def update(
    params: ParamsDollarResourceDollarObjectaccesscontrolsDollarUpdate,
    options: BodyResponseCallback[Schema$ObjectAccessControl],
    callback: BodyResponseCallback[Schema$ObjectAccessControl]
  ): Unit = js.native
  def update(params: ParamsDollarResourceDollarObjectaccesscontrolsDollarUpdate, options: MethodOptions): GaxiosPromise[Schema$ObjectAccessControl] = js.native
  def update(
    params: ParamsDollarResourceDollarObjectaccesscontrolsDollarUpdate,
    options: MethodOptions,
    callback: BodyResponseCallback[Schema$ObjectAccessControl]
  ): Unit = js.native
}

