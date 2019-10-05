package typings.ejDotWebDotAll.ej.datavisualization

import typings.ejDotWebDotAll.JQuery
import typings.ejDotWebDotAll.ej.Model
import typings.ejDotWebDotAll.ej.Widget
import typings.std.Element
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("ej.datavisualization.TreeMap")
@js.native
class TreeMap_ protected () extends Widget {
  def this(element: JQuery) = this()
  def this(element: Element) = this()
  def this(element: JQuery, options: Model) = this()
  def this(element: Element, options: Model) = this()
  var defaults: Model = js.native
  @JSName("model")
  var model_TreeMap_ : Model = js.native
  /** Method to drilldown the treemap.
    * @returns {void}
    */
  def drillDown(): Unit = js.native
  /** Method to reload treemap with updated values.
    * @returns {void}
    */
  def refresh(): Unit = js.native
}

