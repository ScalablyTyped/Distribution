package typings.googleapis.buildSrcApisAccesscontextmanagerV1Mod.accesscontextmanager_v1

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
  * const accesscontextmanager = google.accesscontextmanager('v1');
  *
  * @namespace accesscontextmanager
  * @type {Function}
  * @version v1
  * @variation v1
  * @param {object=} options Options for Accesscontextmanager
  */
@JSImport("googleapis/build/src/apis/accesscontextmanager/v1", "accesscontextmanager_v1.Accesscontextmanager")
@js.native
class Accesscontextmanager protected () extends js.Object {
  def this(options: GlobalOptions) = this()
  def this(options: GlobalOptions, google: GoogleConfigurable) = this()
  var accessPolicies: Resource$Accesspolicies = js.native
  var context: APIRequestContext = js.native
  var operations: Resource$Operations = js.native
}

