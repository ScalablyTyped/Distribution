package typings.googleapis.cloudsearchV1Mod.cloudsearchV1

import typings.gaxios.commonMod.GaxiosPromise
import typings.googleapisCommon.apiMod.APIRequestContext
import typings.googleapisCommon.apiMod.BodyResponseCallback
import typings.googleapisCommon.apiMod.MethodOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("googleapis/build/src/apis/cloudsearch/v1", "cloudsearch_v1.Resource$Query")
@js.native
class ResourceQuery protected () extends StObject {
  def this(context: APIRequestContext) = this()
  
  var context: APIRequestContext = js.native
  
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
  def search(): GaxiosPromise[SchemaSearchResponse] = js.native
  def search(callback: BodyResponseCallback[SchemaSearchResponse]): Unit = js.native
  def search(params: js.UndefOr[scala.Nothing], options: MethodOptions): GaxiosPromise[SchemaSearchResponse] = js.native
  def search(params: ParamsResourceQuerySearch): GaxiosPromise[SchemaSearchResponse] = js.native
  def search(params: ParamsResourceQuerySearch, callback: BodyResponseCallback[SchemaSearchResponse]): Unit = js.native
  def search(
    params: ParamsResourceQuerySearch,
    options: BodyResponseCallback[SchemaSearchResponse],
    callback: BodyResponseCallback[SchemaSearchResponse]
  ): Unit = js.native
  def search(params: ParamsResourceQuerySearch, options: MethodOptions): GaxiosPromise[SchemaSearchResponse] = js.native
  def search(
    params: ParamsResourceQuerySearch,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaSearchResponse]
  ): Unit = js.native
  
  var sources: ResourceQuerySources = js.native
  
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
  def suggest(): GaxiosPromise[SchemaSuggestResponse] = js.native
  def suggest(callback: BodyResponseCallback[SchemaSuggestResponse]): Unit = js.native
  def suggest(params: js.UndefOr[scala.Nothing], options: MethodOptions): GaxiosPromise[SchemaSuggestResponse] = js.native
  def suggest(params: ParamsResourceQuerySuggest): GaxiosPromise[SchemaSuggestResponse] = js.native
  def suggest(params: ParamsResourceQuerySuggest, callback: BodyResponseCallback[SchemaSuggestResponse]): Unit = js.native
  def suggest(
    params: ParamsResourceQuerySuggest,
    options: BodyResponseCallback[SchemaSuggestResponse],
    callback: BodyResponseCallback[SchemaSuggestResponse]
  ): Unit = js.native
  def suggest(params: ParamsResourceQuerySuggest, options: MethodOptions): GaxiosPromise[SchemaSuggestResponse] = js.native
  def suggest(
    params: ParamsResourceQuerySuggest,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaSuggestResponse]
  ): Unit = js.native
}
