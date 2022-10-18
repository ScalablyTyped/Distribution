package typings.firebaseAdmin

import typings.firebaseAdmin.libAppCoreMod.App
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* from `exports` in `package.json` */
object remoteConfigMod {
  
  @JSImport("firebase-admin/remote-config", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("firebase-admin/remote-config", "RemoteConfig")
  @js.native
  open class RemoteConfig ()
    extends typings.firebaseAdmin.libRemoteConfigMod.RemoteConfig
  
  inline def getRemoteConfig(): typings.firebaseAdmin.libRemoteConfigRemoteConfigMod.RemoteConfig = ^.asInstanceOf[js.Dynamic].applyDynamic("getRemoteConfig")().asInstanceOf[typings.firebaseAdmin.libRemoteConfigRemoteConfigMod.RemoteConfig]
  inline def getRemoteConfig(app: App): typings.firebaseAdmin.libRemoteConfigRemoteConfigMod.RemoteConfig = ^.asInstanceOf[js.Dynamic].applyDynamic("getRemoteConfig")(app.asInstanceOf[js.Any]).asInstanceOf[typings.firebaseAdmin.libRemoteConfigRemoteConfigMod.RemoteConfig]
}
