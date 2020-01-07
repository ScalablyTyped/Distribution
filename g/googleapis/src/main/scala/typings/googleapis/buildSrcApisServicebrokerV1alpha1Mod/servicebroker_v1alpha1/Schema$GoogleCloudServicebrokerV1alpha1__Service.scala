package typings.googleapis.buildSrcApisServicebrokerV1alpha1Mod.servicebroker_v1alpha1

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * The resource model mostly follows the Open Service Broker API, as described
  * here:
  * https://github.com/openservicebrokerapi/servicebroker/blob/master/_spec.md
  * Though due to Google Specifics it has additional optional fields.
  */
@js.native
trait Schema$GoogleCloudServicebrokerV1alpha1__Service extends js.Object {
  /**
    * Specifies whether instances of the service can be bound to applications.
    * Required.
    */
  var bindable: js.UndefOr[Boolean] = js.native
  /**
    * Whether the service provides an endpoint to get service bindings.
    */
  var binding_retrievable: js.UndefOr[Boolean] = js.native
  /**
    * Information to activate Dashboard SSO feature.
    */
  var dashboard_client: js.UndefOr[Schema$GoogleCloudServicebrokerV1alpha1__DashboardClient] = js.native
  /**
    * Textual description of the service. Required.
    */
  var description: js.UndefOr[String] = js.native
  /**
    * ID is a globally unique identifier used to uniquely identify the service.
    * ID is an opaque string.
    */
  var id: js.UndefOr[String] = js.native
  /**
    * Whether the service provides an endpoint to get service instances.
    */
  var instance_retrievable: js.UndefOr[Boolean] = js.native
  /**
    * A list of metadata for a service offering. Metadata is an arbitrary JSON
    * object.
    */
  var metadata: js.UndefOr[StringDictionary[js.Any]] = js.native
  /**
    * User friendly service name. Name must match [a-z0-9]+ regexp. The name
    * must be globally unique within GCP project. Note, which is different from
    * (&quot;This must be globally unique within a platform marketplace&quot;).
    * Required.
    */
  var name: js.UndefOr[String] = js.native
  /**
    * Whether the service supports upgrade/downgrade for some plans.
    */
  var plan_updateable: js.UndefOr[Boolean] = js.native
  /**
    * A list of plans for this service. At least one plan is required.
    */
  var plans: js.UndefOr[js.Array[Schema$GoogleCloudServicebrokerV1alpha1__Plan]] = js.native
  /**
    * Tags provide a flexible mechanism to expose a classification, attribute,
    * or base technology of a service.
    */
  var tags: js.UndefOr[js.Array[String]] = js.native
}

object Schema$GoogleCloudServicebrokerV1alpha1__Service {
  @scala.inline
  def apply(
    bindable: js.UndefOr[Boolean] = js.undefined,
    binding_retrievable: js.UndefOr[Boolean] = js.undefined,
    dashboard_client: Schema$GoogleCloudServicebrokerV1alpha1__DashboardClient = null,
    description: String = null,
    id: String = null,
    instance_retrievable: js.UndefOr[Boolean] = js.undefined,
    metadata: StringDictionary[js.Any] = null,
    name: String = null,
    plan_updateable: js.UndefOr[Boolean] = js.undefined,
    plans: js.Array[Schema$GoogleCloudServicebrokerV1alpha1__Plan] = null,
    tags: js.Array[String] = null
  ): Schema$GoogleCloudServicebrokerV1alpha1__Service = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(bindable)) __obj.updateDynamic("bindable")(bindable.asInstanceOf[js.Any])
    if (!js.isUndefined(binding_retrievable)) __obj.updateDynamic("binding_retrievable")(binding_retrievable.asInstanceOf[js.Any])
    if (dashboard_client != null) __obj.updateDynamic("dashboard_client")(dashboard_client.asInstanceOf[js.Any])
    if (description != null) __obj.updateDynamic("description")(description.asInstanceOf[js.Any])
    if (id != null) __obj.updateDynamic("id")(id.asInstanceOf[js.Any])
    if (!js.isUndefined(instance_retrievable)) __obj.updateDynamic("instance_retrievable")(instance_retrievable.asInstanceOf[js.Any])
    if (metadata != null) __obj.updateDynamic("metadata")(metadata.asInstanceOf[js.Any])
    if (name != null) __obj.updateDynamic("name")(name.asInstanceOf[js.Any])
    if (!js.isUndefined(plan_updateable)) __obj.updateDynamic("plan_updateable")(plan_updateable.asInstanceOf[js.Any])
    if (plans != null) __obj.updateDynamic("plans")(plans.asInstanceOf[js.Any])
    if (tags != null) __obj.updateDynamic("tags")(tags.asInstanceOf[js.Any])
    __obj.asInstanceOf[Schema$GoogleCloudServicebrokerV1alpha1__Service]
  }
}

