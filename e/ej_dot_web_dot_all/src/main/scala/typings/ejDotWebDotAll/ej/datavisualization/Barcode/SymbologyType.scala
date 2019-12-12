package typings.ejDotWebDotAll.ej.datavisualization.Barcode

import org.scalablytyped.runtime.TopLevel
import typings.ejDotWebDotAll.ej.datavisualization.Barcode.SymbologyType.Codabar
import typings.ejDotWebDotAll.ej.datavisualization.Barcode.SymbologyType.Code11
import typings.ejDotWebDotAll.ej.datavisualization.Barcode.SymbologyType.Code128A
import typings.ejDotWebDotAll.ej.datavisualization.Barcode.SymbologyType.Code128B
import typings.ejDotWebDotAll.ej.datavisualization.Barcode.SymbologyType.Code128C
import typings.ejDotWebDotAll.ej.datavisualization.Barcode.SymbologyType.Code32
import typings.ejDotWebDotAll.ej.datavisualization.Barcode.SymbologyType.Code39
import typings.ejDotWebDotAll.ej.datavisualization.Barcode.SymbologyType.Code39Extended
import typings.ejDotWebDotAll.ej.datavisualization.Barcode.SymbologyType.Code93
import typings.ejDotWebDotAll.ej.datavisualization.Barcode.SymbologyType.Code93Extended
import typings.ejDotWebDotAll.ej.datavisualization.Barcode.SymbologyType.DataMatrix
import typings.ejDotWebDotAll.ej.datavisualization.Barcode.SymbologyType.QRBarcode
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
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[SymbologyType with Double] = js.native
  /* 5 */ @js.native
  object Codabar extends TopLevel[Codabar with Double]
  
  /* 4 */ @js.native
  object Code11 extends TopLevel[Code11 with Double]
  
  /* 9 */ @js.native
  object Code128A extends TopLevel[Code128A with Double]
  
  /* 10 */ @js.native
  object Code128B extends TopLevel[Code128B with Double]
  
  /* 11 */ @js.native
  object Code128C extends TopLevel[Code128C with Double]
  
  /* 6 */ @js.native
  object Code32 extends TopLevel[Code32 with Double]
  
  /* 2 */ @js.native
  object Code39 extends TopLevel[Code39 with Double]
  
  /* 3 */ @js.native
  object Code39Extended extends TopLevel[Code39Extended with Double]
  
  /* 7 */ @js.native
  object Code93 extends TopLevel[Code93 with Double]
  
  /* 8 */ @js.native
  object Code93Extended extends TopLevel[Code93Extended with Double]
  
  /* 1 */ @js.native
  object DataMatrix extends TopLevel[DataMatrix with Double]
  
  /* 0 */ @js.native
  object QRBarcode extends TopLevel[QRBarcode with Double]
  
}

