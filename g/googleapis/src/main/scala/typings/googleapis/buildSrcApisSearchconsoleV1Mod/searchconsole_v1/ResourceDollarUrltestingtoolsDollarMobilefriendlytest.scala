package typings.googleapis.buildSrcApisSearchconsoleV1Mod.searchconsole_v1

import typings.gaxios.buildSrcCommonMod.GaxiosPromise
import typings.googleapisDashCommon.buildSrcApiMod.APIRequestContext
import typings.googleapisDashCommon.buildSrcApiMod.BodyResponseCallback
import typings.googleapisDashCommon.buildSrcApiMod.MethodOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("googleapis/build/src/apis/searchconsole/v1", "searchconsole_v1.Resource$Urltestingtools$Mobilefriendlytest")
@js.native
class ResourceDollarUrltestingtoolsDollarMobilefriendlytest protected () extends js.Object {
  def this(context: APIRequestContext) = this()
  var context: APIRequestContext = js.native
  /**
    * searchconsole.urlTestingTools.mobileFriendlyTest.run
    * @desc Runs Mobile-Friendly Test for a given URL.
    * @alias searchconsole.urlTestingTools.mobileFriendlyTest.run
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {().RunMobileFriendlyTestRequest} params.resource Request body data
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def run(): GaxiosPromise[Schema$RunMobileFriendlyTestResponse] = js.native
  def run(callback: BodyResponseCallback[Schema$RunMobileFriendlyTestResponse]): Unit = js.native
  def run(params: ParamsDollarResourceDollarUrltestingtoolsDollarMobilefriendlytestDollarRun): GaxiosPromise[Schema$RunMobileFriendlyTestResponse] = js.native
  def run(
    params: ParamsDollarResourceDollarUrltestingtoolsDollarMobilefriendlytestDollarRun,
    callback: BodyResponseCallback[Schema$RunMobileFriendlyTestResponse]
  ): Unit = js.native
  def run(
    params: ParamsDollarResourceDollarUrltestingtoolsDollarMobilefriendlytestDollarRun,
    options: BodyResponseCallback[Schema$RunMobileFriendlyTestResponse],
    callback: BodyResponseCallback[Schema$RunMobileFriendlyTestResponse]
  ): Unit = js.native
  def run(
    params: ParamsDollarResourceDollarUrltestingtoolsDollarMobilefriendlytestDollarRun,
    options: MethodOptions
  ): GaxiosPromise[Schema$RunMobileFriendlyTestResponse] = js.native
  def run(
    params: ParamsDollarResourceDollarUrltestingtoolsDollarMobilefriendlytestDollarRun,
    options: MethodOptions,
    callback: BodyResponseCallback[Schema$RunMobileFriendlyTestResponse]
  ): Unit = js.native
}

