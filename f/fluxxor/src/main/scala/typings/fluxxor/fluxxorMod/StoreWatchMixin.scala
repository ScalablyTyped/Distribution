package typings.fluxxor.fluxxorMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait StoreWatchMixin[StoreState] extends js.Object {
  def getStateFromFlux(): StoreState
}

@JSImport("fluxxor", "StoreWatchMixin")
@js.native
object StoreWatchMixin extends js.Object {
  def apply[StoreState](storeNames: String*): StoreWatchMixin[StoreState] = js.native
}

