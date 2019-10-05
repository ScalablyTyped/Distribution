package typings.gapiDotClientDotAndroidmanagement.gapi.client.androidmanagement

import typings.gapiDotClient.gapi.client.Request
import typings.gapiDotClientDotAndroidmanagement.Anon_AccesstokenAlt
import typings.gapiDotClientDotAndroidmanagement.Anon_AccesstokenAltBearertokenCallback
import typings.gapiDotClientDotAndroidmanagement.Anon_AccesstokenAltBearertokenCallbackFields
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PoliciesResource extends js.Object {
  /** Deletes a policy. This operation is only permitted if no devices are currently referencing the policy. */
  def delete(request: Anon_AccesstokenAlt): Request[js.Object]
  /** Gets a policy. */
  def get(request: Anon_AccesstokenAlt): Request[Policy]
  /** Lists policies for a given enterprise. */
  def list(request: Anon_AccesstokenAltBearertokenCallback): Request[ListPoliciesResponse]
  /** Updates or creates a policy. */
  def patch(request: Anon_AccesstokenAltBearertokenCallbackFields): Request[Policy]
}

object PoliciesResource {
  @scala.inline
  def apply(
    delete: Anon_AccesstokenAlt => Request[js.Object],
    get: Anon_AccesstokenAlt => Request[Policy],
    list: Anon_AccesstokenAltBearertokenCallback => Request[ListPoliciesResponse],
    patch: Anon_AccesstokenAltBearertokenCallbackFields => Request[Policy]
  ): PoliciesResource = {
    val __obj = js.Dynamic.literal(delete = js.Any.fromFunction1(delete), get = js.Any.fromFunction1(get), list = js.Any.fromFunction1(list), patch = js.Any.fromFunction1(patch))
  
    __obj.asInstanceOf[PoliciesResource]
  }
}

