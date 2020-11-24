package typings.ejWebAll.global.ej

import typings.ejWebAll.JQuery
import typings.std.Element
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSGlobal("ej.Toolbar")
@js.native
class Toolbar protected ()
  extends typings.ejWebAll.ej.Toolbar {
  def this(element: JQuery) = this()
  def this(element: Element) = this()
  def this(element: JQuery, options: typings.ejWebAll.ej.Toolbar.Model) = this()
  def this(element: Element, options: typings.ejWebAll.ej.Toolbar.Model) = this()
}
/* static members */
@JSGlobal("ej.Toolbar")
@js.native
object Toolbar extends js.Object {
  
  var Locale: js.Any = js.native
  
  var fn: typings.ejWebAll.ej.Toolbar = js.native
  
  @js.native
  object ResponsiveType extends js.Object {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[typings.ejWebAll.ej.Toolbar.ResponsiveType with Double] = js.native
    
    /* 1 */ val Inline: typings.ejWebAll.ej.Toolbar.ResponsiveType.Inline with Double = js.native
    
    /* 0 */ val Popup: typings.ejWebAll.ej.Toolbar.ResponsiveType.Popup with Double = js.native
  }
}
