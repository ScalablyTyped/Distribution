package typings.gapiDotClientDotTagmanager.gapiNs.clientNs.tagmanagerNs

import typings.gapiDotClient.gapiNs.clientNs.Request
import typings.gapiDotClientDotTagmanager.Anon_Alt
import typings.gapiDotClientDotTagmanager.Anon_AltFields
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ProposalResource extends js.Object {
  /** Creates a GTM Workspace Proposal. */
  def create(request: Anon_Alt): Request[WorkspaceProposal]
  /** Deletes a GTM Workspace Proposal. */
  def delete(request: Anon_AltFields): Request[Unit]
}

object ProposalResource {
  @scala.inline
  def apply(create: Anon_Alt => Request[WorkspaceProposal], delete: Anon_AltFields => Request[Unit]): ProposalResource = {
    val __obj = js.Dynamic.literal(create = js.Any.fromFunction1(create), delete = js.Any.fromFunction1(delete))
  
    __obj.asInstanceOf[ProposalResource]
  }
}

