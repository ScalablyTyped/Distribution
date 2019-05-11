package typings
package atGoogleDashCloudPubsubLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_FlowControl extends js.Object {
  var flowControl: js.UndefOr[atGoogleDashCloudPubsubLib.buildSrcLeaseDashManagerMod.FlowControlOptions] = js.undefined
  var gaxOpts: js.UndefOr[googleDashGaxLib.buildSrcGaxMod.CallOptions] = js.undefined
}

object Anon_FlowControl {
  @scala.inline
  def apply(
    flowControl: atGoogleDashCloudPubsubLib.buildSrcLeaseDashManagerMod.FlowControlOptions = null,
    gaxOpts: googleDashGaxLib.buildSrcGaxMod.CallOptions = null
  ): Anon_FlowControl = {
    val __obj = js.Dynamic.literal()
    if (flowControl != null) __obj.updateDynamic("flowControl")(flowControl)
    if (gaxOpts != null) __obj.updateDynamic("gaxOpts")(gaxOpts)
    __obj.asInstanceOf[Anon_FlowControl]
  }
}

