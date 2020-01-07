package typings.googleapis.buildSrcApisCloudschedulerV1beta1Mod.cloudscheduler_v1beta1

import typings.googleapisDashCommon.buildSrcApiMod.APIRequestContext
import typings.googleapisDashCommon.buildSrcApiMod.GlobalOptions
import typings.googleapisDashCommon.buildSrcApiMod.GoogleConfigurable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Cloud Scheduler API
  *
  * Creates and manages jobs run on a regular recurring schedule.
  *
  * @example
  * const {google} = require('googleapis');
  * const cloudscheduler = google.cloudscheduler('v1beta1');
  *
  * @namespace cloudscheduler
  * @type {Function}
  * @version v1beta1
  * @variation v1beta1
  * @param {object=} options Options for Cloudscheduler
  */
@JSImport("googleapis/build/src/apis/cloudscheduler/v1beta1", "cloudscheduler_v1beta1.Cloudscheduler")
@js.native
class Cloudscheduler protected () extends js.Object {
  def this(options: GlobalOptions) = this()
  def this(options: GlobalOptions, google: GoogleConfigurable) = this()
  var context: APIRequestContext = js.native
  var projects: Resource$Projects = js.native
}

