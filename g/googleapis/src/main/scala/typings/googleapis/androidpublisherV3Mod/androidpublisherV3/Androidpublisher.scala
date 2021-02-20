package typings.googleapis.androidpublisherV3Mod.androidpublisherV3

import typings.googleapisCommon.apiMod.APIRequestContext
import typings.googleapisCommon.apiMod.GlobalOptions
import typings.googleapisCommon.apiMod.GoogleConfigurable
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

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
class Androidpublisher protected () extends StObject {
  def this(options: GlobalOptions) = this()
  def this(options: GlobalOptions, google: GoogleConfigurable) = this()
  
  var context: APIRequestContext = js.native
  
  var edits: ResourceEdits = js.native
  
  var inappproducts: ResourceInappproducts = js.native
  
  var orders: ResourceOrders = js.native
  
  var purchases: ResourcePurchases = js.native
  
  var reviews: ResourceReviews = js.native
}
