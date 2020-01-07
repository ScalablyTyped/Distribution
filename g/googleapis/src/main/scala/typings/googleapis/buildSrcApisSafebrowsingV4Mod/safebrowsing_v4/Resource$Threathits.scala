package typings.googleapis.buildSrcApisSafebrowsingV4Mod.safebrowsing_v4

import typings.gaxios.buildSrcCommonMod.GaxiosPromise
import typings.googleapisDashCommon.buildSrcApiMod.APIRequestContext
import typings.googleapisDashCommon.buildSrcApiMod.BodyResponseCallback
import typings.googleapisDashCommon.buildSrcApiMod.MethodOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("googleapis/build/src/apis/safebrowsing/v4", "safebrowsing_v4.Resource$Threathits")
@js.native
class Resource$Threathits protected () extends js.Object {
  def this(context: APIRequestContext) = this()
  var context: APIRequestContext = js.native
  /**
    * safebrowsing.threatHits.create
    * @desc Reports a Safe Browsing threat list hit to Google. Only projects
    * with TRUSTED_REPORTER visibility can use this method.
    * @alias safebrowsing.threatHits.create
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {().ThreatHit} params.resource Request body data
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def create(): GaxiosPromise[Schema$Empty] = js.native
  def create(callback: BodyResponseCallback[Schema$Empty]): Unit = js.native
  def create(params: ParamsDollarResourceDollarThreathitsDollarCreate): GaxiosPromise[Schema$Empty] = js.native
  def create(
    params: ParamsDollarResourceDollarThreathitsDollarCreate,
    callback: BodyResponseCallback[Schema$Empty]
  ): Unit = js.native
  def create(
    params: ParamsDollarResourceDollarThreathitsDollarCreate,
    options: BodyResponseCallback[Schema$Empty],
    callback: BodyResponseCallback[Schema$Empty]
  ): Unit = js.native
  def create(params: ParamsDollarResourceDollarThreathitsDollarCreate, options: MethodOptions): GaxiosPromise[Schema$Empty] = js.native
  def create(
    params: ParamsDollarResourceDollarThreathitsDollarCreate,
    options: MethodOptions,
    callback: BodyResponseCallback[Schema$Empty]
  ): Unit = js.native
}

