package typings.gapiClientAndroidpublisher

import typings.gapiClientAndroidpublisher.gapi.client.androidpublisher.EditsResource
import typings.gapiClientAndroidpublisher.gapi.client.androidpublisher.EntitlementsResource
import typings.gapiClientAndroidpublisher.gapi.client.androidpublisher.InappproductsResource
import typings.gapiClientAndroidpublisher.gapi.client.androidpublisher.PurchasesResource
import typings.gapiClientAndroidpublisher.gapi.client.androidpublisher.ReviewsResource
import typings.gapiClientAndroidpublisher.gapiClientAndroidpublisherStrings.androidpublisher
import typings.gapiClientAndroidpublisher.gapiClientAndroidpublisherStrings.v2
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobalScope
@js.native
object global extends js.Object {
  @js.native
  object gapi extends js.Object {
    @js.native
    object client extends js.Object {
      val edits: EditsResource = js.native
      val entitlements: EntitlementsResource = js.native
      val inappproducts: InappproductsResource = js.native
      val purchases: PurchasesResource = js.native
      val reviews: ReviewsResource = js.native
      /** Load Google Play Developer API v2 */
      def load(name: androidpublisher, version: v2): js.Thenable[Unit] = js.native
      def load(name: androidpublisher, version: v2, callback: js.Function0[_]): Unit = js.native
    }
    
  }
  
}

