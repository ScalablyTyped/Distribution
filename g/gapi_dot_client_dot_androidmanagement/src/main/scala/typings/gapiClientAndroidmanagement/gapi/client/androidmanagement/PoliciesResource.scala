package typings.gapiClientAndroidmanagement.gapi.client.androidmanagement

import typings.gapiClient.gapi.client.Request
import typings.gapiClientAndroidmanagement.anon.Alt
import typings.gapiClientAndroidmanagement.anon.Callback
import typings.gapiClientAndroidmanagement.anon.Fields
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PoliciesResource extends js.Object {
  /** Deletes a policy. This operation is only permitted if no devices are currently referencing the policy. */
  def delete(request: Alt): Request[js.Object]
  /** Gets a policy. */
  def get(request: Alt): Request[Policy]
  /** Lists policies for a given enterprise. */
  def list(request: Callback): Request[ListPoliciesResponse]
  /** Updates or creates a policy. */
  def patch(request: Fields): Request[Policy]
}

object PoliciesResource {
  @scala.inline
  def apply(
    delete: Alt => Request[js.Object],
    get: Alt => Request[Policy],
    list: Callback => Request[ListPoliciesResponse],
    patch: Fields => Request[Policy]
  ): PoliciesResource = {
    val __obj = js.Dynamic.literal(delete = js.Any.fromFunction1(delete), get = js.Any.fromFunction1(get), list = js.Any.fromFunction1(list), patch = js.Any.fromFunction1(patch))
    __obj.asInstanceOf[PoliciesResource]
  }
}

