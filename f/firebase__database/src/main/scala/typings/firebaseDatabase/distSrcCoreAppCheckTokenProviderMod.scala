package typings.firebaseDatabase

import typings.firebaseAppCheckInteropTypes.mod.AppCheckInternalComponentName
import typings.firebaseAppCheckInteropTypes.mod.AppCheckTokenListener
import typings.firebaseAppCheckInteropTypes.mod.AppCheckTokenResult
import typings.firebaseComponent.mod.Provider
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distSrcCoreAppCheckTokenProviderMod {
  
  @JSImport("@firebase/database/dist/src/core/AppCheckTokenProvider", "AppCheckTokenProvider")
  @js.native
  open class AppCheckTokenProvider protected () extends StObject {
    def this(appName_ : String) = this()
    def this(appName_ : String, appCheckProvider: Provider[AppCheckInternalComponentName]) = this()
    
    def addTokenChangeListener(listener: AppCheckTokenListener): Unit = js.native
    
    /* private */ var appCheck: Any = js.native
    
    /* private */ var appCheckProvider: Any = js.native
    
    /* private */ var appName_ : Any = js.native
    
    def getToken(): js.Promise[AppCheckTokenResult] = js.native
    def getToken(forceRefresh: Boolean): js.Promise[AppCheckTokenResult] = js.native
    
    def notifyForInvalidToken(): Unit = js.native
  }
}
