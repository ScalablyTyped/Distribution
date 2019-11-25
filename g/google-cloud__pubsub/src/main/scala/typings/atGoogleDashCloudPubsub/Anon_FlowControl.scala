package typings.atGoogleDashCloudPubsub

import typings.atGoogleDashCloudPubsub.buildSrcLeaseDashManagerMod.FlowControlOptions
import typings.googleDashGax.buildSrcGaxMod.CallOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_FlowControl extends js.Object {
  var flowControl: js.UndefOr[FlowControlOptions] = js.undefined
  var gaxOpts: js.UndefOr[CallOptions] = js.undefined
}

object Anon_FlowControl {
  @scala.inline
  def apply(flowControl: FlowControlOptions = null, gaxOpts: CallOptions = null): Anon_FlowControl = {
    val __obj = js.Dynamic.literal()
    if (flowControl != null) __obj.updateDynamic("flowControl")(flowControl.asInstanceOf[js.Any])
    if (gaxOpts != null) __obj.updateDynamic("gaxOpts")(gaxOpts.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_FlowControl]
  }
}

