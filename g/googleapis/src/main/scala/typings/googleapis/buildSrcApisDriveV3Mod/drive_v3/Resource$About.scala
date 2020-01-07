package typings.googleapis.buildSrcApisDriveV3Mod.drive_v3

import typings.gaxios.buildSrcCommonMod.GaxiosPromise
import typings.googleapisDashCommon.buildSrcApiMod.APIRequestContext
import typings.googleapisDashCommon.buildSrcApiMod.BodyResponseCallback
import typings.googleapisDashCommon.buildSrcApiMod.MethodOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("googleapis/build/src/apis/drive/v3", "drive_v3.Resource$About")
@js.native
class Resource$About protected () extends js.Object {
  def this(context: APIRequestContext) = this()
  var context: APIRequestContext = js.native
  /**
    * drive.about.get
    * @desc Gets information about the user, the user's Drive, and system
    * capabilities.
    * @alias drive.about.get
    * @memberOf! ()
    *
    * @param {object=} params Parameters for request
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def get(): GaxiosPromise[Schema$About] = js.native
  def get(callback: BodyResponseCallback[Schema$About]): Unit = js.native
  def get(params: ParamsDollarResourceDollarAboutDollarGet): GaxiosPromise[Schema$About] = js.native
  def get(params: ParamsDollarResourceDollarAboutDollarGet, callback: BodyResponseCallback[Schema$About]): Unit = js.native
  def get(
    params: ParamsDollarResourceDollarAboutDollarGet,
    options: BodyResponseCallback[Schema$About],
    callback: BodyResponseCallback[Schema$About]
  ): Unit = js.native
  def get(params: ParamsDollarResourceDollarAboutDollarGet, options: MethodOptions): GaxiosPromise[Schema$About] = js.native
  def get(
    params: ParamsDollarResourceDollarAboutDollarGet,
    options: MethodOptions,
    callback: BodyResponseCallback[Schema$About]
  ): Unit = js.native
}

