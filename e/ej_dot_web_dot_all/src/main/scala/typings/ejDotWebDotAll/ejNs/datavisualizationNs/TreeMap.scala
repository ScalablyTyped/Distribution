package typings.ejDotWebDotAll.ejNs.datavisualizationNs

import typings.ejDotWebDotAll.JQuery
import typings.ejDotWebDotAll.ejNs.Model
import typings.ejDotWebDotAll.ejNs.Widget
import typings.std.Element
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("ej.datavisualization.TreeMap")
@js.native
class TreeMap protected () extends Widget {
  def this(element: JQuery) = this()
  def this(element: Element) = this()
  def this(element: JQuery, options: Model) = this()
  def this(element: Element, options: Model) = this()
  var defaults: Model = js.native
  @JSName("model")
  var model_TreeMap: Model = js.native
  /** Method to drilldown the treemap.
    * @returns {void}
    */
  def drillDown(): Unit = js.native
  /** Method to reload treemap with updated values.
    * @returns {void}
    */
  def refresh(): Unit = js.native
}

/* static members */
@JSGlobal("ej.datavisualization.TreeMap")
@js.native
object TreeMap extends js.Object {
  var Locale: js.Any = js.native
  var fn: TreeMap = js.native
}

