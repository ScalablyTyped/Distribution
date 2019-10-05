package typings.gapiDotClientDotCompute.gapi.client.compute

import typings.gapiDotClient.gapi.client.Request
import typings.gapiDotClientDotCompute.Anon_Alt
import typings.gapiDotClientDotCompute.Anon_AltFieldsForwardingRuleKeyOauthtoken
import typings.gapiDotClientDotCompute.Anon_AltFieldsForwardingRuleKeyOauthtokenPrettyPrint
import typings.gapiDotClientDotCompute.Anon_AltFieldsKeyOauthtokenPrettyPrint
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GlobalForwardingRulesResource extends js.Object {
  /** Deletes the specified GlobalForwardingRule resource. */
  def delete(request: Anon_AltFieldsForwardingRuleKeyOauthtoken): Request[Operation]
  /** Returns the specified GlobalForwardingRule resource. Get a list of available forwarding rules by making a list() request. */
  def get(request: Anon_AltFieldsForwardingRuleKeyOauthtokenPrettyPrint): Request[ForwardingRule]
  /** Creates a GlobalForwardingRule resource in the specified project using the data included in the request. */
  def insert(request: Anon_AltFieldsKeyOauthtokenPrettyPrint): Request[Operation]
  /** Retrieves a list of GlobalForwardingRule resources available to the specified project. */
  def list(request: Anon_Alt): Request[ForwardingRuleList]
  /** Changes target URL for the GlobalForwardingRule resource. The new target should be of the same type as the old target. */
  def setTarget(request: Anon_AltFieldsForwardingRuleKeyOauthtoken): Request[Operation]
}

object GlobalForwardingRulesResource {
  @scala.inline
  def apply(
    delete: Anon_AltFieldsForwardingRuleKeyOauthtoken => Request[Operation],
    get: Anon_AltFieldsForwardingRuleKeyOauthtokenPrettyPrint => Request[ForwardingRule],
    insert: Anon_AltFieldsKeyOauthtokenPrettyPrint => Request[Operation],
    list: Anon_Alt => Request[ForwardingRuleList],
    setTarget: Anon_AltFieldsForwardingRuleKeyOauthtoken => Request[Operation]
  ): GlobalForwardingRulesResource = {
    val __obj = js.Dynamic.literal(delete = js.Any.fromFunction1(delete), get = js.Any.fromFunction1(get), insert = js.Any.fromFunction1(insert), list = js.Any.fromFunction1(list), setTarget = js.Any.fromFunction1(setTarget))
  
    __obj.asInstanceOf[GlobalForwardingRulesResource]
  }
}

