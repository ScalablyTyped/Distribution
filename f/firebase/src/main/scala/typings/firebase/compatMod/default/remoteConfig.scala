package typings.firebase.compatMod.default

import typings.firebase.compatMod.firebase.app.App
import typings.firebase.compatMod.firebase.remoteConfig.RemoteConfig
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * @webonly
  */
object remoteConfig {
  
  /**
    * Gets the {@link firebase.remoteConfig.RemoteConfig `RemoteConfig`} instance.
    *
    * @webonly
    *
    * @example
    * ```javascript
    * // Get the RemoteConfig instance for the default app
    * const defaultRemoteConfig = firebase.remoteConfig();
    * ```
    *
    * @param app The app to create a Remote Config service for. If not passed, uses the default app.
    */
  inline def apply(): RemoteConfig = ^.asInstanceOf[js.Dynamic].apply().asInstanceOf[RemoteConfig]
  inline def apply(app: App): RemoteConfig = ^.asInstanceOf[js.Dynamic].apply(app.asInstanceOf[js.Any]).asInstanceOf[RemoteConfig]
  
  @JSImport("firebase/compat", "default.remoteConfig")
  @js.native
  val ^ : js.Any = js.native
  
  inline def isSupported(): js.Promise[Boolean] = ^.asInstanceOf[js.Dynamic].applyDynamic("isSupported")().asInstanceOf[js.Promise[Boolean]]
}
