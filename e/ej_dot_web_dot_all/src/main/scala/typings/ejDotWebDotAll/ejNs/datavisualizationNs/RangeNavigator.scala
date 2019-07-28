package typings.ejDotWebDotAll.ejNs.datavisualizationNs

import typings.ejDotWebDotAll.JQuery
import typings.ejDotWebDotAll.ejNs.Model
import typings.ejDotWebDotAll.ejNs.Widget
import typings.std.Element
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("ej.datavisualization.RangeNavigator")
@js.native
class RangeNavigator protected () extends Widget {
  def this(element: JQuery) = this()
  def this(element: Element) = this()
  def this(element: JQuery, options: Model) = this()
  def this(element: Element, options: Model) = this()
  var defaults: Model = js.native
  @JSName("model")
  var model_RangeNavigator: Model = js.native
  /** destroy the range navigator widget
    * @returns {void}
    */
  def _destroy(): Unit = js.native
}

/* static members */
@JSGlobal("ej.datavisualization.RangeNavigator")
@js.native
object RangeNavigator extends js.Object {
  var Locale: js.Any = js.native
  var fn: RangeNavigator = js.native
}

