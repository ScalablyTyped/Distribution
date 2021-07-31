package typings.expoSplashScreen

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object expoSplashScreenWebMod {
  
  object default {
    
    @JSImport("expo-splash-screen/build/ExpoSplashScreen.web", JSImport.Default)
    @js.native
    val ^ : js.Any = js.native
    
    @scala.inline
    def hideAsync(): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("hideAsync")().asInstanceOf[Boolean]
    
    @JSImport("expo-splash-screen/build/ExpoSplashScreen.web", "default.name")
    @js.native
    val name: String = js.native
    
    @scala.inline
    def preventAutoHideAsync(): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("preventAutoHideAsync")().asInstanceOf[Boolean]
  }
}
