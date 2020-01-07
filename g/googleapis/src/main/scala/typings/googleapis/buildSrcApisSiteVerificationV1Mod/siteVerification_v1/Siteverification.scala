package typings.googleapis.buildSrcApisSiteVerificationV1Mod.siteVerification_v1

import typings.googleapisDashCommon.buildSrcApiMod.APIRequestContext
import typings.googleapisDashCommon.buildSrcApiMod.GlobalOptions
import typings.googleapisDashCommon.buildSrcApiMod.GoogleConfigurable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Google Site Verification API
  *
  * Verifies ownership of websites or domains with Google.
  *
  * @example
  * const {google} = require('googleapis');
  * const siteVerification = google.siteVerification('v1');
  *
  * @namespace siteVerification
  * @type {Function}
  * @version v1
  * @variation v1
  * @param {object=} options Options for Siteverification
  */
@JSImport("googleapis/build/src/apis/siteVerification/v1", "siteVerification_v1.Siteverification")
@js.native
class Siteverification protected () extends js.Object {
  def this(options: GlobalOptions) = this()
  def this(options: GlobalOptions, google: GoogleConfigurable) = this()
  var context: APIRequestContext = js.native
  var webResource: Resource$Webresource = js.native
}

