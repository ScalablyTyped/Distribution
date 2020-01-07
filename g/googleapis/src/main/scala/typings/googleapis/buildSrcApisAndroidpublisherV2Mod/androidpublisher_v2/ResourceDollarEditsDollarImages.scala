package typings.googleapis.buildSrcApisAndroidpublisherV2Mod.androidpublisher_v2

import typings.gaxios.buildSrcCommonMod.GaxiosPromise
import typings.googleapisDashCommon.buildSrcApiMod.APIRequestContext
import typings.googleapisDashCommon.buildSrcApiMod.BodyResponseCallback
import typings.googleapisDashCommon.buildSrcApiMod.MethodOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("googleapis/build/src/apis/androidpublisher/v2", "androidpublisher_v2.Resource$Edits$Images")
@js.native
class ResourceDollarEditsDollarImages protected () extends js.Object {
  def this(context: APIRequestContext) = this()
  var context: APIRequestContext = js.native
  /**
    * androidpublisher.edits.images.delete
    * @desc Deletes the image (specified by id) from the edit.
    * @alias androidpublisher.edits.images.delete
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.editId Unique identifier for this edit.
    * @param {string} params.imageId Unique identifier an image within the set of images attached to this edit.
    * @param {string} params.imageType
    * @param {string} params.language The language code (a BCP-47 language tag) of the localized listing whose images are to read or modified. For example, to select Austrian German, pass "de-AT".
    * @param {string} params.packageName Unique identifier for the Android app that is being updated; for example, "com.spiffygame".
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def delete(): GaxiosPromise[Unit] = js.native
  def delete(callback: BodyResponseCallback[Unit]): Unit = js.native
  def delete(params: ParamsDollarResourceDollarEditsDollarImagesDollarDelete): GaxiosPromise[Unit] = js.native
  def delete(
    params: ParamsDollarResourceDollarEditsDollarImagesDollarDelete,
    callback: BodyResponseCallback[Unit]
  ): Unit = js.native
  def delete(
    params: ParamsDollarResourceDollarEditsDollarImagesDollarDelete,
    options: BodyResponseCallback[Unit],
    callback: BodyResponseCallback[Unit]
  ): Unit = js.native
  def delete(params: ParamsDollarResourceDollarEditsDollarImagesDollarDelete, options: MethodOptions): GaxiosPromise[Unit] = js.native
  def delete(
    params: ParamsDollarResourceDollarEditsDollarImagesDollarDelete,
    options: MethodOptions,
    callback: BodyResponseCallback[Unit]
  ): Unit = js.native
  /**
    * androidpublisher.edits.images.deleteall
    * @desc Deletes all images for the specified language and image type.
    * @alias androidpublisher.edits.images.deleteall
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.editId Unique identifier for this edit.
    * @param {string} params.imageType
    * @param {string} params.language The language code (a BCP-47 language tag) of the localized listing whose images are to read or modified. For example, to select Austrian German, pass "de-AT".
    * @param {string} params.packageName Unique identifier for the Android app that is being updated; for example, "com.spiffygame".
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def deleteall(): GaxiosPromise[Schema$ImagesDeleteAllResponse] = js.native
  def deleteall(callback: BodyResponseCallback[Schema$ImagesDeleteAllResponse]): Unit = js.native
  def deleteall(params: ParamsDollarResourceDollarEditsDollarImagesDollarDeleteall): GaxiosPromise[Schema$ImagesDeleteAllResponse] = js.native
  def deleteall(
    params: ParamsDollarResourceDollarEditsDollarImagesDollarDeleteall,
    callback: BodyResponseCallback[Schema$ImagesDeleteAllResponse]
  ): Unit = js.native
  def deleteall(
    params: ParamsDollarResourceDollarEditsDollarImagesDollarDeleteall,
    options: BodyResponseCallback[Schema$ImagesDeleteAllResponse],
    callback: BodyResponseCallback[Schema$ImagesDeleteAllResponse]
  ): Unit = js.native
  def deleteall(params: ParamsDollarResourceDollarEditsDollarImagesDollarDeleteall, options: MethodOptions): GaxiosPromise[Schema$ImagesDeleteAllResponse] = js.native
  def deleteall(
    params: ParamsDollarResourceDollarEditsDollarImagesDollarDeleteall,
    options: MethodOptions,
    callback: BodyResponseCallback[Schema$ImagesDeleteAllResponse]
  ): Unit = js.native
  /**
    * androidpublisher.edits.images.list
    * @desc Lists all images for the specified language and image type.
    * @alias androidpublisher.edits.images.list
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.editId Unique identifier for this edit.
    * @param {string} params.imageType
    * @param {string} params.language The language code (a BCP-47 language tag) of the localized listing whose images are to read or modified. For example, to select Austrian German, pass "de-AT".
    * @param {string} params.packageName Unique identifier for the Android app that is being updated; for example, "com.spiffygame".
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def list(): GaxiosPromise[Schema$ImagesListResponse] = js.native
  def list(callback: BodyResponseCallback[Schema$ImagesListResponse]): Unit = js.native
  def list(params: ParamsDollarResourceDollarEditsDollarImagesDollarList): GaxiosPromise[Schema$ImagesListResponse] = js.native
  def list(
    params: ParamsDollarResourceDollarEditsDollarImagesDollarList,
    callback: BodyResponseCallback[Schema$ImagesListResponse]
  ): Unit = js.native
  def list(
    params: ParamsDollarResourceDollarEditsDollarImagesDollarList,
    options: BodyResponseCallback[Schema$ImagesListResponse],
    callback: BodyResponseCallback[Schema$ImagesListResponse]
  ): Unit = js.native
  def list(params: ParamsDollarResourceDollarEditsDollarImagesDollarList, options: MethodOptions): GaxiosPromise[Schema$ImagesListResponse] = js.native
  def list(
    params: ParamsDollarResourceDollarEditsDollarImagesDollarList,
    options: MethodOptions,
    callback: BodyResponseCallback[Schema$ImagesListResponse]
  ): Unit = js.native
  /**
    * androidpublisher.edits.images.upload
    * @desc Uploads a new image and adds it to the list of images for the
    * specified language and image type.
    * @alias androidpublisher.edits.images.upload
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.editId Unique identifier for this edit.
    * @param {string} params.imageType
    * @param {string} params.language The language code (a BCP-47 language tag) of the localized listing whose images are to read or modified. For example, to select Austrian German, pass "de-AT".
    * @param {string} params.packageName Unique identifier for the Android app that is being updated; for example, "com.spiffygame".
    * @param {object} params.media Media object
    * @param {string} params.media.mimeType Media mime-type
    * @param {string|object} params.media.body Media body contents
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def upload(): GaxiosPromise[Schema$ImagesUploadResponse] = js.native
  def upload(callback: BodyResponseCallback[Schema$ImagesUploadResponse]): Unit = js.native
  def upload(params: ParamsDollarResourceDollarEditsDollarImagesDollarUpload): GaxiosPromise[Schema$ImagesUploadResponse] = js.native
  def upload(
    params: ParamsDollarResourceDollarEditsDollarImagesDollarUpload,
    callback: BodyResponseCallback[Schema$ImagesUploadResponse]
  ): Unit = js.native
  def upload(
    params: ParamsDollarResourceDollarEditsDollarImagesDollarUpload,
    options: BodyResponseCallback[Schema$ImagesUploadResponse],
    callback: BodyResponseCallback[Schema$ImagesUploadResponse]
  ): Unit = js.native
  def upload(params: ParamsDollarResourceDollarEditsDollarImagesDollarUpload, options: MethodOptions): GaxiosPromise[Schema$ImagesUploadResponse] = js.native
  def upload(
    params: ParamsDollarResourceDollarEditsDollarImagesDollarUpload,
    options: MethodOptions,
    callback: BodyResponseCallback[Schema$ImagesUploadResponse]
  ): Unit = js.native
}

