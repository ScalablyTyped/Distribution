package typings.googleapis.buildSrcApisServicebrokerV1beta1Mod.servicebroker_v1beta1

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Response for the `GetBinding()` method.
  */
@js.native
trait Schema$GoogleCloudServicebrokerV1beta1__GetBindingResponse extends js.Object {
  /**
    * Credentials to use the binding.
    */
  var credentials: js.UndefOr[StringDictionary[js.Any]] = js.native
  /**
    * String containing the Deployment Manager deployment name that was created
    * for this binding,
    */
  var deploymentName: js.UndefOr[String] = js.native
  /**
    * Used to communicate description of the response. Usually for non-standard
    * error codes.
    * https://github.com/openservicebrokerapi/servicebroker/blob/master/spec.md#service-broker-errors
    */
  var description: js.UndefOr[String] = js.native
  /**
    * Output only. The resource name of the binding, e.g.
    * projects/project_id/brokers/broker_id/service_instances/instance_id/bindings/binding_id.
    */
  var resourceName: js.UndefOr[String] = js.native
  /**
    * A URL to which the platform may proxy requests for the address sent with
    * bind_resource.route
    */
  var route_service_url: js.UndefOr[String] = js.native
  /**
    * From where to read system logs.
    */
  var syslog_drain_url: js.UndefOr[String] = js.native
  /**
    * An array of configurations for mounting volumes.
    */
  var volume_mounts: js.UndefOr[js.Array[StringDictionary[_]]] = js.native
}

object Schema$GoogleCloudServicebrokerV1beta1__GetBindingResponse {
  @scala.inline
  def apply(
    credentials: StringDictionary[js.Any] = null,
    deploymentName: String = null,
    description: String = null,
    resourceName: String = null,
    route_service_url: String = null,
    syslog_drain_url: String = null,
    volume_mounts: js.Array[StringDictionary[_]] = null
  ): Schema$GoogleCloudServicebrokerV1beta1__GetBindingResponse = {
    val __obj = js.Dynamic.literal()
    if (credentials != null) __obj.updateDynamic("credentials")(credentials.asInstanceOf[js.Any])
    if (deploymentName != null) __obj.updateDynamic("deploymentName")(deploymentName.asInstanceOf[js.Any])
    if (description != null) __obj.updateDynamic("description")(description.asInstanceOf[js.Any])
    if (resourceName != null) __obj.updateDynamic("resourceName")(resourceName.asInstanceOf[js.Any])
    if (route_service_url != null) __obj.updateDynamic("route_service_url")(route_service_url.asInstanceOf[js.Any])
    if (syslog_drain_url != null) __obj.updateDynamic("syslog_drain_url")(syslog_drain_url.asInstanceOf[js.Any])
    if (volume_mounts != null) __obj.updateDynamic("volume_mounts")(volume_mounts.asInstanceOf[js.Any])
    __obj.asInstanceOf[Schema$GoogleCloudServicebrokerV1beta1__GetBindingResponse]
  }
}

