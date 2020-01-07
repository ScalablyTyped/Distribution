package typings.googleapis.buildSrcApisAndroidpublisherV1Dot1Mod.androidpublisher_v1_1

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
  * const androidpublisher = google.androidpublisher('v1.1');
  *
  * @namespace androidpublisher
  * @type {Function}
  * @version v1.1
  * @variation v1.1
  * @param {object=} options Options for Androidpublisher
  */
@JSImport("googleapis/build/src/apis/androidpublisher/v1.1", "androidpublisher_v1_1.Androidpublisher")
@js.native
class Androidpublisher protected () extends js.Object {
  def this(options: GlobalOptions) = this()
  def this(options: GlobalOptions, google: GoogleConfigurable) = this()
  var context: APIRequestContext = js.native
  var inapppurchases: Resource$Inapppurchases = js.native
  var purchases: Resource$Purchases = js.native
}

