package typings.googleapis.buildSrcApisVaultV1Mod.vault_v1

import typings.gaxios.buildSrcCommonMod.GaxiosPromise
import typings.googleapisDashCommon.buildSrcApiMod.APIRequestContext
import typings.googleapisDashCommon.buildSrcApiMod.BodyResponseCallback
import typings.googleapisDashCommon.buildSrcApiMod.MethodOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("googleapis/build/src/apis/vault/v1", "vault_v1.Resource$Matters$Savedqueries")
@js.native
class ResourceDollarMattersDollarSavedqueries protected () extends js.Object {
  def this(context: APIRequestContext) = this()
  var context: APIRequestContext = js.native
  /**
    * vault.matters.savedQueries.create
    * @desc Creates a saved query.
    * @alias vault.matters.savedQueries.create
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.matterId The matter id of the parent matter for which the saved query is to be created.
    * @param {().SavedQuery} params.resource Request body data
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def create(): GaxiosPromise[Schema$SavedQuery] = js.native
  def create(callback: BodyResponseCallback[Schema$SavedQuery]): Unit = js.native
  def create(params: ParamsDollarResourceDollarMattersDollarSavedqueriesDollarCreate): GaxiosPromise[Schema$SavedQuery] = js.native
  def create(
    params: ParamsDollarResourceDollarMattersDollarSavedqueriesDollarCreate,
    callback: BodyResponseCallback[Schema$SavedQuery]
  ): Unit = js.native
  def create(
    params: ParamsDollarResourceDollarMattersDollarSavedqueriesDollarCreate,
    options: BodyResponseCallback[Schema$SavedQuery],
    callback: BodyResponseCallback[Schema$SavedQuery]
  ): Unit = js.native
  def create(params: ParamsDollarResourceDollarMattersDollarSavedqueriesDollarCreate, options: MethodOptions): GaxiosPromise[Schema$SavedQuery] = js.native
  def create(
    params: ParamsDollarResourceDollarMattersDollarSavedqueriesDollarCreate,
    options: MethodOptions,
    callback: BodyResponseCallback[Schema$SavedQuery]
  ): Unit = js.native
  /**
    * vault.matters.savedQueries.delete
    * @desc Deletes a saved query by Id.
    * @alias vault.matters.savedQueries.delete
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.matterId The matter id of the parent matter for which the saved query is to be deleted.
    * @param {string} params.savedQueryId Id of the saved query to be deleted.
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def delete(): GaxiosPromise[Schema$Empty] = js.native
  def delete(callback: BodyResponseCallback[Schema$Empty]): Unit = js.native
  def delete(params: ParamsDollarResourceDollarMattersDollarSavedqueriesDollarDelete): GaxiosPromise[Schema$Empty] = js.native
  def delete(
    params: ParamsDollarResourceDollarMattersDollarSavedqueriesDollarDelete,
    callback: BodyResponseCallback[Schema$Empty]
  ): Unit = js.native
  def delete(
    params: ParamsDollarResourceDollarMattersDollarSavedqueriesDollarDelete,
    options: BodyResponseCallback[Schema$Empty],
    callback: BodyResponseCallback[Schema$Empty]
  ): Unit = js.native
  def delete(params: ParamsDollarResourceDollarMattersDollarSavedqueriesDollarDelete, options: MethodOptions): GaxiosPromise[Schema$Empty] = js.native
  def delete(
    params: ParamsDollarResourceDollarMattersDollarSavedqueriesDollarDelete,
    options: MethodOptions,
    callback: BodyResponseCallback[Schema$Empty]
  ): Unit = js.native
  /**
    * vault.matters.savedQueries.get
    * @desc Retrieves a saved query by Id.
    * @alias vault.matters.savedQueries.get
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.matterId The matter id of the parent matter for which the saved query is to be retrieved.
    * @param {string} params.savedQueryId Id of the saved query to be retrieved.
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def get(): GaxiosPromise[Schema$SavedQuery] = js.native
  def get(callback: BodyResponseCallback[Schema$SavedQuery]): Unit = js.native
  def get(params: ParamsDollarResourceDollarMattersDollarSavedqueriesDollarGet): GaxiosPromise[Schema$SavedQuery] = js.native
  def get(
    params: ParamsDollarResourceDollarMattersDollarSavedqueriesDollarGet,
    callback: BodyResponseCallback[Schema$SavedQuery]
  ): Unit = js.native
  def get(
    params: ParamsDollarResourceDollarMattersDollarSavedqueriesDollarGet,
    options: BodyResponseCallback[Schema$SavedQuery],
    callback: BodyResponseCallback[Schema$SavedQuery]
  ): Unit = js.native
  def get(params: ParamsDollarResourceDollarMattersDollarSavedqueriesDollarGet, options: MethodOptions): GaxiosPromise[Schema$SavedQuery] = js.native
  def get(
    params: ParamsDollarResourceDollarMattersDollarSavedqueriesDollarGet,
    options: MethodOptions,
    callback: BodyResponseCallback[Schema$SavedQuery]
  ): Unit = js.native
  /**
    * vault.matters.savedQueries.list
    * @desc Lists saved queries within a matter. An empty page token in
    * ListSavedQueriesResponse denotes no more saved queries to list.
    * @alias vault.matters.savedQueries.list
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.matterId The matter id of the parent matter for which the saved queries are to be retrieved.
    * @param {integer=} params.pageSize The maximum number of saved queries to return.
    * @param {string=} params.pageToken The pagination token as returned in the previous response. An empty token means start from the beginning.
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def list(): GaxiosPromise[Schema$ListSavedQueriesResponse] = js.native
  def list(callback: BodyResponseCallback[Schema$ListSavedQueriesResponse]): Unit = js.native
  def list(params: ParamsDollarResourceDollarMattersDollarSavedqueriesDollarList): GaxiosPromise[Schema$ListSavedQueriesResponse] = js.native
  def list(
    params: ParamsDollarResourceDollarMattersDollarSavedqueriesDollarList,
    callback: BodyResponseCallback[Schema$ListSavedQueriesResponse]
  ): Unit = js.native
  def list(
    params: ParamsDollarResourceDollarMattersDollarSavedqueriesDollarList,
    options: BodyResponseCallback[Schema$ListSavedQueriesResponse],
    callback: BodyResponseCallback[Schema$ListSavedQueriesResponse]
  ): Unit = js.native
  def list(params: ParamsDollarResourceDollarMattersDollarSavedqueriesDollarList, options: MethodOptions): GaxiosPromise[Schema$ListSavedQueriesResponse] = js.native
  def list(
    params: ParamsDollarResourceDollarMattersDollarSavedqueriesDollarList,
    options: MethodOptions,
    callback: BodyResponseCallback[Schema$ListSavedQueriesResponse]
  ): Unit = js.native
}

