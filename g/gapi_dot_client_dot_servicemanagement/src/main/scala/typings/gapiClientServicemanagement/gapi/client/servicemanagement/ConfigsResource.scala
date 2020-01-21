package typings.gapiClientServicemanagement.gapi.client.servicemanagement

import typings.gapiClient.gapi.client.Request_
import typings.gapiClientServicemanagement.AnonAccesstokenAltBearertoken
import typings.gapiClientServicemanagement.AnonAccesstokenAltBearertokenCallback
import typings.gapiClientServicemanagement.AnonAccesstokenAltBearertokenCallbackFields
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ConfigsResource extends js.Object {
  /**
    * Creates a new service configuration (version) for a managed service.
    * This method only stores the service configuration. To roll out the service
    * configuration to backend systems please call
    * CreateServiceRollout.
    */
  def create(request: AnonAccesstokenAltBearertoken): Request_[Service]
  /** Gets a service configuration (version) for a managed service. */
  def get(request: AnonAccesstokenAltBearertokenCallback): Request_[Service]
  /**
    * Lists the history of the service configuration for a managed service,
    * from the newest to the oldest.
    */
  def list(request: AnonAccesstokenAltBearertokenCallbackFields): Request_[ListServiceConfigsResponse]
  /**
    * Creates a new service configuration (version) for a managed service based
    * on
    * user-supplied configuration source files (for example: OpenAPI
    * Specification). This method stores the source configurations as well as the
    * generated service configuration. To rollout the service configuration to
    * other services,
    * please call CreateServiceRollout.
    *
    * Operation<response: SubmitConfigSourceResponse>
    */
  def submit(request: AnonAccesstokenAltBearertoken): Request_[Operation]
}

object ConfigsResource {
  @scala.inline
  def apply(
    create: AnonAccesstokenAltBearertoken => Request_[Service],
    get: AnonAccesstokenAltBearertokenCallback => Request_[Service],
    list: AnonAccesstokenAltBearertokenCallbackFields => Request_[ListServiceConfigsResponse],
    submit: AnonAccesstokenAltBearertoken => Request_[Operation]
  ): ConfigsResource = {
    val __obj = js.Dynamic.literal(create = js.Any.fromFunction1(create), get = js.Any.fromFunction1(get), list = js.Any.fromFunction1(list), submit = js.Any.fromFunction1(submit))
  
    __obj.asInstanceOf[ConfigsResource]
  }
}

