package typings.googleapis.buildSrcApisPlusDomainsV1Mod.plusDomains_v1

import typings.googleapisDashCommon.buildSrcApiMod.APIRequestContext
import typings.googleapisDashCommon.buildSrcApiMod.GlobalOptions
import typings.googleapisDashCommon.buildSrcApiMod.GoogleConfigurable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Google+ Domains API
  *
  * Builds on top of the Google+ platform for Google Apps Domains.
  *
  * @example
  * const {google} = require('googleapis');
  * const plusDomains = google.plusDomains('v1');
  *
  * @namespace plusDomains
  * @type {Function}
  * @version v1
  * @variation v1
  * @param {object=} options Options for Plusdomains
  */
@JSImport("googleapis/build/src/apis/plusDomains/v1", "plusDomains_v1.Plusdomains")
@js.native
class Plusdomains protected () extends js.Object {
  def this(options: GlobalOptions) = this()
  def this(options: GlobalOptions, google: GoogleConfigurable) = this()
  var activities: Resource$Activities = js.native
  var audiences: Resource$Audiences = js.native
  var circles: Resource$Circles = js.native
  var comments: Resource$Comments = js.native
  var context: APIRequestContext = js.native
  var media: Resource$Media = js.native
  var people: Resource$People = js.native
}

