package typings.firebaseRemoteConfig

import typings.firebaseAppTypes.privateMod.FirebaseNamespace
import typings.firebaseRemoteConfigTypes.mod.RemoteConfig
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("@firebase/remote-config", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def registerRemoteConfig(firebaseInstance: FirebaseNamespace): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("registerRemoteConfig")(firebaseInstance.asInstanceOf[js.Any]).asInstanceOf[Unit]
  
  object firebaseAppTypesAugmentingMod {
    
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
    
    trait FirebaseNamespace extends StObject {
      
      var remoteConfig: js.UndefOr[js.Function1[/* app */ js.UndefOr[FirebaseApp], RemoteConfig]] = js.undefined
    }
    object FirebaseNamespace {
      
      inline def apply(): typings.firebaseRemoteConfig.mod.firebaseAppTypesAugmentingMod.FirebaseNamespace = {
        val __obj = js.Dynamic.literal()
        __obj.asInstanceOf[typings.firebaseRemoteConfig.mod.firebaseAppTypesAugmentingMod.FirebaseNamespace]
      }
      
      extension [Self <: typings.firebaseRemoteConfig.mod.firebaseAppTypesAugmentingMod.FirebaseNamespace](x: Self) {
        
        inline def setRemoteConfig(value: /* app */ js.UndefOr[FirebaseApp] => RemoteConfig): Self = StObject.set(x, "remoteConfig", js.Any.fromFunction1(value))
        
        inline def setRemoteConfigUndefined: Self = StObject.set(x, "remoteConfig", js.undefined)
      }
    }
  }
  
  object global {
    
    trait Window extends StObject {
      
      var FIREBASE_REMOTE_CONFIG_URL_BASE: String
    }
    object Window {
      
      inline def apply(FIREBASE_REMOTE_CONFIG_URL_BASE: String): Window = {
        val __obj = js.Dynamic.literal(FIREBASE_REMOTE_CONFIG_URL_BASE = FIREBASE_REMOTE_CONFIG_URL_BASE.asInstanceOf[js.Any])
        __obj.asInstanceOf[Window]
      }
      
      extension [Self <: Window](x: Self) {
        
        inline def setFIREBASE_REMOTE_CONFIG_URL_BASE(value: String): Self = StObject.set(x, "FIREBASE_REMOTE_CONFIG_URL_BASE", value.asInstanceOf[js.Any])
      }
    }
  }
}
