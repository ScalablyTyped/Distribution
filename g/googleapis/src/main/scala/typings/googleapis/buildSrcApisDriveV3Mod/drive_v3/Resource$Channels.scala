package typings.googleapis.buildSrcApisDriveV3Mod.drive_v3

import typings.gaxios.buildSrcCommonMod.GaxiosPromise
import typings.googleapisDashCommon.buildSrcApiMod.APIRequestContext
import typings.googleapisDashCommon.buildSrcApiMod.BodyResponseCallback
import typings.googleapisDashCommon.buildSrcApiMod.MethodOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("googleapis/build/src/apis/drive/v3", "drive_v3.Resource$Channels")
@js.native
class Resource$Channels protected () extends js.Object {
  def this(context: APIRequestContext) = this()
  var context: APIRequestContext = js.native
  /**
    * drive.channels.stop
    * @desc Stop watching resources through this channel
    * @alias drive.channels.stop
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {().Channel} params.resource Request body data
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def stop(): GaxiosPromise[Unit] = js.native
  def stop(callback: BodyResponseCallback[Unit]): Unit = js.native
  def stop(params: ParamsDollarResourceDollarChannelsDollarStop): GaxiosPromise[Unit] = js.native
  def stop(params: ParamsDollarResourceDollarChannelsDollarStop, callback: BodyResponseCallback[Unit]): Unit = js.native
  def stop(
    params: ParamsDollarResourceDollarChannelsDollarStop,
    options: BodyResponseCallback[Unit],
    callback: BodyResponseCallback[Unit]
  ): Unit = js.native
  def stop(params: ParamsDollarResourceDollarChannelsDollarStop, options: MethodOptions): GaxiosPromise[Unit] = js.native
  def stop(
    params: ParamsDollarResourceDollarChannelsDollarStop,
    options: MethodOptions,
    callback: BodyResponseCallback[Unit]
  ): Unit = js.native
}

