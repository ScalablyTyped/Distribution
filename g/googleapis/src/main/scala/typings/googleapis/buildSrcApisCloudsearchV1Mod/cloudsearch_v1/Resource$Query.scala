package typings.googleapis.buildSrcApisCloudsearchV1Mod.cloudsearch_v1

import typings.gaxios.buildSrcCommonMod.GaxiosPromise
import typings.googleapisDashCommon.buildSrcApiMod.APIRequestContext
import typings.googleapisDashCommon.buildSrcApiMod.BodyResponseCallback
import typings.googleapisDashCommon.buildSrcApiMod.MethodOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("googleapis/build/src/apis/cloudsearch/v1", "cloudsearch_v1.Resource$Query")
@js.native
class Resource$Query protected () extends js.Object {
  def this(context: APIRequestContext) = this()
  var context: APIRequestContext = js.native
  var sources: ResourceDollarQueryDollarSources = js.native
  /**
    * cloudsearch.query.search
    * @desc The Cloud Search Query API provides the search method, which
    * returns the most relevant results from a user query.  The results can
    * come from G Suite Apps, such as Gmail or Google Drive, or they can come
    * from data that you have indexed from a third party.
    * @alias cloudsearch.query.search
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {().SearchRequest} params.resource Request body data
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def search(): GaxiosPromise[Schema$SearchResponse] = js.native
  def search(callback: BodyResponseCallback[Schema$SearchResponse]): Unit = js.native
  def search(params: ParamsDollarResourceDollarQueryDollarSearch): GaxiosPromise[Schema$SearchResponse] = js.native
  def search(
    params: ParamsDollarResourceDollarQueryDollarSearch,
    callback: BodyResponseCallback[Schema$SearchResponse]
  ): Unit = js.native
  def search(
    params: ParamsDollarResourceDollarQueryDollarSearch,
    options: BodyResponseCallback[Schema$SearchResponse],
    callback: BodyResponseCallback[Schema$SearchResponse]
  ): Unit = js.native
  def search(params: ParamsDollarResourceDollarQueryDollarSearch, options: MethodOptions): GaxiosPromise[Schema$SearchResponse] = js.native
  def search(
    params: ParamsDollarResourceDollarQueryDollarSearch,
    options: MethodOptions,
    callback: BodyResponseCallback[Schema$SearchResponse]
  ): Unit = js.native
  /**
    * cloudsearch.query.suggest
    * @desc Provides suggestions for autocompleting the query.
    * @alias cloudsearch.query.suggest
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {().SuggestRequest} params.resource Request body data
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def suggest(): GaxiosPromise[Schema$SuggestResponse] = js.native
  def suggest(callback: BodyResponseCallback[Schema$SuggestResponse]): Unit = js.native
  def suggest(params: ParamsDollarResourceDollarQueryDollarSuggest): GaxiosPromise[Schema$SuggestResponse] = js.native
  def suggest(
    params: ParamsDollarResourceDollarQueryDollarSuggest,
    callback: BodyResponseCallback[Schema$SuggestResponse]
  ): Unit = js.native
  def suggest(
    params: ParamsDollarResourceDollarQueryDollarSuggest,
    options: BodyResponseCallback[Schema$SuggestResponse],
    callback: BodyResponseCallback[Schema$SuggestResponse]
  ): Unit = js.native
  def suggest(params: ParamsDollarResourceDollarQueryDollarSuggest, options: MethodOptions): GaxiosPromise[Schema$SuggestResponse] = js.native
  def suggest(
    params: ParamsDollarResourceDollarQueryDollarSuggest,
    options: MethodOptions,
    callback: BodyResponseCallback[Schema$SuggestResponse]
  ): Unit = js.native
}

