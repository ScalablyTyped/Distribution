package typings.googleapis.civicinfoV2Mod.civicinfoV2

import typings.gaxios.commonMod.GaxiosPromise
import typings.googleapisCommon.apiMod.APIRequestContext
import typings.googleapisCommon.apiMod.BodyResponseCallback
import typings.googleapisCommon.apiMod.MethodOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("googleapis/build/src/apis/civicinfo/v2", "civicinfo_v2.Resource$Divisions")
@js.native
class ResourceDivisions protected () extends js.Object {
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
  def search(): GaxiosPromise[SchemaDivisionSearchResponse] = js.native
  def search(callback: BodyResponseCallback[SchemaDivisionSearchResponse]): Unit = js.native
  def search(params: js.UndefOr[scala.Nothing], options: MethodOptions): GaxiosPromise[SchemaDivisionSearchResponse] = js.native
  def search(params: ParamsResourceDivisionsSearch): GaxiosPromise[SchemaDivisionSearchResponse] = js.native
  def search(
    params: ParamsResourceDivisionsSearch,
    callback: BodyResponseCallback[SchemaDivisionSearchResponse]
  ): Unit = js.native
  def search(
    params: ParamsResourceDivisionsSearch,
    options: BodyResponseCallback[SchemaDivisionSearchResponse],
    callback: BodyResponseCallback[SchemaDivisionSearchResponse]
  ): Unit = js.native
  def search(params: ParamsResourceDivisionsSearch, options: MethodOptions): GaxiosPromise[SchemaDivisionSearchResponse] = js.native
  def search(
    params: ParamsResourceDivisionsSearch,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaDivisionSearchResponse]
  ): Unit = js.native
}

