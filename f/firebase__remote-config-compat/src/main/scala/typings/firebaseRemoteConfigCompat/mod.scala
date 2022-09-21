package typings.firebaseRemoteConfigCompat

import typings.firebaseRemoteConfigTypes.mod.RemoteConfig
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* augmented module */
object mod {
  
  trait FirebaseApp extends StObject {
    
    def remoteConfig(): RemoteConfig
  }
  object FirebaseApp {
    
    inline def apply(remoteConfig: () => RemoteConfig): FirebaseApp = {
      val __obj = js.Dynamic.literal(remoteConfig = js.Any.fromFunction0(remoteConfig))
      __obj.asInstanceOf[FirebaseApp]
    }
    
    extension [Self <: FirebaseApp](x: Self) {
      
      inline def setRemoteConfig(value: () => RemoteConfig): Self = StObject.set(x, "remoteConfig", js.Any.fromFunction0(value))
    }
  }
  
  @js.native
  trait FirebaseNamespace extends StObject {
    
    def remoteConfig(): RemoteConfig = js.native
    def remoteConfig(app: FirebaseApp): RemoteConfig = js.native
  }
}
