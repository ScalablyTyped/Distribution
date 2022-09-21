package typings.firebase

import typings.firebaseApp.mod.FirebaseApp
import typings.firebaseRemoteConfig.mod.LogLevel
import typings.firebaseRemoteConfig.mod.RemoteConfig
import typings.firebaseRemoteConfig.mod.Value
import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object storageDistRemoteConfigMod {
  
  @JSImport("firebase/compat/storage/dist/remote-config", JSImport.Namespace)
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
}
