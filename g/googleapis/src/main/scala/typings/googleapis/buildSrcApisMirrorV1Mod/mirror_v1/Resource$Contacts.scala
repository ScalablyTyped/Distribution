package typings.googleapis.buildSrcApisMirrorV1Mod.mirror_v1

import typings.gaxios.buildSrcCommonMod.GaxiosPromise
import typings.googleapisDashCommon.buildSrcApiMod.APIRequestContext
import typings.googleapisDashCommon.buildSrcApiMod.BodyResponseCallback
import typings.googleapisDashCommon.buildSrcApiMod.MethodOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("googleapis/build/src/apis/mirror/v1", "mirror_v1.Resource$Contacts")
@js.native
class Resource$Contacts protected () extends js.Object {
  def this(context: APIRequestContext) = this()
  var context: APIRequestContext = js.native
  /**
    * mirror.contacts.delete
    * @desc Deletes a contact.
    * @alias mirror.contacts.delete
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.id The ID of the contact.
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def delete(): GaxiosPromise[Unit] = js.native
  def delete(callback: BodyResponseCallback[Unit]): Unit = js.native
  def delete(params: ParamsDollarResourceDollarContactsDollarDelete): GaxiosPromise[Unit] = js.native
  def delete(params: ParamsDollarResourceDollarContactsDollarDelete, callback: BodyResponseCallback[Unit]): Unit = js.native
  def delete(
    params: ParamsDollarResourceDollarContactsDollarDelete,
    options: BodyResponseCallback[Unit],
    callback: BodyResponseCallback[Unit]
  ): Unit = js.native
  def delete(params: ParamsDollarResourceDollarContactsDollarDelete, options: MethodOptions): GaxiosPromise[Unit] = js.native
  def delete(
    params: ParamsDollarResourceDollarContactsDollarDelete,
    options: MethodOptions,
    callback: BodyResponseCallback[Unit]
  ): Unit = js.native
  /**
    * mirror.contacts.get
    * @desc Gets a single contact by ID.
    * @alias mirror.contacts.get
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.id The ID of the contact.
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def get(): GaxiosPromise[Schema$Contact] = js.native
  def get(callback: BodyResponseCallback[Schema$Contact]): Unit = js.native
  def get(params: ParamsDollarResourceDollarContactsDollarGet): GaxiosPromise[Schema$Contact] = js.native
  def get(
    params: ParamsDollarResourceDollarContactsDollarGet,
    callback: BodyResponseCallback[Schema$Contact]
  ): Unit = js.native
  def get(
    params: ParamsDollarResourceDollarContactsDollarGet,
    options: BodyResponseCallback[Schema$Contact],
    callback: BodyResponseCallback[Schema$Contact]
  ): Unit = js.native
  def get(params: ParamsDollarResourceDollarContactsDollarGet, options: MethodOptions): GaxiosPromise[Schema$Contact] = js.native
  def get(
    params: ParamsDollarResourceDollarContactsDollarGet,
    options: MethodOptions,
    callback: BodyResponseCallback[Schema$Contact]
  ): Unit = js.native
  /**
    * mirror.contacts.insert
    * @desc Inserts a new contact.
    * @alias mirror.contacts.insert
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {().Contact} params.resource Request body data
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def insert(): GaxiosPromise[Schema$Contact] = js.native
  def insert(callback: BodyResponseCallback[Schema$Contact]): Unit = js.native
  def insert(params: ParamsDollarResourceDollarContactsDollarInsert): GaxiosPromise[Schema$Contact] = js.native
  def insert(
    params: ParamsDollarResourceDollarContactsDollarInsert,
    callback: BodyResponseCallback[Schema$Contact]
  ): Unit = js.native
  def insert(
    params: ParamsDollarResourceDollarContactsDollarInsert,
    options: BodyResponseCallback[Schema$Contact],
    callback: BodyResponseCallback[Schema$Contact]
  ): Unit = js.native
  def insert(params: ParamsDollarResourceDollarContactsDollarInsert, options: MethodOptions): GaxiosPromise[Schema$Contact] = js.native
  def insert(
    params: ParamsDollarResourceDollarContactsDollarInsert,
    options: MethodOptions,
    callback: BodyResponseCallback[Schema$Contact]
  ): Unit = js.native
  /**
    * mirror.contacts.list
    * @desc Retrieves a list of contacts for the authenticated user.
    * @alias mirror.contacts.list
    * @memberOf! ()
    *
    * @param {object=} params Parameters for request
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def list(): GaxiosPromise[Schema$ContactsListResponse] = js.native
  def list(callback: BodyResponseCallback[Schema$ContactsListResponse]): Unit = js.native
  def list(params: ParamsDollarResourceDollarContactsDollarList): GaxiosPromise[Schema$ContactsListResponse] = js.native
  def list(
    params: ParamsDollarResourceDollarContactsDollarList,
    callback: BodyResponseCallback[Schema$ContactsListResponse]
  ): Unit = js.native
  def list(
    params: ParamsDollarResourceDollarContactsDollarList,
    options: BodyResponseCallback[Schema$ContactsListResponse],
    callback: BodyResponseCallback[Schema$ContactsListResponse]
  ): Unit = js.native
  def list(params: ParamsDollarResourceDollarContactsDollarList, options: MethodOptions): GaxiosPromise[Schema$ContactsListResponse] = js.native
  def list(
    params: ParamsDollarResourceDollarContactsDollarList,
    options: MethodOptions,
    callback: BodyResponseCallback[Schema$ContactsListResponse]
  ): Unit = js.native
  /**
    * mirror.contacts.patch
    * @desc Updates a contact in place. This method supports patch semantics.
    * @alias mirror.contacts.patch
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.id The ID of the contact.
    * @param {().Contact} params.resource Request body data
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def patch(): GaxiosPromise[Schema$Contact] = js.native
  def patch(callback: BodyResponseCallback[Schema$Contact]): Unit = js.native
  def patch(params: ParamsDollarResourceDollarContactsDollarPatch): GaxiosPromise[Schema$Contact] = js.native
  def patch(
    params: ParamsDollarResourceDollarContactsDollarPatch,
    callback: BodyResponseCallback[Schema$Contact]
  ): Unit = js.native
  def patch(
    params: ParamsDollarResourceDollarContactsDollarPatch,
    options: BodyResponseCallback[Schema$Contact],
    callback: BodyResponseCallback[Schema$Contact]
  ): Unit = js.native
  def patch(params: ParamsDollarResourceDollarContactsDollarPatch, options: MethodOptions): GaxiosPromise[Schema$Contact] = js.native
  def patch(
    params: ParamsDollarResourceDollarContactsDollarPatch,
    options: MethodOptions,
    callback: BodyResponseCallback[Schema$Contact]
  ): Unit = js.native
  /**
    * mirror.contacts.update
    * @desc Updates a contact in place.
    * @alias mirror.contacts.update
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.id The ID of the contact.
    * @param {().Contact} params.resource Request body data
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def update(): GaxiosPromise[Schema$Contact] = js.native
  def update(callback: BodyResponseCallback[Schema$Contact]): Unit = js.native
  def update(params: ParamsDollarResourceDollarContactsDollarUpdate): GaxiosPromise[Schema$Contact] = js.native
  def update(
    params: ParamsDollarResourceDollarContactsDollarUpdate,
    callback: BodyResponseCallback[Schema$Contact]
  ): Unit = js.native
  def update(
    params: ParamsDollarResourceDollarContactsDollarUpdate,
    options: BodyResponseCallback[Schema$Contact],
    callback: BodyResponseCallback[Schema$Contact]
  ): Unit = js.native
  def update(params: ParamsDollarResourceDollarContactsDollarUpdate, options: MethodOptions): GaxiosPromise[Schema$Contact] = js.native
  def update(
    params: ParamsDollarResourceDollarContactsDollarUpdate,
    options: MethodOptions,
    callback: BodyResponseCallback[Schema$Contact]
  ): Unit = js.native
}

