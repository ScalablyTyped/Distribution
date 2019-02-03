package typings
package ejDotWebDotAllLib.ejNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("ej.ReportDesigner")
@js.native
class ReportDesigner protected () extends Widget {
  def this(element: ejDotWebDotAllLib.JQuery) = this()
  def this(element: stdLib.Element) = this()
  def this(element: ejDotWebDotAllLib.JQuery, options: ejDotWebDotAllLib.ejNs.ReportDesignerNs.Model) = this()
  def this(element: stdLib.Element, options: ejDotWebDotAllLib.ejNs.ReportDesignerNs.Model) = this()
  var defaults: ejDotWebDotAllLib.ejNs.ReportDesignerNs.Model = js.native
  @JSName("model")
  var model_ReportDesigner: ejDotWebDotAllLib.ejNs.ReportDesignerNs.Model = js.native
  /** Determines whether a copy operation is possible.
    * @returns {boolean}
    */
  def canCopy(): scala.Boolean = js.native
  /** Determines whether a cut operation is possible.
    * @returns {boolean}
    */
  def canCut(): scala.Boolean = js.native
  /** Determines whether a paste operation is possible.
    * @returns {boolean}
    */
  def canPaste(): scala.Boolean = js.native
  /** Returns the bool value indicating whether the user can redo the previous action in the report.
    * @returns {boolean}
    */
  def canRedo(): scala.Boolean = js.native
  /** Determines whether a delete operation is possible.
    * @returns {boolean}
    */
  def canRemove(): scala.Boolean = js.native
  /** Returns a bool value indicating whether the user can undo the previous action in the report.
    * @returns {boolean}
    */
  def canUndo(): scala.Boolean = js.native
  /** Copies the selected ReportItem from design panel to Report Designer internal clipboard.
    * @returns {void}
    */
  def copy(): scala.Unit = js.native
  /** Cuts the selected ReportItem from design panel to Report Designer internal clipboard.
    * @returns {void}
    */
  def cut(): scala.Unit = js.native
  /** Returns the bool value that specifies whether the report has changes or not.
    * @returns {boolean}
    */
  def hasReportChanges(): scala.Boolean = js.native
  /** Returns the bool value that specifies whether the currently processing report is a new report or not.
    * @returns {boolean}
    */
  def isNewReport(): scala.Boolean = js.native
  /** Returns the bool value that specifies whether the currently processing report is a new server report or not.
    * @returns {boolean}
    */
  def isNewServerReport(): scala.Boolean = js.native
  /** Returns the bool value that specifies whether the currently processing report is obtained from the server or local.
    * @returns {boolean}
    */
  def isServerReport(): scala.Boolean = js.native
  /** To create a new report.
    * @returns {void}
    */
  def newReport(): scala.Unit = js.native
  /** To create a new report in the server.
    * @returns {void}
    */
  def newServerReport(): scala.Unit = js.native
  /** This method opens the report from the ReportServer.
    * @returns {void}
    */
  def openReport(): scala.Unit = js.native
  /** To open the report client browse dialog.
    * @returns {void}
    */
  def openReportFromDevice(): scala.Unit = js.native
  /** To open the report open server browse dialog.
    * @returns {void}
    */
  def openServerReportDialog(): scala.Unit = js.native
  /** Pastes the selected ReportItem from Report Designer internal clipboard to design panel.
    * @returns {void}
    */
  def paste(): scala.Unit = js.native
  /** Reverses the action of the last Undo command.
    * @returns {void}
    */
  def redo(): scala.Unit = js.native
  /** Deletes the selected item from the report.
    * @returns {void}
    */
  def remove(): scala.Unit = js.native
  /** This method saves the report into the ReportServer.
    * @returns {void}
    */
  def saveReport(): scala.Unit = js.native
  /** To open the report save server browse dialog.
    * @returns {void}
    */
  def saveServerReportDialog(): scala.Unit = js.native
  /** To download the designed report.
    * @returns {void}
    */
  def saveToDevice(): scala.Unit = js.native
  /** To show the report design.
    * @returns {void}
    */
  def showDesign(): scala.Unit = js.native
  /** To open the new report dialog.
    * @returns {void}
    */
  def showNewReportDialog(): scala.Unit = js.native
  /** To open the server browse dialog.
    * @returns {void}
    */
  def showOpenSaveReportDialog(): scala.Unit = js.native
  /** To show the report preview.
    * @returns {void}
    */
  def showPreview(): scala.Unit = js.native
  /** Reverses the last action that was performed.
    * @returns {void}
    */
  def undo(): scala.Unit = js.native
}

/* static members */
@JSGlobal("ej.ReportDesigner")
@js.native
object ReportDesigner extends js.Object {
  var Locale: js.Any = js.native
  var fn: ejDotWebDotAllLib.ejNs.ReportDesigner = js.native
}

