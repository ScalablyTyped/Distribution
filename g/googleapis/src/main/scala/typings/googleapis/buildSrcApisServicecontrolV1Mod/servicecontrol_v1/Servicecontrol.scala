package typings.googleapis.buildSrcApisServicecontrolV1Mod.servicecontrol_v1

import typings.googleapisDashCommon.buildSrcApiMod.APIRequestContext
import typings.googleapisDashCommon.buildSrcApiMod.GlobalOptions
import typings.googleapisDashCommon.buildSrcApiMod.GoogleConfigurable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Service Control API
  *
  * Provides control plane functionality to managed services, such as logging,
  * monitoring, and status checks.
  *
  * @example
  * const {google} = require('googleapis');
  * const servicecontrol = google.servicecontrol('v1');
  *
  * @namespace servicecontrol
  * @type {Function}
  * @version v1
  * @variation v1
  * @param {object=} options Options for Servicecontrol
  */
@JSImport("googleapis/build/src/apis/servicecontrol/v1", "servicecontrol_v1.Servicecontrol")
@js.native
class Servicecontrol protected () extends js.Object {
  def this(options: GlobalOptions) = this()
  def this(options: GlobalOptions, google: GoogleConfigurable) = this()
  var context: APIRequestContext = js.native
  var services: Resource$Services = js.native
}

