package typings.firebaseAdmin.admin.messaging

import typings.firebaseAdmin.admin.app.App
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("admin.messaging")
@js.native
object ^ extends js.Object {
  /**
    * Gets the {@link admin.messaging.Messaging `Messaging`} service for the
    * default app or a given app.
    *
    * `admin.messaging()` can be called with no arguments to access the default
    * app's {@link admin.messaging.Messaging `Messaging`} service or as
    * `admin.messaging(app)` to access the
    * {@link admin.messaging.Messaging `Messaging`} service associated with a
    * specific app.
    *
    * @example
    * ```javascript
    * // Get the Messaging service for the default app
    * var defaultMessaging = admin.messaging();
    * ```
    *
    * @example
    * ```javascript
    * // Get the Messaging service for a given app
    * var otherMessaging = admin.messaging(otherApp);
    * ```
    *
    * @param app Optional app whose `Messaging` service to
    *   return. If not provided, the default `Messaging` service will be returned.
    *
    * @return The default `Messaging` service if no
    *   app is provided or the `Messaging` service associated with the provided
    *   app.
    */
  def apply(): Messaging = js.native
  def apply(app: App): Messaging = js.native
}

