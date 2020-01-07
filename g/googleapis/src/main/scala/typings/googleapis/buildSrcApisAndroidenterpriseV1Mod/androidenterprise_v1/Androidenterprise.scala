package typings.googleapis.buildSrcApisAndroidenterpriseV1Mod.androidenterprise_v1

import typings.googleapisDashCommon.buildSrcApiMod.APIRequestContext
import typings.googleapisDashCommon.buildSrcApiMod.GlobalOptions
import typings.googleapisDashCommon.buildSrcApiMod.GoogleConfigurable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Google Play EMM API
  *
  * Manages the deployment of apps to Android for Work users.
  *
  * @example
  * const {google} = require('googleapis');
  * const androidenterprise = google.androidenterprise('v1');
  *
  * @namespace androidenterprise
  * @type {Function}
  * @version v1
  * @variation v1
  * @param {object=} options Options for Androidenterprise
  */
@JSImport("googleapis/build/src/apis/androidenterprise/v1", "androidenterprise_v1.Androidenterprise")
@js.native
class Androidenterprise protected () extends js.Object {
  def this(options: GlobalOptions) = this()
  def this(options: GlobalOptions, google: GoogleConfigurable) = this()
  var context: APIRequestContext = js.native
  var devices: Resource$Devices = js.native
  var enterprises: Resource$Enterprises = js.native
  var entitlements: Resource$Entitlements = js.native
  var grouplicenses: Resource$Grouplicenses = js.native
  var grouplicenseusers: Resource$Grouplicenseusers = js.native
  var installs: Resource$Installs = js.native
  var managedconfigurationsfordevice: Resource$Managedconfigurationsfordevice = js.native
  var managedconfigurationsforuser: Resource$Managedconfigurationsforuser = js.native
  var managedconfigurationssettings: Resource$Managedconfigurationssettings = js.native
  var permissions: Resource$Permissions = js.native
  var products: Resource$Products = js.native
  var serviceaccountkeys: Resource$Serviceaccountkeys = js.native
  var storelayoutclusters: Resource$Storelayoutclusters = js.native
  var storelayoutpages: Resource$Storelayoutpages = js.native
  var users: Resource$Users = js.native
  var webapps: Resource$Webapps = js.native
}

