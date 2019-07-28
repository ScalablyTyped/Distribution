package typings.ejDotWebDotAll.ejNs.datavisualizationNs.BarcodeNs

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
  sealed trait Codabar extends SymbologyType
  
  //Represents the Code 11 barcode
  @js.native
  sealed trait Code11 extends SymbologyType
  
  //Represents the Code 128 A barcode
  @js.native
  sealed trait Code128A extends SymbologyType
  
  //Represents the Code 128 B barcode
  @js.native
  sealed trait Code128B extends SymbologyType
  
  //Represents the Code 128 C barcode
  @js.native
  sealed trait Code128C extends SymbologyType
  
  //Represents the Code 32 barcode
  @js.native
  sealed trait Code32 extends SymbologyType
  
  //Represents the Code 39 barcode
  @js.native
  sealed trait Code39 extends SymbologyType
  
  //Represents the Code 39 Extended barcode
  @js.native
  sealed trait Code39Extended extends SymbologyType
  
  //Represents the Code 93 barcode
  @js.native
  sealed trait Code93 extends SymbologyType
  
  //Represents the Code 93 Extended barcode
  @js.native
  sealed trait Code93Extended extends SymbologyType
  
  //Represents the Data Matrix barcode
  @js.native
  sealed trait DataMatrix extends SymbologyType
  
  //Represents the QR code
  @js.native
  sealed trait QRBarcode extends SymbologyType
  
  /* 5 */ val Codabar: typings.ejDotWebDotAll.ejNs.datavisualizationNs.BarcodeNs.SymbologyType.Codabar with Double = js.native
  /* 4 */ val Code11: typings.ejDotWebDotAll.ejNs.datavisualizationNs.BarcodeNs.SymbologyType.Code11 with Double = js.native
  /* 9 */ val Code128A: typings.ejDotWebDotAll.ejNs.datavisualizationNs.BarcodeNs.SymbologyType.Code128A with Double = js.native
  /* 10 */ val Code128B: typings.ejDotWebDotAll.ejNs.datavisualizationNs.BarcodeNs.SymbologyType.Code128B with Double = js.native
  /* 11 */ val Code128C: typings.ejDotWebDotAll.ejNs.datavisualizationNs.BarcodeNs.SymbologyType.Code128C with Double = js.native
  /* 6 */ val Code32: typings.ejDotWebDotAll.ejNs.datavisualizationNs.BarcodeNs.SymbologyType.Code32 with Double = js.native
  /* 2 */ val Code39: typings.ejDotWebDotAll.ejNs.datavisualizationNs.BarcodeNs.SymbologyType.Code39 with Double = js.native
  /* 3 */ val Code39Extended: typings.ejDotWebDotAll.ejNs.datavisualizationNs.BarcodeNs.SymbologyType.Code39Extended with Double = js.native
  /* 7 */ val Code93: typings.ejDotWebDotAll.ejNs.datavisualizationNs.BarcodeNs.SymbologyType.Code93 with Double = js.native
  /* 8 */ val Code93Extended: typings.ejDotWebDotAll.ejNs.datavisualizationNs.BarcodeNs.SymbologyType.Code93Extended with Double = js.native
  /* 1 */ val DataMatrix: typings.ejDotWebDotAll.ejNs.datavisualizationNs.BarcodeNs.SymbologyType.DataMatrix with Double = js.native
  /* 0 */ val QRBarcode: typings.ejDotWebDotAll.ejNs.datavisualizationNs.BarcodeNs.SymbologyType.QRBarcode with Double = js.native
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[SymbologyType with Double] = js.native
}

