package typings.firebase.mod.remoteConfig

import typings.firebase.mod.app.App
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

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
  def apply(): RemoteConfig = js.native
  def apply(app: App): RemoteConfig = js.native
}

