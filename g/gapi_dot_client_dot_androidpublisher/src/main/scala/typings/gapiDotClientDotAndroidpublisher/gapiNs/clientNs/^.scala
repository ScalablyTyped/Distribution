package typings.gapiDotClientDotAndroidpublisher.gapiNs.clientNs

import typings.gapiDotClientDotAndroidpublisher.gapiDotClientDotAndroidpublisherStrings.androidpublisher
import typings.gapiDotClientDotAndroidpublisher.gapiDotClientDotAndroidpublisherStrings.v2
import typings.gapiDotClientDotAndroidpublisher.gapiNs.clientNs.androidpublisherNs.EditsResource
import typings.gapiDotClientDotAndroidpublisher.gapiNs.clientNs.androidpublisherNs.EntitlementsResource
import typings.gapiDotClientDotAndroidpublisher.gapiNs.clientNs.androidpublisherNs.InappproductsResource
import typings.gapiDotClientDotAndroidpublisher.gapiNs.clientNs.androidpublisherNs.PurchasesResource
import typings.gapiDotClientDotAndroidpublisher.gapiNs.clientNs.androidpublisherNs.ReviewsResource
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("gapi.client")
@js.native
object ^ extends js.Object {
  val edits: EditsResource = js.native
  val entitlements: EntitlementsResource = js.native
  val inappproducts: InappproductsResource = js.native
  val purchases: PurchasesResource = js.native
  val reviews: ReviewsResource = js.native
  /** Load Google Play Developer API v2 */
  def load(name: androidpublisher, version: v2): js.Thenable[Unit] = js.native
  def load(name: androidpublisher, version: v2, callback: js.Function0[_]): Unit = js.native
}

