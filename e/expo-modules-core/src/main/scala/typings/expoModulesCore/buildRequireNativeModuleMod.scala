package typings.expoModulesCore

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object buildRequireNativeModuleMod {
  
  @JSImport("expo-modules-core/build/requireNativeModule", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  object global {
    
    @JSGlobal("ExpoModules")
    @js.native
    def ExpoModules: js.UndefOr[StringDictionary[Any]] = js.native
    inline def ExpoModules_=(x: js.UndefOr[StringDictionary[Any]]): Unit = js.Dynamic.global.updateDynamic("ExpoModules")(x.asInstanceOf[js.Any])
  }
  
  inline def requireNativeModule[ModuleType](moduleName: String): ModuleType = ^.asInstanceOf[js.Dynamic].applyDynamic("requireNativeModule")(moduleName.asInstanceOf[js.Any]).asInstanceOf[ModuleType]
}
