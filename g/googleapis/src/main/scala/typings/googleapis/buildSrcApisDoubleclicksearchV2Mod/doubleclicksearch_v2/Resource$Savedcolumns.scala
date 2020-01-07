package typings.googleapis.buildSrcApisDoubleclicksearchV2Mod.doubleclicksearch_v2

import typings.gaxios.buildSrcCommonMod.GaxiosPromise
import typings.googleapisDashCommon.buildSrcApiMod.APIRequestContext
import typings.googleapisDashCommon.buildSrcApiMod.BodyResponseCallback
import typings.googleapisDashCommon.buildSrcApiMod.MethodOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("googleapis/build/src/apis/doubleclicksearch/v2", "doubleclicksearch_v2.Resource$Savedcolumns")
@js.native
class Resource$Savedcolumns protected () extends js.Object {
  def this(context: APIRequestContext) = this()
  var context: APIRequestContext = js.native
  /**
    * doubleclicksearch.savedColumns.list
    * @desc Retrieve the list of saved columns for a specified advertiser.
    * @alias doubleclicksearch.savedColumns.list
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.advertiserId DS ID of the advertiser.
    * @param {string} params.agencyId DS ID of the agency.
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def list(): GaxiosPromise[Schema$SavedColumnList] = js.native
  def list(callback: BodyResponseCallback[Schema$SavedColumnList]): Unit = js.native
  def list(params: ParamsDollarResourceDollarSavedcolumnsDollarList): GaxiosPromise[Schema$SavedColumnList] = js.native
  def list(
    params: ParamsDollarResourceDollarSavedcolumnsDollarList,
    callback: BodyResponseCallback[Schema$SavedColumnList]
  ): Unit = js.native
  def list(
    params: ParamsDollarResourceDollarSavedcolumnsDollarList,
    options: BodyResponseCallback[Schema$SavedColumnList],
    callback: BodyResponseCallback[Schema$SavedColumnList]
  ): Unit = js.native
  def list(params: ParamsDollarResourceDollarSavedcolumnsDollarList, options: MethodOptions): GaxiosPromise[Schema$SavedColumnList] = js.native
  def list(
    params: ParamsDollarResourceDollarSavedcolumnsDollarList,
    options: MethodOptions,
    callback: BodyResponseCallback[Schema$SavedColumnList]
  ): Unit = js.native
}

