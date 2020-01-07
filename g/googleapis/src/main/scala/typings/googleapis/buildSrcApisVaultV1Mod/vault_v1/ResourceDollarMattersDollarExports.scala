package typings.googleapis.buildSrcApisVaultV1Mod.vault_v1

import typings.gaxios.buildSrcCommonMod.GaxiosPromise
import typings.googleapisDashCommon.buildSrcApiMod.APIRequestContext
import typings.googleapisDashCommon.buildSrcApiMod.BodyResponseCallback
import typings.googleapisDashCommon.buildSrcApiMod.MethodOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("googleapis/build/src/apis/vault/v1", "vault_v1.Resource$Matters$Exports")
@js.native
class ResourceDollarMattersDollarExports protected () extends js.Object {
  def this(context: APIRequestContext) = this()
  var context: APIRequestContext = js.native
  /**
    * vault.matters.exports.create
    * @desc Creates an Export.
    * @alias vault.matters.exports.create
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.matterId The matter ID.
    * @param {().Export} params.resource Request body data
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def create(): GaxiosPromise[Schema$Export] = js.native
  def create(callback: BodyResponseCallback[Schema$Export]): Unit = js.native
  def create(params: ParamsDollarResourceDollarMattersDollarExportsDollarCreate): GaxiosPromise[Schema$Export] = js.native
  def create(
    params: ParamsDollarResourceDollarMattersDollarExportsDollarCreate,
    callback: BodyResponseCallback[Schema$Export]
  ): Unit = js.native
  def create(
    params: ParamsDollarResourceDollarMattersDollarExportsDollarCreate,
    options: BodyResponseCallback[Schema$Export],
    callback: BodyResponseCallback[Schema$Export]
  ): Unit = js.native
  def create(params: ParamsDollarResourceDollarMattersDollarExportsDollarCreate, options: MethodOptions): GaxiosPromise[Schema$Export] = js.native
  def create(
    params: ParamsDollarResourceDollarMattersDollarExportsDollarCreate,
    options: MethodOptions,
    callback: BodyResponseCallback[Schema$Export]
  ): Unit = js.native
  /**
    * vault.matters.exports.delete
    * @desc Deletes an Export.
    * @alias vault.matters.exports.delete
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.exportId The export ID.
    * @param {string} params.matterId The matter ID.
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def delete(): GaxiosPromise[Schema$Empty] = js.native
  def delete(callback: BodyResponseCallback[Schema$Empty]): Unit = js.native
  def delete(params: ParamsDollarResourceDollarMattersDollarExportsDollarDelete): GaxiosPromise[Schema$Empty] = js.native
  def delete(
    params: ParamsDollarResourceDollarMattersDollarExportsDollarDelete,
    callback: BodyResponseCallback[Schema$Empty]
  ): Unit = js.native
  def delete(
    params: ParamsDollarResourceDollarMattersDollarExportsDollarDelete,
    options: BodyResponseCallback[Schema$Empty],
    callback: BodyResponseCallback[Schema$Empty]
  ): Unit = js.native
  def delete(params: ParamsDollarResourceDollarMattersDollarExportsDollarDelete, options: MethodOptions): GaxiosPromise[Schema$Empty] = js.native
  def delete(
    params: ParamsDollarResourceDollarMattersDollarExportsDollarDelete,
    options: MethodOptions,
    callback: BodyResponseCallback[Schema$Empty]
  ): Unit = js.native
  /**
    * vault.matters.exports.get
    * @desc Gets an Export.
    * @alias vault.matters.exports.get
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.exportId The export ID.
    * @param {string} params.matterId The matter ID.
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def get(): GaxiosPromise[Schema$Export] = js.native
  def get(callback: BodyResponseCallback[Schema$Export]): Unit = js.native
  def get(params: ParamsDollarResourceDollarMattersDollarExportsDollarGet): GaxiosPromise[Schema$Export] = js.native
  def get(
    params: ParamsDollarResourceDollarMattersDollarExportsDollarGet,
    callback: BodyResponseCallback[Schema$Export]
  ): Unit = js.native
  def get(
    params: ParamsDollarResourceDollarMattersDollarExportsDollarGet,
    options: BodyResponseCallback[Schema$Export],
    callback: BodyResponseCallback[Schema$Export]
  ): Unit = js.native
  def get(params: ParamsDollarResourceDollarMattersDollarExportsDollarGet, options: MethodOptions): GaxiosPromise[Schema$Export] = js.native
  def get(
    params: ParamsDollarResourceDollarMattersDollarExportsDollarGet,
    options: MethodOptions,
    callback: BodyResponseCallback[Schema$Export]
  ): Unit = js.native
  /**
    * vault.matters.exports.list
    * @desc Lists Exports.
    * @alias vault.matters.exports.list
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.matterId The matter ID.
    * @param {integer=} params.pageSize The number of exports to return in the response.
    * @param {string=} params.pageToken The pagination token as returned in the response.
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def list(): GaxiosPromise[Schema$ListExportsResponse] = js.native
  def list(callback: BodyResponseCallback[Schema$ListExportsResponse]): Unit = js.native
  def list(params: ParamsDollarResourceDollarMattersDollarExportsDollarList): GaxiosPromise[Schema$ListExportsResponse] = js.native
  def list(
    params: ParamsDollarResourceDollarMattersDollarExportsDollarList,
    callback: BodyResponseCallback[Schema$ListExportsResponse]
  ): Unit = js.native
  def list(
    params: ParamsDollarResourceDollarMattersDollarExportsDollarList,
    options: BodyResponseCallback[Schema$ListExportsResponse],
    callback: BodyResponseCallback[Schema$ListExportsResponse]
  ): Unit = js.native
  def list(params: ParamsDollarResourceDollarMattersDollarExportsDollarList, options: MethodOptions): GaxiosPromise[Schema$ListExportsResponse] = js.native
  def list(
    params: ParamsDollarResourceDollarMattersDollarExportsDollarList,
    options: MethodOptions,
    callback: BodyResponseCallback[Schema$ListExportsResponse]
  ): Unit = js.native
}

