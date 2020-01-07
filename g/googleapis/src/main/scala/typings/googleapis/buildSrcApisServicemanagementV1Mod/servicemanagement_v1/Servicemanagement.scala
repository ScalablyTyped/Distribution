package typings.googleapis.buildSrcApisServicemanagementV1Mod.servicemanagement_v1

import typings.googleapisDashCommon.buildSrcApiMod.APIRequestContext
import typings.googleapisDashCommon.buildSrcApiMod.GlobalOptions
import typings.googleapisDashCommon.buildSrcApiMod.GoogleConfigurable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Service Management API
  *
  * Google Service Management allows service producers to publish their
  * services on Google Cloud Platform so that they can be discovered and used
  * by service consumers.
  *
  * @example
  * const {google} = require('googleapis');
  * const servicemanagement = google.servicemanagement('v1');
  *
  * @namespace servicemanagement
  * @type {Function}
  * @version v1
  * @variation v1
  * @param {object=} options Options for Servicemanagement
  */
@JSImport("googleapis/build/src/apis/servicemanagement/v1", "servicemanagement_v1.Servicemanagement")
@js.native
class Servicemanagement protected () extends js.Object {
  def this(options: GlobalOptions) = this()
  def this(options: GlobalOptions, google: GoogleConfigurable) = this()
  var context: APIRequestContext = js.native
  var operations: Resource$Operations = js.native
  var services: Resource$Services = js.native
}

