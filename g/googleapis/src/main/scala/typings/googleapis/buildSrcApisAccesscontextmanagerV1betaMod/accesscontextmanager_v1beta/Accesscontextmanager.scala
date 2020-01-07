package typings.googleapis.buildSrcApisAccesscontextmanagerV1betaMod.accesscontextmanager_v1beta

import typings.googleapisDashCommon.buildSrcApiMod.APIRequestContext
import typings.googleapisDashCommon.buildSrcApiMod.GlobalOptions
import typings.googleapisDashCommon.buildSrcApiMod.GoogleConfigurable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Access Context Manager API
  *
  * An API for setting attribute based access control to requests to GCP
  * services.
  *
  * @example
  * const {google} = require('googleapis');
  * const accesscontextmanager = google.accesscontextmanager('v1beta');
  *
  * @namespace accesscontextmanager
  * @type {Function}
  * @version v1beta
  * @variation v1beta
  * @param {object=} options Options for Accesscontextmanager
  */
@JSImport("googleapis/build/src/apis/accesscontextmanager/v1beta", "accesscontextmanager_v1beta.Accesscontextmanager")
@js.native
class Accesscontextmanager protected () extends js.Object {
  def this(options: GlobalOptions) = this()
  def this(options: GlobalOptions, google: GoogleConfigurable) = this()
  var accessPolicies: Resource$Accesspolicies = js.native
  var context: APIRequestContext = js.native
  var operations: Resource$Operations = js.native
}

