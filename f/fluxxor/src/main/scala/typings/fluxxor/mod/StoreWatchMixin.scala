package typings.fluxxor.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait StoreWatchMixin[StoreState] extends js.Object {
  def getStateFromFlux(): StoreState = js.native
}

@JSImport("fluxxor", "StoreWatchMixin")
@js.native
object StoreWatchMixin extends js.Object {
  def apply[StoreState](storeNames: String*): StoreWatchMixin[StoreState] = js.native
}

