package typings.googleapis.buildSrcApisGamesManagementV1managementMod.gamesManagement_v1management

import typings.gaxios.buildSrcCommonMod.GaxiosPromise
import typings.googleapisDashCommon.buildSrcApiMod.APIRequestContext
import typings.googleapisDashCommon.buildSrcApiMod.BodyResponseCallback
import typings.googleapisDashCommon.buildSrcApiMod.MethodOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("googleapis/build/src/apis/gamesManagement/v1management", "gamesManagement_v1management.Resource$Applications")
@js.native
class Resource$Applications protected () extends js.Object {
  def this(context: APIRequestContext) = this()
  var context: APIRequestContext = js.native
  /**
    * gamesManagement.applications.listHidden
    * @desc Get the list of players hidden from the given application. This
    * method is only available to user accounts for your developer console.
    * @alias gamesManagement.applications.listHidden
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.applicationId The application ID from the Google Play developer console.
    * @param {integer=} params.maxResults The maximum number of player resources to return in the response, used for paging. For any response, the actual number of player resources returned may be less than the specified maxResults.
    * @param {string=} params.pageToken The token returned by the previous request.
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def listHidden(): GaxiosPromise[Schema$HiddenPlayerList] = js.native
  def listHidden(callback: BodyResponseCallback[Schema$HiddenPlayerList]): Unit = js.native
  def listHidden(params: ParamsDollarResourceDollarApplicationsDollarListhidden): GaxiosPromise[Schema$HiddenPlayerList] = js.native
  def listHidden(
    params: ParamsDollarResourceDollarApplicationsDollarListhidden,
    callback: BodyResponseCallback[Schema$HiddenPlayerList]
  ): Unit = js.native
  def listHidden(
    params: ParamsDollarResourceDollarApplicationsDollarListhidden,
    options: BodyResponseCallback[Schema$HiddenPlayerList],
    callback: BodyResponseCallback[Schema$HiddenPlayerList]
  ): Unit = js.native
  def listHidden(params: ParamsDollarResourceDollarApplicationsDollarListhidden, options: MethodOptions): GaxiosPromise[Schema$HiddenPlayerList] = js.native
  def listHidden(
    params: ParamsDollarResourceDollarApplicationsDollarListhidden,
    options: MethodOptions,
    callback: BodyResponseCallback[Schema$HiddenPlayerList]
  ): Unit = js.native
}

