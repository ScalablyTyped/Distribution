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
    
    /**
      * @deprecated `global.ExpoModules` is deprecated, use `global.expo.modules` instead.
      */
    @JSGlobal("ExpoModules")
    @js.native
    def ExpoModules: js.UndefOr[StringDictionary[Any]] = js.native
    inline def ExpoModules_=(x: js.UndefOr[StringDictionary[Any]]): Unit = js.Dynamic.global.updateDynamic("ExpoModules")(x.asInstanceOf[js.Any])
    
    @JSGlobal("expo")
    @js.native
    def expo: js.UndefOr[ExpoObject] = js.native
    inline def expo_=(x: js.UndefOr[ExpoObject]): Unit = js.Dynamic.global.updateDynamic("expo")(x.asInstanceOf[js.Any])
  }
  
  inline def requireNativeModule[ModuleType](moduleName: String): ModuleType = ^.asInstanceOf[js.Dynamic].applyDynamic("requireNativeModule")(moduleName.asInstanceOf[js.Any]).asInstanceOf[ModuleType]
  
  trait ExpoObject extends StObject {
    
    var modules: js.UndefOr[StringDictionary[Any]] = js.undefined
  }
  object ExpoObject {
    
    inline def apply(): ExpoObject = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ExpoObject]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: ExpoObject] (val x: Self) extends AnyVal {
      
      inline def setModules(value: StringDictionary[Any]): Self = StObject.set(x, "modules", value.asInstanceOf[js.Any])
      
      inline def setModulesUndefined: Self = StObject.set(x, "modules", js.undefined)
    }
  }
}
