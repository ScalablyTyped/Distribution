package typings.firebase.firebaseMod.storage

import typings.firebase.firebaseMod.app.App
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("firebase", "storage")
@js.native
object ^ extends js.Object {
  /**
    * Gets the {@link firebase.storage.Storage `Storage`} service for the default
    * app or a given app.
    *
    * `firebase.storage()` can be called with no arguments to access the default
    * app's {@link firebase.storage.Storage `Storage`} service or as
    * `firebase.storage(app)` to access the
    * {@link firebase.storage.Storage `Storage`} service associated with a
    * specific app.
    *
    * @webonly
    *
    * @example
    * ```javascript
    * // Get the Storage service for the default app
    * var defaultStorage = firebase.storage();
    * ```
    *
    * @example
    * ```javascript
    * // Get the Storage service for a given app
    * var otherStorage = firebase.storage(otherApp);
    * ```
    *
    * @param app The app to create a storage service for.
    *     If not passed, uses the default app.
    */
  def apply(): Storage = js.native
  def apply(app: App): Storage = js.native
}

