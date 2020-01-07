package typings.googleapis.buildSrcApisAdsensehostV4Dot1Mod.adsensehost_v4_1

import typings.googleapisDashCommon.buildSrcApiMod.APIRequestContext
import typings.googleapisDashCommon.buildSrcApiMod.GlobalOptions
import typings.googleapisDashCommon.buildSrcApiMod.GoogleConfigurable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * AdSense Host API
  *
  * Generates performance reports, generates ad codes, and provides publisher
  * management capabilities for AdSense Hosts.
  *
  * @example
  * const {google} = require('googleapis');
  * const adsensehost = google.adsensehost('v4.1');
  *
  * @namespace adsensehost
  * @type {Function}
  * @version v4.1
  * @variation v4.1
  * @param {object=} options Options for Adsensehost
  */
@JSImport("googleapis/build/src/apis/adsensehost/v4.1", "adsensehost_v4_1.Adsensehost")
@js.native
class Adsensehost protected () extends js.Object {
  def this(options: GlobalOptions) = this()
  def this(options: GlobalOptions, google: GoogleConfigurable) = this()
  var accounts: Resource$Accounts = js.native
  var adclients: Resource$Adclients = js.native
  var associationsessions: Resource$Associationsessions = js.native
  var context: APIRequestContext = js.native
  var customchannels: Resource$Customchannels = js.native
  var reports: Resource$Reports = js.native
  var urlchannels: Resource$Urlchannels = js.native
}

