package typings.firebaseRemoteConfig

import typings.firebaseRemoteConfig.srcPublicTypesMod.RemoteConfig
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object srcApi2Mod {
  
  @JSImport("@firebase/remote-config/dist/src/api2", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def fetchAndActivate(remoteConfig: RemoteConfig): js.Promise[Boolean] = ^.asInstanceOf[js.Dynamic].applyDynamic("fetchAndActivate")(remoteConfig.asInstanceOf[js.Any]).asInstanceOf[js.Promise[Boolean]]
  
  inline def isSupported(): js.Promise[Boolean] = ^.asInstanceOf[js.Dynamic].applyDynamic("isSupported")().asInstanceOf[js.Promise[Boolean]]
}
