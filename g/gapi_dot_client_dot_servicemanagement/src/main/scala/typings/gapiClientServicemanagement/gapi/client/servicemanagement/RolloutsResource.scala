package typings.gapiClientServicemanagement.gapi.client.servicemanagement

import typings.gapiClient.gapi.client.Request_
import typings.gapiClientServicemanagement.AnonBearertoken
import typings.gapiClientServicemanagement.AnonFilter
import typings.gapiClientServicemanagement.AnonOauthtoken
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
  def create(request: AnonBearertoken): Request_[Operation]
  /** Gets a service configuration rollout. */
  def get(request: AnonOauthtoken): Request_[Rollout]
  /**
    * Lists the history of the service configuration rollouts for a managed
    * service, from the newest to the oldest.
    */
  def list(request: AnonFilter): Request_[ListServiceRolloutsResponse]
}

object RolloutsResource {
  @scala.inline
  def apply(
    create: AnonBearertoken => Request_[Operation],
    get: AnonOauthtoken => Request_[Rollout],
    list: AnonFilter => Request_[ListServiceRolloutsResponse]
  ): RolloutsResource = {
    val __obj = js.Dynamic.literal(create = js.Any.fromFunction1(create), get = js.Any.fromFunction1(get), list = js.Any.fromFunction1(list))
  
    __obj.asInstanceOf[RolloutsResource]
  }
}

