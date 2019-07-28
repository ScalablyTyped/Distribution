package typings.gapiDotClientDotCompute.gapiNs.clientNs.computeNs

import typings.gapiDotClient.gapiNs.clientNs.Request
import typings.gapiDotClientDotCompute.Anon_Alt
import typings.gapiDotClientDotCompute.Anon_AltFieldsFilter
import typings.gapiDotClientDotCompute.Anon_AltFieldsForwardingRule
import typings.gapiDotClientDotCompute.Anon_AltFieldsForwardingRuleKey
import typings.gapiDotClientDotCompute.Anon_AltFieldsKey
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ForwardingRulesResource extends js.Object {
  /** Retrieves an aggregated list of forwarding rules. */
  def aggregatedList(request: Anon_Alt): Request[ForwardingRuleAggregatedList]
  /** Deletes the specified ForwardingRule resource. */
  def delete(request: Anon_AltFieldsForwardingRule): Request[Operation]
  /** Returns the specified ForwardingRule resource. */
  def get(request: Anon_AltFieldsForwardingRuleKey): Request[ForwardingRule]
  /** Creates a ForwardingRule resource in the specified project and region using the data included in the request. */
  def insert(request: Anon_AltFieldsKey): Request[Operation]
  /** Retrieves a list of ForwardingRule resources available to the specified project and region. */
  def list(request: Anon_AltFieldsFilter): Request[ForwardingRuleList]
  /** Changes target URL for forwarding rule. The new target should be of the same type as the old target. */
  def setTarget(request: Anon_AltFieldsForwardingRule): Request[Operation]
}

object ForwardingRulesResource {
  @scala.inline
  def apply(
    aggregatedList: Anon_Alt => Request[ForwardingRuleAggregatedList],
    delete: Anon_AltFieldsForwardingRule => Request[Operation],
    get: Anon_AltFieldsForwardingRuleKey => Request[ForwardingRule],
    insert: Anon_AltFieldsKey => Request[Operation],
    list: Anon_AltFieldsFilter => Request[ForwardingRuleList],
    setTarget: Anon_AltFieldsForwardingRule => Request[Operation]
  ): ForwardingRulesResource = {
    val __obj = js.Dynamic.literal(aggregatedList = js.Any.fromFunction1(aggregatedList), delete = js.Any.fromFunction1(delete), get = js.Any.fromFunction1(get), insert = js.Any.fromFunction1(insert), list = js.Any.fromFunction1(list), setTarget = js.Any.fromFunction1(setTarget))
  
    __obj.asInstanceOf[ForwardingRulesResource]
  }
}

