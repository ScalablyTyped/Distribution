package typings
package ejDotWebDotAllLib.ejNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("ej.PivotTreeMap")
@js.native
class PivotTreeMap protected () extends Widget {
  def this(element: ejDotWebDotAllLib.JQuery) = this()
  def this(element: stdLib.Element) = this()
  def this(element: ejDotWebDotAllLib.JQuery, options: ejDotWebDotAllLib.ejNs.PivotTreeMapNs.Model) = this()
  def this(element: stdLib.Element, options: ejDotWebDotAllLib.ejNs.PivotTreeMapNs.Model) = this()
  var defaults: ejDotWebDotAllLib.ejNs.PivotTreeMapNs.Model = js.native
  @JSName("model")
  var model_PivotTreeMap: ejDotWebDotAllLib.ejNs.PivotTreeMapNs.Model = js.native
  /** Performs an asynchronous HTTP (AJAX) request.
    * @returns {void}
    */
  def doAjaxPost(): scala.Unit = js.native
  /** Performs an asynchronous HTTP (FullPost) submit.
    * @returns {void}
    */
  def doPostBack(): scala.Unit = js.native
  /** Renders the control with the pivot engine obtained from OLAP cube.
    * @returns {void}
    */
  def generateJSON(): scala.Unit = js.native
  /** Returns the JSON records formed to render the control.
    * @returns {any[]}
    */
  def getJSONRecords(): js.Array[_] = js.native
  /** Returns the OlapReport string maintained along with the axis elements information.
    * @returns {string}
    */
  def getOlapReport(): java.lang.String = js.native
  /** This function receives the update from service-end, which would be utilized for rendering the widget.
    * @returns {void}
    */
  def renderControlSuccess(): scala.Unit = js.native
  /** This function receives the JSON formatted datasource to render the PivotTreeMap control.
    * @returns {void}
    */
  def renderTreeMapFromJSON(): scala.Unit = js.native
  /** Sets the JSON records to render the control.
    * @returns {void}
    */
  def setJSONRecords(): scala.Unit = js.native
  /** Sets the OlapReport string along with the axis information and maintains it in a property.
    * @returns {void}
    */
  def setOlapReport(): scala.Unit = js.native
}

@JSGlobal("ej.PivotTreeMap")
@js.native
object PivotTreeMap extends js.Object {
  var Locale: js.Any = js.native
  var fn: ejDotWebDotAllLib.ejNs.PivotTreeMap = js.native
}

