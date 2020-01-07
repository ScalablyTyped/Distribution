package typings.googleapis.buildSrcApisWebsecurityscannerV1betaMod.websecurityscanner_v1beta

import typings.googleapisDashCommon.buildSrcApiMod.APIRequestContext
import typings.googleapisDashCommon.buildSrcApiMod.GlobalOptions
import typings.googleapisDashCommon.buildSrcApiMod.GoogleConfigurable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Web Security Scanner API
  *
  * Scans your Compute and App Engine apps for common web vulnerabilities.
  *
  * @example
  * const {google} = require('googleapis');
  * const websecurityscanner = google.websecurityscanner('v1beta');
  *
  * @namespace websecurityscanner
  * @type {Function}
  * @version v1beta
  * @variation v1beta
  * @param {object=} options Options for Websecurityscanner
  */
@JSImport("googleapis/build/src/apis/websecurityscanner/v1beta", "websecurityscanner_v1beta.Websecurityscanner")
@js.native
class Websecurityscanner protected () extends js.Object {
  def this(options: GlobalOptions) = this()
  def this(options: GlobalOptions, google: GoogleConfigurable) = this()
  var context: APIRequestContext = js.native
  var projects: Resource$Projects = js.native
}

