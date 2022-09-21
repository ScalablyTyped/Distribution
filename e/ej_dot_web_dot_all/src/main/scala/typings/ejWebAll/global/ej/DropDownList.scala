package typings.ejWebAll.global.ej

import typings.ejWebAll.JQuery
import typings.std.Element
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSGlobal("ej.DropDownList")
@js.native
open class DropDownList protected ()
  extends StObject
     with typings.ejWebAll.ej.DropDownList {
  def this(element: JQuery) = this()
  def this(element: Element) = this()
  def this(element: JQuery, options: typings.ejWebAll.ej.Model) = this()
  def this(element: Element, options: typings.ejWebAll.ej.Model) = this()
}
object DropDownList {
  
  @JSGlobal("ej.DropDownList")
  @js.native
  val ^ : js.Any = js.native
  
  /* static member */
  @JSGlobal("ej.DropDownList.Locale")
  @js.native
  def Locale: Any = js.native
  inline def Locale_=(x: Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("Locale")(x.asInstanceOf[js.Any])
  
  /* static member */
  @JSGlobal("ej.DropDownList.fn")
  @js.native
  def fn: typings.ejWebAll.ej.DropDownList = js.native
  inline def fn_=(x: typings.ejWebAll.ej.DropDownList): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("fn")(x.asInstanceOf[js.Any])
}
