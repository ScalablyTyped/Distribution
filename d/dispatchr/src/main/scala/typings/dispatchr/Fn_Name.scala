package typings.dispatchr

import typings.dispatchr.dispatchrMod.Store
import typings.dispatchr.dispatchrMod.StoreClass
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Fn_Name extends js.Object {
  def apply(name: String): Store[js.Object] = js.native
  def apply[T /* <: StoreClass */](name: T): T = js.native
}

