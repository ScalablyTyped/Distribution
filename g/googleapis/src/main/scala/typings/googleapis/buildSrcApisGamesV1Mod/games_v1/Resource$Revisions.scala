package typings.googleapis.buildSrcApisGamesV1Mod.games_v1

import typings.gaxios.buildSrcCommonMod.GaxiosPromise
import typings.googleapisDashCommon.buildSrcApiMod.APIRequestContext
import typings.googleapisDashCommon.buildSrcApiMod.BodyResponseCallback
import typings.googleapisDashCommon.buildSrcApiMod.MethodOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("googleapis/build/src/apis/games/v1", "games_v1.Resource$Revisions")
@js.native
class Resource$Revisions protected () extends js.Object {
  def this(context: APIRequestContext) = this()
  var context: APIRequestContext = js.native
  /**
    * games.revisions.check
    * @desc Checks whether the games client is out of date.
    * @alias games.revisions.check
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.clientRevision The revision of the client SDK used by your application. Format: [PLATFORM_TYPE]:[VERSION_NUMBER]. Possible values of PLATFORM_TYPE are:   - "ANDROID" - Client is running the Android SDK.  - "IOS" - Client is running the iOS SDK.  - "WEB_APP" - Client is running as a Web App.
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def check(): GaxiosPromise[Schema$RevisionCheckResponse] = js.native
  def check(callback: BodyResponseCallback[Schema$RevisionCheckResponse]): Unit = js.native
  def check(params: ParamsDollarResourceDollarRevisionsDollarCheck): GaxiosPromise[Schema$RevisionCheckResponse] = js.native
  def check(
    params: ParamsDollarResourceDollarRevisionsDollarCheck,
    callback: BodyResponseCallback[Schema$RevisionCheckResponse]
  ): Unit = js.native
  def check(
    params: ParamsDollarResourceDollarRevisionsDollarCheck,
    options: BodyResponseCallback[Schema$RevisionCheckResponse],
    callback: BodyResponseCallback[Schema$RevisionCheckResponse]
  ): Unit = js.native
  def check(params: ParamsDollarResourceDollarRevisionsDollarCheck, options: MethodOptions): GaxiosPromise[Schema$RevisionCheckResponse] = js.native
  def check(
    params: ParamsDollarResourceDollarRevisionsDollarCheck,
    options: MethodOptions,
    callback: BodyResponseCallback[Schema$RevisionCheckResponse]
  ): Unit = js.native
}

