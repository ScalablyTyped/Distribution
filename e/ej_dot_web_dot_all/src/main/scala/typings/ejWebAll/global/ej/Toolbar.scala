package typings.ejWebAll.global.ej

import typings.ejWebAll.JQuery
import typings.std.Element
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSGlobal("ej.Toolbar")
@js.native
open class Toolbar protected ()
  extends StObject
     with typings.ejWebAll.ej.Toolbar {
  def this(element: JQuery) = this()
  def this(element: Element) = this()
  def this(element: JQuery, options: typings.ejWebAll.ej.Model) = this()
  def this(element: Element, options: typings.ejWebAll.ej.Model) = this()
}
object Toolbar {
  
  @JSGlobal("ej.Toolbar")
  @js.native
  val ^ : js.Any = js.native
  
  /* static member */
  @JSGlobal("ej.Toolbar.Locale")
  @js.native
  def Locale: Any = js.native
  inline def Locale_=(x: Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("Locale")(x.asInstanceOf[js.Any])
  
  @JSGlobal("ej.Toolbar.ResponsiveType")
  @js.native
  object ResponsiveType extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[typings.ejWebAll.ej.Toolbar.ResponsiveType & Double] = js.native
    
    /* 1 */ val Inline: typings.ejWebAll.ej.Toolbar.ResponsiveType.Inline & Double = js.native
    
    /* 0 */ val Popup: typings.ejWebAll.ej.Toolbar.ResponsiveType.Popup & Double = js.native
  }
  
  /* static member */
  @JSGlobal("ej.Toolbar.fn")
  @js.native
  def fn: typings.ejWebAll.ej.Toolbar = js.native
  inline def fn_=(x: typings.ejWebAll.ej.Toolbar): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("fn")(x.asInstanceOf[js.Any])
}
