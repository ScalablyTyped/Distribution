package typings.flexmonster.mod

import typings.flexmonster.anon.Charts
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Toolbar extends js.Object {
  
  // Charts tab
  def chartsHandler(`type`: String): Unit = js.native
  
  def chartsMultipleHandler(): Unit = js.native
  
  def conditionalFormattingHandler(): Unit = js.native
  
  // Connect tab
  def connectLocalCSVHandler(): Unit = js.native
  
  def connectLocalJSONHandler(): Unit = js.native
  
  def connectOLAP(): Unit = js.native
  
  def connectRemoteCSV(): Unit = js.native
  
  def connectRemoteJSON(): Unit = js.native
  
  def exportHandler(`type`: String): Unit = js.native
  
  // Fields tab
  def fieldsHandler(): Unit = js.native
  
  // Format tab
  def formatCellsHandler(): Unit = js.native
  
  // Fullscreen tab
  def fullscreenHandler(): Unit = js.native
  
  def getTabs(): js.Array[ToolbarTab] = js.native
  
  // Grid tab
  def gridHandler(): Unit = js.native
  
  var icons: Charts = js.native
  
  // Open tab
  def openLocalReport(): Unit = js.native
  
  def openRemoteReport(): Unit = js.native
  
  // Options tab
  def optionsHandler(): Unit = js.native
  
  // Export tab
  def printHandler(): Unit = js.native
  
  // Save tab
  def saveHandler(): Unit = js.native
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
    icons: Charts,
    openLocalReport: () => Unit,
    openRemoteReport: () => Unit,
    optionsHandler: () => Unit,
    printHandler: () => Unit,
    saveHandler: () => Unit
  ): Toolbar = {
    val __obj = js.Dynamic.literal(chartsHandler = js.Any.fromFunction1(chartsHandler), chartsMultipleHandler = js.Any.fromFunction0(chartsMultipleHandler), conditionalFormattingHandler = js.Any.fromFunction0(conditionalFormattingHandler), connectLocalCSVHandler = js.Any.fromFunction0(connectLocalCSVHandler), connectLocalJSONHandler = js.Any.fromFunction0(connectLocalJSONHandler), connectOLAP = js.Any.fromFunction0(connectOLAP), connectRemoteCSV = js.Any.fromFunction0(connectRemoteCSV), connectRemoteJSON = js.Any.fromFunction0(connectRemoteJSON), exportHandler = js.Any.fromFunction1(exportHandler), fieldsHandler = js.Any.fromFunction0(fieldsHandler), formatCellsHandler = js.Any.fromFunction0(formatCellsHandler), fullscreenHandler = js.Any.fromFunction0(fullscreenHandler), getTabs = js.Any.fromFunction0(getTabs), gridHandler = js.Any.fromFunction0(gridHandler), icons = icons.asInstanceOf[js.Any], openLocalReport = js.Any.fromFunction0(openLocalReport), openRemoteReport = js.Any.fromFunction0(openRemoteReport), optionsHandler = js.Any.fromFunction0(optionsHandler), printHandler = js.Any.fromFunction0(printHandler), saveHandler = js.Any.fromFunction0(saveHandler))
    __obj.asInstanceOf[Toolbar]
  }
  
  @scala.inline
  implicit class ToolbarOps[Self <: Toolbar] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setChartsHandler(value: String => Unit): Self = this.set("chartsHandler", js.Any.fromFunction1(value))
    
    @scala.inline
    def setChartsMultipleHandler(value: () => Unit): Self = this.set("chartsMultipleHandler", js.Any.fromFunction0(value))
    
    @scala.inline
    def setConditionalFormattingHandler(value: () => Unit): Self = this.set("conditionalFormattingHandler", js.Any.fromFunction0(value))
    
    @scala.inline
    def setConnectLocalCSVHandler(value: () => Unit): Self = this.set("connectLocalCSVHandler", js.Any.fromFunction0(value))
    
    @scala.inline
    def setConnectLocalJSONHandler(value: () => Unit): Self = this.set("connectLocalJSONHandler", js.Any.fromFunction0(value))
    
    @scala.inline
    def setConnectOLAP(value: () => Unit): Self = this.set("connectOLAP", js.Any.fromFunction0(value))
    
    @scala.inline
    def setConnectRemoteCSV(value: () => Unit): Self = this.set("connectRemoteCSV", js.Any.fromFunction0(value))
    
    @scala.inline
    def setConnectRemoteJSON(value: () => Unit): Self = this.set("connectRemoteJSON", js.Any.fromFunction0(value))
    
    @scala.inline
    def setExportHandler(value: String => Unit): Self = this.set("exportHandler", js.Any.fromFunction1(value))
    
    @scala.inline
    def setFieldsHandler(value: () => Unit): Self = this.set("fieldsHandler", js.Any.fromFunction0(value))
    
    @scala.inline
    def setFormatCellsHandler(value: () => Unit): Self = this.set("formatCellsHandler", js.Any.fromFunction0(value))
    
    @scala.inline
    def setFullscreenHandler(value: () => Unit): Self = this.set("fullscreenHandler", js.Any.fromFunction0(value))
    
    @scala.inline
    def setGetTabs(value: () => js.Array[ToolbarTab]): Self = this.set("getTabs", js.Any.fromFunction0(value))
    
    @scala.inline
    def setGridHandler(value: () => Unit): Self = this.set("gridHandler", js.Any.fromFunction0(value))
    
    @scala.inline
    def setIcons(value: Charts): Self = this.set("icons", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOpenLocalReport(value: () => Unit): Self = this.set("openLocalReport", js.Any.fromFunction0(value))
    
    @scala.inline
    def setOpenRemoteReport(value: () => Unit): Self = this.set("openRemoteReport", js.Any.fromFunction0(value))
    
    @scala.inline
    def setOptionsHandler(value: () => Unit): Self = this.set("optionsHandler", js.Any.fromFunction0(value))
    
    @scala.inline
    def setPrintHandler(value: () => Unit): Self = this.set("printHandler", js.Any.fromFunction0(value))
    
    @scala.inline
    def setSaveHandler(value: () => Unit): Self = this.set("saveHandler", js.Any.fromFunction0(value))
  }
}
