package typings
package dymoDashLabelDashFrameworkLib.dymoNs.labelNs.frameworkNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait CreateLabelRenderParamsXmlParams extends js.Object {
  /**  The direction of the label content on the label (left-to-right or right-to-left). Use the dymo.label.framework.FlowDirection enumeration to specify the value. */
  var flowDirection: js.UndefOr[FlowDirection] = js.undefined
  /** The color of the label. */
  var labelColor: js.UndefOr[Color] = js.undefined
  /**
  		 * If true, the PNG will be generated using the display resolution.
  		 * If false, the PNG will be generated using the printer resolution.
  		 * If the display resolution is used, the resulting PNG will be smaller.
  		 * Use the printer resolution if the resulting image will be zoomed. This will give the zoomed preview better quality.
  		 */
  var pngUseDisplayResolution: js.UndefOr[scala.Boolean] = js.undefined
  /** The color of label shadow. */
  var shadowColor: js.UndefOr[Color] = js.undefined
  /** The shadow width in TWIPS. If '0' is specified, no shadow is rendered. */
  var shadowDepth: js.UndefOr[scala.Double] = js.undefined
}

