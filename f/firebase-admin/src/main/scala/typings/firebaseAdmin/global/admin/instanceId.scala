package typings.firebaseAdmin.global.admin

import typings.firebaseAdmin.admin.app.App
import typings.firebaseAdmin.admin.instanceId.InstanceId
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("admin.instanceId")
@js.native
object instanceId extends js.Object {
  /**
    * Gets the {@link admin.instanceId.InstanceId `InstanceId`} service for the
    * default app or a given app.
    *
    * `admin.instanceId()` can be called with no arguments to access the default
    * app's {@link admin.instanceId.InstanceId `InstanceId`} service or as
    * `admin.instanceId(app)` to access the
    * {@link admin.instanceId.InstanceId `InstanceId`} service associated with a
    * specific app.
    *
    * @example
    * ```javascript
    * // Get the Instance ID service for the default app
    * var defaultInstanceId = admin.instanceId();
    * ```
    *
    * @example
    * ```javascript
    * // Get the Instance ID service for a given app
    * var otherInstanceId = admin.instanceId(otherApp);
    *```
    *
    * @param app Optional app whose `InstanceId` service to
    *   return. If not provided, the default `InstanceId` service will be
    *   returned.
    *
    * @return The default `InstanceId` service if
    *   no app is provided or the `InstanceId` service associated with the
    *   provided app.
    */
  def apply(): InstanceId = js.native
  def apply(app: App): InstanceId = js.native
}

