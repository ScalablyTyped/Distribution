package typings.gapiDotClientDotServicemanagement.gapi.client.servicemanagement

import typings.gapiDotClient.gapi.client.Request
import typings.gapiDotClientDotServicemanagement.Anon_AccesstokenAltBearertoken
import typings.gapiDotClientDotServicemanagement.Anon_AccesstokenAltBearertokenCallbackFieldsFilter
import typings.gapiDotClientDotServicemanagement.Anon_AccesstokenAltBearertokenCallbackFieldsKeyOauthtoken
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RolloutsResource extends js.Object {
  /**
    * Creates a new service configuration rollout. Based on rollout, the
    * Google Service Management will roll out the service configurations to
    * different backend services. For example, the logging configuration will be
    * pushed to Google Cloud Logging.
    *
    * Please note that any previous pending and running Rollouts and associated
    * Operations will be automatically cancelled so that the latest Rollout will
    * not be blocked by previous Rollouts.
    *
    * Operation<response: Rollout>
    */
  def create(request: Anon_AccesstokenAltBearertoken): Request[Operation]
  /** Gets a service configuration rollout. */
  def get(request: Anon_AccesstokenAltBearertokenCallbackFieldsKeyOauthtoken): Request[Rollout]
  /**
    * Lists the history of the service configuration rollouts for a managed
    * service, from the newest to the oldest.
    */
  def list(request: Anon_AccesstokenAltBearertokenCallbackFieldsFilter): Request[ListServiceRolloutsResponse]
}

object RolloutsResource {
  @scala.inline
  def apply(
    create: Anon_AccesstokenAltBearertoken => Request[Operation],
    get: Anon_AccesstokenAltBearertokenCallbackFieldsKeyOauthtoken => Request[Rollout],
    list: Anon_AccesstokenAltBearertokenCallbackFieldsFilter => Request[ListServiceRolloutsResponse]
  ): RolloutsResource = {
    val __obj = js.Dynamic.literal(create = js.Any.fromFunction1(create), get = js.Any.fromFunction1(get), list = js.Any.fromFunction1(list))
  
    __obj.asInstanceOf[RolloutsResource]
  }
}

