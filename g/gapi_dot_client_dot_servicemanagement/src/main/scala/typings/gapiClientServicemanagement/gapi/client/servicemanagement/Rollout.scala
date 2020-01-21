package typings.gapiClientServicemanagement.gapi.client.servicemanagement

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Rollout extends js.Object {
  /** Creation time of the rollout. Readonly. */
  var createTime: js.UndefOr[String] = js.undefined
  /** The user who created the Rollout. Readonly. */
  var createdBy: js.UndefOr[String] = js.undefined
  /**
    * The strategy associated with a rollout to delete a `ManagedService`.
    * Readonly.
    */
  var deleteServiceStrategy: js.UndefOr[js.Any] = js.undefined
  /**
    * Optional unique identifier of this Rollout. Only lower case letters, digits
    * and '-' are allowed.
    *
    * If not specified by client, the server will generate one. The generated id
    * will have the form of <date><revision number>, where "date" is the create
    * date in ISO 8601 format.  "revision number" is a monotonically increasing
    * positive number that is reset every day for each service.
    * An example of the generated rollout_id is '2016-02-16r1'
    */
  var rolloutId: js.UndefOr[String] = js.undefined
  /** The name of the service associated with this Rollout. */
  var serviceName: js.UndefOr[String] = js.undefined
  /**
    * The status of this rollout. Readonly. In case of a failed rollout,
    * the system will automatically rollback to the current Rollout
    * version. Readonly.
    */
  var status: js.UndefOr[String] = js.undefined
  /**
    * Google Service Control selects service configurations based on
    * traffic percentage.
    */
  var trafficPercentStrategy: js.UndefOr[TrafficPercentStrategy] = js.undefined
}

object Rollout {
  @scala.inline
  def apply(
    createTime: String = null,
    createdBy: String = null,
    deleteServiceStrategy: js.Any = null,
    rolloutId: String = null,
    serviceName: String = null,
    status: String = null,
    trafficPercentStrategy: TrafficPercentStrategy = null
  ): Rollout = {
    val __obj = js.Dynamic.literal()
    if (createTime != null) __obj.updateDynamic("createTime")(createTime.asInstanceOf[js.Any])
    if (createdBy != null) __obj.updateDynamic("createdBy")(createdBy.asInstanceOf[js.Any])
    if (deleteServiceStrategy != null) __obj.updateDynamic("deleteServiceStrategy")(deleteServiceStrategy.asInstanceOf[js.Any])
    if (rolloutId != null) __obj.updateDynamic("rolloutId")(rolloutId.asInstanceOf[js.Any])
    if (serviceName != null) __obj.updateDynamic("serviceName")(serviceName.asInstanceOf[js.Any])
    if (status != null) __obj.updateDynamic("status")(status.asInstanceOf[js.Any])
    if (trafficPercentStrategy != null) __obj.updateDynamic("trafficPercentStrategy")(trafficPercentStrategy.asInstanceOf[js.Any])
    __obj.asInstanceOf[Rollout]
  }
}

