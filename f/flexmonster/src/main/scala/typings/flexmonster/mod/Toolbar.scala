package typings.flexmonster.mod

import typings.flexmonster.anon.Charts
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Toolbar extends StObject {
  
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
  
  var icons: Charts
  
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
  
  inline def apply(
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
  implicit open class MutableBuilder[Self <: Toolbar] (val x: Self) extends AnyVal {
    
    inline def setChartsHandler(value: String => Unit): Self = StObject.set(x, "chartsHandler", js.Any.fromFunction1(value))
    
    inline def setChartsMultipleHandler(value: () => Unit): Self = StObject.set(x, "chartsMultipleHandler", js.Any.fromFunction0(value))
    
    inline def setConditionalFormattingHandler(value: () => Unit): Self = StObject.set(x, "conditionalFormattingHandler", js.Any.fromFunction0(value))
    
    inline def setConnectLocalCSVHandler(value: () => Unit): Self = StObject.set(x, "connectLocalCSVHandler", js.Any.fromFunction0(value))
    
    inline def setConnectLocalJSONHandler(value: () => Unit): Self = StObject.set(x, "connectLocalJSONHandler", js.Any.fromFunction0(value))
    
    inline def setConnectOLAP(value: () => Unit): Self = StObject.set(x, "connectOLAP", js.Any.fromFunction0(value))
    
    inline def setConnectRemoteCSV(value: () => Unit): Self = StObject.set(x, "connectRemoteCSV", js.Any.fromFunction0(value))
    
    inline def setConnectRemoteJSON(value: () => Unit): Self = StObject.set(x, "connectRemoteJSON", js.Any.fromFunction0(value))
    
    inline def setExportHandler(value: String => Unit): Self = StObject.set(x, "exportHandler", js.Any.fromFunction1(value))
    
    inline def setFieldsHandler(value: () => Unit): Self = StObject.set(x, "fieldsHandler", js.Any.fromFunction0(value))
    
    inline def setFormatCellsHandler(value: () => Unit): Self = StObject.set(x, "formatCellsHandler", js.Any.fromFunction0(value))
    
    inline def setFullscreenHandler(value: () => Unit): Self = StObject.set(x, "fullscreenHandler", js.Any.fromFunction0(value))
    
    inline def setGetTabs(value: () => js.Array[ToolbarTab]): Self = StObject.set(x, "getTabs", js.Any.fromFunction0(value))
    
    inline def setGridHandler(value: () => Unit): Self = StObject.set(x, "gridHandler", js.Any.fromFunction0(value))
    
    inline def setIcons(value: Charts): Self = StObject.set(x, "icons", value.asInstanceOf[js.Any])
    
    inline def setOpenLocalReport(value: () => Unit): Self = StObject.set(x, "openLocalReport", js.Any.fromFunction0(value))
    
    inline def setOpenRemoteReport(value: () => Unit): Self = StObject.set(x, "openRemoteReport", js.Any.fromFunction0(value))
    
    inline def setOptionsHandler(value: () => Unit): Self = StObject.set(x, "optionsHandler", js.Any.fromFunction0(value))
    
    inline def setPrintHandler(value: () => Unit): Self = StObject.set(x, "printHandler", js.Any.fromFunction0(value))
    
    inline def setSaveHandler(value: () => Unit): Self = StObject.set(x, "saveHandler", js.Any.fromFunction0(value))
  }
}
