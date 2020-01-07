package typings.googleapis.buildSrcApisAdexchangebuyer2V2beta1Mod.adexchangebuyer2_v2beta1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Request to accept a proposal.
  */
@js.native
trait Schema$AcceptProposalRequest extends js.Object {
  /**
    * The last known client revision number of the proposal.
    */
  var proposalRevision: js.UndefOr[String] = js.native
}

object Schema$AcceptProposalRequest {
  @scala.inline
  def apply(proposalRevision: String = null): Schema$AcceptProposalRequest = {
    val __obj = js.Dynamic.literal()
    if (proposalRevision != null) __obj.updateDynamic("proposalRevision")(proposalRevision.asInstanceOf[js.Any])
    __obj.asInstanceOf[Schema$AcceptProposalRequest]
  }
}

