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
  
  val Auto: Auto with java.lang.String = js.native
  val BarcodeAndGraphics: BarcodeAndGraphics with java.lang.String = js.native
  val Text: Text with java.lang.String = js.native
  @JSBracketAccess
  def apply(value: java.lang.String): js.UndefOr[
    dymoDashLabelDashFrameworkLib.dymoNs.labelNs.frameworkNs.LabelWriterPrintQuality with java.lang.String
  ] = js.native
}

