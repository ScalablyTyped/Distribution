package typings
package gapiDotClientDotAndroidmanagementLib.gapiNs.clientNs.androidmanagementNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PoliciesResource extends js.Object {
  /** Deletes a policy. This operation is only permitted if no devices are currently referencing the policy. */
  def delete(request: gapiDotClientDotAndroidmanagementLib.Anon_AccesstokenAlt): gapiDotClientLib.gapiNs.clientNs.Request[js.Object]
  /** Gets a policy. */
  def get(request: gapiDotClientDotAndroidmanagementLib.Anon_AccesstokenAlt): gapiDotClientLib.gapiNs.clientNs.Request[Policy]
  /** Lists policies for a given enterprise. */
  def list(request: gapiDotClientDotAndroidmanagementLib.Anon_AccesstokenAltBearertokenCallback): gapiDotClientLib.gapiNs.clientNs.Request[ListPoliciesResponse]
  /** Updates or creates a policy. */
  def patch(request: gapiDotClientDotAndroidmanagementLib.Anon_AccesstokenAltBearertokenCallbackFields): gapiDotClientLib.gapiNs.clientNs.Request[Policy]
}

object PoliciesResource {
  @scala.inline
  def apply(
    delete: gapiDotClientDotAndroidmanagementLib.Anon_AccesstokenAlt => gapiDotClientLib.gapiNs.clientNs.Request[js.Object],
    get: gapiDotClientDotAndroidmanagementLib.Anon_AccesstokenAlt => gapiDotClientLib.gapiNs.clientNs.Request[Policy],
    list: gapiDotClientDotAndroidmanagementLib.Anon_AccesstokenAltBearertokenCallback => gapiDotClientLib.gapiNs.clientNs.Request[ListPoliciesResponse],
    patch: gapiDotClientDotAndroidmanagementLib.Anon_AccesstokenAltBearertokenCallbackFields => gapiDotClientLib.gapiNs.clientNs.Request[Policy]
  ): PoliciesResource = {
    val __obj = js.Dynamic.literal(delete = js.Any.fromFunction1(delete), get = js.Any.fromFunction1(get), list = js.Any.fromFunction1(list), patch = js.Any.fromFunction1(patch))
  
    __obj.asInstanceOf[PoliciesResource]
  }
}

