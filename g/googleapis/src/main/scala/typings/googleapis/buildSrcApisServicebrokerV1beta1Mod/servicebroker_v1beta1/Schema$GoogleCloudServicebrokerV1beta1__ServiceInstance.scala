package typings.googleapis.buildSrcApisServicebrokerV1beta1Mod.servicebroker_v1beta1

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Message describing inputs to Provision and Update Service instance
  * requests.
  */
@js.native
trait Schema$GoogleCloudServicebrokerV1beta1__ServiceInstance extends js.Object {
  /**
    * Platform specific contextual information under which the service instance
    * is to be provisioned. This replaces organization_guid and space_guid. But
    * can also contain anything. Currently only used for logging context
    * information.
    */
  var context: js.UndefOr[StringDictionary[js.Any]] = js.native
  /**
    * Output only. Timestamp for when the instance was created.
    */
  var createTime: js.UndefOr[String] = js.native
  /**
    * Output only. String containing the Deployment Manager deployment name
    * that was created for this instance,
    */
  var deploymentName: js.UndefOr[String] = js.native
  /**
    * To return errors when GetInstance call is done via HTTP to be unified
    * with other methods.
    */
  var description: js.UndefOr[String] = js.native
  /**
    * The id of the service instance. Must be unique within GCP project.
    * Maximum length is 64, GUID recommended. Required.
    */
  var instance_id: js.UndefOr[String] = js.native
  /**
    * The platform GUID for the organization under which the service is to be
    * provisioned. Required.
    */
  var organization_guid: js.UndefOr[String] = js.native
  /**
    * Configuration options for the service instance. Parameters is JSON object
    * serialized to string.
    */
  var parameters: js.UndefOr[StringDictionary[js.Any]] = js.native
  /**
    * The ID of the plan. See `Service` and `Plan` resources for details.
    * Maximum length is 64, GUID recommended. Required.
    */
  var plan_id: js.UndefOr[String] = js.native
  /**
    * Used only in UpdateServiceInstance request to optionally specify previous
    * fields.
    */
  var previous_values: js.UndefOr[StringDictionary[js.Any]] = js.native
  /**
    * Output only. The resource name of the instance, e.g.
    * projects/project_id/brokers/broker_id/service_instances/instance_id
    */
  var resourceName: js.UndefOr[String] = js.native
  /**
    * The id of the service. Must be a valid identifier of a service contained
    * in the list from a `ListServices()` call. Maximum length is 64, GUID
    * recommended. Required.
    */
  var service_id: js.UndefOr[String] = js.native
  /**
    * The identifier for the project space within the platform organization.
    * Required.
    */
  var space_guid: js.UndefOr[String] = js.native
}

object Schema$GoogleCloudServicebrokerV1beta1__ServiceInstance {
  @scala.inline
  def apply(
    context: StringDictionary[js.Any] = null,
    createTime: String = null,
    deploymentName: String = null,
    description: String = null,
    instance_id: String = null,
    organization_guid: String = null,
    parameters: StringDictionary[js.Any] = null,
    plan_id: String = null,
    previous_values: StringDictionary[js.Any] = null,
    resourceName: String = null,
    service_id: String = null,
    space_guid: String = null
  ): Schema$GoogleCloudServicebrokerV1beta1__ServiceInstance = {
    val __obj = js.Dynamic.literal()
    if (context != null) __obj.updateDynamic("context")(context.asInstanceOf[js.Any])
    if (createTime != null) __obj.updateDynamic("createTime")(createTime.asInstanceOf[js.Any])
    if (deploymentName != null) __obj.updateDynamic("deploymentName")(deploymentName.asInstanceOf[js.Any])
    if (description != null) __obj.updateDynamic("description")(description.asInstanceOf[js.Any])
    if (instance_id != null) __obj.updateDynamic("instance_id")(instance_id.asInstanceOf[js.Any])
    if (organization_guid != null) __obj.updateDynamic("organization_guid")(organization_guid.asInstanceOf[js.Any])
    if (parameters != null) __obj.updateDynamic("parameters")(parameters.asInstanceOf[js.Any])
    if (plan_id != null) __obj.updateDynamic("plan_id")(plan_id.asInstanceOf[js.Any])
    if (previous_values != null) __obj.updateDynamic("previous_values")(previous_values.asInstanceOf[js.Any])
    if (resourceName != null) __obj.updateDynamic("resourceName")(resourceName.asInstanceOf[js.Any])
    if (service_id != null) __obj.updateDynamic("service_id")(service_id.asInstanceOf[js.Any])
    if (space_guid != null) __obj.updateDynamic("space_guid")(space_guid.asInstanceOf[js.Any])
    __obj.asInstanceOf[Schema$GoogleCloudServicebrokerV1beta1__ServiceInstance]
  }
}

