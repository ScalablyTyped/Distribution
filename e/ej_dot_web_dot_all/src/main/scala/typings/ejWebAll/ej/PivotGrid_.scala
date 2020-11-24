package typings.ejWebAll.ej

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait PivotGrid_ extends Widget_ {
  
  /** This function returns the height of all rows and the width of all columns.
    * @returns {any}
    */
  def calculateCellWidths(): js.Any = js.native
  
  var defaults: typings.ejWebAll.ej.PivotGrid.Model = js.native
  
  /** Performs an asynchronous HTTP (AJAX) request.
    * @returns {void}
    */
  def doAjaxPost(): Unit = js.native
  
  /** Performs an asynchronous HTTP (FullPost) submit.
    * @returns {void}
    */
  def doPostBack(): Unit = js.native
  
  /** This function reconstructs the JSON data that is formed for rendering the PivotGrid in the excel-like layout format.
    * @returns {void}
    */
  def excelLikeLayout(): Unit = js.native
  
  /** Exports the PivotGrid to the specified format.
    * @returns {void}
    */
  def exportPivotGrid(): Unit = js.native
  
  /** Returns the JSON records that are formed to render the control.
    * @returns {any[]}
    */
  def getJSONRecords(): js.Array[_] = js.native
  
  /** Returns the OlapReport string that is maintained along with the axis elements information.
    * @returns {string}
    */
  def getOlapReport(): String = js.native
  
  /** This function loads the specified report from the database/local storage.
    * @returns {void}
    */
  def loadReport(): Unit = js.native
  
  @JSName("model")
  var model_PivotGrid_ : typings.ejWebAll.ej.PivotGrid.Model = js.native
  
  /** This function creates the conditional formatting dialog to apply conditional formatting for the PivotGrid control.
    * @returns {void}
    */
  def openConditionalFormattingDialog(): Unit = js.native
  
  /** This function re-renders the control with the report available at that instant.
    * @returns {void}
    */
  def refreshControl(): Unit = js.native
  
  /** This function allows you to change the caption of the pivot item (name displayed in UI) on-demand for the relational datasource in client-mode.
    * @returns {void}
    */
  def refreshFieldCaption(): Unit = js.native
  
  /** This function re-renders the PivotGrid when clicking the navigation buttons on the PivotPager.
    * @returns {void}
    */
  def refreshPagedPivotGrid(): Unit = js.native
  
  /** This function refreshes the PivotGrid with the modified data input in client-mode.
    * @returns {void}
    */
  def refreshPivotGrid(): Unit = js.native
  
  /** This function receives the JSON formatted datasource to render the PivotGrid control.
    * @returns {void}
    */
  def renderControlFromJSON(): Unit = js.native
  
  /** This function saves the current report to the database/local storage.
    * @returns {void}
    */
  def saveReport(): Unit = js.native
  
  /** Sets the JSON records that are formed to render the control.
    * @returns {void}
    */
  def setJSONRecords(): Unit = js.native
  
  /** Sets the OlapReport string along with the axis information.
    * @returns {void}
    */
  def setOlapReport(): Unit = js.native
}
