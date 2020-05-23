package typings.gapiClientCompute.gapi.client.compute

import typings.gapiClient.gapi.client.Request
import typings.gapiClientCompute.anon.Alt
import typings.gapiClientCompute.anon.AltFields
import typings.gapiClientCompute.anon.FieldsForwardingRule
import typings.gapiClientCompute.anon.ForwardingRuleKey
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GlobalForwardingRulesResource extends js.Object {
  /** Deletes the specified GlobalForwardingRule resource. */
  def delete(request: FieldsForwardingRule): Request[Operation]
  /** Returns the specified GlobalForwardingRule resource. Get a list of available forwarding rules by making a list() request. */
  def get(request: ForwardingRuleKey): Request[ForwardingRule]
  /** Creates a GlobalForwardingRule resource in the specified project using the data included in the request. */
  def insert(request: AltFields): Request[Operation]
  /** Retrieves a list of GlobalForwardingRule resources available to the specified project. */
  def list(request: Alt): Request[ForwardingRuleList]
  /** Changes target URL for the GlobalForwardingRule resource. The new target should be of the same type as the old target. */
  def setTarget(request: FieldsForwardingRule): Request[Operation]
}

object GlobalForwardingRulesResource {
  @scala.inline
  def apply(
    delete: FieldsForwardingRule => Request[Operation],
    get: ForwardingRuleKey => Request[ForwardingRule],
    insert: AltFields => Request[Operation],
    list: Alt => Request[ForwardingRuleList],
    setTarget: FieldsForwardingRule => Request[Operation]
  ): GlobalForwardingRulesResource = {
    val __obj = js.Dynamic.literal(delete = js.Any.fromFunction1(delete), get = js.Any.fromFunction1(get), insert = js.Any.fromFunction1(insert), list = js.Any.fromFunction1(list), setTarget = js.Any.fromFunction1(setTarget))
    __obj.asInstanceOf[GlobalForwardingRulesResource]
  }
}

