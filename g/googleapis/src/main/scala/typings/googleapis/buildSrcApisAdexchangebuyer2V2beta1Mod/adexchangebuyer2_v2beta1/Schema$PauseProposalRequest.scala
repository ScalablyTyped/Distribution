package typings.googleapis.buildSrcApisAdexchangebuyer2V2beta1Mod.adexchangebuyer2_v2beta1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Request message to pause serving for an already-finalized proposal.
  */
@js.native
trait Schema$PauseProposalRequest extends js.Object {
  /**
    * The reason why the proposal is being paused. This human readable message
    * will be displayed in the seller&#39;s UI. (Max length: 1000 unicode code
    * units.)
    */
  var reason: js.UndefOr[String] = js.native
}

object Schema$PauseProposalRequest {
  @scala.inline
  def apply(reason: String = null): Schema$PauseProposalRequest = {
    val __obj = js.Dynamic.literal()
    if (reason != null) __obj.updateDynamic("reason")(reason.asInstanceOf[js.Any])
    __obj.asInstanceOf[Schema$PauseProposalRequest]
  }
}

