package typings.gapiDotClientDotServicemanagement.gapi.client.servicemanagement

import typings.gapiDotClient.gapi.client.Request
import typings.gapiDotClientDotServicemanagement.Anon_AccesstokenAltBearertoken
import typings.gapiDotClientDotServicemanagement.Anon_AccesstokenAltBearertokenCallback
import typings.gapiDotClientDotServicemanagement.Anon_AccesstokenAltBearertokenCallbackFields
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
  def create(request: Anon_AccesstokenAltBearertoken): Request[Service]
  /** Gets a service configuration (version) for a managed service. */
  def get(request: Anon_AccesstokenAltBearertokenCallback): Request[Service]
  /**
    * Lists the history of the service configuration for a managed service,
    * from the newest to the oldest.
    */
  def list(request: Anon_AccesstokenAltBearertokenCallbackFields): Request[ListServiceConfigsResponse]
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
  def submit(request: Anon_AccesstokenAltBearertoken): Request[Operation]
}

object ConfigsResource {
  @scala.inline
  def apply(
    create: Anon_AccesstokenAltBearertoken => Request[Service],
    get: Anon_AccesstokenAltBearertokenCallback => Request[Service],
    list: Anon_AccesstokenAltBearertokenCallbackFields => Request[ListServiceConfigsResponse],
    submit: Anon_AccesstokenAltBearertoken => Request[Operation]
  ): ConfigsResource = {
    val __obj = js.Dynamic.literal(create = js.Any.fromFunction1(create), get = js.Any.fromFunction1(get), list = js.Any.fromFunction1(list), submit = js.Any.fromFunction1(submit))
  
    __obj.asInstanceOf[ConfigsResource]
  }
}

