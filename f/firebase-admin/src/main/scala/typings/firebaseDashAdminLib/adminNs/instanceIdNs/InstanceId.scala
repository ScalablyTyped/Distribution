package typings
package firebaseDashAdminLib.adminNs.instanceIdNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Gets the {@link admin.instanceId.InstanceId `InstanceId`} service for the
  * current app.
  *
  * @example
  * ```javascript
  * var instanceId = app.instanceId();
  * // The above is shorthand for:
  * // var instanceId = admin.instanceId(app);
  * ```
  *
  * @return The `InstanceId` service for the
  *   current app.
  */
trait InstanceId extends js.Object {
  var app: firebaseDashAdminLib.adminNs.appNs.App
  /**
    * Deletes the specified instance ID and the associated data from Firebase.
    *
    * Note that Google Analytics for Firebase uses its own form of Instance ID to
    * keep track of analytics data. Therefore deleting a Firebase Instance ID does
    * not delete Analytics data. See
    * [Delete an Instance ID](/support/privacy/manage-iids#delete_an_instance_id)
    * for more information.
    *
    * @param instanceId The instance ID to be deleted.
    *
    * @return A promise fulfilled when the instance ID is deleted.
    */
  def deleteInstanceId(instanceId: java.lang.String): js.Promise[scala.Unit]
}

object InstanceId {
  @scala.inline
  def apply(
    app: firebaseDashAdminLib.adminNs.appNs.App,
    deleteInstanceId: java.lang.String => js.Promise[scala.Unit]
  ): InstanceId = {
    val __obj = js.Dynamic.literal(app = app, deleteInstanceId = js.Any.fromFunction1(deleteInstanceId))
  
    __obj.asInstanceOf[InstanceId]
  }
}

