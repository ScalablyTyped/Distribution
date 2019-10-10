package typings.ejDotWebDotAll.ej

import typings.ejDotWebDotAll.JQuery
import typings.std.Element
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("ej.ReportDesigner")
@js.native
class ReportDesigner_ protected () extends Widget {
  def this(element: JQuery) = this()
  def this(element: Element) = this()
  def this(element: JQuery, options: typings.ejDotWebDotAll.ej.ReportDesigner.Model) = this()
  def this(element: Element, options: typings.ejDotWebDotAll.ej.ReportDesigner.Model) = this()
  var defaults: typings.ejDotWebDotAll.ej.ReportDesigner.Model = js.native
  @JSName("model")
  var model_ReportDesigner_ : typings.ejDotWebDotAll.ej.ReportDesigner.Model = js.native
  /** Add a dataset to the report at runtime.
    * @param {any} a JSON to define a connection properties for dataset.
    * @returns {void}
    */
  def addDataSet(dataset: js.Any): Unit = js.native
  /** Add a datasource to the report at runtime.
    * @param {any} a JSON to define a connection properties for datasource.
    * @returns {void}
    */
  def addDataSource(datasource: js.Any): Unit = js.native
  /** Add a report item to the report at runtime.
    * @param {any} JSON for the new report item to be added
    * @returns {void}
    */
  def addItem(item: js.Any): Unit = js.native
  /** Visually move the selected report item over its closest intersected report items.
    * @returns {void}
    */
  def bringForward(): Unit = js.native
  /** Visually move the selected report item over all other intersected report items.
    * @returns {void}
    */
  def bringToFront(): Unit = js.native
  /** Determines whether a copy operation is possible.
    * @returns {boolean}
    */
  def canCopy(): Boolean = js.native
  /** Determines whether a cut operation is possible.
    * @returns {boolean}
    */
  def canCut(): Boolean = js.native
  /** Determines whether a paste operation is possible.
    * @returns {boolean}
    */
  def canPaste(): Boolean = js.native
  /** Returns the boolean value indicating whether the user can redo the previous action in the report.
    * @returns {boolean}
    */
  def canRedo(): Boolean = js.native
  /** Determines whether a delete operation is possible.
    * @returns {boolean}
    */
  def canRemove(): Boolean = js.native
  /** Returns a boolean value indicating whether the user can undo the previous action in the report.
    * @returns {boolean}
    */
  def canUndo(): Boolean = js.native
  /** Clone the existing dataset in the report at runtime.
    * @param {string} Name of the existing dataset.
    * @returns {void}
    */
  def cloneDataSet(name: String): Unit = js.native
  /** Clone the existing datasource in the report at runtime.
    * @param {string} Name of the existing datasource.
    * @returns {void}
    */
  def cloneDataSource(name: String): Unit = js.native
  /** Copies the selected report item from design panel to the Report Designer internal clipboard.
    * @returns {void}
    */
  def copy(): Unit = js.native
  /** Cuts the selected report item from design panel to the Report Designer internal clipboard.
    * @returns {void}
    */
  def cut(): Unit = js.native
  /** Returns the boolean value that specifies whether the report has changes or not.
    * @returns {boolean}
    */
  def hasReportChanges(): Boolean = js.native
  /** Returns the boolean value that specifies whether the currently processing report is a new report or not.
    * @returns {boolean}
    */
  def isNewReport(): Boolean = js.native
  /** Returns the boolean value that specifies whether the currently processing report is a new server report or not.
    * @returns {boolean}
    */
  def isNewServerReport(): Boolean = js.native
  /** Returns the boolean value that specifies whether the currently processing report is obtained from the server or local.
    * @returns {boolean}
    */
  def isServerReport(): Boolean = js.native
  /** To create a new report.
    * @returns {void}
    */
  def newReport(): Unit = js.native
  /** To create a new report in the server.
    * @returns {void}
    */
  def newServerReport(): Unit = js.native
  /** This method opens the report from the server.
    * @returns {void}
    */
  def openReport(): Unit = js.native
  /** This method opens the report using raw report data.
    * @returns {void}
    */
  def openReportDefinition(): Unit = js.native
  /** Opens the client browse dialog to browse the report.
    * @returns {void}
    */
  def openReportFromDevice(): Unit = js.native
  /** Opens the report designer browse dialog to browse the available reports in the reportserver.
    * @returns {void}
    */
  def openServerReportDialog(): Unit = js.native
  /** Pastes the selected report item from the Report Designer internal clipboard to design panel.
    * @returns {void}
    */
  def paste(): Unit = js.native
  /** Reverses the action of the last Undo command.
    * @returns {void}
    */
  def redo(): Unit = js.native
  /** Deletes the selected report item from the report.
    * @returns {void}
    */
  def remove(): Unit = js.native
  /** Remove a dataset from the report at runtime.
    * @param {string} Name of the dataset.
    * @returns {void}
    */
  def removeDataSet(dataset: String): Unit = js.native
  /** Remove a datasource from the report at runtime.
    * @param {string} Name of the datasource.
    * @returns {void}
    */
  def removeDatasource(datasource: String): Unit = js.native
  /** Remove the given report item from the report.
    * @param {string} Name of the report item to be removed from report
    * @returns {void}
    */
  def removeItem(itemName: String): Unit = js.native
  /** This method saves the report into the server.
    * @returns {void}
    */
  def saveReport(): Unit = js.native
  /** This method returns the report in JSON or XML format.
    * @returns {void}
    */
  def saveReportDefinition(): Unit = js.native
  /** Opens the report designer browse dialog to save the report into server.
    * @returns {void}
    */
  def saveServerReportDialog(): Unit = js.native
  /** To download the designed report.
    * @returns {void}
    */
  def saveToDevice(): Unit = js.native
  /** Update the selection to report items at runtime.
    * @param {any[]} Name of the report items as string array.
    * @returns {void}
    */
  def selectItems(itemNames: js.Array[_]): Unit = js.native
  /** Visually move the selected report item behind its closest intersected report item.
    * @returns {void}
    */
  def sendBackward(): Unit = js.native
  /** Visually move the selected report item behind all other intersected report items.
    * @returns {void}
    */
  def sendToBack(): Unit = js.native
  /** Performs switch action from viewer to designer at runtime.
    * @returns {void}
    */
  def showDesign(): Unit = js.native
  /** To open the new report dialog.
    * @returns {void}
    */
  def showNewReportDialog(): Unit = js.native
  /** To open the server browse dialog.
    * @returns {void}
    */
  def showOpenSaveReportDialog(): Unit = js.native
  /** Performs switch action from designer to viewer at runtime.
    * @returns {void}
    */
  def showPreview(): Unit = js.native
  /** Reverses the last action that was performed.
    * @returns {void}
    */
  def undo(): Unit = js.native
  /** Update the dataset in the report at runtime.
    * @param {string} Name of the existing dataset.
    * @param {any} a JSON to define a connection properties for dataset.
    * @returns {void}
    */
  def updateDataset(datasetName: String, dataset: js.Any): Unit = js.native
  /** Update the datasource in the report at runtime.
    * @param {string} Name of the existing datasource.
    * @param {any} a JSON to define a connection properties for datasource.
    * @returns {void}
    */
  def updateDatasource(datasourceName: String, datasource: js.Any): Unit = js.native
}

