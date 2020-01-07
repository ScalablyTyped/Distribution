package typings.googleapis.buildSrcApisSqladminV1beta4Mod.sqladmin_v1beta4

import typings.googleapisDashCommon.buildSrcApiMod.APIRequestContext
import typings.googleapisDashCommon.buildSrcApiMod.GlobalOptions
import typings.googleapisDashCommon.buildSrcApiMod.GoogleConfigurable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Cloud SQL Admin API
  *
  * Creates and manages Cloud SQL instances, which provide fully managed MySQL
  * or PostgreSQL databases.
  *
  * @example
  * const {google} = require('googleapis');
  * const sqladmin = google.sqladmin('v1beta4');
  *
  * @namespace sqladmin
  * @type {Function}
  * @version v1beta4
  * @variation v1beta4
  * @param {object=} options Options for Sqladmin
  */
@JSImport("googleapis/build/src/apis/sqladmin/v1beta4", "sqladmin_v1beta4.Sqladmin")
@js.native
class Sqladmin protected () extends js.Object {
  def this(options: GlobalOptions) = this()
  def this(options: GlobalOptions, google: GoogleConfigurable) = this()
  var backupRuns: Resource$Backupruns = js.native
  var context: APIRequestContext = js.native
  var databases: Resource$Databases = js.native
  var flags: Resource$Flags = js.native
  var instances: Resource$Instances = js.native
  var operations: Resource$Operations = js.native
  var sslCerts: Resource$Sslcerts = js.native
  var tiers: Resource$Tiers = js.native
  var users: Resource$Users = js.native
}

