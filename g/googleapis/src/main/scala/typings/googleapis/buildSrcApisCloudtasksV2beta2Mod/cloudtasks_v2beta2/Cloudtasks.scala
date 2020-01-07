package typings.googleapis.buildSrcApisCloudtasksV2beta2Mod.cloudtasks_v2beta2

import typings.googleapisDashCommon.buildSrcApiMod.APIRequestContext
import typings.googleapisDashCommon.buildSrcApiMod.GlobalOptions
import typings.googleapisDashCommon.buildSrcApiMod.GoogleConfigurable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Cloud Tasks API
  *
  * Manages the execution of large numbers of distributed requests.
  *
  * @example
  * const {google} = require('googleapis');
  * const cloudtasks = google.cloudtasks('v2beta2');
  *
  * @namespace cloudtasks
  * @type {Function}
  * @version v2beta2
  * @variation v2beta2
  * @param {object=} options Options for Cloudtasks
  */
@JSImport("googleapis/build/src/apis/cloudtasks/v2beta2", "cloudtasks_v2beta2.Cloudtasks")
@js.native
class Cloudtasks protected () extends js.Object {
  def this(options: GlobalOptions) = this()
  def this(options: GlobalOptions, google: GoogleConfigurable) = this()
  var context: APIRequestContext = js.native
  var projects: Resource$Projects = js.native
}

