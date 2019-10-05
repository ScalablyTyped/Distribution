package typings.dymoDashLabelDashFramework.dymo.label.framework

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
  sealed trait Auto extends LabelWriterPrintQuality
  
  /** Indicates that barcode and images print quality (slow) is used. */
  @js.native
  sealed trait BarcodeAndGraphics extends LabelWriterPrintQuality
  
  /** Indicates that text print quality (fast) is used. */
  @js.native
  sealed trait Text extends LabelWriterPrintQuality
  
  /* 2 */ val Auto: typings.dymoDashLabelDashFramework.dymo.label.framework.LabelWriterPrintQuality.Auto with Double = js.native
  /* 1 */ val BarcodeAndGraphics: typings.dymoDashLabelDashFramework.dymo.label.framework.LabelWriterPrintQuality.BarcodeAndGraphics with Double = js.native
  /* 0 */ val Text: typings.dymoDashLabelDashFramework.dymo.label.framework.LabelWriterPrintQuality.Text with Double = js.native
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[LabelWriterPrintQuality with Double] = js.native
}

