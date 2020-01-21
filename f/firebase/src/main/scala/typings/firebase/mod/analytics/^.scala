package typings.firebase.mod.analytics

import typings.firebase.mod.app.App
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("firebase", "analytics")
@js.native
object ^ extends js.Object {
  /**
    * Gets the {@link firebase.analytics.Analytics `Analytics`} service.
    *
    * `firebase.analytics()` can be called with no arguments to access the default
    * app's {@link firebase.analytics.Analytics `Analytics`} service.
    *
    * @webonly
    *
    * @example
    * ```javascript
    * // Get the Analytics service for the default app
    * const defaultAnalytics = firebase.analytics();
    * ```
    *
    * @param app The app to create an analytics service for.
    * If not passed, uses the default app.
    */
  def apply(): Analytics = js.native
  def apply(app: App): Analytics = js.native
}

