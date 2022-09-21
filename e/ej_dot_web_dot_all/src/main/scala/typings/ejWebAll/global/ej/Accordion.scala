package typings.ejWebAll.global.ej

import typings.ejWebAll.JQuery
import typings.std.Element
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSGlobal("ej.Accordion")
@js.native
open class Accordion protected ()
  extends StObject
     with typings.ejWebAll.ej.Accordion {
  def this(element: JQuery) = this()
  def this(element: Element) = this()
  def this(element: JQuery, options: typings.ejWebAll.ej.Model) = this()
  def this(element: Element, options: typings.ejWebAll.ej.Model) = this()
}
object Accordion {
  
  @JSGlobal("ej.Accordion")
  @js.native
  val ^ : js.Any = js.native
  
  @JSGlobal("ej.Accordion.HeightAdjustMode")
  @js.native
  object HeightAdjustMode extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[typings.ejWebAll.ej.Accordion.HeightAdjustMode & Double] = js.native
    
    /* 1 */ val Auto: typings.ejWebAll.ej.Accordion.HeightAdjustMode.Auto & Double = js.native
    
    /* 0 */ val Content: typings.ejWebAll.ej.Accordion.HeightAdjustMode.Content & Double = js.native
    
    /* 2 */ val Fill: typings.ejWebAll.ej.Accordion.HeightAdjustMode.Fill & Double = js.native
  }
  
  /* static member */
  @JSGlobal("ej.Accordion.Locale")
  @js.native
  def Locale: Any = js.native
  inline def Locale_=(x: Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("Locale")(x.asInstanceOf[js.Any])
  
  /* static member */
  @JSGlobal("ej.Accordion.fn")
  @js.native
  def fn: typings.ejWebAll.ej.Accordion = js.native
  inline def fn_=(x: typings.ejWebAll.ej.Accordion): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("fn")(x.asInstanceOf[js.Any])
}
