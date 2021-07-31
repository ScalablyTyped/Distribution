package typings.fluxible

import typings.dispatchr.createStoreMod.StoreOptions
import typings.dispatchr.createStoreMod.StoreThis
import typings.dispatchr.mod.StoreClass
import typings.std.ThisType
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object createStoreMod {
  
  @scala.inline
  def apply[T /* <: StoreOptions */](options: T & ThisType[StoreThis[T]]): StoreClass = ^.asInstanceOf[js.Dynamic].apply(options.asInstanceOf[js.Any]).asInstanceOf[StoreClass]
  
  @JSImport("fluxible/addons/createStore", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
}
