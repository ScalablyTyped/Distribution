package typings.googleapis.androidenterpriseV1Mod.androidenterpriseV1

import typings.googleapisCommon.apiMod.APIRequestContext
import typings.googleapisCommon.apiMod.GlobalOptions
import typings.googleapisCommon.apiMod.GoogleConfigurable
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

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
class Androidenterprise protected () extends StObject {
  def this(options: GlobalOptions) = this()
  def this(options: GlobalOptions, google: GoogleConfigurable) = this()
  
  var context: APIRequestContext = js.native
  
  var devices: ResourceDevices = js.native
  
  var enterprises: ResourceEnterprises = js.native
  
  var entitlements: ResourceEntitlements = js.native
  
  var grouplicenses: ResourceGrouplicenses = js.native
  
  var grouplicenseusers: ResourceGrouplicenseusers = js.native
  
  var installs: ResourceInstalls = js.native
  
  var managedconfigurationsfordevice: ResourceManagedconfigurationsfordevice = js.native
  
  var managedconfigurationsforuser: ResourceManagedconfigurationsforuser = js.native
  
  var managedconfigurationssettings: ResourceManagedconfigurationssettings = js.native
  
  var permissions: ResourcePermissions = js.native
  
  var products: ResourceProducts = js.native
  
  var serviceaccountkeys: ResourceServiceaccountkeys = js.native
  
  var storelayoutclusters: ResourceStorelayoutclusters = js.native
  
  var storelayoutpages: ResourceStorelayoutpages = js.native
  
  var users: ResourceUsers = js.native
  
  var webapps: ResourceWebapps = js.native
}
