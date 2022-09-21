package typings.ejWebAll.global.ej

import typings.ejWebAll.JQuery
import typings.std.Element
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSGlobal("ej.PivotGauge")
@js.native
open class PivotGauge protected ()
  extends StObject
     with typings.ejWebAll.ej.PivotGauge {
  def this(element: JQuery) = this()
  def this(element: Element) = this()
  def this(element: JQuery, options: typings.ejWebAll.ej.Model) = this()
  def this(element: Element, options: typings.ejWebAll.ej.Model) = this()
}
object PivotGauge {
  
  @JSGlobal("ej.PivotGauge")
  @js.native
  val ^ : js.Any = js.native
  
  /* static member */
  @JSGlobal("ej.PivotGauge.Locale")
  @js.native
  def Locale: Any = js.native
  inline def Locale_=(x: Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("Locale")(x.asInstanceOf[js.Any])
  
  @JSGlobal("ej.PivotGauge.NumberFormat")
  @js.native
  object NumberFormat extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[typings.ejWebAll.ej.PivotGauge.NumberFormat & Double] = js.native
    
    /* 1 */ val Currency: typings.ejWebAll.ej.PivotGauge.NumberFormat.Currency & Double = js.native
    
    /* 0 */ val Default: typings.ejWebAll.ej.PivotGauge.NumberFormat.Default & Double = js.native
    
    /* 3 */ val Fraction: typings.ejWebAll.ej.PivotGauge.NumberFormat.Fraction & Double = js.native
    
    /* 6 */ val Notation: typings.ejWebAll.ej.PivotGauge.NumberFormat.Notation & Double = js.native
    
    /* 2 */ val Percentage: typings.ejWebAll.ej.PivotGauge.NumberFormat.Percentage & Double = js.native
    
    /* 4 */ val Scientific: typings.ejWebAll.ej.PivotGauge.NumberFormat.Scientific & Double = js.native
    
    /* 5 */ val Text: typings.ejWebAll.ej.PivotGauge.NumberFormat.Text & Double = js.native
  }
  
  /* static member */
  @JSGlobal("ej.PivotGauge.fn")
  @js.native
  def fn: typings.ejWebAll.ej.PivotGauge = js.native
  inline def fn_=(x: typings.ejWebAll.ej.PivotGauge): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("fn")(x.asInstanceOf[js.Any])
}
