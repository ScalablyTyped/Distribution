package typings.googleapis.buildSrcApisAndroidpublisherV3Mod.androidpublisher_v3

import typings.googleapisDashCommon.buildSrcApiMod.APIRequestContext
import typings.googleapisDashCommon.buildSrcApiMod.GlobalOptions
import typings.googleapisDashCommon.buildSrcApiMod.GoogleConfigurable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Google Play Developer API
  *
  * Accesses Android application developers&#39; Google Play accounts.
  *
  * @example
  * const {google} = require('googleapis');
  * const androidpublisher = google.androidpublisher('v3');
  *
  * @namespace androidpublisher
  * @type {Function}
  * @version v3
  * @variation v3
  * @param {object=} options Options for Androidpublisher
  */
@JSImport("googleapis/build/src/apis/androidpublisher/v3", "androidpublisher_v3.Androidpublisher")
@js.native
class Androidpublisher protected () extends js.Object {
  def this(options: GlobalOptions) = this()
  def this(options: GlobalOptions, google: GoogleConfigurable) = this()
  var context: APIRequestContext = js.native
  var edits: Resource$Edits = js.native
  var inappproducts: Resource$Inappproducts = js.native
  var orders: Resource$Orders = js.native
  var purchases: Resource$Purchases = js.native
  var reviews: Resource$Reviews = js.native
}

