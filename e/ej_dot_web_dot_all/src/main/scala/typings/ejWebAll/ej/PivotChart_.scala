package typings.ejWebAll.ej

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait PivotChart_ extends Widget_ {
  var defaults: typings.ejWebAll.ej.PivotChart.Model = js.native
  @JSName("model")
  var model_PivotChart_ : typings.ejWebAll.ej.PivotChart.Model = js.native
  /** Posts an asynchronous HTTP (AJAX) request.
    * @returns {void}
    */
  def doAjaxPost(): Unit = js.native
  /** Performs an asynchronous HTTP (FullPost) submit.
    * @returns {void}
    */
  def doPostBack(): Unit = js.native
  /** Exports the pivot chart to the format that is specified in the parameter.
    * @returns {void}
    */
  def exportPivotChart(): Unit = js.native
  /** Renders the control with the pivot engine that is obtained from the OLAP cube.
    * @returns {void}
    */
  def generateJSON(): Unit = js.native
  /** Returns the JSON records that are formed to render the control.
    * @returns {any[]}
    */
  def getJSONRecords(): js.Array[_] = js.native
  /** Returns the OlapReport string that is maintained along with the axis elements information.
    * @returns {string}
    */
  def getOlapReport(): String = js.native
  /** Returns the PivotEngine that is formed to render the control.
    * @returns {any[]}
    */
  def getPivotEngine(): js.Array[_] = js.native
  /** Re-renders the control with the datasource at instant.
    * @returns {void}
    */
  def refreshControl(): Unit = js.native
  /** Navigates to the specified page number in the specified axis.
    * @returns {void}
    */
  def refreshPagedPivotChart(): Unit = js.native
  /** This function renders the pivot chart control with the JSON formatted data source.
    * @returns {void}
    */
  def renderChartFromJSON(): Unit = js.native
  /** This function receives the update from the service-end, which will be utilized for rendering the widget.
    * @returns {void}
    */
  def renderControlSuccess(): Unit = js.native
  /** Sets the JSON records to render the control.
    * @returns {void}
    */
  def setJSONRecords(): Unit = js.native
  /** Sets the OlapReport string along with the axis information and maintains it in a property.
    * @returns {void}
    */
  def setOlapReport(): Unit = js.native
  /** Sets the PivotEngine that is required to render the control.
    * @returns {void}
    */
  def setPivotEngine(): Unit = js.native
}

