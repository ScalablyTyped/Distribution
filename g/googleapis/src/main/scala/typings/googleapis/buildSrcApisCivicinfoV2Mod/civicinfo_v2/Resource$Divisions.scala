package typings.googleapis.buildSrcApisCivicinfoV2Mod.civicinfo_v2

import typings.gaxios.buildSrcCommonMod.GaxiosPromise
import typings.googleapisDashCommon.buildSrcApiMod.APIRequestContext
import typings.googleapisDashCommon.buildSrcApiMod.BodyResponseCallback
import typings.googleapisDashCommon.buildSrcApiMod.MethodOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("googleapis/build/src/apis/civicinfo/v2", "civicinfo_v2.Resource$Divisions")
@js.native
class Resource$Divisions protected () extends js.Object {
  def this(context: APIRequestContext) = this()
  var context: APIRequestContext = js.native
  /**
    * civicinfo.divisions.search
    * @desc Searches for political divisions by their natural name or OCD ID.
    * @alias civicinfo.divisions.search
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string=} params.query The search query. Queries can cover any parts of a OCD ID or a human readable division name. All words given in the query are treated as required patterns. In addition to that, most query operators of the Apache Lucene library are supported. See http://lucene.apache.org/core/2_9_4/queryparsersyntax.html
    * @param {().DivisionSearchRequest} params.resource Request body data
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def search(): GaxiosPromise[Schema$DivisionSearchResponse] = js.native
  def search(callback: BodyResponseCallback[Schema$DivisionSearchResponse]): Unit = js.native
  def search(params: ParamsDollarResourceDollarDivisionsDollarSearch): GaxiosPromise[Schema$DivisionSearchResponse] = js.native
  def search(
    params: ParamsDollarResourceDollarDivisionsDollarSearch,
    callback: BodyResponseCallback[Schema$DivisionSearchResponse]
  ): Unit = js.native
  def search(
    params: ParamsDollarResourceDollarDivisionsDollarSearch,
    options: BodyResponseCallback[Schema$DivisionSearchResponse],
    callback: BodyResponseCallback[Schema$DivisionSearchResponse]
  ): Unit = js.native
  def search(params: ParamsDollarResourceDollarDivisionsDollarSearch, options: MethodOptions): GaxiosPromise[Schema$DivisionSearchResponse] = js.native
  def search(
    params: ParamsDollarResourceDollarDivisionsDollarSearch,
    options: MethodOptions,
    callback: BodyResponseCallback[Schema$DivisionSearchResponse]
  ): Unit = js.native
}

