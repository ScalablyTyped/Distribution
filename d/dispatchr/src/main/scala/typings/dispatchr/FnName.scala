package typings.dispatchr

import typings.dispatchr.mod.Store
import typings.dispatchr.mod.StoreClass
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait FnName extends js.Object {
  def apply(name: String): Store[js.Object] = js.native
  def apply[T /* <: StoreClass */](name: T): T = js.native
}

