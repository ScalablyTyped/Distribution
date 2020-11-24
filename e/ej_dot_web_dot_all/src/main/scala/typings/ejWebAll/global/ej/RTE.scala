package typings.ejWebAll.global.ej

import typings.ejWebAll.JQuery
import typings.std.Element
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSGlobal("ej.RTE")
@js.native
class RTE protected ()
  extends typings.ejWebAll.ej.RTE {
  def this(element: JQuery) = this()
  def this(element: Element) = this()
  def this(element: JQuery, options: typings.ejWebAll.ej.RTE.Model) = this()
  def this(element: Element, options: typings.ejWebAll.ej.RTE.Model) = this()
}
/* static members */
@JSGlobal("ej.RTE")
@js.native
object RTE extends js.Object {
  
  var Locale: js.Any = js.native
  
  var fn: typings.ejWebAll.ej.RTE = js.native
  
  @js.native
  object ToolbarOverflowMode extends js.Object {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[typings.ejWebAll.ej.RTE.ToolbarOverflowMode with Double] = js.native
    
    /* 1 */ val Inline: typings.ejWebAll.ej.RTE.ToolbarOverflowMode.Inline with Double = js.native
    
    /* 0 */ val Popup: typings.ejWebAll.ej.RTE.ToolbarOverflowMode.Popup with Double = js.native
  }
}
