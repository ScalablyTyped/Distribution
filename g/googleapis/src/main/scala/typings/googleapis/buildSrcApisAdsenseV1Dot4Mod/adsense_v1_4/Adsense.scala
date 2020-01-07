package typings.googleapis.buildSrcApisAdsenseV1Dot4Mod.adsense_v1_4

import typings.googleapisDashCommon.buildSrcApiMod.APIRequestContext
import typings.googleapisDashCommon.buildSrcApiMod.GlobalOptions
import typings.googleapisDashCommon.buildSrcApiMod.GoogleConfigurable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * AdSense Management API
  *
  * Accesses AdSense publishers&#39; inventory and generates performance
  * reports.
  *
  * @example
  * const {google} = require('googleapis');
  * const adsense = google.adsense('v1.4');
  *
  * @namespace adsense
  * @type {Function}
  * @version v1.4
  * @variation v1.4
  * @param {object=} options Options for Adsense
  */
@JSImport("googleapis/build/src/apis/adsense/v1.4", "adsense_v1_4.Adsense")
@js.native
class Adsense protected () extends js.Object {
  def this(options: GlobalOptions) = this()
  def this(options: GlobalOptions, google: GoogleConfigurable) = this()
  var accounts: Resource$Accounts = js.native
  var adclients: Resource$Adclients = js.native
  var adunits: Resource$Adunits = js.native
  var alerts: Resource$Alerts = js.native
  var context: APIRequestContext = js.native
  var customchannels: Resource$Customchannels = js.native
  var metadata: Resource$Metadata = js.native
  var payments: Resource$Payments = js.native
  var reports: Resource$Reports = js.native
  var savedadstyles: Resource$Savedadstyles = js.native
  var urlchannels: Resource$Urlchannels = js.native
}

