package typings.ejWebAll.global.ej

import typings.ejWebAll.JQuery
import typings.std.Element
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSGlobal("ej.RadioButton")
@js.native
open class RadioButton protected ()
  extends StObject
     with typings.ejWebAll.ej.RadioButton {
  def this(element: JQuery) = this()
  def this(element: Element) = this()
  def this(element: JQuery, options: typings.ejWebAll.ej.Model) = this()
  def this(element: Element, options: typings.ejWebAll.ej.Model) = this()
}
object RadioButton {
  
  @JSGlobal("ej.RadioButton")
  @js.native
  val ^ : js.Any = js.native
  
  /* static member */
  @JSGlobal("ej.RadioButton.Locale")
  @js.native
  def Locale: Any = js.native
  inline def Locale_=(x: Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("Locale")(x.asInstanceOf[js.Any])
  
  /* static member */
  @JSGlobal("ej.RadioButton.fn")
  @js.native
  def fn: typings.ejWebAll.ej.RadioButton = js.native
  inline def fn_=(x: typings.ejWebAll.ej.RadioButton): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("fn")(x.asInstanceOf[js.Any])
}
