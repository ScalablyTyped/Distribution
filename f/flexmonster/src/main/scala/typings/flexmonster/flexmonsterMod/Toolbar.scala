package typings.flexmonster.flexmonsterMod

import typings.flexmonster.Anon_Charts
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Toolbar extends js.Object {
  var icons: Anon_Charts
  // Charts tab
  def chartsHandler(`type`: String): Unit
  def chartsMultipleHandler(): Unit
  def conditionalFormattingHandler(): Unit
  // Connect tab
  def connectLocalCSVHandler(): Unit
  def connectLocalJSONHandler(): Unit
  def connectOLAP(): Unit
  def connectRemoteCSV(): Unit
  def connectRemoteJSON(): Unit
  def exportHandler(`type`: String): Unit
  // Fields tab
  def fieldsHandler(): Unit
  // Format tab
  def formatCellsHandler(): Unit
  // Fullscreen tab
  def fullscreenHandler(): Unit
  def getTabs(): js.Array[ToolbarTab]
  // Grid tab
  def gridHandler(): Unit
  // Open tab
  def openLocalReport(): Unit
  def openRemoteReport(): Unit
  // Options tab
  def optionsHandler(): Unit
  // Export tab
  def printHandler(): Unit
  // Save tab
  def saveHandler(): Unit
}

object Toolbar {
  @scala.inline
  def apply(
    chartsHandler: String => Unit,
    chartsMultipleHandler: () => Unit,
    conditionalFormattingHandler: () => Unit,
    connectLocalCSVHandler: () => Unit,
    connectLocalJSONHandler: () => Unit,
    connectOLAP: () => Unit,
    connectRemoteCSV: () => Unit,
    connectRemoteJSON: () => Unit,
    exportHandler: String => Unit,
    fieldsHandler: () => Unit,
    formatCellsHandler: () => Unit,
    fullscreenHandler: () => Unit,
    getTabs: () => js.Array[ToolbarTab],
    gridHandler: () => Unit,
    icons: Anon_Charts,
    openLocalReport: () => Unit,
    openRemoteReport: () => Unit,
    optionsHandler: () => Unit,
    printHandler: () => Unit,
    saveHandler: () => Unit
  ): Toolbar = {
    val __obj = js.Dynamic.literal(chartsHandler = js.Any.fromFunction1(chartsHandler), chartsMultipleHandler = js.Any.fromFunction0(chartsMultipleHandler), conditionalFormattingHandler = js.Any.fromFunction0(conditionalFormattingHandler), connectLocalCSVHandler = js.Any.fromFunction0(connectLocalCSVHandler), connectLocalJSONHandler = js.Any.fromFunction0(connectLocalJSONHandler), connectOLAP = js.Any.fromFunction0(connectOLAP), connectRemoteCSV = js.Any.fromFunction0(connectRemoteCSV), connectRemoteJSON = js.Any.fromFunction0(connectRemoteJSON), exportHandler = js.Any.fromFunction1(exportHandler), fieldsHandler = js.Any.fromFunction0(fieldsHandler), formatCellsHandler = js.Any.fromFunction0(formatCellsHandler), fullscreenHandler = js.Any.fromFunction0(fullscreenHandler), getTabs = js.Any.fromFunction0(getTabs), gridHandler = js.Any.fromFunction0(gridHandler), icons = icons.asInstanceOf[js.Any], openLocalReport = js.Any.fromFunction0(openLocalReport), openRemoteReport = js.Any.fromFunction0(openRemoteReport), optionsHandler = js.Any.fromFunction0(optionsHandler), printHandler = js.Any.fromFunction0(printHandler), saveHandler = js.Any.fromFunction0(saveHandler))
  
    __obj.asInstanceOf[Toolbar]
  }
}

