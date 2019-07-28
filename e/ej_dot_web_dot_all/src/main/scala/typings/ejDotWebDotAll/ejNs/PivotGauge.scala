package typings.ejDotWebDotAll.ejNs

import typings.ejDotWebDotAll.JQuery
import typings.std.Element
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("ej.PivotGauge")
@js.native
class PivotGauge protected () extends Widget {
  def this(element: JQuery) = this()
  def this(element: Element) = this()
  def this(element: JQuery, options: typings.ejDotWebDotAll.ejNs.PivotGaugeNs.Model) = this()
  def this(element: Element, options: typings.ejDotWebDotAll.ejNs.PivotGaugeNs.Model) = this()
  var defaults: typings.ejDotWebDotAll.ejNs.PivotGaugeNs.Model = js.native
  @JSName("model")
  var model_PivotGauge: typings.ejDotWebDotAll.ejNs.PivotGaugeNs.Model = js.native
  /** Performs an asynchronous HTTP (AJAX) request.
    * @returns {void}
    */
  def doAjaxPost(): Unit = js.native
  /** Returns the JSON records required to render the PivotGauge on performing any action with OLAP data source.
    * @returns {void}
    */
  def getJSONData(): Unit = js.native
  /** Returns the JSON records formed to render the control.
    * @returns {any[]}
    */
  def getJSONRecords(): js.Array[_] = js.native
  /** Returns the OlapReport string maintained along with the axis elements information.
    * @returns {string}
    */
  def getOlapReport(): String = js.native
  /** This function is used to refresh the PivotGauge at client-side itself.
    * @returns {void}
    */
  def refresh(): Unit = js.native
  /** This function removes the KPI related images from PivotGauge on binding OLAP datasource.
    * @returns {void}
    */
  def removeImg(): Unit = js.native
  /** This function receives the JSON formatted datasource and renders the PivotGauge control.
    * @returns {void}
    */
  def renderControlFromJSON(): Unit = js.native
  /** Sets the JSON records to render the control.
    * @returns {void}
    */
  def setJSONRecords(): Unit = js.native
  /** Sets the OlapReport string along with the axis information and maintains it in a property.
    * @returns {void}
    */
  def setOlapReport(): Unit = js.native
}

/* static members */
@JSGlobal("ej.PivotGauge")
@js.native
object PivotGauge extends js.Object {
  var Locale: js.Any = js.native
  var fn: PivotGauge = js.native
}

