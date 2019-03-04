package typings
package gapiDotClientDotComputeLib.gapiNs.clientNs.computeNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GlobalForwardingRulesResource extends js.Object {
  /** Deletes the specified GlobalForwardingRule resource. */
  def delete(request: gapiDotClientDotComputeLib.Anon_AltFieldsForwardingRuleKeyOauthtoken): gapiDotClientLib.gapiNs.clientNs.Request[Operation]
  /** Returns the specified GlobalForwardingRule resource. Get a list of available forwarding rules by making a list() request. */
  def get(request: gapiDotClientDotComputeLib.Anon_AltFieldsForwardingRuleKeyOauthtokenPrettyPrint): gapiDotClientLib.gapiNs.clientNs.Request[ForwardingRule]
  /** Creates a GlobalForwardingRule resource in the specified project using the data included in the request. */
  def insert(request: gapiDotClientDotComputeLib.Anon_AltFieldsKeyOauthtokenPrettyPrint): gapiDotClientLib.gapiNs.clientNs.Request[Operation]
  /** Retrieves a list of GlobalForwardingRule resources available to the specified project. */
  def list(request: gapiDotClientDotComputeLib.Anon_Alt): gapiDotClientLib.gapiNs.clientNs.Request[ForwardingRuleList]
  /** Changes target URL for the GlobalForwardingRule resource. The new target should be of the same type as the old target. */
  def setTarget(request: gapiDotClientDotComputeLib.Anon_AltFieldsForwardingRuleKeyOauthtoken): gapiDotClientLib.gapiNs.clientNs.Request[Operation]
}

object GlobalForwardingRulesResource {
  @scala.inline
  def apply(
    delete: js.Function1[
      gapiDotClientDotComputeLib.Anon_AltFieldsForwardingRuleKeyOauthtoken, 
      gapiDotClientLib.gapiNs.clientNs.Request[Operation]
    ],
    get: js.Function1[
      gapiDotClientDotComputeLib.Anon_AltFieldsForwardingRuleKeyOauthtokenPrettyPrint, 
      gapiDotClientLib.gapiNs.clientNs.Request[ForwardingRule]
    ],
    insert: js.Function1[
      gapiDotClientDotComputeLib.Anon_AltFieldsKeyOauthtokenPrettyPrint, 
      gapiDotClientLib.gapiNs.clientNs.Request[Operation]
    ],
    list: js.Function1[
      gapiDotClientDotComputeLib.Anon_Alt, 
      gapiDotClientLib.gapiNs.clientNs.Request[ForwardingRuleList]
    ],
    setTarget: js.Function1[
      gapiDotClientDotComputeLib.Anon_AltFieldsForwardingRuleKeyOauthtoken, 
      gapiDotClientLib.gapiNs.clientNs.Request[Operation]
    ]
  ): GlobalForwardingRulesResource = {
    val __obj = js.Dynamic.literal(delete = delete, get = get, insert = insert, list = list, setTarget = setTarget)
  
    __obj.asInstanceOf[GlobalForwardingRulesResource]
  }
}

