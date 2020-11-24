package typings.firebase.mod.default.messaging

import typings.firebase.mod.firebase.app.App
import typings.firebase.mod.firebase.messaging.Messaging
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("firebase", "messaging")
@js.native
object ^ extends js.Object {
  
  /**
    * Gets the {@link firebase.messaging.Messaging `Messaging`} service for the
    * default app or a given app.
    *
    * `firebase.messaging()` can be called with no arguments to access the default
    * app's {@link firebase.messaging.Messaging `Messaging`} service or as
    * `firebase.messaging(app)` to access the
    * {@link firebase.messaging.Messaging `Messaging`} service associated with a
    * specific app.
    *
    * Calling `firebase.messaging()` in a service worker results in Firebase
    * generating notifications if the push message payload has a `notification`
    * parameter.
    *
    * @webonly
    *
    * @example
    * ```javascript
    * // Get the Messaging service for the default app
    * var defaultMessaging = firebase.messaging();
    * ```
    *
    * @example
    * ```javascript
    * // Get the Messaging service for a given app
    * var otherMessaging = firebase.messaging(otherApp);
    * ```
    *
    * @namespace
    * @param app The app to create a Messaging service for.
    *     If not passed, uses the default app.
    */
  def apply(): Messaging = js.native
  def apply(app: App): Messaging = js.native
}
