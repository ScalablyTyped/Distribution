package typings.googleCloudPubsub

import typings.googleCloudPubsub.leaseManagerMod.FlowControlOptions
import typings.googleGax.gaxMod.CallOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonFlowControl extends js.Object {
  var flowControl: js.UndefOr[FlowControlOptions] = js.undefined
  var gaxOpts: js.UndefOr[CallOptions] = js.undefined
}

object AnonFlowControl {
  @scala.inline
  def apply(flowControl: FlowControlOptions = null, gaxOpts: CallOptions = null): AnonFlowControl = {
    val __obj = js.Dynamic.literal()
    if (flowControl != null) __obj.updateDynamic("flowControl")(flowControl.asInstanceOf[js.Any])
    if (gaxOpts != null) __obj.updateDynamic("gaxOpts")(gaxOpts.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonFlowControl]
  }
}

