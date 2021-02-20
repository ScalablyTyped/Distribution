package typings.ejWebAll.global.ej.datavisualization

import typings.ejWebAll.JQuery
import typings.ejWebAll.ej.Model
import typings.std.Element
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSGlobal("ej.datavisualization.Barcode")
@js.native
class Barcode protected ()
  extends typings.ejWebAll.ej.datavisualization.Barcode {
  def this(element: JQuery) = this()
  def this(element: Element) = this()
  def this(element: JQuery, options: Model) = this()
  def this(element: Element, options: Model) = this()
}
object Barcode {
  
  @JSGlobal("ej.datavisualization.Barcode")
  @js.native
  val ^ : js.Any = js.native
  
  /* static member */
  @JSGlobal("ej.datavisualization.Barcode.Locale")
  @js.native
  def Locale: js.Any = js.native
  @scala.inline
  def Locale_=(x: js.Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("Locale")(x.asInstanceOf[js.Any])
  
  @JSGlobal("ej.datavisualization.Barcode.SymbologyType")
  @js.native
  object SymbologyType extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[typings.ejWebAll.ej.datavisualization.Barcode.SymbologyType with Double] = js.native
    
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
  }
  
  /* static member */
  @JSGlobal("ej.datavisualization.Barcode.fn")
  @js.native
  def fn: typings.ejWebAll.ej.datavisualization.Barcode = js.native
  @scala.inline
  def fn_=(x: typings.ejWebAll.ej.datavisualization.Barcode): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("fn")(x.asInstanceOf[js.Any])
}
