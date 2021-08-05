package typings.ejWebAll.global.ej

import typings.ejWebAll.JQuery
import typings.std.Element
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSGlobal("ej.Rotator")
@js.native
class Rotator protected ()
  extends StObject
     with typings.ejWebAll.ej.Rotator {
  def this(element: JQuery) = this()
  def this(element: Element) = this()
  def this(element: JQuery, options: typings.ejWebAll.ej.Model) = this()
  def this(element: Element, options: typings.ejWebAll.ej.Model) = this()
}
object Rotator {
  
  @JSGlobal("ej.Rotator")
  @js.native
  val ^ : js.Any = js.native
  
  /* static member */
  @JSGlobal("ej.Rotator.Locale")
  @js.native
  def Locale: js.Any = js.native
  inline def Locale_=(x: js.Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("Locale")(x.asInstanceOf[js.Any])
  
  @JSGlobal("ej.Rotator.PagerPosition")
  @js.native
  object PagerPosition extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[typings.ejWebAll.ej.Rotator.PagerPosition & Double] = js.native
    
    /* 0 */ val BottomLeft: typings.ejWebAll.ej.Rotator.PagerPosition.BottomLeft & Double = js.native
    
    /* 1 */ val BottomRight: typings.ejWebAll.ej.Rotator.PagerPosition.BottomRight & Double = js.native
    
    /* 2 */ val Outside: typings.ejWebAll.ej.Rotator.PagerPosition.Outside & Double = js.native
    
    /* 3 */ val TopCenter: typings.ejWebAll.ej.Rotator.PagerPosition.TopCenter & Double = js.native
    
    /* 4 */ val TopLeft: typings.ejWebAll.ej.Rotator.PagerPosition.TopLeft & Double = js.native
    
    /* 5 */ val TopRight: typings.ejWebAll.ej.Rotator.PagerPosition.TopRight & Double = js.native
  }
  
  /* static member */
  @JSGlobal("ej.Rotator.fn")
  @js.native
  def fn: typings.ejWebAll.ej.Rotator = js.native
  inline def fn_=(x: typings.ejWebAll.ej.Rotator): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("fn")(x.asInstanceOf[js.Any])
}
