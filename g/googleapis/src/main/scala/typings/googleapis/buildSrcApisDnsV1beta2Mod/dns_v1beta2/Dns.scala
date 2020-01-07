package typings.googleapis.buildSrcApisDnsV1beta2Mod.dns_v1beta2

import typings.googleapisDashCommon.buildSrcApiMod.APIRequestContext
import typings.googleapisDashCommon.buildSrcApiMod.GlobalOptions
import typings.googleapisDashCommon.buildSrcApiMod.GoogleConfigurable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Google Cloud DNS API
  *
  * Configures and serves authoritative DNS records.
  *
  * @example
  * const {google} = require('googleapis');
  * const dns = google.dns('v1beta2');
  *
  * @namespace dns
  * @type {Function}
  * @version v1beta2
  * @variation v1beta2
  * @param {object=} options Options for Dns
  */
@JSImport("googleapis/build/src/apis/dns/v1beta2", "dns_v1beta2.Dns")
@js.native
class Dns protected () extends js.Object {
  def this(options: GlobalOptions) = this()
  def this(options: GlobalOptions, google: GoogleConfigurable) = this()
  var changes: Resource$Changes = js.native
  var context: APIRequestContext = js.native
  var dnsKeys: Resource$Dnskeys = js.native
  var managedZoneOperations: Resource$Managedzoneoperations = js.native
  var managedZones: Resource$Managedzones = js.native
  var policies: Resource$Policies = js.native
  var projects: Resource$Projects = js.native
  var resourceRecordSets: Resource$Resourcerecordsets = js.native
}

