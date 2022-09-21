package typings.expoApplication

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object expoApplicationWebMod {
  
  object default {
    
    @JSImport("expo-application/build/ExpoApplication.web", JSImport.Default)
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("expo-application/build/ExpoApplication.web", "default.androidId")
    @js.native
    val androidId: /* is `Null`, but independent javascript fields cannot be in scala 3 */ Any = js.native
    
    @JSImport("expo-application/build/ExpoApplication.web", "default.applicationName")
    @js.native
    val applicationName: /* is `Null`, but independent javascript fields cannot be in scala 3 */ Any = js.native
    
    @JSImport("expo-application/build/ExpoApplication.web", "default.bundleId")
    @js.native
    val bundleId: /* is `Null`, but independent javascript fields cannot be in scala 3 */ Any = js.native
    
    inline def getInstallationTimeAsync(): js.Promise[Null] = ^.asInstanceOf[js.Dynamic].applyDynamic("getInstallationTimeAsync")().asInstanceOf[js.Promise[Null]]
    
    @JSImport("expo-application/build/ExpoApplication.web", "default.name")
    @js.native
    val name: String = js.native
    
    @JSImport("expo-application/build/ExpoApplication.web", "default.nativeApplicationVersion")
    @js.native
    val nativeApplicationVersion: /* is `Null`, but independent javascript fields cannot be in scala 3 */ Any = js.native
    
    @JSImport("expo-application/build/ExpoApplication.web", "default.nativeBuildVersion")
    @js.native
    val nativeBuildVersion: /* is `Null`, but independent javascript fields cannot be in scala 3 */ Any = js.native
  }
}
