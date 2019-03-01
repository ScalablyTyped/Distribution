package typings
package dymoDashLabelDashFrameworkLib.dymoNs.labelNs.frameworkNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CreateLabelWriterPrintParamsXmlParams extends js.Object {
  /** The number of copies to print. */
  var copies: js.UndefOr[scala.Double] = js.undefined
  /** The direction of the label content on the label (left-to-right or right-to-left). Use the dymo.label.framework.FlowDirection enumeration to specify the value. */
  var flowDirection: js.UndefOr[FlowDirection] = js.undefined
  /** The print job title/description. */
  var jobTitle: js.UndefOr[java.lang.String] = js.undefined
  /** The print quality. Use the dymo.label.framework.LabelWriterPrintQuality enumeration to specify the value. */
  var printQuality: js.UndefOr[LabelWriterPrintQuality] = js.undefined
  /** The roll to print to if the printer is a TwinTurbo printer. Use the dymo.label.framework.TwinTurboRoll enumeration to specify the value. */
  var twinTurboRoll: js.UndefOr[TwinTurboRoll] = js.undefined
}

object CreateLabelWriterPrintParamsXmlParams {
  @scala.inline
  def apply(
    copies: scala.Int | scala.Double = null,
    flowDirection: FlowDirection = null,
    jobTitle: java.lang.String = null,
    printQuality: LabelWriterPrintQuality = null,
    twinTurboRoll: TwinTurboRoll = null
  ): CreateLabelWriterPrintParamsXmlParams = {
    val __obj = js.Dynamic.literal()
    if (copies != null) __obj.updateDynamic("copies")(copies.asInstanceOf[js.Any])
    if (flowDirection != null) __obj.updateDynamic("flowDirection")(flowDirection)
    if (jobTitle != null) __obj.updateDynamic("jobTitle")(jobTitle)
    if (printQuality != null) __obj.updateDynamic("printQuality")(printQuality)
    if (twinTurboRoll != null) __obj.updateDynamic("twinTurboRoll")(twinTurboRoll)
    __obj.asInstanceOf[CreateLabelWriterPrintParamsXmlParams]
  }
}

