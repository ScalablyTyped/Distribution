package typings.firebaseAdmin

import typings.firebaseAdmin.coreMod.App
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object remoteConfigMod {
  
  @JSImport("firebase-admin/lib/remote-config", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("firebase-admin/lib/remote-config", "RemoteConfig")
  @js.native
  open class RemoteConfig ()
    extends typings.firebaseAdmin.remoteConfigRemoteConfigMod.RemoteConfig
  
  inline def getRemoteConfig(): typings.firebaseAdmin.remoteConfigRemoteConfigMod.RemoteConfig = ^.asInstanceOf[js.Dynamic].applyDynamic("getRemoteConfig")().asInstanceOf[typings.firebaseAdmin.remoteConfigRemoteConfigMod.RemoteConfig]
  inline def getRemoteConfig(app: App): typings.firebaseAdmin.remoteConfigRemoteConfigMod.RemoteConfig = ^.asInstanceOf[js.Dynamic].applyDynamic("getRemoteConfig")(app.asInstanceOf[js.Any]).asInstanceOf[typings.firebaseAdmin.remoteConfigRemoteConfigMod.RemoteConfig]
}
