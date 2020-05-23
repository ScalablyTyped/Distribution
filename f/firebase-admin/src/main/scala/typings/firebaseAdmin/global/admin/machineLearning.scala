package typings.firebaseAdmin.global.admin

import typings.firebaseAdmin.admin.app.App
import typings.firebaseAdmin.admin.machineLearning.MachineLearning
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("admin.machineLearning")
@js.native
object machineLearning extends js.Object {
  /**
    * Gets the {@link admin.machineLearning.MachineLearning `MachineLearning`} service for the
    * default app or a given app.
    *
    * `admin.machineLearning()` can be called with no arguments to access the
    * default app's {@link admin.machineLearning.MachineLearning
    * `MachineLearning`} service or as `admin.machineLearning(app)` to access
    * the {@link admin.machineLearning.MachineLearning `MachineLearning`}
    * service associated with a specific app.
    *
    * @example
    * ```javascript
    * // Get the MachineLearning service for the default app
    * var defaultMachineLearning = admin.machineLearning();
    * ```
    *
    * @example
    * ```javascript
    * // Get the MachineLearning service for a given app
    * var otherMachineLearning = admin.machineLearning(otherApp);
    * ```
    *
    * @param app Optional app whose `MachineLearning` service to
    *   return. If not provided, the default `MachineLearning` service
    *   will be returned.
    *
    * @return The default `MachineLearning` service if no app is provided or the
    *   `MachineLearning` service associated with the provided app.
    */
  def apply(): MachineLearning = js.native
  def apply(app: App): MachineLearning = js.native
}

