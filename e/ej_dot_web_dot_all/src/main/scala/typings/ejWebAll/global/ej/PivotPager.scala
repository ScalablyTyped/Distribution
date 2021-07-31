package typings.ejWebAll.global.ej

import typings.ejWebAll.JQuery
import typings.std.Element
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSGlobal("ej.PivotPager")
@js.native
class PivotPager protected ()
  extends StObject
     with typings.ejWebAll.ej.PivotPager {
  def this(element: JQuery) = this()
  def this(element: Element) = this()
  def this(element: JQuery, options: typings.ejWebAll.ej.Model) = this()
  def this(element: Element, options: typings.ejWebAll.ej.Model) = this()
}
object PivotPager {
  
  @JSGlobal("ej.PivotPager")
  @js.native
  val ^ : js.Any = js.native
  
  /* static member */
  @JSGlobal("ej.PivotPager.Locale")
  @js.native
  def Locale: js.Any = js.native
  @scala.inline
  def Locale_=(x: js.Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("Locale")(x.asInstanceOf[js.Any])
  
  @JSGlobal("ej.PivotPager.Mode")
  @js.native
  object Mode extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[typings.ejWebAll.ej.PivotPager.Mode & Double] = js.native
    
    /* 0 */ val Both: typings.ejWebAll.ej.PivotPager.Mode.Both & Double = js.native
    
    /* 1 */ val Categorical: typings.ejWebAll.ej.PivotPager.Mode.Categorical & Double = js.native
    
    /* 2 */ val Series: typings.ejWebAll.ej.PivotPager.Mode.Series & Double = js.native
  }
  
  /* static member */
  @JSGlobal("ej.PivotPager.fn")
  @js.native
  def fn: typings.ejWebAll.ej.PivotPager = js.native
  @scala.inline
  def fn_=(x: typings.ejWebAll.ej.PivotPager): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("fn")(x.asInstanceOf[js.Any])
}
