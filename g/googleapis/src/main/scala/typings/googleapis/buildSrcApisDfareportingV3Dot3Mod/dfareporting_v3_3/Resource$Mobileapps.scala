package typings.googleapis.buildSrcApisDfareportingV3Dot3Mod.dfareporting_v3_3

import typings.gaxios.buildSrcCommonMod.GaxiosPromise
import typings.googleapisDashCommon.buildSrcApiMod.APIRequestContext
import typings.googleapisDashCommon.buildSrcApiMod.BodyResponseCallback
import typings.googleapisDashCommon.buildSrcApiMod.MethodOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("googleapis/build/src/apis/dfareporting/v3.3", "dfareporting_v3_3.Resource$Mobileapps")
@js.native
class Resource$Mobileapps protected () extends js.Object {
  def this(context: APIRequestContext) = this()
  var context: APIRequestContext = js.native
  /**
    * dfareporting.mobileApps.get
    * @desc Gets one mobile app by ID.
    * @alias dfareporting.mobileApps.get
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.id Mobile app ID.
    * @param {string} params.profileId User profile ID associated with this request.
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def get(): GaxiosPromise[Schema$MobileApp] = js.native
  def get(callback: BodyResponseCallback[Schema$MobileApp]): Unit = js.native
  def get(params: ParamsDollarResourceDollarMobileappsDollarGet): GaxiosPromise[Schema$MobileApp] = js.native
  def get(
    params: ParamsDollarResourceDollarMobileappsDollarGet,
    callback: BodyResponseCallback[Schema$MobileApp]
  ): Unit = js.native
  def get(
    params: ParamsDollarResourceDollarMobileappsDollarGet,
    options: BodyResponseCallback[Schema$MobileApp],
    callback: BodyResponseCallback[Schema$MobileApp]
  ): Unit = js.native
  def get(params: ParamsDollarResourceDollarMobileappsDollarGet, options: MethodOptions): GaxiosPromise[Schema$MobileApp] = js.native
  def get(
    params: ParamsDollarResourceDollarMobileappsDollarGet,
    options: MethodOptions,
    callback: BodyResponseCallback[Schema$MobileApp]
  ): Unit = js.native
  /**
    * dfareporting.mobileApps.list
    * @desc Retrieves list of available mobile apps.
    * @alias dfareporting.mobileApps.list
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string=} params.directories Select only apps from these directories.
    * @param {string=} params.ids Select only apps with these IDs.
    * @param {integer=} params.maxResults Maximum number of results to return.
    * @param {string=} params.pageToken Value of the nextPageToken from the previous result page.
    * @param {string} params.profileId User profile ID associated with this request.
    * @param {string=} params.searchString Allows searching for objects by name or ID. Wildcards (*) are allowed. For example, "app*2015" will return objects with names like "app Jan 2018", "app Jan 2018", or simply "app 2018". Most of the searches also add wildcards implicitly at the start and the end of the search string. For example, a search string of "app" will match objects with name "my app", "app 2018", or simply "app".
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def list(): GaxiosPromise[Schema$MobileAppsListResponse] = js.native
  def list(callback: BodyResponseCallback[Schema$MobileAppsListResponse]): Unit = js.native
  def list(params: ParamsDollarResourceDollarMobileappsDollarList): GaxiosPromise[Schema$MobileAppsListResponse] = js.native
  def list(
    params: ParamsDollarResourceDollarMobileappsDollarList,
    callback: BodyResponseCallback[Schema$MobileAppsListResponse]
  ): Unit = js.native
  def list(
    params: ParamsDollarResourceDollarMobileappsDollarList,
    options: BodyResponseCallback[Schema$MobileAppsListResponse],
    callback: BodyResponseCallback[Schema$MobileAppsListResponse]
  ): Unit = js.native
  def list(params: ParamsDollarResourceDollarMobileappsDollarList, options: MethodOptions): GaxiosPromise[Schema$MobileAppsListResponse] = js.native
  def list(
    params: ParamsDollarResourceDollarMobileappsDollarList,
    options: MethodOptions,
    callback: BodyResponseCallback[Schema$MobileAppsListResponse]
  ): Unit = js.native
}

