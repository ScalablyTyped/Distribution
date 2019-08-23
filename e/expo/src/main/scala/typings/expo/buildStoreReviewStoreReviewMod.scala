package typings.expo

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("expo/build/StoreReview/StoreReview", JSImport.Namespace)
@js.native
object buildStoreReviewStoreReviewMod extends js.Object {
  def hasAction(): Boolean = js.native
  def isSupported(): Boolean = js.native
  def requestReview(): js.Promise[Unit] = js.native
  def storeUrl(): String | Null = js.native
}

