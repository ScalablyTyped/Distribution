package typings.googleapis.buildSrcApisAdminReportsUnderscoreV1Mod.admin_reports_v1

import typings.googleapisDashCommon.buildSrcApiMod.APIRequestContext
import typings.googleapisDashCommon.buildSrcApiMod.GlobalOptions
import typings.googleapisDashCommon.buildSrcApiMod.GoogleConfigurable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Admin Reports API
  *
  * Fetches reports for the administrators of G Suite customers about the
  * usage, collaboration, security, and risk for their users.
  *
  * @example
  * const {google} = require('googleapis');
  * const admin = google.admin('reports_v1');
  *
  * @namespace admin
  * @type {Function}
  * @version reports_v1
  * @variation reports_v1
  * @param {object=} options Options for Admin
  */
@JSImport("googleapis/build/src/apis/admin/reports_v1", "admin_reports_v1.Admin")
@js.native
class Admin protected () extends js.Object {
  def this(options: GlobalOptions) = this()
  def this(options: GlobalOptions, google: GoogleConfigurable) = this()
  var activities: Resource$Activities = js.native
  var channels: Resource$Channels = js.native
  var context: APIRequestContext = js.native
  var customerUsageReports: Resource$Customerusagereports = js.native
  var entityUsageReports: Resource$Entityusagereports = js.native
  var userUsageReport: Resource$Userusagereport = js.native
}

