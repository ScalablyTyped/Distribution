package typings.googleapis.buildSrcApisDiscoveryV1Mod.discovery_v1

import typings.googleapisDashCommon.buildSrcApiMod.APIRequestContext
import typings.googleapisDashCommon.buildSrcApiMod.GlobalOptions
import typings.googleapisDashCommon.buildSrcApiMod.GoogleConfigurable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * API Discovery Service
  *
  * Provides information about other Google APIs, such as what APIs are
  * available, the resource, and method details for each API.
  *
  * @example
  * const {google} = require('googleapis');
  * const discovery = google.discovery('v1');
  *
  * @namespace discovery
  * @type {Function}
  * @version v1
  * @variation v1
  * @param {object=} options Options for Discovery
  */
@JSImport("googleapis/build/src/apis/discovery/v1", "discovery_v1.Discovery")
@js.native
class Discovery protected () extends js.Object {
  def this(options: GlobalOptions) = this()
  def this(options: GlobalOptions, google: GoogleConfigurable) = this()
  var apis: Resource$Apis = js.native
  var context: APIRequestContext = js.native
}

