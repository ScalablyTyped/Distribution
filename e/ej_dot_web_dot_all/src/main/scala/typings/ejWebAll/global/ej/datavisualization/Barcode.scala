package typings.ejWebAll.global.ej.datavisualization

import typings.ejWebAll.JQuery
import typings.ejWebAll.ej.Model
import typings.std.Element
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("ej.datavisualization.Barcode")
@js.native
class Barcode protected ()
  extends typings.ejWebAll.ej.datavisualization.Barcode {
  def this(element: JQuery) = this()
  def this(element: Element) = this()
  def this(element: JQuery, options: Model) = this()
  def this(element: Element, options: Model) = this()
}

/* static members */
@JSGlobal("ej.datavisualization.Barcode")
@js.native
object Barcode extends js.Object {
  var Locale: js.Any = js.native
  var fn: typings.ejWebAll.ej.datavisualization.Barcode = js.native
  @js.native
  object SymbologyType extends js.Object {
    /* 5 */ val Codabar: typings.ejWebAll.ej.datavisualization.Barcode.SymbologyType.Codabar with Double = js.native
    /* 4 */ val Code11: typings.ejWebAll.ej.datavisualization.Barcode.SymbologyType.Code11 with Double = js.native
    /* 9 */ val Code128A: typings.ejWebAll.ej.datavisualization.Barcode.SymbologyType.Code128A with Double = js.native
    /* 10 */ val Code128B: typings.ejWebAll.ej.datavisualization.Barcode.SymbologyType.Code128B with Double = js.native
    /* 11 */ val Code128C: typings.ejWebAll.ej.datavisualization.Barcode.SymbologyType.Code128C with Double = js.native
    /* 6 */ val Code32: typings.ejWebAll.ej.datavisualization.Barcode.SymbologyType.Code32 with Double = js.native
    /* 2 */ val Code39: typings.ejWebAll.ej.datavisualization.Barcode.SymbologyType.Code39 with Double = js.native
    /* 3 */ val Code39Extended: typings.ejWebAll.ej.datavisualization.Barcode.SymbologyType.Code39Extended with Double = js.native
    /* 7 */ val Code93: typings.ejWebAll.ej.datavisualization.Barcode.SymbologyType.Code93 with Double = js.native
    /* 8 */ val Code93Extended: typings.ejWebAll.ej.datavisualization.Barcode.SymbologyType.Code93Extended with Double = js.native
    /* 1 */ val DataMatrix: typings.ejWebAll.ej.datavisualization.Barcode.SymbologyType.DataMatrix with Double = js.native
    /* 0 */ val QRBarcode: typings.ejWebAll.ej.datavisualization.Barcode.SymbologyType.QRBarcode with Double = js.native
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[typings.ejWebAll.ej.datavisualization.Barcode.SymbologyType with Double] = js.native
  }
  
}

