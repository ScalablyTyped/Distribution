package typings.fluxible

import typings.dispatchr.createStoreMod.StoreOptions
import typings.dispatchr.createStoreMod.StoreThis
import typings.dispatchr.mod.StoreClass
import typings.std.ThisType
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("fluxible/addons/createStore", JSImport.Namespace)
@js.native
object createStoreMod extends js.Object {
  def apply[T /* <: StoreOptions */](options: T with ThisType[StoreThis[T]]): StoreClass = js.native
}

