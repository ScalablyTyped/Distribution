package typings.googleapis.buildSrcApisDoubleclicksearchV2Mod.doubleclicksearch_v2

import typings.gaxios.buildSrcCommonMod.GaxiosPromise
import typings.googleapisDashCommon.buildSrcApiMod.APIRequestContext
import typings.googleapisDashCommon.buildSrcApiMod.BodyResponseCallback
import typings.googleapisDashCommon.buildSrcApiMod.MethodOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("googleapis/build/src/apis/doubleclicksearch/v2", "doubleclicksearch_v2.Resource$Conversion")
@js.native
class Resource$Conversion protected () extends js.Object {
  def this(context: APIRequestContext) = this()
  var context: APIRequestContext = js.native
  /**
    * doubleclicksearch.conversion.get
    * @desc Retrieves a list of conversions from a DoubleClick Search engine
    * account.
    * @alias doubleclicksearch.conversion.get
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string=} params.adGroupId Numeric ID of the ad group.
    * @param {string=} params.adId Numeric ID of the ad.
    * @param {string} params.advertiserId Numeric ID of the advertiser.
    * @param {string} params.agencyId Numeric ID of the agency.
    * @param {string=} params.campaignId Numeric ID of the campaign.
    * @param {string=} params.criterionId Numeric ID of the criterion.
    * @param {integer} params.endDate Last date (inclusive) on which to retrieve conversions. Format is yyyymmdd.
    * @param {string} params.engineAccountId Numeric ID of the engine account.
    * @param {integer} params.rowCount The number of conversions to return per call.
    * @param {integer} params.startDate First date (inclusive) on which to retrieve conversions. Format is yyyymmdd.
    * @param {integer} params.startRow The 0-based starting index for retrieving conversions results.
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def get(): GaxiosPromise[Schema$ConversionList] = js.native
  def get(callback: BodyResponseCallback[Schema$ConversionList]): Unit = js.native
  def get(params: ParamsDollarResourceDollarConversionDollarGet): GaxiosPromise[Schema$ConversionList] = js.native
  def get(
    params: ParamsDollarResourceDollarConversionDollarGet,
    callback: BodyResponseCallback[Schema$ConversionList]
  ): Unit = js.native
  def get(
    params: ParamsDollarResourceDollarConversionDollarGet,
    options: BodyResponseCallback[Schema$ConversionList],
    callback: BodyResponseCallback[Schema$ConversionList]
  ): Unit = js.native
  def get(params: ParamsDollarResourceDollarConversionDollarGet, options: MethodOptions): GaxiosPromise[Schema$ConversionList] = js.native
  def get(
    params: ParamsDollarResourceDollarConversionDollarGet,
    options: MethodOptions,
    callback: BodyResponseCallback[Schema$ConversionList]
  ): Unit = js.native
  /**
    * doubleclicksearch.conversion.insert
    * @desc Inserts a batch of new conversions into DoubleClick Search.
    * @alias doubleclicksearch.conversion.insert
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {().ConversionList} params.resource Request body data
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def insert(): GaxiosPromise[Schema$ConversionList] = js.native
  def insert(callback: BodyResponseCallback[Schema$ConversionList]): Unit = js.native
  def insert(params: ParamsDollarResourceDollarConversionDollarInsert): GaxiosPromise[Schema$ConversionList] = js.native
  def insert(
    params: ParamsDollarResourceDollarConversionDollarInsert,
    callback: BodyResponseCallback[Schema$ConversionList]
  ): Unit = js.native
  def insert(
    params: ParamsDollarResourceDollarConversionDollarInsert,
    options: BodyResponseCallback[Schema$ConversionList],
    callback: BodyResponseCallback[Schema$ConversionList]
  ): Unit = js.native
  def insert(params: ParamsDollarResourceDollarConversionDollarInsert, options: MethodOptions): GaxiosPromise[Schema$ConversionList] = js.native
  def insert(
    params: ParamsDollarResourceDollarConversionDollarInsert,
    options: MethodOptions,
    callback: BodyResponseCallback[Schema$ConversionList]
  ): Unit = js.native
  /**
    * doubleclicksearch.conversion.patch
    * @desc Updates a batch of conversions in DoubleClick Search. This method
    * supports patch semantics.
    * @alias doubleclicksearch.conversion.patch
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.advertiserId Numeric ID of the advertiser.
    * @param {string} params.agencyId Numeric ID of the agency.
    * @param {integer} params.endDate Last date (inclusive) on which to retrieve conversions. Format is yyyymmdd.
    * @param {string} params.engineAccountId Numeric ID of the engine account.
    * @param {integer} params.rowCount The number of conversions to return per call.
    * @param {integer} params.startDate First date (inclusive) on which to retrieve conversions. Format is yyyymmdd.
    * @param {integer} params.startRow The 0-based starting index for retrieving conversions results.
    * @param {().ConversionList} params.resource Request body data
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def patch(): GaxiosPromise[Schema$ConversionList] = js.native
  def patch(callback: BodyResponseCallback[Schema$ConversionList]): Unit = js.native
  def patch(params: ParamsDollarResourceDollarConversionDollarPatch): GaxiosPromise[Schema$ConversionList] = js.native
  def patch(
    params: ParamsDollarResourceDollarConversionDollarPatch,
    callback: BodyResponseCallback[Schema$ConversionList]
  ): Unit = js.native
  def patch(
    params: ParamsDollarResourceDollarConversionDollarPatch,
    options: BodyResponseCallback[Schema$ConversionList],
    callback: BodyResponseCallback[Schema$ConversionList]
  ): Unit = js.native
  def patch(params: ParamsDollarResourceDollarConversionDollarPatch, options: MethodOptions): GaxiosPromise[Schema$ConversionList] = js.native
  def patch(
    params: ParamsDollarResourceDollarConversionDollarPatch,
    options: MethodOptions,
    callback: BodyResponseCallback[Schema$ConversionList]
  ): Unit = js.native
  /**
    * doubleclicksearch.conversion.update
    * @desc Updates a batch of conversions in DoubleClick Search.
    * @alias doubleclicksearch.conversion.update
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {().ConversionList} params.resource Request body data
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def update(): GaxiosPromise[Schema$ConversionList] = js.native
  def update(callback: BodyResponseCallback[Schema$ConversionList]): Unit = js.native
  def update(params: ParamsDollarResourceDollarConversionDollarUpdate): GaxiosPromise[Schema$ConversionList] = js.native
  def update(
    params: ParamsDollarResourceDollarConversionDollarUpdate,
    callback: BodyResponseCallback[Schema$ConversionList]
  ): Unit = js.native
  def update(
    params: ParamsDollarResourceDollarConversionDollarUpdate,
    options: BodyResponseCallback[Schema$ConversionList],
    callback: BodyResponseCallback[Schema$ConversionList]
  ): Unit = js.native
  def update(params: ParamsDollarResourceDollarConversionDollarUpdate, options: MethodOptions): GaxiosPromise[Schema$ConversionList] = js.native
  def update(
    params: ParamsDollarResourceDollarConversionDollarUpdate,
    options: MethodOptions,
    callback: BodyResponseCallback[Schema$ConversionList]
  ): Unit = js.native
  /**
    * doubleclicksearch.conversion.updateAvailability
    * @desc Updates the availabilities of a batch of floodlight activities in
    * DoubleClick Search.
    * @alias doubleclicksearch.conversion.updateAvailability
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {().UpdateAvailabilityRequest} params.resource Request body data
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def updateAvailability(): GaxiosPromise[Schema$UpdateAvailabilityResponse] = js.native
  def updateAvailability(callback: BodyResponseCallback[Schema$UpdateAvailabilityResponse]): Unit = js.native
  def updateAvailability(params: ParamsDollarResourceDollarConversionDollarUpdateavailability): GaxiosPromise[Schema$UpdateAvailabilityResponse] = js.native
  def updateAvailability(
    params: ParamsDollarResourceDollarConversionDollarUpdateavailability,
    callback: BodyResponseCallback[Schema$UpdateAvailabilityResponse]
  ): Unit = js.native
  def updateAvailability(
    params: ParamsDollarResourceDollarConversionDollarUpdateavailability,
    options: BodyResponseCallback[Schema$UpdateAvailabilityResponse],
    callback: BodyResponseCallback[Schema$UpdateAvailabilityResponse]
  ): Unit = js.native
  def updateAvailability(params: ParamsDollarResourceDollarConversionDollarUpdateavailability, options: MethodOptions): GaxiosPromise[Schema$UpdateAvailabilityResponse] = js.native
  def updateAvailability(
    params: ParamsDollarResourceDollarConversionDollarUpdateavailability,
    options: MethodOptions,
    callback: BodyResponseCallback[Schema$UpdateAvailabilityResponse]
  ): Unit = js.native
}

