package typings.ejWebAll.global.ej

import typings.ejWebAll.JQuery
import typings.std.Element
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSGlobal("ej.GroupButton")
@js.native
open class GroupButton protected ()
  extends StObject
     with typings.ejWebAll.ej.GroupButton {
  def this(element: JQuery) = this()
  def this(element: Element) = this()
  def this(element: JQuery, options: typings.ejWebAll.ej.Model) = this()
  def this(element: Element, options: typings.ejWebAll.ej.Model) = this()
}
object GroupButton {
  
  @JSGlobal("ej.GroupButton")
  @js.native
  val ^ : js.Any = js.native
  
  /* static member */
  @JSGlobal("ej.GroupButton.Locale")
  @js.native
  def Locale: Any = js.native
  inline def Locale_=(x: Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("Locale")(x.asInstanceOf[js.Any])
  
  /* static member */
  @JSGlobal("ej.GroupButton.fn")
  @js.native
  def fn: typings.ejWebAll.ej.GroupButton = js.native
  inline def fn_=(x: typings.ejWebAll.ej.GroupButton): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("fn")(x.asInstanceOf[js.Any])
}
