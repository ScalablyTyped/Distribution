package typings.googleapis.buildSrcApisGmailV1Mod.gmail_v1

import typings.gaxios.buildSrcCommonMod.GaxiosPromise
import typings.googleapisDashCommon.buildSrcApiMod.APIRequestContext
import typings.googleapisDashCommon.buildSrcApiMod.BodyResponseCallback
import typings.googleapisDashCommon.buildSrcApiMod.MethodOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("googleapis/build/src/apis/gmail/v1", "gmail_v1.Resource$Users$Labels")
@js.native
class ResourceDollarUsersDollarLabels protected () extends js.Object {
  def this(context: APIRequestContext) = this()
  var context: APIRequestContext = js.native
  /**
    * gmail.users.labels.create
    * @desc Creates a new label.
    * @alias gmail.users.labels.create
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.userId The user's email address. The special value me can be used to indicate the authenticated user.
    * @param {().Label} params.resource Request body data
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def create(): GaxiosPromise[Schema$Label] = js.native
  def create(callback: BodyResponseCallback[Schema$Label]): Unit = js.native
  def create(params: ParamsDollarResourceDollarUsersDollarLabelsDollarCreate): GaxiosPromise[Schema$Label] = js.native
  def create(
    params: ParamsDollarResourceDollarUsersDollarLabelsDollarCreate,
    callback: BodyResponseCallback[Schema$Label]
  ): Unit = js.native
  def create(
    params: ParamsDollarResourceDollarUsersDollarLabelsDollarCreate,
    options: BodyResponseCallback[Schema$Label],
    callback: BodyResponseCallback[Schema$Label]
  ): Unit = js.native
  def create(params: ParamsDollarResourceDollarUsersDollarLabelsDollarCreate, options: MethodOptions): GaxiosPromise[Schema$Label] = js.native
  def create(
    params: ParamsDollarResourceDollarUsersDollarLabelsDollarCreate,
    options: MethodOptions,
    callback: BodyResponseCallback[Schema$Label]
  ): Unit = js.native
  /**
    * gmail.users.labels.delete
    * @desc Immediately and permanently deletes the specified label and removes
    * it from any messages and threads that it is applied to.
    * @alias gmail.users.labels.delete
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.id The ID of the label to delete.
    * @param {string} params.userId The user's email address. The special value me can be used to indicate the authenticated user.
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def delete(): GaxiosPromise[Unit] = js.native
  def delete(callback: BodyResponseCallback[Unit]): Unit = js.native
  def delete(params: ParamsDollarResourceDollarUsersDollarLabelsDollarDelete): GaxiosPromise[Unit] = js.native
  def delete(
    params: ParamsDollarResourceDollarUsersDollarLabelsDollarDelete,
    callback: BodyResponseCallback[Unit]
  ): Unit = js.native
  def delete(
    params: ParamsDollarResourceDollarUsersDollarLabelsDollarDelete,
    options: BodyResponseCallback[Unit],
    callback: BodyResponseCallback[Unit]
  ): Unit = js.native
  def delete(params: ParamsDollarResourceDollarUsersDollarLabelsDollarDelete, options: MethodOptions): GaxiosPromise[Unit] = js.native
  def delete(
    params: ParamsDollarResourceDollarUsersDollarLabelsDollarDelete,
    options: MethodOptions,
    callback: BodyResponseCallback[Unit]
  ): Unit = js.native
  /**
    * gmail.users.labels.get
    * @desc Gets the specified label.
    * @alias gmail.users.labels.get
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.id The ID of the label to retrieve.
    * @param {string} params.userId The user's email address. The special value me can be used to indicate the authenticated user.
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def get(): GaxiosPromise[Schema$Label] = js.native
  def get(callback: BodyResponseCallback[Schema$Label]): Unit = js.native
  def get(params: ParamsDollarResourceDollarUsersDollarLabelsDollarGet): GaxiosPromise[Schema$Label] = js.native
  def get(
    params: ParamsDollarResourceDollarUsersDollarLabelsDollarGet,
    callback: BodyResponseCallback[Schema$Label]
  ): Unit = js.native
  def get(
    params: ParamsDollarResourceDollarUsersDollarLabelsDollarGet,
    options: BodyResponseCallback[Schema$Label],
    callback: BodyResponseCallback[Schema$Label]
  ): Unit = js.native
  def get(params: ParamsDollarResourceDollarUsersDollarLabelsDollarGet, options: MethodOptions): GaxiosPromise[Schema$Label] = js.native
  def get(
    params: ParamsDollarResourceDollarUsersDollarLabelsDollarGet,
    options: MethodOptions,
    callback: BodyResponseCallback[Schema$Label]
  ): Unit = js.native
  /**
    * gmail.users.labels.list
    * @desc Lists all labels in the user's mailbox.
    * @alias gmail.users.labels.list
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.userId The user's email address. The special value me can be used to indicate the authenticated user.
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def list(): GaxiosPromise[Schema$ListLabelsResponse] = js.native
  def list(callback: BodyResponseCallback[Schema$ListLabelsResponse]): Unit = js.native
  def list(params: ParamsDollarResourceDollarUsersDollarLabelsDollarList): GaxiosPromise[Schema$ListLabelsResponse] = js.native
  def list(
    params: ParamsDollarResourceDollarUsersDollarLabelsDollarList,
    callback: BodyResponseCallback[Schema$ListLabelsResponse]
  ): Unit = js.native
  def list(
    params: ParamsDollarResourceDollarUsersDollarLabelsDollarList,
    options: BodyResponseCallback[Schema$ListLabelsResponse],
    callback: BodyResponseCallback[Schema$ListLabelsResponse]
  ): Unit = js.native
  def list(params: ParamsDollarResourceDollarUsersDollarLabelsDollarList, options: MethodOptions): GaxiosPromise[Schema$ListLabelsResponse] = js.native
  def list(
    params: ParamsDollarResourceDollarUsersDollarLabelsDollarList,
    options: MethodOptions,
    callback: BodyResponseCallback[Schema$ListLabelsResponse]
  ): Unit = js.native
  /**
    * gmail.users.labels.patch
    * @desc Updates the specified label. This method supports patch semantics.
    * @alias gmail.users.labels.patch
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.id The ID of the label to update.
    * @param {string} params.userId The user's email address. The special value me can be used to indicate the authenticated user.
    * @param {().Label} params.resource Request body data
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def patch(): GaxiosPromise[Schema$Label] = js.native
  def patch(callback: BodyResponseCallback[Schema$Label]): Unit = js.native
  def patch(params: ParamsDollarResourceDollarUsersDollarLabelsDollarPatch): GaxiosPromise[Schema$Label] = js.native
  def patch(
    params: ParamsDollarResourceDollarUsersDollarLabelsDollarPatch,
    callback: BodyResponseCallback[Schema$Label]
  ): Unit = js.native
  def patch(
    params: ParamsDollarResourceDollarUsersDollarLabelsDollarPatch,
    options: BodyResponseCallback[Schema$Label],
    callback: BodyResponseCallback[Schema$Label]
  ): Unit = js.native
  def patch(params: ParamsDollarResourceDollarUsersDollarLabelsDollarPatch, options: MethodOptions): GaxiosPromise[Schema$Label] = js.native
  def patch(
    params: ParamsDollarResourceDollarUsersDollarLabelsDollarPatch,
    options: MethodOptions,
    callback: BodyResponseCallback[Schema$Label]
  ): Unit = js.native
  /**
    * gmail.users.labels.update
    * @desc Updates the specified label.
    * @alias gmail.users.labels.update
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.id The ID of the label to update.
    * @param {string} params.userId The user's email address. The special value me can be used to indicate the authenticated user.
    * @param {().Label} params.resource Request body data
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def update(): GaxiosPromise[Schema$Label] = js.native
  def update(callback: BodyResponseCallback[Schema$Label]): Unit = js.native
  def update(params: ParamsDollarResourceDollarUsersDollarLabelsDollarUpdate): GaxiosPromise[Schema$Label] = js.native
  def update(
    params: ParamsDollarResourceDollarUsersDollarLabelsDollarUpdate,
    callback: BodyResponseCallback[Schema$Label]
  ): Unit = js.native
  def update(
    params: ParamsDollarResourceDollarUsersDollarLabelsDollarUpdate,
    options: BodyResponseCallback[Schema$Label],
    callback: BodyResponseCallback[Schema$Label]
  ): Unit = js.native
  def update(params: ParamsDollarResourceDollarUsersDollarLabelsDollarUpdate, options: MethodOptions): GaxiosPromise[Schema$Label] = js.native
  def update(
    params: ParamsDollarResourceDollarUsersDollarLabelsDollarUpdate,
    options: MethodOptions,
    callback: BodyResponseCallback[Schema$Label]
  ): Unit = js.native
}

