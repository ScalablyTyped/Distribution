package typings.googleapis.buildSrcApisDnsV2beta1Mod.dns_v2beta1

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
  * const dns = google.dns('v2beta1');
  *
  * @namespace dns
  * @type {Function}
  * @version v2beta1
  * @variation v2beta1
  * @param {object=} options Options for Dns
  */
@JSImport("googleapis/build/src/apis/dns/v2beta1", "dns_v2beta1.Dns")
@js.native
class Dns protected () extends js.Object {
  def this(options: GlobalOptions) = this()
  def this(options: GlobalOptions, google: GoogleConfigurable) = this()
  var changes: Resource$Changes = js.native
  var context: APIRequestContext = js.native
  var dnsKeys: Resource$Dnskeys = js.native
  var managedZoneOperations: Resource$Managedzoneoperations = js.native
  var managedZones: Resource$Managedzones = js.native
  var projects: Resource$Projects = js.native
  var resourceRecordSets: Resource$Resourcerecordsets = js.native
}

