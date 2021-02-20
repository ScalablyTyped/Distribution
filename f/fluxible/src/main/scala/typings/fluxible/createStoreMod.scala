package typings.fluxible

import typings.dispatchr.createStoreMod.StoreOptions
import typings.dispatchr.createStoreMod.StoreThis
import typings.dispatchr.mod.StoreClass
import typings.std.ThisType
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object createStoreMod {
  
  @JSImport("fluxible/addons/createStore", JSImport.Namespace)
  @js.native
  def apply[T /* <: StoreOptions */](options: T with ThisType[StoreThis[T]]): StoreClass = js.native
}
