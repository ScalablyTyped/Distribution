package typings.expo.expoMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("expo", "StoreReview")
@js.native
object StoreReviewNs extends js.Object {
  def hasAction(): Boolean = js.native
  def isSupported(): Boolean = js.native
  def requestReview(): js.Promise[Unit] = js.native
  def storeUrl(): String | Null = js.native
}

