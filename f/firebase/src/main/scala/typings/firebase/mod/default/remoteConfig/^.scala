package typings.firebase.mod.default.remoteConfig

import typings.firebase.mod.firebase.app.App
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("firebase", "remoteConfig")
@js.native
object ^ extends js.Object {
  
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
  def apply(): typings.firebase.mod.firebase.remoteConfig.RemoteConfig = js.native
  def apply(app: App): typings.firebase.mod.firebase.remoteConfig.RemoteConfig = js.native
}
