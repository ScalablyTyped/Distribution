package typings.googleapis.buildSrcApisAdsenseV1Dot4Mod.adsense_v1_4

import typings.gaxios.buildSrcCommonMod.GaxiosPromise
import typings.googleapisDashCommon.buildSrcApiMod.APIRequestContext
import typings.googleapisDashCommon.buildSrcApiMod.BodyResponseCallback
import typings.googleapisDashCommon.buildSrcApiMod.MethodOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("googleapis/build/src/apis/adsense/v1.4", "adsense_v1_4.Resource$Metadata$Dimensions")
@js.native
class ResourceDollarMetadataDollarDimensions protected () extends js.Object {
  def this(context: APIRequestContext) = this()
  var context: APIRequestContext = js.native
  /**
    * adsense.metadata.dimensions.list
    * @desc List the metadata for the dimensions available to this AdSense
    * account.
    * @alias adsense.metadata.dimensions.list
    * @memberOf! ()
    *
    * @param {object=} params Parameters for request
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def list(): GaxiosPromise[Schema$Metadata] = js.native
  def list(callback: BodyResponseCallback[Schema$Metadata]): Unit = js.native
  def list(params: ParamsDollarResourceDollarMetadataDollarDimensionsDollarList): GaxiosPromise[Schema$Metadata] = js.native
  def list(
    params: ParamsDollarResourceDollarMetadataDollarDimensionsDollarList,
    callback: BodyResponseCallback[Schema$Metadata]
  ): Unit = js.native
  def list(
    params: ParamsDollarResourceDollarMetadataDollarDimensionsDollarList,
    options: BodyResponseCallback[Schema$Metadata],
    callback: BodyResponseCallback[Schema$Metadata]
  ): Unit = js.native
  def list(params: ParamsDollarResourceDollarMetadataDollarDimensionsDollarList, options: MethodOptions): GaxiosPromise[Schema$Metadata] = js.native
  def list(
    params: ParamsDollarResourceDollarMetadataDollarDimensionsDollarList,
    options: MethodOptions,
    callback: BodyResponseCallback[Schema$Metadata]
  ): Unit = js.native
}

