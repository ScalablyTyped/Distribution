package typings.expoModulesCore

import typings.react.mod.ComponentType
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object buildNativeViewManagerAdapterMod {
  
  @JSImport("expo-modules-core/build/NativeViewManagerAdapter", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def requireNativeViewManager[P](viewName: String): ComponentType[P] = ^.asInstanceOf[js.Dynamic].applyDynamic("requireNativeViewManager")(viewName.asInstanceOf[js.Any]).asInstanceOf[ComponentType[P]]
}
