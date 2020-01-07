package typings.googleapis.buildSrcApisAdminDirectoryUnderscoreV1Mod.admin_directory_v1

import typings.googleapisDashCommon.buildSrcApiMod.APIRequestContext
import typings.googleapisDashCommon.buildSrcApiMod.GlobalOptions
import typings.googleapisDashCommon.buildSrcApiMod.GoogleConfigurable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Admin Directory API
  *
  * Manages enterprise resources such as users and groups, administrative
  * notifications, security features, and more.
  *
  * @example
  * const {google} = require('googleapis');
  * const admin = google.admin('directory_v1');
  *
  * @namespace admin
  * @type {Function}
  * @version directory_v1
  * @variation directory_v1
  * @param {object=} options Options for Admin
  */
@JSImport("googleapis/build/src/apis/admin/directory_v1", "admin_directory_v1.Admin")
@js.native
class Admin protected () extends js.Object {
  def this(options: GlobalOptions) = this()
  def this(options: GlobalOptions, google: GoogleConfigurable) = this()
  var asps: Resource$Asps = js.native
  var channels: Resource$Channels = js.native
  var chromeosdevices: Resource$Chromeosdevices = js.native
  var context: APIRequestContext = js.native
  var customers: Resource$Customers = js.native
  var domainAliases: Resource$Domainaliases = js.native
  var domains: Resource$Domains = js.native
  var groups: Resource$Groups = js.native
  var members: Resource$Members = js.native
  var mobiledevices: Resource$Mobiledevices = js.native
  var notifications: Resource$Notifications = js.native
  var orgunits: Resource$Orgunits = js.native
  var privileges: Resource$Privileges = js.native
  var resolvedAppAccessSettings: Resource$Resolvedappaccesssettings = js.native
  var resources: Resource$Resources = js.native
  var roleAssignments: Resource$Roleassignments = js.native
  var roles: Resource$Roles = js.native
  var schemas: Resource$Schemas = js.native
  var tokens: Resource$Tokens = js.native
  var users: Resource$Users = js.native
  var verificationCodes: Resource$Verificationcodes = js.native
}

