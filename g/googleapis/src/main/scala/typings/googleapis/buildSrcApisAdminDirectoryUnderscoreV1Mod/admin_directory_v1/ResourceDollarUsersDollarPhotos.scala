package typings.googleapis.buildSrcApisAdminDirectoryUnderscoreV1Mod.admin_directory_v1

import typings.gaxios.buildSrcCommonMod.GaxiosPromise
import typings.googleapisDashCommon.buildSrcApiMod.APIRequestContext
import typings.googleapisDashCommon.buildSrcApiMod.BodyResponseCallback
import typings.googleapisDashCommon.buildSrcApiMod.MethodOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("googleapis/build/src/apis/admin/directory_v1", "admin_directory_v1.Resource$Users$Photos")
@js.native
class ResourceDollarUsersDollarPhotos protected () extends js.Object {
  def this(context: APIRequestContext) = this()
  var context: APIRequestContext = js.native
  /**
    * directory.users.photos.delete
    * @desc Remove photos for the user
    * @alias directory.users.photos.delete
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.userKey Email or immutable ID of the user
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def delete(): GaxiosPromise[Unit] = js.native
  def delete(callback: BodyResponseCallback[Unit]): Unit = js.native
  def delete(params: ParamsDollarResourceDollarUsersDollarPhotosDollarDelete): GaxiosPromise[Unit] = js.native
  def delete(
    params: ParamsDollarResourceDollarUsersDollarPhotosDollarDelete,
    callback: BodyResponseCallback[Unit]
  ): Unit = js.native
  def delete(
    params: ParamsDollarResourceDollarUsersDollarPhotosDollarDelete,
    options: BodyResponseCallback[Unit],
    callback: BodyResponseCallback[Unit]
  ): Unit = js.native
  def delete(params: ParamsDollarResourceDollarUsersDollarPhotosDollarDelete, options: MethodOptions): GaxiosPromise[Unit] = js.native
  def delete(
    params: ParamsDollarResourceDollarUsersDollarPhotosDollarDelete,
    options: MethodOptions,
    callback: BodyResponseCallback[Unit]
  ): Unit = js.native
  /**
    * directory.users.photos.get
    * @desc Retrieve photo of a user
    * @alias directory.users.photos.get
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.userKey Email or immutable ID of the user
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def get(): GaxiosPromise[Schema$UserPhoto] = js.native
  def get(callback: BodyResponseCallback[Schema$UserPhoto]): Unit = js.native
  def get(params: ParamsDollarResourceDollarUsersDollarPhotosDollarGet): GaxiosPromise[Schema$UserPhoto] = js.native
  def get(
    params: ParamsDollarResourceDollarUsersDollarPhotosDollarGet,
    callback: BodyResponseCallback[Schema$UserPhoto]
  ): Unit = js.native
  def get(
    params: ParamsDollarResourceDollarUsersDollarPhotosDollarGet,
    options: BodyResponseCallback[Schema$UserPhoto],
    callback: BodyResponseCallback[Schema$UserPhoto]
  ): Unit = js.native
  def get(params: ParamsDollarResourceDollarUsersDollarPhotosDollarGet, options: MethodOptions): GaxiosPromise[Schema$UserPhoto] = js.native
  def get(
    params: ParamsDollarResourceDollarUsersDollarPhotosDollarGet,
    options: MethodOptions,
    callback: BodyResponseCallback[Schema$UserPhoto]
  ): Unit = js.native
  /**
    * directory.users.photos.patch
    * @desc Add a photo for the user. This method supports patch semantics.
    * @alias directory.users.photos.patch
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.userKey Email or immutable ID of the user
    * @param {().UserPhoto} params.resource Request body data
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def patch(): GaxiosPromise[Schema$UserPhoto] = js.native
  def patch(callback: BodyResponseCallback[Schema$UserPhoto]): Unit = js.native
  def patch(params: ParamsDollarResourceDollarUsersDollarPhotosDollarPatch): GaxiosPromise[Schema$UserPhoto] = js.native
  def patch(
    params: ParamsDollarResourceDollarUsersDollarPhotosDollarPatch,
    callback: BodyResponseCallback[Schema$UserPhoto]
  ): Unit = js.native
  def patch(
    params: ParamsDollarResourceDollarUsersDollarPhotosDollarPatch,
    options: BodyResponseCallback[Schema$UserPhoto],
    callback: BodyResponseCallback[Schema$UserPhoto]
  ): Unit = js.native
  def patch(params: ParamsDollarResourceDollarUsersDollarPhotosDollarPatch, options: MethodOptions): GaxiosPromise[Schema$UserPhoto] = js.native
  def patch(
    params: ParamsDollarResourceDollarUsersDollarPhotosDollarPatch,
    options: MethodOptions,
    callback: BodyResponseCallback[Schema$UserPhoto]
  ): Unit = js.native
  /**
    * directory.users.photos.update
    * @desc Add a photo for the user
    * @alias directory.users.photos.update
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.userKey Email or immutable ID of the user
    * @param {().UserPhoto} params.resource Request body data
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def update(): GaxiosPromise[Schema$UserPhoto] = js.native
  def update(callback: BodyResponseCallback[Schema$UserPhoto]): Unit = js.native
  def update(params: ParamsDollarResourceDollarUsersDollarPhotosDollarUpdate): GaxiosPromise[Schema$UserPhoto] = js.native
  def update(
    params: ParamsDollarResourceDollarUsersDollarPhotosDollarUpdate,
    callback: BodyResponseCallback[Schema$UserPhoto]
  ): Unit = js.native
  def update(
    params: ParamsDollarResourceDollarUsersDollarPhotosDollarUpdate,
    options: BodyResponseCallback[Schema$UserPhoto],
    callback: BodyResponseCallback[Schema$UserPhoto]
  ): Unit = js.native
  def update(params: ParamsDollarResourceDollarUsersDollarPhotosDollarUpdate, options: MethodOptions): GaxiosPromise[Schema$UserPhoto] = js.native
  def update(
    params: ParamsDollarResourceDollarUsersDollarPhotosDollarUpdate,
    options: MethodOptions,
    callback: BodyResponseCallback[Schema$UserPhoto]
  ): Unit = js.native
}

