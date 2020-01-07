package typings.googleapis.buildSrcApisAdminDirectoryUnderscoreV1Mod.admin_directory_v1

import typings.gaxios.buildSrcCommonMod.GaxiosPromise
import typings.googleapisDashCommon.buildSrcApiMod.APIRequestContext
import typings.googleapisDashCommon.buildSrcApiMod.BodyResponseCallback
import typings.googleapisDashCommon.buildSrcApiMod.MethodOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("googleapis/build/src/apis/admin/directory_v1", "admin_directory_v1.Resource$Schemas")
@js.native
class Resource$Schemas protected () extends js.Object {
  def this(context: APIRequestContext) = this()
  var context: APIRequestContext = js.native
  /**
    * directory.schemas.delete
    * @desc Delete schema
    * @alias directory.schemas.delete
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.customerId Immutable ID of the G Suite account
    * @param {string} params.schemaKey Name or immutable ID of the schema
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def delete(): GaxiosPromise[Unit] = js.native
  def delete(callback: BodyResponseCallback[Unit]): Unit = js.native
  def delete(params: ParamsDollarResourceDollarSchemasDollarDelete): GaxiosPromise[Unit] = js.native
  def delete(params: ParamsDollarResourceDollarSchemasDollarDelete, callback: BodyResponseCallback[Unit]): Unit = js.native
  def delete(
    params: ParamsDollarResourceDollarSchemasDollarDelete,
    options: BodyResponseCallback[Unit],
    callback: BodyResponseCallback[Unit]
  ): Unit = js.native
  def delete(params: ParamsDollarResourceDollarSchemasDollarDelete, options: MethodOptions): GaxiosPromise[Unit] = js.native
  def delete(
    params: ParamsDollarResourceDollarSchemasDollarDelete,
    options: MethodOptions,
    callback: BodyResponseCallback[Unit]
  ): Unit = js.native
  /**
    * directory.schemas.get
    * @desc Retrieve schema
    * @alias directory.schemas.get
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.customerId Immutable ID of the G Suite account
    * @param {string} params.schemaKey Name or immutable ID of the schema
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def get(): GaxiosPromise[Schema$Schema] = js.native
  def get(callback: BodyResponseCallback[Schema$Schema]): Unit = js.native
  def get(params: ParamsDollarResourceDollarSchemasDollarGet): GaxiosPromise[Schema$Schema] = js.native
  def get(params: ParamsDollarResourceDollarSchemasDollarGet, callback: BodyResponseCallback[Schema$Schema]): Unit = js.native
  def get(
    params: ParamsDollarResourceDollarSchemasDollarGet,
    options: BodyResponseCallback[Schema$Schema],
    callback: BodyResponseCallback[Schema$Schema]
  ): Unit = js.native
  def get(params: ParamsDollarResourceDollarSchemasDollarGet, options: MethodOptions): GaxiosPromise[Schema$Schema] = js.native
  def get(
    params: ParamsDollarResourceDollarSchemasDollarGet,
    options: MethodOptions,
    callback: BodyResponseCallback[Schema$Schema]
  ): Unit = js.native
  /**
    * directory.schemas.insert
    * @desc Create schema.
    * @alias directory.schemas.insert
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.customerId Immutable ID of the G Suite account
    * @param {().Schema} params.resource Request body data
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def insert(): GaxiosPromise[Schema$Schema] = js.native
  def insert(callback: BodyResponseCallback[Schema$Schema]): Unit = js.native
  def insert(params: ParamsDollarResourceDollarSchemasDollarInsert): GaxiosPromise[Schema$Schema] = js.native
  def insert(
    params: ParamsDollarResourceDollarSchemasDollarInsert,
    callback: BodyResponseCallback[Schema$Schema]
  ): Unit = js.native
  def insert(
    params: ParamsDollarResourceDollarSchemasDollarInsert,
    options: BodyResponseCallback[Schema$Schema],
    callback: BodyResponseCallback[Schema$Schema]
  ): Unit = js.native
  def insert(params: ParamsDollarResourceDollarSchemasDollarInsert, options: MethodOptions): GaxiosPromise[Schema$Schema] = js.native
  def insert(
    params: ParamsDollarResourceDollarSchemasDollarInsert,
    options: MethodOptions,
    callback: BodyResponseCallback[Schema$Schema]
  ): Unit = js.native
  /**
    * directory.schemas.list
    * @desc Retrieve all schemas for a customer
    * @alias directory.schemas.list
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.customerId Immutable ID of the G Suite account
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def list(): GaxiosPromise[Schema$Schemas] = js.native
  def list(callback: BodyResponseCallback[Schema$Schemas]): Unit = js.native
  def list(params: ParamsDollarResourceDollarSchemasDollarList): GaxiosPromise[Schema$Schemas] = js.native
  def list(
    params: ParamsDollarResourceDollarSchemasDollarList,
    callback: BodyResponseCallback[Schema$Schemas]
  ): Unit = js.native
  def list(
    params: ParamsDollarResourceDollarSchemasDollarList,
    options: BodyResponseCallback[Schema$Schemas],
    callback: BodyResponseCallback[Schema$Schemas]
  ): Unit = js.native
  def list(params: ParamsDollarResourceDollarSchemasDollarList, options: MethodOptions): GaxiosPromise[Schema$Schemas] = js.native
  def list(
    params: ParamsDollarResourceDollarSchemasDollarList,
    options: MethodOptions,
    callback: BodyResponseCallback[Schema$Schemas]
  ): Unit = js.native
  /**
    * directory.schemas.patch
    * @desc Update schema. This method supports patch semantics.
    * @alias directory.schemas.patch
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.customerId Immutable ID of the G Suite account
    * @param {string} params.schemaKey Name or immutable ID of the schema.
    * @param {().Schema} params.resource Request body data
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def patch(): GaxiosPromise[Schema$Schema] = js.native
  def patch(callback: BodyResponseCallback[Schema$Schema]): Unit = js.native
  def patch(params: ParamsDollarResourceDollarSchemasDollarPatch): GaxiosPromise[Schema$Schema] = js.native
  def patch(
    params: ParamsDollarResourceDollarSchemasDollarPatch,
    callback: BodyResponseCallback[Schema$Schema]
  ): Unit = js.native
  def patch(
    params: ParamsDollarResourceDollarSchemasDollarPatch,
    options: BodyResponseCallback[Schema$Schema],
    callback: BodyResponseCallback[Schema$Schema]
  ): Unit = js.native
  def patch(params: ParamsDollarResourceDollarSchemasDollarPatch, options: MethodOptions): GaxiosPromise[Schema$Schema] = js.native
  def patch(
    params: ParamsDollarResourceDollarSchemasDollarPatch,
    options: MethodOptions,
    callback: BodyResponseCallback[Schema$Schema]
  ): Unit = js.native
  /**
    * directory.schemas.update
    * @desc Update schema
    * @alias directory.schemas.update
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.customerId Immutable ID of the G Suite account
    * @param {string} params.schemaKey Name or immutable ID of the schema.
    * @param {().Schema} params.resource Request body data
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def update(): GaxiosPromise[Schema$Schema] = js.native
  def update(callback: BodyResponseCallback[Schema$Schema]): Unit = js.native
  def update(params: ParamsDollarResourceDollarSchemasDollarUpdate): GaxiosPromise[Schema$Schema] = js.native
  def update(
    params: ParamsDollarResourceDollarSchemasDollarUpdate,
    callback: BodyResponseCallback[Schema$Schema]
  ): Unit = js.native
  def update(
    params: ParamsDollarResourceDollarSchemasDollarUpdate,
    options: BodyResponseCallback[Schema$Schema],
    callback: BodyResponseCallback[Schema$Schema]
  ): Unit = js.native
  def update(params: ParamsDollarResourceDollarSchemasDollarUpdate, options: MethodOptions): GaxiosPromise[Schema$Schema] = js.native
  def update(
    params: ParamsDollarResourceDollarSchemasDollarUpdate,
    options: MethodOptions,
    callback: BodyResponseCallback[Schema$Schema]
  ): Unit = js.native
}

