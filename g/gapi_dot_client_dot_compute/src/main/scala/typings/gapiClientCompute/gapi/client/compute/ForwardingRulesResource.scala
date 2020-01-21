package typings.gapiClientCompute.gapi.client.compute

import typings.gapiClient.gapi.client.Request_
import typings.gapiClientCompute.AnonAlt
import typings.gapiClientCompute.AnonAltFieldsFilter
import typings.gapiClientCompute.AnonAltFieldsForwardingRule
import typings.gapiClientCompute.AnonAltFieldsForwardingRuleKey
import typings.gapiClientCompute.AnonAltFieldsKey
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ForwardingRulesResource extends js.Object {
  /** Retrieves an aggregated list of forwarding rules. */
  def aggregatedList(request: AnonAlt): Request_[ForwardingRuleAggregatedList]
  /** Deletes the specified ForwardingRule resource. */
  def delete(request: AnonAltFieldsForwardingRule): Request_[Operation]
  /** Returns the specified ForwardingRule resource. */
  def get(request: AnonAltFieldsForwardingRuleKey): Request_[ForwardingRule]
  /** Creates a ForwardingRule resource in the specified project and region using the data included in the request. */
  def insert(request: AnonAltFieldsKey): Request_[Operation]
  /** Retrieves a list of ForwardingRule resources available to the specified project and region. */
  def list(request: AnonAltFieldsFilter): Request_[ForwardingRuleList]
  /** Changes target URL for forwarding rule. The new target should be of the same type as the old target. */
  def setTarget(request: AnonAltFieldsForwardingRule): Request_[Operation]
}

object ForwardingRulesResource {
  @scala.inline
  def apply(
    aggregatedList: AnonAlt => Request_[ForwardingRuleAggregatedList],
    delete: AnonAltFieldsForwardingRule => Request_[Operation],
    get: AnonAltFieldsForwardingRuleKey => Request_[ForwardingRule],
    insert: AnonAltFieldsKey => Request_[Operation],
    list: AnonAltFieldsFilter => Request_[ForwardingRuleList],
    setTarget: AnonAltFieldsForwardingRule => Request_[Operation]
  ): ForwardingRulesResource = {
    val __obj = js.Dynamic.literal(aggregatedList = js.Any.fromFunction1(aggregatedList), delete = js.Any.fromFunction1(delete), get = js.Any.fromFunction1(get), insert = js.Any.fromFunction1(insert), list = js.Any.fromFunction1(list), setTarget = js.Any.fromFunction1(setTarget))
  
    __obj.asInstanceOf[ForwardingRulesResource]
  }
}

