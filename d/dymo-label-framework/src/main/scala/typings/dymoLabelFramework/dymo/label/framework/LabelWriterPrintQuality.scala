package typings.dymoLabelFramework.dymo.label.framework

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait LabelWriterPrintQuality extends StObject
/**
  * Enumeration that specifies the print quality when printing to a LabelWriter printer.
  */
@JSGlobal("dymo.label.framework.LabelWriterPrintQuality")
@js.native
object LabelWriterPrintQuality extends StObject {
  
  /** Indicates that the print quality is automatically determined based on the types of objects on the label. */
  @js.native
  sealed trait Auto
    extends StObject
       with LabelWriterPrintQuality
  
  /** Indicates that barcode and images print quality (slow) is used. */
  @js.native
  sealed trait BarcodeAndGraphics
    extends StObject
       with LabelWriterPrintQuality
  
  /** Indicates that text print quality (fast) is used. */
  @js.native
  sealed trait Text
    extends StObject
       with LabelWriterPrintQuality
}
