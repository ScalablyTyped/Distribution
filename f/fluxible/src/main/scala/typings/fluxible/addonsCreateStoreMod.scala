package typings.fluxible

import typings.dispatchr.addonsCreateStoreMod.StoreOptions
import typings.dispatchr.addonsCreateStoreMod.StoreThis
import typings.dispatchr.dispatchrMod.StoreClass
import typings.std.ThisType
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("fluxible/addons/createStore", JSImport.Namespace)
@js.native
object addonsCreateStoreMod extends js.Object {
  def apply[T /* <: StoreOptions */](options: T with ThisType[StoreThis[T]]): StoreClass = js.native
}

