package typings.ejWebAll.global.ej

import typings.ejWebAll.JQuery
import typings.std.Element
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSGlobal("ej.RTE")
@js.native
class RTE protected ()
  extends StObject
     with typings.ejWebAll.ej.RTE {
  def this(element: JQuery) = this()
  def this(element: Element) = this()
  def this(element: JQuery, options: typings.ejWebAll.ej.Model) = this()
  def this(element: Element, options: typings.ejWebAll.ej.Model) = this()
}
object RTE {
  
  @JSGlobal("ej.RTE")
  @js.native
  val ^ : js.Any = js.native
  
  /* static member */
  @JSGlobal("ej.RTE.Locale")
  @js.native
  def Locale: js.Any = js.native
  inline def Locale_=(x: js.Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("Locale")(x.asInstanceOf[js.Any])
  
  @JSGlobal("ej.RTE.ToolbarOverflowMode")
  @js.native
  object ToolbarOverflowMode extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[typings.ejWebAll.ej.RTE.ToolbarOverflowMode & Double] = js.native
    
    /* 1 */ val Inline: typings.ejWebAll.ej.RTE.ToolbarOverflowMode.Inline & Double = js.native
    
    /* 0 */ val Popup: typings.ejWebAll.ej.RTE.ToolbarOverflowMode.Popup & Double = js.native
  }
  
  /* static member */
  @JSGlobal("ej.RTE.fn")
  @js.native
  def fn: typings.ejWebAll.ej.RTE = js.native
  inline def fn_=(x: typings.ejWebAll.ej.RTE): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("fn")(x.asInstanceOf[js.Any])
}
