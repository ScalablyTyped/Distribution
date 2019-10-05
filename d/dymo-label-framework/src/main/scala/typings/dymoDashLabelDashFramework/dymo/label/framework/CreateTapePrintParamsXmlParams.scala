package typings.dymoDashLabelDashFramework.dymo.label.framework

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CreateTapePrintParamsXmlParams extends js.Object {
  /** The label alignment on the tape. Use the dymo.label.framework.TapeAlignment enumeration to specify the value. */
  var alignment: js.UndefOr[TapeAlignment] = js.undefined
  /** The number of copies to print. */
  var copies: js.UndefOr[Double] = js.undefined
  /** The cut mode (if auto-cut is supported by the printer). Use the dymo.label.framework.TapeCutMode enumeration to specify the value. */
  var cutMode: js.UndefOr[TapeCutMode] = js.undefined
  /** The direction of the label content on the label (left-to-right or right-to-left). Use the dymo.label.framework.FlowDirection enumeration to specify the value. */
  var flowDirection: js.UndefOr[FlowDirection] = js.undefined
  /** The print job title/description. */
  var jobTitle: js.UndefOr[String] = js.undefined
}

object CreateTapePrintParamsXmlParams {
  @scala.inline
  def apply(
    alignment: TapeAlignment = null,
    copies: Int | Double = null,
    cutMode: TapeCutMode = null,
    flowDirection: FlowDirection = null,
    jobTitle: String = null
  ): CreateTapePrintParamsXmlParams = {
    val __obj = js.Dynamic.literal()
    if (alignment != null) __obj.updateDynamic("alignment")(alignment)
    if (copies != null) __obj.updateDynamic("copies")(copies.asInstanceOf[js.Any])
    if (cutMode != null) __obj.updateDynamic("cutMode")(cutMode)
    if (flowDirection != null) __obj.updateDynamic("flowDirection")(flowDirection)
    if (jobTitle != null) __obj.updateDynamic("jobTitle")(jobTitle)
    __obj.asInstanceOf[CreateTapePrintParamsXmlParams]
  }
}

