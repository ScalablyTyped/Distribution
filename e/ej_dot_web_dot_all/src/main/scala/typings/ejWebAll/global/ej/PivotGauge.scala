package typings.ejWebAll.global.ej

import typings.ejWebAll.JQuery
import typings.std.Element
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSGlobal("ej.PivotGauge")
@js.native
class PivotGauge protected ()
  extends typings.ejWebAll.ej.PivotGauge {
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
  def Locale: js.Any = js.native
  @scala.inline
  def Locale_=(x: js.Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("Locale")(x.asInstanceOf[js.Any])
  
  @JSGlobal("ej.PivotGauge.NumberFormat")
  @js.native
  object NumberFormat extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[typings.ejWebAll.ej.PivotGauge.NumberFormat with Double] = js.native
    
    /* 1 */ val Currency: typings.ejWebAll.ej.PivotGauge.NumberFormat.Currency with Double = js.native
    
    /* 0 */ val Default: typings.ejWebAll.ej.PivotGauge.NumberFormat.Default with Double = js.native
    
    /* 3 */ val Fraction: typings.ejWebAll.ej.PivotGauge.NumberFormat.Fraction with Double = js.native
    
    /* 6 */ val Notation: typings.ejWebAll.ej.PivotGauge.NumberFormat.Notation with Double = js.native
    
    /* 2 */ val Percentage: typings.ejWebAll.ej.PivotGauge.NumberFormat.Percentage with Double = js.native
    
    /* 4 */ val Scientific: typings.ejWebAll.ej.PivotGauge.NumberFormat.Scientific with Double = js.native
    
    /* 5 */ val Text: typings.ejWebAll.ej.PivotGauge.NumberFormat.Text with Double = js.native
  }
  
  /* static member */
  @JSGlobal("ej.PivotGauge.fn")
  @js.native
  def fn: typings.ejWebAll.ej.PivotGauge = js.native
  @scala.inline
  def fn_=(x: typings.ejWebAll.ej.PivotGauge): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("fn")(x.asInstanceOf[js.Any])
}
