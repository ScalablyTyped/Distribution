package typings.ejWebAll.global.ej

import typings.ejWebAll.JQuery
import typings.std.Element
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSGlobal("ej.PivotGrid")
@js.native
class PivotGrid protected ()
  extends StObject
     with typings.ejWebAll.ej.PivotGrid {
  def this(element: JQuery) = this()
  def this(element: Element) = this()
  def this(element: JQuery, options: typings.ejWebAll.ej.Model) = this()
  def this(element: Element, options: typings.ejWebAll.ej.Model) = this()
}
object PivotGrid {
  
  @JSGlobal("ej.PivotGrid")
  @js.native
  val ^ : js.Any = js.native
  
  @JSGlobal("ej.PivotGrid.Layout")
  @js.native
  object Layout extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[typings.ejWebAll.ej.PivotGrid.Layout & Double] = js.native
    
    /* 3 */ val ExcelLikeLayout: typings.ejWebAll.ej.PivotGrid.Layout.ExcelLikeLayout & Double = js.native
    
    /* 2 */ val NoSummaries: typings.ejWebAll.ej.PivotGrid.Layout.NoSummaries & Double = js.native
    
    /* 0 */ val Normal: typings.ejWebAll.ej.PivotGrid.Layout.Normal & Double = js.native
    
    /* 1 */ val NormalTopSummary: typings.ejWebAll.ej.PivotGrid.Layout.NormalTopSummary & Double = js.native
  }
  
  /* static member */
  @JSGlobal("ej.PivotGrid.Locale")
  @js.native
  def Locale: js.Any = js.native
  inline def Locale_=(x: js.Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("Locale")(x.asInstanceOf[js.Any])
  
  /* static member */
  @JSGlobal("ej.PivotGrid.fn")
  @js.native
  def fn: typings.ejWebAll.ej.PivotGrid = js.native
  inline def fn_=(x: typings.ejWebAll.ej.PivotGrid): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("fn")(x.asInstanceOf[js.Any])
}
