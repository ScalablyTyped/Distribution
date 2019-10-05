package typings.firebaseDashAdmin.admin.projectManagement

import typings.firebaseDashAdmin.admin.app.App
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("admin.projectManagement")
@js.native
object ^ extends js.Object {
  /**
    * Gets the {@link admin.projectManagement.ProjectManagement
    * `ProjectManagement`} service for the default app or a given app.
    *
    * `admin.projectManagement()` can be called with no arguments to access the
    * default app's {@link admin.projectManagement.ProjectManagement
    * `ProjectManagement`} service, or as `admin.projectManagement(app)` to access
    * the {@link admin.projectManagement.ProjectManagement `ProjectManagement`}
    * service associated with a specific app.
    *
    * @example
    * ```javascript
    * // Get the ProjectManagement service for the default app
    * var defaultProjectManagement = admin.projectManagement();
    * ```
    *
    * @example
    * ```javascript
    * // Get the ProjectManagement service for a given app
    * var otherProjectManagement = admin.projectManagement(otherApp);
    * ```
    *
    * @param app Optional app whose `ProjectManagement` service
    *     to return. If not provided, the default `ProjectManagement` service will
    *     be returned. *
    * @return The default `ProjectManagement` service if no app is provided or the
    *   `ProjectManagement` service associated with the provided app.
    */
  def apply(): ProjectManagement = js.native
  def apply(app: App): ProjectManagement = js.native
}

