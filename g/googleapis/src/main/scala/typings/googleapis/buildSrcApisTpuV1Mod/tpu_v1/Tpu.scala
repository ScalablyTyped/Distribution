package typings.googleapis.buildSrcApisTpuV1Mod.tpu_v1

import typings.googleapisDashCommon.buildSrcApiMod.APIRequestContext
import typings.googleapisDashCommon.buildSrcApiMod.GlobalOptions
import typings.googleapisDashCommon.buildSrcApiMod.GoogleConfigurable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Cloud TPU API
  *
  * TPU API provides customers with access to Google TPU technology.
  *
  * @example
  * const {google} = require('googleapis');
  * const tpu = google.tpu('v1');
  *
  * @namespace tpu
  * @type {Function}
  * @version v1
  * @variation v1
  * @param {object=} options Options for Tpu
  */
@JSImport("googleapis/build/src/apis/tpu/v1", "tpu_v1.Tpu")
@js.native
class Tpu protected () extends js.Object {
  def this(options: GlobalOptions) = this()
  def this(options: GlobalOptions, google: GoogleConfigurable) = this()
  var context: APIRequestContext = js.native
  var projects: Resource$Projects = js.native
}

