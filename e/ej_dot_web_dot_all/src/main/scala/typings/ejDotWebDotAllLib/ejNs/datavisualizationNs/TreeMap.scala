package typings
package ejDotWebDotAllLib.ejNs.datavisualizationNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("ej.datavisualization.TreeMap")
@js.native
class TreeMap protected ()
  extends ejDotWebDotAllLib.ejNs.Widget {
  def this(element: ejDotWebDotAllLib.JQuery) = this()
  def this(element: stdLib.Element) = this()
  def this(element: ejDotWebDotAllLib.JQuery, options: ejDotWebDotAllLib.ejNs.Model) = this()
  def this(element: stdLib.Element, options: ejDotWebDotAllLib.ejNs.Model) = this()
  var defaults: ejDotWebDotAllLib.ejNs.Model = js.native
  @JSName("model")
  var model_TreeMap: ejDotWebDotAllLib.ejNs.Model = js.native
  /** Method to drilldown the treemap.
    * @returns {void}
    */
  def drillDown(): scala.Unit = js.native
  /** Method to reload treemap with updated values.
    * @returns {void}
    */
  def refresh(): scala.Unit = js.native
}

/* static members */
@JSGlobal("ej.datavisualization.TreeMap")
@js.native
object TreeMap extends js.Object {
  var Locale: js.Any = js.native
  var fn: ejDotWebDotAllLib.ejNs.datavisualizationNs.TreeMap = js.native
}

