package typings
package gapiDotClientDotServicemanagementLib.gapiNs.clientNs.servicemanagementNs

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
  def create(request: gapiDotClientDotServicemanagementLib.Anon_AccesstokenAltBearertoken): gapiDotClientLib.gapiNs.clientNs.Request[Operation]
  /** Gets a service configuration rollout. */
  def get(
    request: gapiDotClientDotServicemanagementLib.Anon_AccesstokenAltBearertokenCallbackFieldsKeyOauthtoken
  ): gapiDotClientLib.gapiNs.clientNs.Request[Rollout]
  /**
    * Lists the history of the service configuration rollouts for a managed
    * service, from the newest to the oldest.
    */
  def list(request: gapiDotClientDotServicemanagementLib.Anon_AccesstokenAltBearertokenCallbackFieldsFilter): gapiDotClientLib.gapiNs.clientNs.Request[ListServiceRolloutsResponse]
}

object RolloutsResource {
  @scala.inline
  def apply(
    create: js.Function1[
      gapiDotClientDotServicemanagementLib.Anon_AccesstokenAltBearertoken, 
      gapiDotClientLib.gapiNs.clientNs.Request[Operation]
    ],
    get: js.Function1[
      gapiDotClientDotServicemanagementLib.Anon_AccesstokenAltBearertokenCallbackFieldsKeyOauthtoken, 
      gapiDotClientLib.gapiNs.clientNs.Request[Rollout]
    ],
    list: js.Function1[
      gapiDotClientDotServicemanagementLib.Anon_AccesstokenAltBearertokenCallbackFieldsFilter, 
      gapiDotClientLib.gapiNs.clientNs.Request[ListServiceRolloutsResponse]
    ]
  ): RolloutsResource = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("create")(create)
    __obj.updateDynamic("get")(get)
    __obj.updateDynamic("list")(list)
    __obj.asInstanceOf[RolloutsResource]
  }
}

