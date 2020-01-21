package typings.gapiClientServicemanagement.gapi.client.servicemanagement

import typings.gapiClient.gapi.client.Request_
import typings.gapiClientServicemanagement.AnonAccesstokenAltBearertoken
import typings.gapiClientServicemanagement.AnonAccesstokenAltBearertokenCallbackConfigId
import typings.gapiClientServicemanagement.AnonAccesstokenAltBearertokenCallbackConsumerId
import typings.gapiClientServicemanagement.AnonAccesstokenAltBearertokenCallbackFieldsKey
import typings.gapiClientServicemanagement.AnonAccesstokenAltBearertokenCallbackFieldsKeyOauthtokenPp
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ServicesResource extends js.Object {
  var configs: ConfigsResource
  var consumers: ConsumersResource
  var rollouts: RolloutsResource
  /**
    * Creates a new managed service.
    * Please note one producer project can own no more than 20 services.
    *
    * Operation<response: ManagedService>
    */
  def create(request: AnonAccesstokenAltBearertokenCallbackFieldsKeyOauthtokenPp): Request_[Operation]
  /**
    * Deletes a managed service. This method will change the service to the
    * `Soft-Delete` state for 30 days. Within this period, service producers may
    * call UndeleteService to restore the service.
    * After 30 days, the service will be permanently deleted.
    *
    * Operation<response: google.protobuf.Empty>
    */
  def delete(request: AnonAccesstokenAltBearertoken): Request_[Operation]
  /**
    * Disables a service for a project, so it can no longer be
    * be used for the project. It prevents accidental usage that may cause
    * unexpected billing charges or security leaks.
    *
    * Operation<response: DisableServiceResponse>
    */
  def disable(request: AnonAccesstokenAltBearertoken): Request_[Operation]
  /**
    * Enables a service for a project, so it can be used
    * for the project. See
    * [Cloud Auth Guide](https://cloud.google.com/docs/authentication) for
    * more information.
    *
    * Operation<response: EnableServiceResponse>
    */
  def enable(request: AnonAccesstokenAltBearertoken): Request_[Operation]
  /**
    * Generates and returns a report (errors, warnings and changes from
    * existing configurations) associated with
    * GenerateConfigReportRequest.new_value
    *
    * If GenerateConfigReportRequest.old_value is specified,
    * GenerateConfigReportRequest will contain a single ChangeReport based on the
    * comparison between GenerateConfigReportRequest.new_value and
    * GenerateConfigReportRequest.old_value.
    * If GenerateConfigReportRequest.old_value is not specified, this method
    * will compare GenerateConfigReportRequest.new_value with the last pushed
    * service configuration.
    */
  def generateConfigReport(request: AnonAccesstokenAltBearertokenCallbackFieldsKeyOauthtokenPp): Request_[GenerateConfigReportResponse]
  /**
    * Gets a managed service. Authentication is required unless the service is
    * public.
    */
  def get(request: AnonAccesstokenAltBearertoken): Request_[ManagedService]
  /** Gets a service configuration (version) for a managed service. */
  def getConfig(request: AnonAccesstokenAltBearertokenCallbackConfigId): Request_[Service]
  /**
    * Gets the access control policy for a resource.
    * Returns an empty policy if the resource exists and does not have a policy
    * set.
    */
  def getIamPolicy(request: AnonAccesstokenAltBearertokenCallbackFieldsKey): Request_[Policy]
  /**
    * Lists managed services.
    *
    * Returns all public services. For authenticated users, also returns all
    * services the calling user has "servicemanagement.services.get" permission
    * for.
    *
    * &#42;&#42;BETA:&#42;&#42; If the caller specifies the `consumer_id`, it returns only the
    * services enabled on the consumer. The `consumer_id` must have the format
    * of "project:{PROJECT-ID}".
    */
  def list(request: AnonAccesstokenAltBearertokenCallbackConsumerId): Request_[ListServicesResponse]
  /**
    * Sets the access control policy on the specified resource. Replaces any
    * existing policy.
    */
  def setIamPolicy(request: AnonAccesstokenAltBearertokenCallbackFieldsKey): Request_[Policy]
  /**
    * Returns permissions that a caller has on the specified resource.
    * If the resource does not exist, this will return an empty set of
    * permissions, not a NOT_FOUND error.
    *
    * Note: This operation is designed to be used for building permission-aware
    * UIs and command-line tools, not for authorization checking. This operation
    * may "fail open" without warning.
    */
  def testIamPermissions(request: AnonAccesstokenAltBearertokenCallbackFieldsKey): Request_[TestIamPermissionsResponse]
  /**
    * Revives a previously deleted managed service. The method restores the
    * service using the configuration at the time the service was deleted.
    * The target service must exist and must have been deleted within the
    * last 30 days.
    *
    * Operation<response: UndeleteServiceResponse>
    */
  def undelete(request: AnonAccesstokenAltBearertoken): Request_[Operation]
}

object ServicesResource {
  @scala.inline
  def apply(
    configs: ConfigsResource,
    consumers: ConsumersResource,
    create: AnonAccesstokenAltBearertokenCallbackFieldsKeyOauthtokenPp => Request_[Operation],
    delete: AnonAccesstokenAltBearertoken => Request_[Operation],
    disable: AnonAccesstokenAltBearertoken => Request_[Operation],
    enable: AnonAccesstokenAltBearertoken => Request_[Operation],
    generateConfigReport: AnonAccesstokenAltBearertokenCallbackFieldsKeyOauthtokenPp => Request_[GenerateConfigReportResponse],
    get: AnonAccesstokenAltBearertoken => Request_[ManagedService],
    getConfig: AnonAccesstokenAltBearertokenCallbackConfigId => Request_[Service],
    getIamPolicy: AnonAccesstokenAltBearertokenCallbackFieldsKey => Request_[Policy],
    list: AnonAccesstokenAltBearertokenCallbackConsumerId => Request_[ListServicesResponse],
    rollouts: RolloutsResource,
    setIamPolicy: AnonAccesstokenAltBearertokenCallbackFieldsKey => Request_[Policy],
    testIamPermissions: AnonAccesstokenAltBearertokenCallbackFieldsKey => Request_[TestIamPermissionsResponse],
    undelete: AnonAccesstokenAltBearertoken => Request_[Operation]
  ): ServicesResource = {
    val __obj = js.Dynamic.literal(configs = configs.asInstanceOf[js.Any], consumers = consumers.asInstanceOf[js.Any], create = js.Any.fromFunction1(create), delete = js.Any.fromFunction1(delete), disable = js.Any.fromFunction1(disable), enable = js.Any.fromFunction1(enable), generateConfigReport = js.Any.fromFunction1(generateConfigReport), get = js.Any.fromFunction1(get), getConfig = js.Any.fromFunction1(getConfig), getIamPolicy = js.Any.fromFunction1(getIamPolicy), list = js.Any.fromFunction1(list), rollouts = rollouts.asInstanceOf[js.Any], setIamPolicy = js.Any.fromFunction1(setIamPolicy), testIamPermissions = js.Any.fromFunction1(testIamPermissions), undelete = js.Any.fromFunction1(undelete))
  
    __obj.asInstanceOf[ServicesResource]
  }
}

