package typings.ejDotWebDotAll.ejNs

import typings.ejDotWebDotAll.JQuery
import typings.std.Element
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("ej.Draggable")
@js.native
class Draggable protected () extends Widget {
  def this(element: JQuery) = this()
  def this(element: Element) = this()
  def this(element: JQuery, options: typings.ejDotWebDotAll.ejNs.DraggableNs.Model) = this()
  def this(element: Element, options: typings.ejDotWebDotAll.ejNs.DraggableNs.Model) = this()
  var defaults: typings.ejDotWebDotAll.ejNs.DraggableNs.Model = js.native
  @JSName("model")
  var model_Draggable: typings.ejDotWebDotAll.ejNs.DraggableNs.Model = js.native
}

/* static members */
@JSGlobal("ej.Draggable")
@js.native
object Draggable extends js.Object {
  var Locale: js.Any = js.native
  var fn: Draggable = js.native
}

