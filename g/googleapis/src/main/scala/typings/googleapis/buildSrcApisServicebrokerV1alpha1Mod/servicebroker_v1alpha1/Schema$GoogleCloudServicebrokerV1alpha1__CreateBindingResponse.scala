package typings.googleapis.buildSrcApisServicebrokerV1alpha1Mod.servicebroker_v1alpha1

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Response for the `CreateBinding()` method.
  */
@js.native
trait Schema$GoogleCloudServicebrokerV1alpha1__CreateBindingResponse extends js.Object {
  /**
    * Credentials to use the binding.
    */
  var credentials: js.UndefOr[StringDictionary[js.Any]] = js.native
  /**
    * Used to communicate description of the response. Usually for non-standard
    * error codes.
    * https://github.com/openservicebrokerapi/servicebroker/blob/master/spec.md#service-broker-errors
    */
  var description: js.UndefOr[String] = js.native
  /**
    * If broker executes operation asynchronously, this is the operation ID
    * that can be polled to check the completion status of said operation. This
    * broker always executes all create/delete operations asynchronously.
    */
  var operation: js.UndefOr[String] = js.native
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
    * An array of configuration for mounting volumes.
    */
  var volume_mounts: js.UndefOr[js.Array[StringDictionary[_]]] = js.native
}

object Schema$GoogleCloudServicebrokerV1alpha1__CreateBindingResponse {
  @scala.inline
  def apply(
    credentials: StringDictionary[js.Any] = null,
    description: String = null,
    operation: String = null,
    route_service_url: String = null,
    syslog_drain_url: String = null,
    volume_mounts: js.Array[StringDictionary[_]] = null
  ): Schema$GoogleCloudServicebrokerV1alpha1__CreateBindingResponse = {
    val __obj = js.Dynamic.literal()
    if (credentials != null) __obj.updateDynamic("credentials")(credentials.asInstanceOf[js.Any])
    if (description != null) __obj.updateDynamic("description")(description.asInstanceOf[js.Any])
    if (operation != null) __obj.updateDynamic("operation")(operation.asInstanceOf[js.Any])
    if (route_service_url != null) __obj.updateDynamic("route_service_url")(route_service_url.asInstanceOf[js.Any])
    if (syslog_drain_url != null) __obj.updateDynamic("syslog_drain_url")(syslog_drain_url.asInstanceOf[js.Any])
    if (volume_mounts != null) __obj.updateDynamic("volume_mounts")(volume_mounts.asInstanceOf[js.Any])
    __obj.asInstanceOf[Schema$GoogleCloudServicebrokerV1alpha1__CreateBindingResponse]
  }
}

