package typings
package ejDotWebDotAllLib.ejNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("ej.PivotClient")
@js.native
class PivotClient protected () extends Widget {
  def this(element: ejDotWebDotAllLib.JQuery) = this()
  def this(element: stdLib.Element) = this()
  def this(element: ejDotWebDotAllLib.JQuery, options: ejDotWebDotAllLib.ejNs.PivotClientNs.Model) = this()
  def this(element: stdLib.Element, options: ejDotWebDotAllLib.ejNs.PivotClientNs.Model) = this()
  var defaults: ejDotWebDotAllLib.ejNs.PivotClientNs.Model = js.native
  @JSName("model")
  var model_PivotClient: ejDotWebDotAllLib.ejNs.PivotClientNs.Model = js.native
  /** Performs an asynchronous HTTP (AJAX) request.
    * @returns {void}
    */
  def doAjaxPost(): scala.Unit = js.native
  /** Performs an asynchronous HTTP (full post) submit.
    * @returns {void}
    */
  def doPostBack(): scala.Unit = js.native
  /** Renders the pivot chart and the pivot grid with the provided JSON data.
    * @returns {void}
    */
  def generateJSON(): scala.Unit = js.native
  /** Returns the control tab string that displays currently in the pivot client.
    * @returns {void}
    */
  def getActiveTab(): scala.Unit = js.native
  /** Returns the formed JSON records to render the control.
    * @returns {any[]}
    */
  def getJSONRecords(): js.Array[_] = js.native
  /** Returns the OLAP report string that is maintained along with the axis elements information.
    * @returns {string}
    */
  def getOlapReport(): java.lang.String = js.native
  /** Re-renders the control with the report at that instant.
    * @returns {void}
    */
  def refreshControl(): scala.Unit = js.native
  /** Navigates to a specified page in the specified axis.
    * @returns {void}
    */
  def refreshPagedPivotClient(): scala.Unit = js.native
  /** Updates the pivot client component with the JSON data that is fetched from the service while navigating between the pages.
    * @returns {void}
    */
  def refreshPagedPivotClientSuccess(): scala.Unit = js.native
  /** Sets the formed JSON records to render the control to a property.
    * @returns {void}
    */
  def setJSONRecords(): scala.Unit = js.native
  /** Sets the OLAP report string along with the axis information and maintains it in a property.
    * @returns {void}
    */
  def setOlapReport(): scala.Unit = js.native
}

@JSGlobal("ej.PivotClient")
@js.native
object PivotClient extends js.Object {
  var Locale: js.Any = js.native
  var fn: ejDotWebDotAllLib.ejNs.PivotClient = js.native
}

