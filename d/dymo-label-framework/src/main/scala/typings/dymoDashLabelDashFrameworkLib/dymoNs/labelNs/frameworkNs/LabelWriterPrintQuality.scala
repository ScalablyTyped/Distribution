package typings
package dymoDashLabelDashFrameworkLib.dymoNs.labelNs.frameworkNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait LabelWriterPrintQuality extends js.Object

/**
	 * Enumeration that specifies the print quality when printing to a LabelWriter printer.
	 */
@JSGlobal("dymo.label.framework.LabelWriterPrintQuality")
@js.native
object LabelWriterPrintQuality extends js.Object {
  /** Indicates that the print quality is automatically determined based on the types of objects on the label. */
  @js.native
  sealed trait Auto
    extends dymoDashLabelDashFrameworkLib.dymoNs.labelNs.frameworkNs.LabelWriterPrintQuality
  
  /** Indicates that barcode and images print quality (slow) is used. */
  @js.native
  sealed trait BarcodeAndGraphics
    extends dymoDashLabelDashFrameworkLib.dymoNs.labelNs.frameworkNs.LabelWriterPrintQuality
  
  /** Indicates that text print quality (fast) is used. */
  @js.native
  sealed trait Text
    extends dymoDashLabelDashFrameworkLib.dymoNs.labelNs.frameworkNs.LabelWriterPrintQuality
  
  /* 2 */ val Auto: Auto with scala.Double = js.native
  /* 1 */ val BarcodeAndGraphics: BarcodeAndGraphics with scala.Double = js.native
  /* 0 */ val Text: Text with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[
    dymoDashLabelDashFrameworkLib.dymoNs.labelNs.frameworkNs.LabelWriterPrintQuality with scala.Double
  ] = js.native
}

