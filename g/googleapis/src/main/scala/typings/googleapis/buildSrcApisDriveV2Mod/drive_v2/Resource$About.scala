package typings.googleapis.buildSrcApisDriveV2Mod.drive_v2

import typings.gaxios.buildSrcCommonMod.GaxiosPromise
import typings.googleapisDashCommon.buildSrcApiMod.APIRequestContext
import typings.googleapisDashCommon.buildSrcApiMod.BodyResponseCallback
import typings.googleapisDashCommon.buildSrcApiMod.MethodOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("googleapis/build/src/apis/drive/v2", "drive_v2.Resource$About")
@js.native
class Resource$About protected () extends js.Object {
  def this(context: APIRequestContext) = this()
  var context: APIRequestContext = js.native
  /**
    * drive.about.get
    * @desc Gets the information about the current user along with Drive API
    * settings
    * @alias drive.about.get
    * @memberOf! ()
    *
    * @param {object=} params Parameters for request
    * @param {boolean=} params.includeSubscribed Whether to count changes outside the My Drive hierarchy. When set to false, changes to files such as those in the Application Data folder or shared files which have not been added to My Drive will be omitted from the maxChangeIdCount.
    * @param {string=} params.maxChangeIdCount Maximum number of remaining change IDs to count
    * @param {string=} params.startChangeId Change ID to start counting from when calculating number of remaining change IDs
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

