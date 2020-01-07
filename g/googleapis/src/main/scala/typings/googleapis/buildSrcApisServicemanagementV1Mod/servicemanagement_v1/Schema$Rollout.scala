package typings.googleapis.buildSrcApisServicemanagementV1Mod.servicemanagement_v1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * A rollout resource that defines how service configuration versions are
  * pushed to control plane systems. Typically, you create a new version of the
  * service config, and then create a Rollout to push the service config.
  */
@js.native
trait Schema$Rollout extends js.Object {
  /**
    * Creation time of the rollout. Readonly.
    */
  var createTime: js.UndefOr[String] = js.native
  /**
    * The user who created the Rollout. Readonly.
    */
  var createdBy: js.UndefOr[String] = js.native
  /**
    * The strategy associated with a rollout to delete a `ManagedService`.
    * Readonly.
    */
  var deleteServiceStrategy: js.UndefOr[Schema$DeleteServiceStrategy] = js.native
  /**
    * Optional unique identifier of this Rollout. Only lower case letters,
    * digits  and &#39;-&#39; are allowed.  If not specified by client, the
    * server will generate one. The generated id will have the form of
    * &lt;date&gt;&lt;revision number&gt;, where &quot;date&quot; is the create
    * date in ISO 8601 format.  &quot;revision number&quot; is a monotonically
    * increasing positive number that is reset every day for each service. An
    * example of the generated rollout_id is &#39;2016-02-16r1&#39;
    */
  var rolloutId: js.UndefOr[String] = js.native
  /**
    * The name of the service associated with this Rollout.
    */
  var serviceName: js.UndefOr[String] = js.native
  /**
    * The status of this rollout. Readonly. In case of a failed rollout, the
    * system will automatically rollback to the current Rollout version.
    * Readonly.
    */
  var status: js.UndefOr[String] = js.native
  /**
    * Google Service Control selects service configurations based on traffic
    * percentage.
    */
  var trafficPercentStrategy: js.UndefOr[Schema$TrafficPercentStrategy] = js.native
}

object Schema$Rollout {
  @scala.inline
  def apply(
    createTime: String = null,
    createdBy: String = null,
    deleteServiceStrategy: Schema$DeleteServiceStrategy = null,
    rolloutId: String = null,
    serviceName: String = null,
    status: String = null,
    trafficPercentStrategy: Schema$TrafficPercentStrategy = null
  ): Schema$Rollout = {
    val __obj = js.Dynamic.literal()
    if (createTime != null) __obj.updateDynamic("createTime")(createTime.asInstanceOf[js.Any])
    if (createdBy != null) __obj.updateDynamic("createdBy")(createdBy.asInstanceOf[js.Any])
    if (deleteServiceStrategy != null) __obj.updateDynamic("deleteServiceStrategy")(deleteServiceStrategy.asInstanceOf[js.Any])
    if (rolloutId != null) __obj.updateDynamic("rolloutId")(rolloutId.asInstanceOf[js.Any])
    if (serviceName != null) __obj.updateDynamic("serviceName")(serviceName.asInstanceOf[js.Any])
    if (status != null) __obj.updateDynamic("status")(status.asInstanceOf[js.Any])
    if (trafficPercentStrategy != null) __obj.updateDynamic("trafficPercentStrategy")(trafficPercentStrategy.asInstanceOf[js.Any])
    __obj.asInstanceOf[Schema$Rollout]
  }
}

