package typings.googleapis.buildSrcApisAdminDatatransferUnderscoreV1Mod.admin_datatransfer_v1

import typings.googleapisDashCommon.buildSrcApiMod.APIRequestContext
import typings.googleapisDashCommon.buildSrcApiMod.GlobalOptions
import typings.googleapisDashCommon.buildSrcApiMod.GoogleConfigurable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Admin Data Transfer API
  *
  * Transfers user data from one user to another.
  *
  * @example
  * const {google} = require('googleapis');
  * const admin = google.admin('datatransfer_v1');
  *
  * @namespace admin
  * @type {Function}
  * @version datatransfer_v1
  * @variation datatransfer_v1
  * @param {object=} options Options for Admin
  */
@JSImport("googleapis/build/src/apis/admin/datatransfer_v1", "admin_datatransfer_v1.Admin")
@js.native
class Admin protected () extends js.Object {
  def this(options: GlobalOptions) = this()
  def this(options: GlobalOptions, google: GoogleConfigurable) = this()
  var applications: Resource$Applications = js.native
  var context: APIRequestContext = js.native
  var transfers: Resource$Transfers = js.native
}

