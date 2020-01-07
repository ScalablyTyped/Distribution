package typings.googleapis.buildSrcApisAndroidmanagementV1Mod.androidmanagement_v1

import typings.googleapisDashCommon.buildSrcApiMod.APIRequestContext
import typings.googleapisDashCommon.buildSrcApiMod.GlobalOptions
import typings.googleapisDashCommon.buildSrcApiMod.GoogleConfigurable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Android Management API
  *
  * The Android Management API provides remote enterprise management of Android
  * devices and apps.
  *
  * @example
  * const {google} = require('googleapis');
  * const androidmanagement = google.androidmanagement('v1');
  *
  * @namespace androidmanagement
  * @type {Function}
  * @version v1
  * @variation v1
  * @param {object=} options Options for Androidmanagement
  */
@JSImport("googleapis/build/src/apis/androidmanagement/v1", "androidmanagement_v1.Androidmanagement")
@js.native
class Androidmanagement protected () extends js.Object {
  def this(options: GlobalOptions) = this()
  def this(options: GlobalOptions, google: GoogleConfigurable) = this()
  var context: APIRequestContext = js.native
  var enterprises: Resource$Enterprises = js.native
  var signupUrls: Resource$Signupurls = js.native
}

