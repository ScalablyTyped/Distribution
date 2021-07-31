package typings.ejWebAll.global.ej

import typings.ejWebAll.JQuery
import typings.std.Element
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSGlobal("ej.TimePicker")
@js.native
class TimePicker protected ()
  extends StObject
     with typings.ejWebAll.ej.TimePicker {
  def this(element: JQuery) = this()
  def this(element: Element) = this()
  def this(element: JQuery, options: typings.ejWebAll.ej.Model) = this()
  def this(element: Element, options: typings.ejWebAll.ej.Model) = this()
}
object TimePicker {
  
  @JSGlobal("ej.TimePicker")
  @js.native
  val ^ : js.Any = js.native
  
  /* static member */
  @JSGlobal("ej.TimePicker.Locale")
  @js.native
  def Locale: js.Any = js.native
  @scala.inline
  def Locale_=(x: js.Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("Locale")(x.asInstanceOf[js.Any])
  
  /* static member */
  @JSGlobal("ej.TimePicker.fn")
  @js.native
  def fn: typings.ejWebAll.ej.TimePicker = js.native
  @scala.inline
  def fn_=(x: typings.ejWebAll.ej.TimePicker): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("fn")(x.asInstanceOf[js.Any])
}
