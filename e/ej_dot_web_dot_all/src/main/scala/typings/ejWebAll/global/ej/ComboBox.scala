package typings.ejWebAll.global.ej

import typings.ejWebAll.JQuery
import typings.std.Element
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSGlobal("ej.ComboBox")
@js.native
class ComboBox protected ()
  extends typings.ejWebAll.ej.ComboBox {
  def this(element: JQuery) = this()
  def this(element: Element) = this()
  def this(element: JQuery, options: typings.ejWebAll.ej.ComboBox.Model) = this()
  def this(element: Element, options: typings.ejWebAll.ej.ComboBox.Model) = this()
}
/* static members */
@JSGlobal("ej.ComboBox")
@js.native
object ComboBox extends js.Object {
  
  var Locale: js.Any = js.native
  
  var fn: typings.ejWebAll.ej.ComboBox = js.native
  
  @js.native
  object SortOrder extends js.Object {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[typings.ejWebAll.ej.ComboBox.SortOrder with Double] = js.native
    
    /* 1 */ val Ascending: typings.ejWebAll.ej.ComboBox.SortOrder.Ascending with Double = js.native
    
    /* 2 */ val Descending: typings.ejWebAll.ej.ComboBox.SortOrder.Descending with Double = js.native
    
    /* 0 */ val None: typings.ejWebAll.ej.ComboBox.SortOrder.None with Double = js.native
  }
}
