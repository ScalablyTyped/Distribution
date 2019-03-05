package typings
package flexmonsterLib.flexmonsterMod.FlexmonsterNs

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
    chartsHandler: js.Function1[java.lang.String, scala.Unit],
    chartsMultipleHandler: js.Function0[scala.Unit],
    conditionalFormattingHandler: js.Function0[scala.Unit],
    connectLocalCSVHandler: js.Function0[scala.Unit],
    connectLocalJSONHandler: js.Function0[scala.Unit],
    connectOLAP: js.Function0[scala.Unit],
    connectRemoteCSV: js.Function0[scala.Unit],
    connectRemoteJSON: js.Function0[scala.Unit],
    exportHandler: js.Function1[java.lang.String, scala.Unit],
    fieldsHandler: js.Function0[scala.Unit],
    formatCellsHandler: js.Function0[scala.Unit],
    fullscreenHandler: js.Function0[scala.Unit],
    getTabs: js.Function0[js.Array[ToolbarTab]],
    gridHandler: js.Function0[scala.Unit],
    openLocalReport: js.Function0[scala.Unit],
    openRemoteReport: js.Function0[scala.Unit],
    optionsHandler: js.Function0[scala.Unit],
    printHandler: js.Function0[scala.Unit],
    saveHandler: js.Function0[scala.Unit]
  ): Toolbar = {
    val __obj = js.Dynamic.literal(chartsHandler = chartsHandler, chartsMultipleHandler = chartsMultipleHandler, conditionalFormattingHandler = conditionalFormattingHandler, connectLocalCSVHandler = connectLocalCSVHandler, connectLocalJSONHandler = connectLocalJSONHandler, connectOLAP = connectOLAP, connectRemoteCSV = connectRemoteCSV, connectRemoteJSON = connectRemoteJSON, exportHandler = exportHandler, fieldsHandler = fieldsHandler, formatCellsHandler = formatCellsHandler, fullscreenHandler = fullscreenHandler, getTabs = getTabs, gridHandler = gridHandler, openLocalReport = openLocalReport, openRemoteReport = openRemoteReport, optionsHandler = optionsHandler, printHandler = printHandler, saveHandler = saveHandler)
  
    __obj.asInstanceOf[Toolbar]
  }
}

