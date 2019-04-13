package typings
package flexmonsterLib.flexmonsterMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Toolbar extends js.Object {
  // Charts tab
  def chartsHandler(`type`: java.lang.String): scala.Unit
  def chartsMultipleHandler(): scala.Unit
  def conditionalFormattingHandler(): scala.Unit
  // Connect tab
  def connectLocalCSVHandler(): scala.Unit
  def connectLocalJSONHandler(): scala.Unit
  def connectOLAP(): scala.Unit
  def connectRemoteCSV(): scala.Unit
  def connectRemoteJSON(): scala.Unit
  def exportHandler(`type`: java.lang.String): scala.Unit
  // Fields tab
  def fieldsHandler(): scala.Unit
  // Format tab
  def formatCellsHandler(): scala.Unit
  // Fullscreen tab
  def fullscreenHandler(): scala.Unit
  def getTabs(): js.Array[ToolbarTab]
  // Grid tab
  def gridHandler(): scala.Unit
  // Open tab
  def openLocalReport(): scala.Unit
  def openRemoteReport(): scala.Unit
  // Options tab
  def optionsHandler(): scala.Unit
  // Export tab
  def printHandler(): scala.Unit
  // Save tab
  def saveHandler(): scala.Unit
}

object Toolbar {
  @scala.inline
  def apply(
    chartsHandler: java.lang.String => scala.Unit,
    chartsMultipleHandler: () => scala.Unit,
    conditionalFormattingHandler: () => scala.Unit,
    connectLocalCSVHandler: () => scala.Unit,
    connectLocalJSONHandler: () => scala.Unit,
    connectOLAP: () => scala.Unit,
    connectRemoteCSV: () => scala.Unit,
    connectRemoteJSON: () => scala.Unit,
    exportHandler: java.lang.String => scala.Unit,
    fieldsHandler: () => scala.Unit,
    formatCellsHandler: () => scala.Unit,
    fullscreenHandler: () => scala.Unit,
    getTabs: () => js.Array[ToolbarTab],
    gridHandler: () => scala.Unit,
    openLocalReport: () => scala.Unit,
    openRemoteReport: () => scala.Unit,
    optionsHandler: () => scala.Unit,
    printHandler: () => scala.Unit,
    saveHandler: () => scala.Unit
  ): Toolbar = {
    val __obj = js.Dynamic.literal(chartsHandler = js.Any.fromFunction1(chartsHandler), chartsMultipleHandler = js.Any.fromFunction0(chartsMultipleHandler), conditionalFormattingHandler = js.Any.fromFunction0(conditionalFormattingHandler), connectLocalCSVHandler = js.Any.fromFunction0(connectLocalCSVHandler), connectLocalJSONHandler = js.Any.fromFunction0(connectLocalJSONHandler), connectOLAP = js.Any.fromFunction0(connectOLAP), connectRemoteCSV = js.Any.fromFunction0(connectRemoteCSV), connectRemoteJSON = js.Any.fromFunction0(connectRemoteJSON), exportHandler = js.Any.fromFunction1(exportHandler), fieldsHandler = js.Any.fromFunction0(fieldsHandler), formatCellsHandler = js.Any.fromFunction0(formatCellsHandler), fullscreenHandler = js.Any.fromFunction0(fullscreenHandler), getTabs = js.Any.fromFunction0(getTabs), gridHandler = js.Any.fromFunction0(gridHandler), openLocalReport = js.Any.fromFunction0(openLocalReport), openRemoteReport = js.Any.fromFunction0(openRemoteReport), optionsHandler = js.Any.fromFunction0(optionsHandler), printHandler = js.Any.fromFunction0(printHandler), saveHandler = js.Any.fromFunction0(saveHandler))
  
    __obj.asInstanceOf[Toolbar]
  }
}

