package typings.firebaseAdmin.global.admin

import typings.firebaseAdmin.admin.app.App
import typings.firebaseAdmin.admin.remoteConfig.RemoteConfig
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("admin.remoteConfig")
@js.native
object remoteConfig extends js.Object {
  /**
    * Gets the {@link admin.remoteConfig.RemoteConfig `RemoteConfig`} service for the
    * default app or a given app.
    *
    * `admin.remoteConfig()` can be called with no arguments to access the default
    * app's {@link admin.remoteConfig.RemoteConfig `RemoteConfig`} service or as
    * `admin.remoteConfig(app)` to access the
    * {@link admin.remoteConfig.RemoteConfig `RemoteConfig`} service associated with a
    * specific app.
    *
    * @example
    * ```javascript
    * // Get the `RemoteConfig` service for the default app
    * var defaultRemoteConfig = admin.remoteConfig();
    * ```
    *
    * @example
    * ```javascript
    * // Get the `RemoteConfig` service for a given app
    * var otherRemoteConfig = admin.remoteConfig(otherApp);
    * ```
    *
    * @param app Optional app for which to return the `RemoteConfig` service.
    *   If not provided, the default `RemoteConfig` service is returned.
    *
    * @return The default `RemoteConfig` service if no
    *   app is provided, or the `RemoteConfig` service associated with the provided
    *   app.
    */
  def apply(): RemoteConfig = js.native
  def apply(app: App): RemoteConfig = js.native
}

