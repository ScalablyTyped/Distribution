package typings.googleapis.buildSrcApisAlertcenterV1beta1Mod.alertcenter_v1beta1

import typings.googleapisDashCommon.buildSrcApiMod.APIRequestContext
import typings.googleapisDashCommon.buildSrcApiMod.GlobalOptions
import typings.googleapisDashCommon.buildSrcApiMod.GoogleConfigurable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * G Suite Alert Center API
  *
  * Manages alerts on issues affecting your domain.
  *
  * @example
  * const {google} = require('googleapis');
  * const alertcenter = google.alertcenter('v1beta1');
  *
  * @namespace alertcenter
  * @type {Function}
  * @version v1beta1
  * @variation v1beta1
  * @param {object=} options Options for Alertcenter
  */
@JSImport("googleapis/build/src/apis/alertcenter/v1beta1", "alertcenter_v1beta1.Alertcenter")
@js.native
class Alertcenter protected () extends js.Object {
  def this(options: GlobalOptions) = this()
  def this(options: GlobalOptions, google: GoogleConfigurable) = this()
  var alerts: Resource$Alerts = js.native
  var context: APIRequestContext = js.native
  var v1beta1: Resource$V1beta1 = js.native
}

