package typings.forgeViewer.Autodesk.Viewing

import typings.forgeViewer.Autodesk.Viewing.Private.ProgressBar
import typings.forgeViewer.Autodesk.Viewing.UI.Button
import typings.forgeViewer.Autodesk.Viewing.UI.DockingPanel
import typings.forgeViewer.Autodesk.Viewing.UI.ToolBar
import typings.std.Element
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GuiViewer3D
  extends StObject
     with Viewer3D {
  
  def addDivider(parent: Element): Unit = js.native
  
  def addOptionList(
    parent: Element,
    label: String,
    optionList: js.Array[String],
    initialIndex: Double,
    onchange: js.Function1[/* index */ Double, Unit],
    saveKey: Boolean
  ): Unit = js.native
  
  def addOptionToggle(
    parent: Element,
    tooltip: String,
    initialState: Any,
    onchange: js.Function1[/* checked */ Boolean, Unit],
    saveKey: Boolean
  ): Unit = js.native
  
  def addPanel(panel: DockingPanel): Boolean = js.native
  
  var autocam: Any = js.native
  
  def createDebugSubmenu(button: Button): Unit = js.native
  
  def createSettingsPanel(model: Model): Unit = js.native
  
  def createUI(model: Model): Unit = js.native
  
  def createViewerOptionsMenu(): Unit = js.native
  
  var dockingPanels: Any = js.native
  
  def getPropertyPanel(): Any = js.native
  def getPropertyPanel(createDefault: Boolean): Any = js.native
  
  def getSettingsPanel(): Any = js.native
  def getSettingsPanel(createDefault: Boolean): Any = js.native
  def getSettingsPanel(createDefault: Boolean, model: Model): Any = js.native
  def getSettingsPanel(createDefault: Unit, model: Model): Any = js.native
  
  def getToolbar(create: Boolean): ToolBar = js.native
  
  def initDebugTools(): Unit = js.native
  
  def initEscapeHandlers(): Unit = js.native
  
  def initExplodeSlider(): Unit = js.native
  
  def initHotkeys(model: Model): Unit = js.native
  
  def initInspectTools(): Unit = js.native
  
  def initModality(): Unit = js.native
  
  def initModelStats(): Unit = js.native
  
  def initModelTools(model: Model): Unit = js.native
  
  def onFullScreenModeEvent(event: js.Object): Unit = js.native
  
  def onPanelVisible(panel: DockingPanel): Unit = js.native
  
  def onProgressBarUpdate(event: js.Object): Unit = js.native
  
  var overlays: OverlayManager = js.native
  
  var progressbar: ProgressBar = js.native
  
  def removeDebugTools(): Unit = js.native
  
  def removePanel(panel: DockingPanel): Boolean = js.native
  
  def resizePanels(options: js.Object): Unit = js.native
  
  /** @deprecated */
  def setLayersPanel(): Unit = js.native
  
  def setModelStructurePanel(modelStructurePanel: Any): Unit = js.native
  
  def setPropertiesOnSelect(onSelect: Boolean): Unit = js.native
  
  def setPropertyPanel(propertyPanel: Any): Unit = js.native
  
  def setSettingsPanel(settingsPanel: Any): Unit = js.native
  
  /** @deprecated */
  def showLayerManager(): Unit = js.native
  
  def showModelStructurePanel(show: Boolean): Unit = js.native
  
  def showRenderingOptions(show: Boolean): Unit = js.native
  
  def showViewer3dOptions(show: Boolean): Unit = js.native
  
  var toolController: ToolController = js.native
  
  def updateFullscreenButton(mode: Any): Unit = js.native
  
  def updateToolbarButtons(width: Double, height: Double): Unit = js.native
  
  var utilities: ViewingUtilities = js.native
}
