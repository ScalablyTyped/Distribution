package typings.ejWebAll.global.ej

import typings.ejWebAll.JQuery
import typings.std.Element
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSGlobal("ej.ProgressBar")
@js.native
open class ProgressBar protected ()
  extends StObject
     with typings.ejWebAll.ej.ProgressBar {
  def this(element: JQuery) = this()
  def this(element: Element) = this()
  def this(element: JQuery, options: typings.ejWebAll.ej.Model) = this()
  def this(element: Element, options: typings.ejWebAll.ej.Model) = this()
}
object ProgressBar {
  
  @JSGlobal("ej.ProgressBar")
  @js.native
  val ^ : js.Any = js.native
  
  /* static member */
  @JSGlobal("ej.ProgressBar.Locale")
  @js.native
  def Locale: Any = js.native
  inline def Locale_=(x: Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("Locale")(x.asInstanceOf[js.Any])
  
  /* static member */
  @JSGlobal("ej.ProgressBar.fn")
  @js.native
  def fn: typings.ejWebAll.ej.ProgressBar = js.native
  inline def fn_=(x: typings.ejWebAll.ej.ProgressBar): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("fn")(x.asInstanceOf[js.Any])
}
