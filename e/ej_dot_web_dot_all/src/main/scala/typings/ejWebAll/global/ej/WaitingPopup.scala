package typings.ejWebAll.global.ej

import typings.ejWebAll.JQuery
import typings.std.Element
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSGlobal("ej.WaitingPopup")
@js.native
class WaitingPopup protected ()
  extends StObject
     with typings.ejWebAll.ej.WaitingPopup {
  def this(element: JQuery) = this()
  def this(element: Element) = this()
  def this(element: JQuery, options: typings.ejWebAll.ej.Model) = this()
  def this(element: Element, options: typings.ejWebAll.ej.Model) = this()
}
object WaitingPopup {
  
  @JSGlobal("ej.WaitingPopup")
  @js.native
  val ^ : js.Any = js.native
  
  /* static member */
  @JSGlobal("ej.WaitingPopup.Locale")
  @js.native
  def Locale: js.Any = js.native
  @scala.inline
  def Locale_=(x: js.Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("Locale")(x.asInstanceOf[js.Any])
  
  /* static member */
  @JSGlobal("ej.WaitingPopup.fn")
  @js.native
  def fn: typings.ejWebAll.ej.WaitingPopup = js.native
  @scala.inline
  def fn_=(x: typings.ejWebAll.ej.WaitingPopup): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("fn")(x.asInstanceOf[js.Any])
}
