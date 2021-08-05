package typings.ejWebAll.global.ej

import typings.ejWebAll.JQuery
import typings.std.Element
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSGlobal("ej.TagCloud")
@js.native
class TagCloud protected ()
  extends StObject
     with typings.ejWebAll.ej.TagCloud {
  def this(element: JQuery) = this()
  def this(element: Element) = this()
  def this(element: JQuery, options: typings.ejWebAll.ej.Model) = this()
  def this(element: Element, options: typings.ejWebAll.ej.Model) = this()
}
object TagCloud {
  
  @JSGlobal("ej.TagCloud")
  @js.native
  val ^ : js.Any = js.native
  
  /* static member */
  @JSGlobal("ej.TagCloud.Locale")
  @js.native
  def Locale: js.Any = js.native
  inline def Locale_=(x: js.Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("Locale")(x.asInstanceOf[js.Any])
  
  /* static member */
  @JSGlobal("ej.TagCloud.fn")
  @js.native
  def fn: typings.ejWebAll.ej.TagCloud = js.native
  inline def fn_=(x: typings.ejWebAll.ej.TagCloud): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("fn")(x.asInstanceOf[js.Any])
}
