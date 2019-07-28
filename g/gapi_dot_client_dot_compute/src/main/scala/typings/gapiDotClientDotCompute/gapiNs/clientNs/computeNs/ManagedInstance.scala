package typings.gapiDotClientDotCompute.gapiNs.clientNs.computeNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ManagedInstance extends js.Object {
  /**
    * [Output Only] The current action that the managed instance group has scheduled for the instance. Possible values:
    * - NONE The instance is running, and the managed instance group does not have any scheduled actions for this instance.
    * - CREATING The managed instance group is creating this instance. If the group fails to create this instance, it will try again until it is successful.
    * - CREATING_WITHOUT_RETRIES The managed instance group is attempting to create this instance only once. If the group fails to create this instance, it
    * does not try again and the group's targetSize value is decreased instead.
    * - RECREATING The managed instance group is recreating this instance.
    * - DELETING The managed instance group is permanently deleting this instance.
    * - ABANDONING The managed instance group is abandoning this instance. The instance will be removed from the instance group and from any target pools
    * that are associated with this group.
    * - RESTARTING The managed instance group is restarting the instance.
    * - REFRESHING The managed instance group is applying configuration changes to the instance without stopping it. For example, the group can update the
    * target pool list for an instance without stopping that instance.
    */
  var currentAction: js.UndefOr[String] = js.undefined
  /** [Output only] The unique identifier for this resource. This field is empty when instance does not exist. */
  var id: js.UndefOr[String] = js.undefined
  /** [Output Only] The URL of the instance. The URL can exist even if the instance has not yet been created. */
  var instance: js.UndefOr[String] = js.undefined
  /** [Output Only] The status of the instance. This field is empty when the instance does not exist. */
  var instanceStatus: js.UndefOr[String] = js.undefined
  /** [Output Only] Information about the last attempt to create or delete the instance. */
  var lastAttempt: js.UndefOr[ManagedInstanceLastAttempt] = js.undefined
}

object ManagedInstance {
  @scala.inline
  def apply(
    currentAction: String = null,
    id: String = null,
    instance: String = null,
    instanceStatus: String = null,
    lastAttempt: ManagedInstanceLastAttempt = null
  ): ManagedInstance = {
    val __obj = js.Dynamic.literal()
    if (currentAction != null) __obj.updateDynamic("currentAction")(currentAction)
    if (id != null) __obj.updateDynamic("id")(id)
    if (instance != null) __obj.updateDynamic("instance")(instance)
    if (instanceStatus != null) __obj.updateDynamic("instanceStatus")(instanceStatus)
    if (lastAttempt != null) __obj.updateDynamic("lastAttempt")(lastAttempt)
    __obj.asInstanceOf[ManagedInstance]
  }
}

