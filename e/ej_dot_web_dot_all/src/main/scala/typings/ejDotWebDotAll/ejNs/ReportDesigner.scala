package typings.ejDotWebDotAll.ejNs

import typings.ejDotWebDotAll.JQuery
import typings.std.Element
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("ej.ReportDesigner")
@js.native
class ReportDesigner protected () extends Widget {
  def this(element: JQuery) = this()
  def this(element: Element) = this()
  def this(element: JQuery, options: typings.ejDotWebDotAll.ejNs.ReportDesignerNs.Model) = this()
  def this(element: Element, options: typings.ejDotWebDotAll.ejNs.ReportDesignerNs.Model) = this()
  var defaults: typings.ejDotWebDotAll.ejNs.ReportDesignerNs.Model = js.native
  @JSName("model")
  var model_ReportDesigner: typings.ejDotWebDotAll.ejNs.ReportDesignerNs.Model = js.native
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
  /** Returns the bool value indicating whether the user can redo the previous action in the report.
    * @returns {boolean}
    */
  def canRedo(): Boolean = js.native
  /** Determines whether a delete operation is possible.
    * @returns {boolean}
    */
  def canRemove(): Boolean = js.native
  /** Returns a bool value indicating whether the user can undo the previous action in the report.
    * @returns {boolean}
    */
  def canUndo(): Boolean = js.native
  /** Copies the selected ReportItem from design panel to Report Designer internal clipboard.
    * @returns {void}
    */
  def copy(): Unit = js.native
  /** Cuts the selected ReportItem from design panel to Report Designer internal clipboard.
    * @returns {void}
    */
  def cut(): Unit = js.native
  /** Returns the bool value that specifies whether the report has changes or not.
    * @returns {boolean}
    */
  def hasReportChanges(): Boolean = js.native
  /** Returns the bool value that specifies whether the currently processing report is a new report or not.
    * @returns {boolean}
    */
  def isNewReport(): Boolean = js.native
  /** Returns the bool value that specifies whether the currently processing report is a new server report or not.
    * @returns {boolean}
    */
  def isNewServerReport(): Boolean = js.native
  /** Returns the bool value that specifies whether the currently processing report is obtained from the server or local.
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
  /** This method opens the report from the ReportServer.
    * @returns {void}
    */
  def openReport(): Unit = js.native
  /** To open the report client browse dialog.
    * @returns {void}
    */
  def openReportFromDevice(): Unit = js.native
  /** To open the report open server browse dialog.
    * @returns {void}
    */
  def openServerReportDialog(): Unit = js.native
  /** Pastes the selected ReportItem from Report Designer internal clipboard to design panel.
    * @returns {void}
    */
  def paste(): Unit = js.native
  /** Reverses the action of the last Undo command.
    * @returns {void}
    */
  def redo(): Unit = js.native
  /** Deletes the selected item from the report.
    * @returns {void}
    */
  def remove(): Unit = js.native
  /** This method saves the report into the ReportServer.
    * @returns {void}
    */
  def saveReport(): Unit = js.native
  /** To open the report save server browse dialog.
    * @returns {void}
    */
  def saveServerReportDialog(): Unit = js.native
  /** To download the designed report.
    * @returns {void}
    */
  def saveToDevice(): Unit = js.native
  /** To show the report design.
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
  /** To show the report preview.
    * @returns {void}
    */
  def showPreview(): Unit = js.native
  /** Reverses the last action that was performed.
    * @returns {void}
    */
  def undo(): Unit = js.native
}

/* static members */
@JSGlobal("ej.ReportDesigner")
@js.native
object ReportDesigner extends js.Object {
  var Locale: js.Any = js.native
  var fn: ReportDesigner = js.native
}

