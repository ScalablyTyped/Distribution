package typings
package ejDotWebDotAllLib.ejNs.datavisualizationNs.BarcodeNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait SymbologyType extends js.Object

@JSGlobal("ej.datavisualization.Barcode.SymbologyType")
@js.native
object SymbologyType extends js.Object {
  //Represents the Codabar barcode
  @js.native
  sealed trait Codabar
    extends ejDotWebDotAllLib.ejNs.datavisualizationNs.BarcodeNs.SymbologyType
  
  //Represents the Code 11 barcode
  @js.native
  sealed trait Code11
    extends ejDotWebDotAllLib.ejNs.datavisualizationNs.BarcodeNs.SymbologyType
  
  //Represents the Code 128 A barcode
  @js.native
  sealed trait Code128A
    extends ejDotWebDotAllLib.ejNs.datavisualizationNs.BarcodeNs.SymbologyType
  
  //Represents the Code 128 B barcode
  @js.native
  sealed trait Code128B
    extends ejDotWebDotAllLib.ejNs.datavisualizationNs.BarcodeNs.SymbologyType
  
  //Represents the Code 128 C barcode
  @js.native
  sealed trait Code128C
    extends ejDotWebDotAllLib.ejNs.datavisualizationNs.BarcodeNs.SymbologyType
  
  //Represents the Code 32 barcode
  @js.native
  sealed trait Code32
    extends ejDotWebDotAllLib.ejNs.datavisualizationNs.BarcodeNs.SymbologyType
  
  //Represents the Code 39 barcode
  @js.native
  sealed trait Code39
    extends ejDotWebDotAllLib.ejNs.datavisualizationNs.BarcodeNs.SymbologyType
  
  //Represents the Code 39 Extended barcode
  @js.native
  sealed trait Code39Extended
    extends ejDotWebDotAllLib.ejNs.datavisualizationNs.BarcodeNs.SymbologyType
  
  //Represents the Code 93 barcode
  @js.native
  sealed trait Code93
    extends ejDotWebDotAllLib.ejNs.datavisualizationNs.BarcodeNs.SymbologyType
  
  //Represents the Code 93 Extended barcode
  @js.native
  sealed trait Code93Extended
    extends ejDotWebDotAllLib.ejNs.datavisualizationNs.BarcodeNs.SymbologyType
  
  //Represents the Data Matrix barcode
  @js.native
  sealed trait DataMatrix
    extends ejDotWebDotAllLib.ejNs.datavisualizationNs.BarcodeNs.SymbologyType
  
  //Represents the QR code
  @js.native
  sealed trait QRBarcode
    extends ejDotWebDotAllLib.ejNs.datavisualizationNs.BarcodeNs.SymbologyType
  
  val Codabar: Codabar with java.lang.String = js.native
  val Code11: Code11 with java.lang.String = js.native
  val Code128A: Code128A with java.lang.String = js.native
  val Code128B: Code128B with java.lang.String = js.native
  val Code128C: Code128C with java.lang.String = js.native
  val Code32: Code32 with java.lang.String = js.native
  val Code39: Code39 with java.lang.String = js.native
  val Code39Extended: Code39Extended with java.lang.String = js.native
  val Code93: Code93 with java.lang.String = js.native
  val Code93Extended: Code93Extended with java.lang.String = js.native
  val DataMatrix: DataMatrix with java.lang.String = js.native
  val QRBarcode: QRBarcode with java.lang.String = js.native
  @JSBracketAccess
  def apply(value: java.lang.String): js.UndefOr[
    ejDotWebDotAllLib.ejNs.datavisualizationNs.BarcodeNs.SymbologyType with java.lang.String
  ] = js.native
}

