package typings.fluxible

import typings.dispatchr.addonsCreateStoreMod.StoreOptions
import typings.dispatchr.addonsCreateStoreMod.StoreThis
import typings.dispatchr.mod.StoreClass
import typings.std.ThisType
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object addonsCreateStoreMod {
  
  inline def apply[T /* <: StoreOptions */](options: T & ThisType[StoreThis[T]]): StoreClass = ^.asInstanceOf[js.Dynamic].apply(options.asInstanceOf[js.Any]).asInstanceOf[StoreClass]
  
  @JSImport("fluxible/addons/createStore", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
}
