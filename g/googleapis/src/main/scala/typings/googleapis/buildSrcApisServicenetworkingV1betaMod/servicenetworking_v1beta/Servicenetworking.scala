package typings.googleapis.buildSrcApisServicenetworkingV1betaMod.servicenetworking_v1beta

import typings.googleapisDashCommon.buildSrcApiMod.APIRequestContext
import typings.googleapisDashCommon.buildSrcApiMod.GlobalOptions
import typings.googleapisDashCommon.buildSrcApiMod.GoogleConfigurable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Service Networking API
  *
  * Provides automatic management of network configurations necessary for
  * certain services.
  *
  * @example
  * const {google} = require('googleapis');
  * const servicenetworking = google.servicenetworking('v1beta');
  *
  * @namespace servicenetworking
  * @type {Function}
  * @version v1beta
  * @variation v1beta
  * @param {object=} options Options for Servicenetworking
  */
@JSImport("googleapis/build/src/apis/servicenetworking/v1beta", "servicenetworking_v1beta.Servicenetworking")
@js.native
class Servicenetworking protected () extends js.Object {
  def this(options: GlobalOptions) = this()
  def this(options: GlobalOptions, google: GoogleConfigurable) = this()
  var context: APIRequestContext = js.native
  var operations: Resource$Operations = js.native
  var services: Resource$Services = js.native
}

