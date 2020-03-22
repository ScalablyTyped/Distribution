package typings.gapiClientAndroidmanagement.gapi.client.androidmanagement

import typings.gapiClient.gapi.client.Request_
import typings.gapiClientAndroidmanagement.AnonAlt
import typings.gapiClientAndroidmanagement.AnonCallback
import typings.gapiClientAndroidmanagement.AnonFields
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PoliciesResource extends js.Object {
  /** Deletes a policy. This operation is only permitted if no devices are currently referencing the policy. */
  def delete(request: AnonAlt): Request_[js.Object]
  /** Gets a policy. */
  def get(request: AnonAlt): Request_[Policy]
  /** Lists policies for a given enterprise. */
  def list(request: AnonCallback): Request_[ListPoliciesResponse]
  /** Updates or creates a policy. */
  def patch(request: AnonFields): Request_[Policy]
}

object PoliciesResource {
  @scala.inline
  def apply(
    delete: AnonAlt => Request_[js.Object],
    get: AnonAlt => Request_[Policy],
    list: AnonCallback => Request_[ListPoliciesResponse],
    patch: AnonFields => Request_[Policy]
  ): PoliciesResource = {
    val __obj = js.Dynamic.literal(delete = js.Any.fromFunction1(delete), get = js.Any.fromFunction1(get), list = js.Any.fromFunction1(list), patch = js.Any.fromFunction1(patch))
  
    __obj.asInstanceOf[PoliciesResource]
  }
}

