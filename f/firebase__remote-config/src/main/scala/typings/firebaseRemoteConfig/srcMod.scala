package typings.firebaseRemoteConfig

import typings.firebaseApp.mod.FirebaseApp
import typings.firebaseRemoteConfig.publicTypesMod.LogLevel
import typings.firebaseRemoteConfig.publicTypesMod.RemoteConfig
import typings.firebaseRemoteConfig.publicTypesMod.Value
import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object srcMod {
  
  @JSImport("@firebase/remote-config/dist/esm/src", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def activate(remoteConfig: RemoteConfig): js.Promise[Boolean] = ^.asInstanceOf[js.Dynamic].applyDynamic("activate")(remoteConfig.asInstanceOf[js.Any]).asInstanceOf[js.Promise[Boolean]]
  
  inline def ensureInitialized(remoteConfig: RemoteConfig): js.Promise[Unit] = ^.asInstanceOf[js.Dynamic].applyDynamic("ensureInitialized")(remoteConfig.asInstanceOf[js.Any]).asInstanceOf[js.Promise[Unit]]
  
  inline def fetchAndActivate(remoteConfig: RemoteConfig): js.Promise[Boolean] = ^.asInstanceOf[js.Dynamic].applyDynamic("fetchAndActivate")(remoteConfig.asInstanceOf[js.Any]).asInstanceOf[js.Promise[Boolean]]
  
  inline def fetchConfig(remoteConfig: RemoteConfig): js.Promise[Unit] = ^.asInstanceOf[js.Dynamic].applyDynamic("fetchConfig")(remoteConfig.asInstanceOf[js.Any]).asInstanceOf[js.Promise[Unit]]
  
  inline def getAll(remoteConfig: RemoteConfig): Record[String, Value] = ^.asInstanceOf[js.Dynamic].applyDynamic("getAll")(remoteConfig.asInstanceOf[js.Any]).asInstanceOf[Record[String, Value]]
  
  inline def getBoolean(remoteConfig: RemoteConfig, key: String): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("getBoolean")(remoteConfig.asInstanceOf[js.Any], key.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  
  inline def getNumber(remoteConfig: RemoteConfig, key: String): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("getNumber")(remoteConfig.asInstanceOf[js.Any], key.asInstanceOf[js.Any])).asInstanceOf[Double]
  
  inline def getRemoteConfig(): RemoteConfig = ^.asInstanceOf[js.Dynamic].applyDynamic("getRemoteConfig")().asInstanceOf[RemoteConfig]
  inline def getRemoteConfig(app: FirebaseApp): RemoteConfig = ^.asInstanceOf[js.Dynamic].applyDynamic("getRemoteConfig")(app.asInstanceOf[js.Any]).asInstanceOf[RemoteConfig]
  
  inline def getString(remoteConfig: RemoteConfig, key: String): String = (^.asInstanceOf[js.Dynamic].applyDynamic("getString")(remoteConfig.asInstanceOf[js.Any], key.asInstanceOf[js.Any])).asInstanceOf[String]
  
  inline def getValue(remoteConfig: RemoteConfig, key: String): Value = (^.asInstanceOf[js.Dynamic].applyDynamic("getValue")(remoteConfig.asInstanceOf[js.Any], key.asInstanceOf[js.Any])).asInstanceOf[Value]
  
  inline def isSupported(): js.Promise[Boolean] = ^.asInstanceOf[js.Dynamic].applyDynamic("isSupported")().asInstanceOf[js.Promise[Boolean]]
  
  inline def setLogLevel(remoteConfig: RemoteConfig, logLevel: LogLevel): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("setLogLevel")(remoteConfig.asInstanceOf[js.Any], logLevel.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  object firebaseComponentAugmentingMod {
    
    trait NameServiceMapping extends StObject {
      
      var `remote-config`: RemoteConfig
    }
    object NameServiceMapping {
      
      inline def apply(`remote-config`: RemoteConfig): NameServiceMapping = {
        val __obj = js.Dynamic.literal()
        __obj.updateDynamic("remote-config")(`remote-config`.asInstanceOf[js.Any])
        __obj.asInstanceOf[NameServiceMapping]
      }
      
      extension [Self <: NameServiceMapping](x: Self) {
        
        inline def `setRemote-config`(value: RemoteConfig): Self = StObject.set(x, "remote-config", value.asInstanceOf[js.Any])
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
