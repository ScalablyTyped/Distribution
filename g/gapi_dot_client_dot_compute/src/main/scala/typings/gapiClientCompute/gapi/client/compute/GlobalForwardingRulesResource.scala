package typings.gapiClientCompute.gapi.client.compute

import typings.gapiClient.gapi.client.Request_
import typings.gapiClientCompute.AnonAlt
import typings.gapiClientCompute.AnonAltFields
import typings.gapiClientCompute.AnonFieldsForwardingRule
import typings.gapiClientCompute.AnonForwardingRuleKey
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GlobalForwardingRulesResource extends js.Object {
  /** Deletes the specified GlobalForwardingRule resource. */
  def delete(request: AnonFieldsForwardingRule): Request_[Operation]
  /** Returns the specified GlobalForwardingRule resource. Get a list of available forwarding rules by making a list() request. */
  def get(request: AnonForwardingRuleKey): Request_[ForwardingRule]
  /** Creates a GlobalForwardingRule resource in the specified project using the data included in the request. */
  def insert(request: AnonAltFields): Request_[Operation]
  /** Retrieves a list of GlobalForwardingRule resources available to the specified project. */
  def list(request: AnonAlt): Request_[ForwardingRuleList]
  /** Changes target URL for the GlobalForwardingRule resource. The new target should be of the same type as the old target. */
  def setTarget(request: AnonFieldsForwardingRule): Request_[Operation]
}

object GlobalForwardingRulesResource {
  @scala.inline
  def apply(
    delete: AnonFieldsForwardingRule => Request_[Operation],
    get: AnonForwardingRuleKey => Request_[ForwardingRule],
    insert: AnonAltFields => Request_[Operation],
    list: AnonAlt => Request_[ForwardingRuleList],
    setTarget: AnonFieldsForwardingRule => Request_[Operation]
  ): GlobalForwardingRulesResource = {
    val __obj = js.Dynamic.literal(delete = js.Any.fromFunction1(delete), get = js.Any.fromFunction1(get), insert = js.Any.fromFunction1(insert), list = js.Any.fromFunction1(list), setTarget = js.Any.fromFunction1(setTarget))
  
    __obj.asInstanceOf[GlobalForwardingRulesResource]
  }
}

