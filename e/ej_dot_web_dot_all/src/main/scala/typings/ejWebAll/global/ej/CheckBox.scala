package typings.ejWebAll.global.ej

import typings.ejWebAll.JQuery
import typings.std.Element
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSGlobal("ej.CheckBox")
@js.native
open class CheckBox protected ()
  extends StObject
     with typings.ejWebAll.ej.CheckBox {
  def this(element: JQuery) = this()
  def this(element: Element) = this()
  def this(element: JQuery, options: typings.ejWebAll.ej.Model) = this()
  def this(element: Element, options: typings.ejWebAll.ej.Model) = this()
}
object CheckBox {
  
  @JSGlobal("ej.CheckBox")
  @js.native
  val ^ : js.Any = js.native
  
  /* static member */
  @JSGlobal("ej.CheckBox.Locale")
  @js.native
  def Locale: Any = js.native
  inline def Locale_=(x: Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("Locale")(x.asInstanceOf[js.Any])
  
  /* static member */
  @JSGlobal("ej.CheckBox.fn")
  @js.native
  def fn: typings.ejWebAll.ej.CheckBox = js.native
  inline def fn_=(x: typings.ejWebAll.ej.CheckBox): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("fn")(x.asInstanceOf[js.Any])
}
