package typings.firebase.firebaseMod.performance

import typings.firebase.firebaseMod.app.App
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("firebase", "performance")
@js.native
object ^ extends js.Object {
  /**
    * Gets the {@link firebase.performance.Performance `Performance`} service.
    *
    * `firebase.performance()` can be called with no arguments to access the default
    * app's {@link firebase.performance.Performance `Performance`} service.
    * The {@link firebase.performance.Performance `Performance`} service does not work with
    * any other app.
    *
    * @webonly
    *
    * @example
    * ```javascript
    * // Get the Performance service for the default app
    * const defaultPerformance = firebase.performance();
    * ```
    *
    * @param app The app to create a performance service for. Performance Monitoring only works with
    * the default app.
    * If not passed, uses the default app.
    */
  def apply(): Performance = js.native
  def apply(app: App): Performance = js.native
}

