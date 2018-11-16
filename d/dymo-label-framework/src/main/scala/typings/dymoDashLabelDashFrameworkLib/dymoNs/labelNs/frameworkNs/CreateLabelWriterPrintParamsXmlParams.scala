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

