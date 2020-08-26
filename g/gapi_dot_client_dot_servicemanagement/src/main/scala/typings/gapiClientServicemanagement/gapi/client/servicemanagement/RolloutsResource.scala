package typings.gapiClientServicemanagement.gapi.client.servicemanagement

import typings.gapiClient.gapi.client.Request
import typings.gapiClientServicemanagement.anon.Bearertoken
import typings.gapiClientServicemanagement.anon.Filter
import typings.gapiClientServicemanagement.anon.Oauthtoken
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
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
  def create(request: Bearertoken): Request[Operation] = js.native
  /** Gets a service configuration rollout. */
  def get(request: Oauthtoken): Request[Rollout] = js.native
  /**
    * Lists the history of the service configuration rollouts for a managed
    * service, from the newest to the oldest.
    */
  def list(request: Filter): Request[ListServiceRolloutsResponse] = js.native
}

object RolloutsResource {
  @scala.inline
  def apply(
    create: Bearertoken => Request[Operation],
    get: Oauthtoken => Request[Rollout],
    list: Filter => Request[ListServiceRolloutsResponse]
  ): RolloutsResource = {
    val __obj = js.Dynamic.literal(create = js.Any.fromFunction1(create), get = js.Any.fromFunction1(get), list = js.Any.fromFunction1(list))
    __obj.asInstanceOf[RolloutsResource]
  }
  @scala.inline
  implicit class RolloutsResourceOps[Self <: RolloutsResource] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setCreate(value: Bearertoken => Request[Operation]): Self = this.set("create", js.Any.fromFunction1(value))
    @scala.inline
    def setGet(value: Oauthtoken => Request[Rollout]): Self = this.set("get", js.Any.fromFunction1(value))
    @scala.inline
    def setList(value: Filter => Request[ListServiceRolloutsResponse]): Self = this.set("list", js.Any.fromFunction1(value))
  }
  
}

