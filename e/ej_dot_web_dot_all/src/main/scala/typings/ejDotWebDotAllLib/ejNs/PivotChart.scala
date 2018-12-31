package typings
package ejDotWebDotAllLib.ejNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("ej.PivotChart")
@js.native
class PivotChart protected () extends Widget {
  def this(element: ejDotWebDotAllLib.JQuery) = this()
  def this(element: stdLib.Element) = this()
  def this(element: ejDotWebDotAllLib.JQuery, options: ejDotWebDotAllLib.ejNs.PivotChartNs.Model) = this()
  def this(element: stdLib.Element, options: ejDotWebDotAllLib.ejNs.PivotChartNs.Model) = this()
  var defaults: ejDotWebDotAllLib.ejNs.PivotChartNs.Model = js.native
  @JSName("model")
  var model_PivotChart: ejDotWebDotAllLib.ejNs.PivotChartNs.Model = js.native
  /** Posts an asynchronous HTTP (AJAX) request.
    * @returns {void}
    */
  def doAjaxPost(): scala.Unit = js.native
  /** Performs an asynchronous HTTP (FullPost) submit.
    * @returns {void}
    */
  def doPostBack(): scala.Unit = js.native
  /** Exports the pivot chart to the format that is specified in the parameter.
    * @returns {void}
    */
  def exportPivotChart(): scala.Unit = js.native
  /** Renders the control with the pivot engine that is obtained from the OLAP cube.
    * @returns {void}
    */
  def generateJSON(): scala.Unit = js.native
  /** Returns the JSON records that are formed to render the control.
    * @returns {any[]}
    */
  def getJSONRecords(): js.Array[_] = js.native
  /** Returns the OlapReport string that is maintained along with the axis elements information.
    * @returns {string}
    */
  def getOlapReport(): java.lang.String = js.native
  /** Returns the PivotEngine that is formed to render the control.
    * @returns {any[]}
    */
  def getPivotEngine(): js.Array[_] = js.native
  /** Re-renders the control with the datasource at instant.
    * @returns {void}
    */
  def refreshControl(): scala.Unit = js.native
  /** Navigates to the specified page number in the specified axis.
    * @returns {void}
    */
  def refreshPagedPivotChart(): scala.Unit = js.native
  /** This function renders the pivot chart control with the JSON formatted data source.
    * @returns {void}
    */
  def renderChartFromJSON(): scala.Unit = js.native
  /** This function receives the update from the service-end, which will be utilized for rendering the widget.
    * @returns {void}
    */
  def renderControlSuccess(): scala.Unit = js.native
  /** Sets the JSON records to render the control.
    * @returns {void}
    */
  def setJSONRecords(): scala.Unit = js.native
  /** Sets the OlapReport string along with the axis information and maintains it in a property.
    * @returns {void}
    */
  def setOlapReport(): scala.Unit = js.native
  /** Sets the PivotEngine that is required to render the control.
    * @returns {void}
    */
  def setPivotEngine(): scala.Unit = js.native
}

@JSGlobal("ej.PivotChart")
@js.native
object PivotChart extends js.Object {
  var Locale: js.Any = js.native
  var fn: ejDotWebDotAllLib.ejNs.PivotChart = js.native
}

