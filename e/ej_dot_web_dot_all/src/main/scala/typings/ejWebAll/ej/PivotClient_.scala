package typings.ejWebAll.ej

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait PivotClient_ extends Widget_ {
  
  var defaults: typings.ejWebAll.ej.PivotClient.Model = js.native
  
  /** Performs an asynchronous HTTP (AJAX) request.
    * @returns {void}
    */
  def doAjaxPost(): Unit = js.native
  
  /** Performs an asynchronous HTTP (full post) submit.
    * @returns {void}
    */
  def doPostBack(): Unit = js.native
  
  /** Renders the pivot chart and the pivot grid with the provided JSON data.
    * @returns {void}
    */
  def generateJSON(): Unit = js.native
  
  /** Returns the control tab string that displays currently in the pivot client.
    * @returns {void}
    */
  def getActiveTab(): Unit = js.native
  
  /** Returns the formed JSON records to render the control.
    * @returns {any[]}
    */
  def getJSONRecords(): js.Array[_] = js.native
  
  /** Returns the OLAP report string that is maintained along with the axis elements information.
    * @returns {string}
    */
  def getOlapReport(): String = js.native
  
  @JSName("model")
  var model_PivotClient_ : typings.ejWebAll.ej.PivotClient.Model = js.native
  
  /** Re-renders the control with the report at that instant.
    * @returns {void}
    */
  def refreshControl(): Unit = js.native
  
  /** Navigates to a specified page in the specified axis.
    * @returns {void}
    */
  def refreshPagedPivotClient(): Unit = js.native
  
  /** Updates the pivot client component with the JSON data that is fetched from the service while navigating between the pages.
    * @returns {void}
    */
  def refreshPagedPivotClientSuccess(): Unit = js.native
  
  /** Sets the formed JSON records to render the control to a property.
    * @returns {void}
    */
  def setJSONRecords(): Unit = js.native
  
  /** Sets the OLAP report string along with the axis information and maintains it in a property.
    * @returns {void}
    */
  def setOlapReport(): Unit = js.native
}
