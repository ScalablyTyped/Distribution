package typings.gapiClientCompute.gapi.client.compute

import typings.gapiClient.gapi.client.Request
import typings.gapiClientCompute.anon.Alt
import typings.gapiClientCompute.anon.Filter
import typings.gapiClientCompute.anon.PrettyPrint
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ForwardingRulesResource extends js.Object {
  /** Retrieves an aggregated list of forwarding rules. */
  def aggregatedList(request: Alt): Request[ForwardingRuleAggregatedList] = js.native
  /** Deletes the specified ForwardingRule resource. */
  def delete(request: typings.gapiClientCompute.anon.ForwardingRule): Request[Operation] = js.native
  /** Returns the specified ForwardingRule resource. */
  def get(request: typings.gapiClientCompute.anon.Region): Request[ForwardingRule] = js.native
  /** Creates a ForwardingRule resource in the specified project and region using the data included in the request. */
  def insert(request: PrettyPrint): Request[Operation] = js.native
  /** Retrieves a list of ForwardingRule resources available to the specified project and region. */
  def list(request: Filter): Request[ForwardingRuleList] = js.native
  /** Changes target URL for forwarding rule. The new target should be of the same type as the old target. */
  def setTarget(request: typings.gapiClientCompute.anon.ForwardingRule): Request[Operation] = js.native
}

object ForwardingRulesResource {
  @scala.inline
  def apply(
    aggregatedList: Alt => Request[ForwardingRuleAggregatedList],
    delete: typings.gapiClientCompute.anon.ForwardingRule => Request[Operation],
    get: typings.gapiClientCompute.anon.Region => Request[ForwardingRule],
    insert: PrettyPrint => Request[Operation],
    list: Filter => Request[ForwardingRuleList],
    setTarget: typings.gapiClientCompute.anon.ForwardingRule => Request[Operation]
  ): ForwardingRulesResource = {
    val __obj = js.Dynamic.literal(aggregatedList = js.Any.fromFunction1(aggregatedList), delete = js.Any.fromFunction1(delete), get = js.Any.fromFunction1(get), insert = js.Any.fromFunction1(insert), list = js.Any.fromFunction1(list), setTarget = js.Any.fromFunction1(setTarget))
    __obj.asInstanceOf[ForwardingRulesResource]
  }
  @scala.inline
  implicit class ForwardingRulesResourceOps[Self <: ForwardingRulesResource] (val x: Self) extends AnyVal {
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
    def setAggregatedList(value: Alt => Request[ForwardingRuleAggregatedList]): Self = this.set("aggregatedList", js.Any.fromFunction1(value))
    @scala.inline
    def setDelete(value: typings.gapiClientCompute.anon.ForwardingRule => Request[Operation]): Self = this.set("delete", js.Any.fromFunction1(value))
    @scala.inline
    def setGet(value: typings.gapiClientCompute.anon.Region => Request[ForwardingRule]): Self = this.set("get", js.Any.fromFunction1(value))
    @scala.inline
    def setInsert(value: PrettyPrint => Request[Operation]): Self = this.set("insert", js.Any.fromFunction1(value))
    @scala.inline
    def setList(value: Filter => Request[ForwardingRuleList]): Self = this.set("list", js.Any.fromFunction1(value))
    @scala.inline
    def setSetTarget(value: typings.gapiClientCompute.anon.ForwardingRule => Request[Operation]): Self = this.set("setTarget", js.Any.fromFunction1(value))
  }
  
}

