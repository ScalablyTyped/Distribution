package typings
package dymoDashLabelDashFrameworkLib.dymoNs.labelNs.frameworkNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait CreateTapePrintParamsXmlParams extends js.Object {
  /** The label alignment on the tape. Use the dymo.label.framework.TapeAlignment enumeration to specify the value. */
  var alignment: js.UndefOr[TapeAlignment] = js.undefined
  /** The number of copies to print. */
  var copies: js.UndefOr[scala.Double] = js.undefined
  /** The cut mode (if auto-cut is supported by the printer). Use the dymo.label.framework.TapeCutMode enumeration to specify the value. */
  var cutMode: js.UndefOr[TapeCutMode] = js.undefined
  /** The direction of the label content on the label (left-to-right or right-to-left). Use the dymo.label.framework.FlowDirection enumeration to specify the value. */
  var flowDirection: js.UndefOr[FlowDirection] = js.undefined
  /** The print job title/description. */
  var jobTitle: js.UndefOr[java.lang.String] = js.undefined
}

