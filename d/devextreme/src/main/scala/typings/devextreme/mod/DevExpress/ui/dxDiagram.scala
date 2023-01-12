package typings.devextreme.mod.DevExpress.ui

import typings.devextreme.devextremeStrings.addShape
import typings.devextreme.devextremeStrings.addShapeFromToolbox
import typings.devextreme.devextremeStrings.changeConnection
import typings.devextreme.devextremeStrings.changeConnectorPoints
import typings.devextreme.devextremeStrings.deleteConnector
import typings.devextreme.devextremeStrings.deleteShape
import typings.devextreme.devextremeStrings.merge_
import typings.devextreme.devextremeStrings.png_
import typings.devextreme.devextremeStrings.svg_
import typings.devextreme.mod.DevExpress.core.DxElement_
import typings.devextreme.mod.DevExpress.data.DataSource
import typings.devextreme.mod.DevExpress.events.ChangedOptionInfo
import typings.devextreme.mod.DevExpress.events.EventInfo
import typings.devextreme.mod.DevExpress.events.InitializedEventInfo
import typings.devextreme.mod.DevExpress.ui.dxDiagram.DiagramExportFormat
import typings.devextreme.mod.DevExpress.ui.dxDiagram.Item
import typings.std.HTMLElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait dxDiagram
  extends StObject
     with Widget[dxDiagramOptions] {
  
  /**
    * Exports the diagram data to a JSON object.
    */
  def `export`(): String = js.native
  
  /**
    * Exports the diagram to an image format.
    */
  def exportTo(format: DiagramExportFormat, callback: js.Function): Unit = js.native
  
  /**
    * Fits the diagram content into the work area. The maximum scale is 100%.
    */
  def fitToContent(): Unit = js.native
  
  /**
    * Fits the diagram content&apos;s width into the work area width. The maximum scale is 100%.
    */
  def fitToWidth(): Unit = js.native
  
  /**
    * Returns the DataSource instance.
    */
  def getEdgeDataSource(): DataSource[Any, Any] = js.native
  
  /**
    * Returns a shape or connector object specified by its internal identifier.
    */
  def getItemById(id: String): Item = js.native
  
  /**
    * Returns a shape or connector object specified by its key.
    */
  def getItemByKey(key: js.Object): Item = js.native
  
  /**
    * Returns an array of diagram items.
    */
  def getItems(): js.Array[Item] = js.native
  
  /**
    * Gets the DataSource instance.
    */
  def getNodeDataSource(): DataSource[Any, Any] = js.native
  
  /**
    * Returns an array of selected diagram items.
    */
  def getSelectedItems(): js.Array[Item] = js.native
  
  /**
    * Imports the diagram data.
    */
  def `import`(data: String): Unit = js.native
  def `import`(data: String, updateExistingItemsOnly: Boolean): Unit = js.native
  
  /**
    * Scrolls the view area to the specified item.
    */
  def scrollToItem(item: Item): Unit = js.native
  
  /**
    * Selects the specified items.
    */
  def setSelectedItems(items: js.Array[Item]): Unit = js.native
  
  /**
    * Updates the diagram toolboxes.
    */
  def updateToolbox(): Unit = js.native
}
object dxDiagram {
  
  type ContentReadyEvent = EventInfo[dxDiagram]
  
  trait CustomCommandEvent extends StObject {
    
    val component: dxDiagram
    
    val element: DxElement_[HTMLElement]
    
    val name: String
  }
  object CustomCommandEvent {
    
    inline def apply(component: dxDiagram, element: DxElement_[HTMLElement], name: String): CustomCommandEvent = {
      val __obj = js.Dynamic.literal(component = component.asInstanceOf[js.Any], element = element.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
      __obj.asInstanceOf[CustomCommandEvent]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: CustomCommandEvent] (val x: Self) extends AnyVal {
      
      inline def setComponent(value: dxDiagram): Self = StObject.set(x, "component", value.asInstanceOf[js.Any])
      
      inline def setElement(value: DxElement_[HTMLElement]): Self = StObject.set(x, "element", value.asInstanceOf[js.Any])
      
      inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    }
  }
  
  trait CustomShapeTemplateData extends StObject {
    
    val item: dxDiagramShape
  }
  object CustomShapeTemplateData {
    
    inline def apply(item: dxDiagramShape): CustomShapeTemplateData = {
      val __obj = js.Dynamic.literal(item = item.asInstanceOf[js.Any])
      __obj.asInstanceOf[CustomShapeTemplateData]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: CustomShapeTemplateData] (val x: Self) extends AnyVal {
      
      inline def setItem(value: dxDiagramShape): Self = StObject.set(x, "item", value.asInstanceOf[js.Any])
    }
  }
  
  trait CustomShapeToolboxTemplateData extends StObject {
    
    val item: dxDiagramShape
  }
  object CustomShapeToolboxTemplateData {
    
    inline def apply(item: dxDiagramShape): CustomShapeToolboxTemplateData = {
      val __obj = js.Dynamic.literal(item = item.asInstanceOf[js.Any])
      __obj.asInstanceOf[CustomShapeToolboxTemplateData]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: CustomShapeToolboxTemplateData] (val x: Self) extends AnyVal {
      
      inline def setItem(value: dxDiagramShape): Self = StObject.set(x, "item", value.asInstanceOf[js.Any])
    }
  }
  
  /* Rewritten from type alias, can be one of: 
    - typings.devextreme.devextremeStrings.fitContent
    - typings.devextreme.devextremeStrings.fitWidth
    - typings.devextreme.devextremeStrings.disabled
  */
  trait DiagramAutoZoomMode extends StObject
  object DiagramAutoZoomMode {
    
    inline def disabled: typings.devextreme.devextremeStrings.disabled = "disabled".asInstanceOf[typings.devextreme.devextremeStrings.disabled]
    
    inline def fitContent: typings.devextreme.devextremeStrings.fitContent = "fitContent".asInstanceOf[typings.devextreme.devextremeStrings.fitContent]
    
    inline def fitWidth: typings.devextreme.devextremeStrings.fitWidth = "fitWidth".asInstanceOf[typings.devextreme.devextremeStrings.fitWidth]
  }
  
  /* Rewritten from type alias, can be one of: 
    - typings.devextreme.devextremeStrings.separator
    - typings.devextreme.devextremeStrings.exportSvg
    - typings.devextreme.devextremeStrings.exportPng
    - typings.devextreme.devextremeStrings.exportJpg
    - typings.devextreme.devextremeStrings.undo
    - typings.devextreme.devextremeStrings.redo
    - typings.devextreme.devextremeStrings.cut
    - typings.devextreme.devextremeStrings.copy
    - typings.devextreme.devextremeStrings.paste
    - typings.devextreme.devextremeStrings.selectAll
    - typings.devextreme.devextremeStrings.delete
    - typings.devextreme.devextremeStrings.fontName
    - typings.devextreme.devextremeStrings.fontSize
    - typings.devextreme.devextremeStrings.bold
    - typings.devextreme.devextremeStrings.italic
    - typings.devextreme.devextremeStrings.underline
    - typings.devextreme.devextremeStrings.fontColor
    - typings.devextreme.devextremeStrings.lineStyle
    - typings.devextreme.devextremeStrings.lineWidth
    - typings.devextreme.devextremeStrings.lineColor
    - typings.devextreme.devextremeStrings.fillColor
    - typings.devextreme.devextremeStrings.textAlignLeft
    - typings.devextreme.devextremeStrings.textAlignCenter
    - typings.devextreme.devextremeStrings.textAlignRight
    - typings.devextreme.devextremeStrings.lock
    - typings.devextreme.devextremeStrings.unlock
    - typings.devextreme.devextremeStrings.sendToBack
    - typings.devextreme.devextremeStrings.bringToFront
    - typings.devextreme.devextremeStrings.insertShapeImage
    - typings.devextreme.devextremeStrings.editShapeImage
    - typings.devextreme.devextremeStrings.deleteShapeImage
    - typings.devextreme.devextremeStrings.connectorLineType
    - typings.devextreme.devextremeStrings.connectorLineStart
    - typings.devextreme.devextremeStrings.connectorLineEnd
    - typings.devextreme.devextremeStrings.layoutTreeTopToBottom
    - typings.devextreme.devextremeStrings.layoutTreeBottomToTop
    - typings.devextreme.devextremeStrings.layoutTreeLeftToRight
    - typings.devextreme.devextremeStrings.layoutTreeRightToLeft
    - typings.devextreme.devextremeStrings.layoutLayeredTopToBottom
    - typings.devextreme.devextremeStrings.layoutLayeredBottomToTop
    - typings.devextreme.devextremeStrings.layoutLayeredLeftToRight
    - typings.devextreme.devextremeStrings.layoutLayeredRightToLeft
    - typings.devextreme.devextremeStrings.fullScreen
    - typings.devextreme.devextremeStrings.zoomLevel
    - typings.devextreme.devextremeStrings.showGrid
    - typings.devextreme.devextremeStrings.snapToGrid
    - typings.devextreme.devextremeStrings.gridSize
    - typings.devextreme.devextremeStrings.units
    - typings.devextreme.devextremeStrings.pageSize
    - typings.devextreme.devextremeStrings.pageOrientation
    - typings.devextreme.devextremeStrings.pageColor
    - typings.devextreme.devextremeStrings.simpleView
    - typings.devextreme.devextremeStrings.toolbox
  */
  trait DiagramCommand extends StObject
  object DiagramCommand {
    
    inline def bold: typings.devextreme.devextremeStrings.bold = "bold".asInstanceOf[typings.devextreme.devextremeStrings.bold]
    
    inline def bringToFront: typings.devextreme.devextremeStrings.bringToFront = "bringToFront".asInstanceOf[typings.devextreme.devextremeStrings.bringToFront]
    
    inline def connectorLineEnd: typings.devextreme.devextremeStrings.connectorLineEnd = "connectorLineEnd".asInstanceOf[typings.devextreme.devextremeStrings.connectorLineEnd]
    
    inline def connectorLineStart: typings.devextreme.devextremeStrings.connectorLineStart = "connectorLineStart".asInstanceOf[typings.devextreme.devextremeStrings.connectorLineStart]
    
    inline def connectorLineType: typings.devextreme.devextremeStrings.connectorLineType = "connectorLineType".asInstanceOf[typings.devextreme.devextremeStrings.connectorLineType]
    
    inline def copy: typings.devextreme.devextremeStrings.copy = "copy".asInstanceOf[typings.devextreme.devextremeStrings.copy]
    
    inline def cut: typings.devextreme.devextremeStrings.cut = "cut".asInstanceOf[typings.devextreme.devextremeStrings.cut]
    
    inline def delete: typings.devextreme.devextremeStrings.delete = "delete".asInstanceOf[typings.devextreme.devextremeStrings.delete]
    
    inline def deleteShapeImage: typings.devextreme.devextremeStrings.deleteShapeImage = "deleteShapeImage".asInstanceOf[typings.devextreme.devextremeStrings.deleteShapeImage]
    
    inline def editShapeImage: typings.devextreme.devextremeStrings.editShapeImage = "editShapeImage".asInstanceOf[typings.devextreme.devextremeStrings.editShapeImage]
    
    inline def exportJpg: typings.devextreme.devextremeStrings.exportJpg = "exportJpg".asInstanceOf[typings.devextreme.devextremeStrings.exportJpg]
    
    inline def exportPng: typings.devextreme.devextremeStrings.exportPng = "exportPng".asInstanceOf[typings.devextreme.devextremeStrings.exportPng]
    
    inline def exportSvg: typings.devextreme.devextremeStrings.exportSvg = "exportSvg".asInstanceOf[typings.devextreme.devextremeStrings.exportSvg]
    
    inline def fillColor: typings.devextreme.devextremeStrings.fillColor = "fillColor".asInstanceOf[typings.devextreme.devextremeStrings.fillColor]
    
    inline def fontColor: typings.devextreme.devextremeStrings.fontColor = "fontColor".asInstanceOf[typings.devextreme.devextremeStrings.fontColor]
    
    inline def fontName: typings.devextreme.devextremeStrings.fontName = "fontName".asInstanceOf[typings.devextreme.devextremeStrings.fontName]
    
    inline def fontSize: typings.devextreme.devextremeStrings.fontSize = "fontSize".asInstanceOf[typings.devextreme.devextremeStrings.fontSize]
    
    inline def fullScreen: typings.devextreme.devextremeStrings.fullScreen = "fullScreen".asInstanceOf[typings.devextreme.devextremeStrings.fullScreen]
    
    inline def gridSize: typings.devextreme.devextremeStrings.gridSize = "gridSize".asInstanceOf[typings.devextreme.devextremeStrings.gridSize]
    
    inline def insertShapeImage: typings.devextreme.devextremeStrings.insertShapeImage = "insertShapeImage".asInstanceOf[typings.devextreme.devextremeStrings.insertShapeImage]
    
    inline def italic: typings.devextreme.devextremeStrings.italic = "italic".asInstanceOf[typings.devextreme.devextremeStrings.italic]
    
    inline def layoutLayeredBottomToTop: typings.devextreme.devextremeStrings.layoutLayeredBottomToTop = "layoutLayeredBottomToTop".asInstanceOf[typings.devextreme.devextremeStrings.layoutLayeredBottomToTop]
    
    inline def layoutLayeredLeftToRight: typings.devextreme.devextremeStrings.layoutLayeredLeftToRight = "layoutLayeredLeftToRight".asInstanceOf[typings.devextreme.devextremeStrings.layoutLayeredLeftToRight]
    
    inline def layoutLayeredRightToLeft: typings.devextreme.devextremeStrings.layoutLayeredRightToLeft = "layoutLayeredRightToLeft".asInstanceOf[typings.devextreme.devextremeStrings.layoutLayeredRightToLeft]
    
    inline def layoutLayeredTopToBottom: typings.devextreme.devextremeStrings.layoutLayeredTopToBottom = "layoutLayeredTopToBottom".asInstanceOf[typings.devextreme.devextremeStrings.layoutLayeredTopToBottom]
    
    inline def layoutTreeBottomToTop: typings.devextreme.devextremeStrings.layoutTreeBottomToTop = "layoutTreeBottomToTop".asInstanceOf[typings.devextreme.devextremeStrings.layoutTreeBottomToTop]
    
    inline def layoutTreeLeftToRight: typings.devextreme.devextremeStrings.layoutTreeLeftToRight = "layoutTreeLeftToRight".asInstanceOf[typings.devextreme.devextremeStrings.layoutTreeLeftToRight]
    
    inline def layoutTreeRightToLeft: typings.devextreme.devextremeStrings.layoutTreeRightToLeft = "layoutTreeRightToLeft".asInstanceOf[typings.devextreme.devextremeStrings.layoutTreeRightToLeft]
    
    inline def layoutTreeTopToBottom: typings.devextreme.devextremeStrings.layoutTreeTopToBottom = "layoutTreeTopToBottom".asInstanceOf[typings.devextreme.devextremeStrings.layoutTreeTopToBottom]
    
    inline def lineColor: typings.devextreme.devextremeStrings.lineColor = "lineColor".asInstanceOf[typings.devextreme.devextremeStrings.lineColor]
    
    inline def lineStyle: typings.devextreme.devextremeStrings.lineStyle = "lineStyle".asInstanceOf[typings.devextreme.devextremeStrings.lineStyle]
    
    inline def lineWidth: typings.devextreme.devextremeStrings.lineWidth = "lineWidth".asInstanceOf[typings.devextreme.devextremeStrings.lineWidth]
    
    inline def lock: typings.devextreme.devextremeStrings.lock = "lock".asInstanceOf[typings.devextreme.devextremeStrings.lock]
    
    inline def pageColor: typings.devextreme.devextremeStrings.pageColor = "pageColor".asInstanceOf[typings.devextreme.devextremeStrings.pageColor]
    
    inline def pageOrientation: typings.devextreme.devextremeStrings.pageOrientation = "pageOrientation".asInstanceOf[typings.devextreme.devextremeStrings.pageOrientation]
    
    inline def pageSize: typings.devextreme.devextremeStrings.pageSize = "pageSize".asInstanceOf[typings.devextreme.devextremeStrings.pageSize]
    
    inline def paste: typings.devextreme.devextremeStrings.paste = "paste".asInstanceOf[typings.devextreme.devextremeStrings.paste]
    
    inline def redo: typings.devextreme.devextremeStrings.redo = "redo".asInstanceOf[typings.devextreme.devextremeStrings.redo]
    
    inline def selectAll: typings.devextreme.devextremeStrings.selectAll = "selectAll".asInstanceOf[typings.devextreme.devextremeStrings.selectAll]
    
    inline def sendToBack: typings.devextreme.devextremeStrings.sendToBack = "sendToBack".asInstanceOf[typings.devextreme.devextremeStrings.sendToBack]
    
    inline def separator: typings.devextreme.devextremeStrings.separator = "separator".asInstanceOf[typings.devextreme.devextremeStrings.separator]
    
    inline def showGrid: typings.devextreme.devextremeStrings.showGrid = "showGrid".asInstanceOf[typings.devextreme.devextremeStrings.showGrid]
    
    inline def simpleView: typings.devextreme.devextremeStrings.simpleView = "simpleView".asInstanceOf[typings.devextreme.devextremeStrings.simpleView]
    
    inline def snapToGrid: typings.devextreme.devextremeStrings.snapToGrid = "snapToGrid".asInstanceOf[typings.devextreme.devextremeStrings.snapToGrid]
    
    inline def textAlignCenter: typings.devextreme.devextremeStrings.textAlignCenter = "textAlignCenter".asInstanceOf[typings.devextreme.devextremeStrings.textAlignCenter]
    
    inline def textAlignLeft: typings.devextreme.devextremeStrings.textAlignLeft = "textAlignLeft".asInstanceOf[typings.devextreme.devextremeStrings.textAlignLeft]
    
    inline def textAlignRight: typings.devextreme.devextremeStrings.textAlignRight = "textAlignRight".asInstanceOf[typings.devextreme.devextremeStrings.textAlignRight]
    
    inline def toolbox: typings.devextreme.devextremeStrings.toolbox = "toolbox".asInstanceOf[typings.devextreme.devextremeStrings.toolbox]
    
    inline def underline: typings.devextreme.devextremeStrings.underline = "underline".asInstanceOf[typings.devextreme.devextremeStrings.underline]
    
    inline def undo: typings.devextreme.devextremeStrings.undo = "undo".asInstanceOf[typings.devextreme.devextremeStrings.undo]
    
    inline def units: typings.devextreme.devextremeStrings.units = "units".asInstanceOf[typings.devextreme.devextremeStrings.units]
    
    inline def unlock: typings.devextreme.devextremeStrings.unlock = "unlock".asInstanceOf[typings.devextreme.devextremeStrings.unlock]
    
    inline def zoomLevel: typings.devextreme.devextremeStrings.zoomLevel = "zoomLevel".asInstanceOf[typings.devextreme.devextremeStrings.zoomLevel]
  }
  
  /* Rewritten from type alias, can be one of: 
    - typings.devextreme.devextremeStrings.none
    - typings.devextreme.devextremeStrings.arrow
    - typings.devextreme.devextremeStrings.outlinedTriangle
    - typings.devextreme.devextremeStrings.filledTriangle
  */
  trait DiagramConnectorLineEnd extends StObject
  object DiagramConnectorLineEnd {
    
    inline def arrow: typings.devextreme.devextremeStrings.arrow = "arrow".asInstanceOf[typings.devextreme.devextremeStrings.arrow]
    
    inline def filledTriangle: typings.devextreme.devextremeStrings.filledTriangle = "filledTriangle".asInstanceOf[typings.devextreme.devextremeStrings.filledTriangle]
    
    inline def none: typings.devextreme.devextremeStrings.none = "none".asInstanceOf[typings.devextreme.devextremeStrings.none]
    
    inline def outlinedTriangle: typings.devextreme.devextremeStrings.outlinedTriangle = "outlinedTriangle".asInstanceOf[typings.devextreme.devextremeStrings.outlinedTriangle]
  }
  
  /* Rewritten from type alias, can be one of: 
    - typings.devextreme.devextremeStrings.straight
    - typings.devextreme.devextremeStrings.orthogonal
  */
  trait DiagramConnectorLineType extends StObject
  object DiagramConnectorLineType {
    
    inline def orthogonal: typings.devextreme.devextremeStrings.orthogonal = "orthogonal".asInstanceOf[typings.devextreme.devextremeStrings.orthogonal]
    
    inline def straight: typings.devextreme.devextremeStrings.straight = "straight".asInstanceOf[typings.devextreme.devextremeStrings.straight]
  }
  
  /* Rewritten from type alias, can be one of: 
    - typings.devextreme.devextremeStrings.start
    - typings.devextreme.devextremeStrings.end
  */
  trait DiagramConnectorPosition extends StObject
  object DiagramConnectorPosition {
    
    inline def end: typings.devextreme.devextremeStrings.end = "end".asInstanceOf[typings.devextreme.devextremeStrings.end]
    
    inline def start: typings.devextreme.devextremeStrings.start = "start".asInstanceOf[typings.devextreme.devextremeStrings.start]
  }
  
  /* Rewritten from type alias, can be one of: 
    - typings.devextreme.devextremeStrings.auto
    - typings.devextreme.devextremeStrings.off
    - typings.devextreme.devextremeStrings.tree
    - typings.devextreme.devextremeStrings.layered
  */
  trait DiagramDataLayoutType extends StObject
  object DiagramDataLayoutType {
    
    inline def auto: typings.devextreme.devextremeStrings.auto = "auto".asInstanceOf[typings.devextreme.devextremeStrings.auto]
    
    inline def layered: typings.devextreme.devextremeStrings.layered = "layered".asInstanceOf[typings.devextreme.devextremeStrings.layered]
    
    inline def off: typings.devextreme.devextremeStrings.off = "off".asInstanceOf[typings.devextreme.devextremeStrings.off]
    
    inline def tree: typings.devextreme.devextremeStrings.tree = "tree".asInstanceOf[typings.devextreme.devextremeStrings.tree]
  }
  
  /* Rewritten from type alias, can be one of: 
    - typings.devextreme.devextremeStrings.svg_
    - typings.devextreme.devextremeStrings.png_
    - typings.devextreme.devextremeStrings.jpg
  */
  trait DiagramExportFormat extends StObject
  object DiagramExportFormat {
    
    inline def jpg: typings.devextreme.devextremeStrings.jpg = "jpg".asInstanceOf[typings.devextreme.devextremeStrings.jpg]
    
    inline def png: png_ = "png".asInstanceOf[png_]
    
    inline def svg: svg_ = "svg".asInstanceOf[svg_]
  }
  
  /* Rewritten from type alias, can be one of: 
    - typings.devextreme.devextremeStrings.shape
    - typings.devextreme.devextremeStrings.connector
  */
  trait DiagramItemType extends StObject
  object DiagramItemType {
    
    inline def connector: typings.devextreme.devextremeStrings.connector = "connector".asInstanceOf[typings.devextreme.devextremeStrings.connector]
    
    inline def shape: typings.devextreme.devextremeStrings.shape = "shape".asInstanceOf[typings.devextreme.devextremeStrings.shape]
  }
  
  /* Rewritten from type alias, can be one of: 
    - typings.devextreme.devextremeStrings.auto
    - typings.devextreme.devextremeStrings.visible
    - typings.devextreme.devextremeStrings.collapsed
    - typings.devextreme.devextremeStrings.disabled
  */
  trait DiagramPanelVisibility extends StObject
  object DiagramPanelVisibility {
    
    inline def auto: typings.devextreme.devextremeStrings.auto = "auto".asInstanceOf[typings.devextreme.devextremeStrings.auto]
    
    inline def collapsed: typings.devextreme.devextremeStrings.collapsed = "collapsed".asInstanceOf[typings.devextreme.devextremeStrings.collapsed]
    
    inline def disabled: typings.devextreme.devextremeStrings.disabled = "disabled".asInstanceOf[typings.devextreme.devextremeStrings.disabled]
    
    inline def visible: typings.devextreme.devextremeStrings.visible = "visible".asInstanceOf[typings.devextreme.devextremeStrings.visible]
  }
  
  /* Rewritten from type alias, can be one of: 
    - typings.devextreme.devextremeStrings.checkUIElementAvailability
    - typings.devextreme.devextremeStrings.modelModification
  */
  trait DiagramRequestEditOperationReason extends StObject
  object DiagramRequestEditOperationReason {
    
    inline def checkUIElementAvailability: typings.devextreme.devextremeStrings.checkUIElementAvailability = "checkUIElementAvailability".asInstanceOf[typings.devextreme.devextremeStrings.checkUIElementAvailability]
    
    inline def modelModification: typings.devextreme.devextremeStrings.modelModification = "modelModification".asInstanceOf[typings.devextreme.devextremeStrings.modelModification]
  }
  
  /* Rewritten from type alias, can be one of: 
    - typings.devextreme.devextremeStrings.general
    - typings.devextreme.devextremeStrings.flowchart
    - typings.devextreme.devextremeStrings.orgChart
    - typings.devextreme.devextremeStrings.containers
    - typings.devextreme.devextremeStrings.custom
  */
  trait DiagramShapeCategory extends StObject
  object DiagramShapeCategory {
    
    inline def containers: typings.devextreme.devextremeStrings.containers = "containers".asInstanceOf[typings.devextreme.devextremeStrings.containers]
    
    inline def custom: typings.devextreme.devextremeStrings.custom = "custom".asInstanceOf[typings.devextreme.devextremeStrings.custom]
    
    inline def flowchart: typings.devextreme.devextremeStrings.flowchart = "flowchart".asInstanceOf[typings.devextreme.devextremeStrings.flowchart]
    
    inline def general: typings.devextreme.devextremeStrings.general = "general".asInstanceOf[typings.devextreme.devextremeStrings.general]
    
    inline def orgChart: typings.devextreme.devextremeStrings.orgChart = "orgChart".asInstanceOf[typings.devextreme.devextremeStrings.orgChart]
  }
  
  /* Rewritten from type alias, can be one of: 
    - typings.devextreme.devextremeStrings.text
    - typings.devextreme.devextremeStrings.rectangle
    - typings.devextreme.devextremeStrings.ellipse
    - typings.devextreme.devextremeStrings.cross
    - typings.devextreme.devextremeStrings.triangle
    - typings.devextreme.devextremeStrings.diamond
    - typings.devextreme.devextremeStrings.heart
    - typings.devextreme.devextremeStrings.pentagon
    - typings.devextreme.devextremeStrings.hexagon
    - typings.devextreme.devextremeStrings.octagon
    - typings.devextreme.devextremeStrings.star
    - typings.devextreme.devextremeStrings.arrowLeft
    - typings.devextreme.devextremeStrings.arrowTop
    - typings.devextreme.devextremeStrings.arrowRight
    - typings.devextreme.devextremeStrings.arrowBottom
    - typings.devextreme.devextremeStrings.arrowNorthSouth
    - typings.devextreme.devextremeStrings.arrowEastWest
    - typings.devextreme.devextremeStrings.process
    - typings.devextreme.devextremeStrings.decision
    - typings.devextreme.devextremeStrings.terminator
    - typings.devextreme.devextremeStrings.predefinedProcess
    - typings.devextreme.devextremeStrings.document
    - typings.devextreme.devextremeStrings.multipleDocuments
    - typings.devextreme.devextremeStrings.manualInput
    - typings.devextreme.devextremeStrings.preparation
    - typings.devextreme.devextremeStrings.data
    - typings.devextreme.devextremeStrings.database
    - typings.devextreme.devextremeStrings.hardDisk
    - typings.devextreme.devextremeStrings.internalStorage
    - typings.devextreme.devextremeStrings.paperTape
    - typings.devextreme.devextremeStrings.manualOperation
    - typings.devextreme.devextremeStrings.delay
    - typings.devextreme.devextremeStrings.storedData
    - typings.devextreme.devextremeStrings.display
    - typings.devextreme.devextremeStrings.merge_
    - typings.devextreme.devextremeStrings.connector
    - typings.devextreme.devextremeStrings.or
    - typings.devextreme.devextremeStrings.summingJunction
    - typings.devextreme.devextremeStrings.verticalContainer
    - typings.devextreme.devextremeStrings.horizontalContainer
    - typings.devextreme.devextremeStrings.cardWithImageOnLeft
    - typings.devextreme.devextremeStrings.cardWithImageOnTop
    - typings.devextreme.devextremeStrings.cardWithImageOnRight
  */
  trait DiagramShapeType extends StObject
  object DiagramShapeType {
    
    inline def arrowBottom: typings.devextreme.devextremeStrings.arrowBottom = "arrowBottom".asInstanceOf[typings.devextreme.devextremeStrings.arrowBottom]
    
    inline def arrowEastWest: typings.devextreme.devextremeStrings.arrowEastWest = "arrowEastWest".asInstanceOf[typings.devextreme.devextremeStrings.arrowEastWest]
    
    inline def arrowLeft: typings.devextreme.devextremeStrings.arrowLeft = "arrowLeft".asInstanceOf[typings.devextreme.devextremeStrings.arrowLeft]
    
    inline def arrowNorthSouth: typings.devextreme.devextremeStrings.arrowNorthSouth = "arrowNorthSouth".asInstanceOf[typings.devextreme.devextremeStrings.arrowNorthSouth]
    
    inline def arrowRight: typings.devextreme.devextremeStrings.arrowRight = "arrowRight".asInstanceOf[typings.devextreme.devextremeStrings.arrowRight]
    
    inline def arrowTop: typings.devextreme.devextremeStrings.arrowTop = "arrowTop".asInstanceOf[typings.devextreme.devextremeStrings.arrowTop]
    
    inline def cardWithImageOnLeft: typings.devextreme.devextremeStrings.cardWithImageOnLeft = "cardWithImageOnLeft".asInstanceOf[typings.devextreme.devextremeStrings.cardWithImageOnLeft]
    
    inline def cardWithImageOnRight: typings.devextreme.devextremeStrings.cardWithImageOnRight = "cardWithImageOnRight".asInstanceOf[typings.devextreme.devextremeStrings.cardWithImageOnRight]
    
    inline def cardWithImageOnTop: typings.devextreme.devextremeStrings.cardWithImageOnTop = "cardWithImageOnTop".asInstanceOf[typings.devextreme.devextremeStrings.cardWithImageOnTop]
    
    inline def connector: typings.devextreme.devextremeStrings.connector = "connector".asInstanceOf[typings.devextreme.devextremeStrings.connector]
    
    inline def cross: typings.devextreme.devextremeStrings.cross = "cross".asInstanceOf[typings.devextreme.devextremeStrings.cross]
    
    inline def data: typings.devextreme.devextremeStrings.data = "data".asInstanceOf[typings.devextreme.devextremeStrings.data]
    
    inline def database: typings.devextreme.devextremeStrings.database = "database".asInstanceOf[typings.devextreme.devextremeStrings.database]
    
    inline def decision: typings.devextreme.devextremeStrings.decision = "decision".asInstanceOf[typings.devextreme.devextremeStrings.decision]
    
    inline def delay: typings.devextreme.devextremeStrings.delay = "delay".asInstanceOf[typings.devextreme.devextremeStrings.delay]
    
    inline def diamond: typings.devextreme.devextremeStrings.diamond = "diamond".asInstanceOf[typings.devextreme.devextremeStrings.diamond]
    
    inline def display: typings.devextreme.devextremeStrings.display = "display".asInstanceOf[typings.devextreme.devextremeStrings.display]
    
    inline def document: typings.devextreme.devextremeStrings.document = "document".asInstanceOf[typings.devextreme.devextremeStrings.document]
    
    inline def ellipse: typings.devextreme.devextremeStrings.ellipse = "ellipse".asInstanceOf[typings.devextreme.devextremeStrings.ellipse]
    
    inline def hardDisk: typings.devextreme.devextremeStrings.hardDisk = "hardDisk".asInstanceOf[typings.devextreme.devextremeStrings.hardDisk]
    
    inline def heart: typings.devextreme.devextremeStrings.heart = "heart".asInstanceOf[typings.devextreme.devextremeStrings.heart]
    
    inline def hexagon: typings.devextreme.devextremeStrings.hexagon = "hexagon".asInstanceOf[typings.devextreme.devextremeStrings.hexagon]
    
    inline def horizontalContainer: typings.devextreme.devextremeStrings.horizontalContainer = "horizontalContainer".asInstanceOf[typings.devextreme.devextremeStrings.horizontalContainer]
    
    inline def internalStorage: typings.devextreme.devextremeStrings.internalStorage = "internalStorage".asInstanceOf[typings.devextreme.devextremeStrings.internalStorage]
    
    inline def manualInput: typings.devextreme.devextremeStrings.manualInput = "manualInput".asInstanceOf[typings.devextreme.devextremeStrings.manualInput]
    
    inline def manualOperation: typings.devextreme.devextremeStrings.manualOperation = "manualOperation".asInstanceOf[typings.devextreme.devextremeStrings.manualOperation]
    
    inline def merge: merge_ = "merge".asInstanceOf[merge_]
    
    inline def multipleDocuments: typings.devextreme.devextremeStrings.multipleDocuments = "multipleDocuments".asInstanceOf[typings.devextreme.devextremeStrings.multipleDocuments]
    
    inline def octagon: typings.devextreme.devextremeStrings.octagon = "octagon".asInstanceOf[typings.devextreme.devextremeStrings.octagon]
    
    inline def or: typings.devextreme.devextremeStrings.or = "or".asInstanceOf[typings.devextreme.devextremeStrings.or]
    
    inline def paperTape: typings.devextreme.devextremeStrings.paperTape = "paperTape".asInstanceOf[typings.devextreme.devextremeStrings.paperTape]
    
    inline def pentagon: typings.devextreme.devextremeStrings.pentagon = "pentagon".asInstanceOf[typings.devextreme.devextremeStrings.pentagon]
    
    inline def predefinedProcess: typings.devextreme.devextremeStrings.predefinedProcess = "predefinedProcess".asInstanceOf[typings.devextreme.devextremeStrings.predefinedProcess]
    
    inline def preparation: typings.devextreme.devextremeStrings.preparation = "preparation".asInstanceOf[typings.devextreme.devextremeStrings.preparation]
    
    inline def process: typings.devextreme.devextremeStrings.process = "process".asInstanceOf[typings.devextreme.devextremeStrings.process]
    
    inline def rectangle: typings.devextreme.devextremeStrings.rectangle = "rectangle".asInstanceOf[typings.devextreme.devextremeStrings.rectangle]
    
    inline def star: typings.devextreme.devextremeStrings.star = "star".asInstanceOf[typings.devextreme.devextremeStrings.star]
    
    inline def storedData: typings.devextreme.devextremeStrings.storedData = "storedData".asInstanceOf[typings.devextreme.devextremeStrings.storedData]
    
    inline def summingJunction: typings.devextreme.devextremeStrings.summingJunction = "summingJunction".asInstanceOf[typings.devextreme.devextremeStrings.summingJunction]
    
    inline def terminator: typings.devextreme.devextremeStrings.terminator = "terminator".asInstanceOf[typings.devextreme.devextremeStrings.terminator]
    
    inline def text: typings.devextreme.devextremeStrings.text = "text".asInstanceOf[typings.devextreme.devextremeStrings.text]
    
    inline def triangle: typings.devextreme.devextremeStrings.triangle = "triangle".asInstanceOf[typings.devextreme.devextremeStrings.triangle]
    
    inline def verticalContainer: typings.devextreme.devextremeStrings.verticalContainer = "verticalContainer".asInstanceOf[typings.devextreme.devextremeStrings.verticalContainer]
  }
  
  /* Rewritten from type alias, can be one of: 
    - typings.devextreme.devextremeStrings.icons
    - typings.devextreme.devextremeStrings.texts
  */
  trait DiagramToolboxDisplayMode extends StObject
  object DiagramToolboxDisplayMode {
    
    inline def icons: typings.devextreme.devextremeStrings.icons = "icons".asInstanceOf[typings.devextreme.devextremeStrings.icons]
    
    inline def texts: typings.devextreme.devextremeStrings.texts = "texts".asInstanceOf[typings.devextreme.devextremeStrings.texts]
  }
  
  /* Rewritten from type alias, can be one of: 
    - typings.devextreme.devextremeStrings.in
    - typings.devextreme.devextremeStrings.cm
    - typings.devextreme.devextremeStrings.px
  */
  trait DiagramUnits extends StObject
  object DiagramUnits {
    
    inline def cm: typings.devextreme.devextremeStrings.cm = "cm".asInstanceOf[typings.devextreme.devextremeStrings.cm]
    
    inline def in: typings.devextreme.devextremeStrings.in = "in".asInstanceOf[typings.devextreme.devextremeStrings.in]
    
    inline def px: typings.devextreme.devextremeStrings.px = "px".asInstanceOf[typings.devextreme.devextremeStrings.px]
  }
  
  type DisposingEvent = EventInfo[dxDiagram]
  
  type InitializedEvent = InitializedEventInfo[dxDiagram]
  
  type Item = dxDiagramItem
  
  trait ItemClickEvent
    extends StObject
       with EventInfo[dxDiagram] {
    
    val item: Item
  }
  object ItemClickEvent {
    
    inline def apply(component: dxDiagram, element: DxElement_[HTMLElement], item: Item): ItemClickEvent = {
      val __obj = js.Dynamic.literal(component = component.asInstanceOf[js.Any], element = element.asInstanceOf[js.Any], item = item.asInstanceOf[js.Any])
      __obj.asInstanceOf[ItemClickEvent]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: ItemClickEvent] (val x: Self) extends AnyVal {
      
      inline def setItem(value: Item): Self = StObject.set(x, "item", value.asInstanceOf[js.Any])
    }
  }
  
  trait ItemDblClickEvent
    extends StObject
       with EventInfo[dxDiagram] {
    
    val item: Item
  }
  object ItemDblClickEvent {
    
    inline def apply(component: dxDiagram, element: DxElement_[HTMLElement], item: Item): ItemDblClickEvent = {
      val __obj = js.Dynamic.literal(component = component.asInstanceOf[js.Any], element = element.asInstanceOf[js.Any], item = item.asInstanceOf[js.Any])
      __obj.asInstanceOf[ItemDblClickEvent]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: ItemDblClickEvent] (val x: Self) extends AnyVal {
      
      inline def setItem(value: Item): Self = StObject.set(x, "item", value.asInstanceOf[js.Any])
    }
  }
  
  trait OptionChangedEvent
    extends StObject
       with EventInfo[dxDiagram]
       with ChangedOptionInfo
  object OptionChangedEvent {
    
    inline def apply(component: dxDiagram, element: DxElement_[HTMLElement], fullName: String, name: String): OptionChangedEvent = {
      val __obj = js.Dynamic.literal(component = component.asInstanceOf[js.Any], element = element.asInstanceOf[js.Any], fullName = fullName.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
      __obj.asInstanceOf[OptionChangedEvent]
    }
  }
  
  type Properties = dxDiagramOptions
  
  trait RequestEditOperationEvent
    extends StObject
       with EventInfo[dxDiagram] {
    
    var allowed: js.UndefOr[Boolean] = js.undefined
    
    val args: dxDiagramAddShapeArgs | dxDiagramAddShapeFromToolboxArgs | dxDiagramDeleteShapeArgs | dxDiagramDeleteConnectorArgs | dxDiagramChangeConnectionArgs | dxDiagramChangeConnectorPointsArgs | dxDiagramBeforeChangeShapeTextArgs | dxDiagramChangeShapeTextArgs | dxDiagramBeforeChangeConnectorTextArgs | dxDiagramChangeConnectorTextArgs | dxDiagramResizeShapeArgs | dxDiagramMoveShapeArgs
    
    val operation: addShape | addShapeFromToolbox | deleteShape | deleteConnector | changeConnection | changeConnectorPoints
    
    val reason: DiagramRequestEditOperationReason
  }
  object RequestEditOperationEvent {
    
    inline def apply(
      args: dxDiagramAddShapeArgs | dxDiagramAddShapeFromToolboxArgs | dxDiagramDeleteShapeArgs | dxDiagramDeleteConnectorArgs | dxDiagramChangeConnectionArgs | dxDiagramChangeConnectorPointsArgs | dxDiagramBeforeChangeShapeTextArgs | dxDiagramChangeShapeTextArgs | dxDiagramBeforeChangeConnectorTextArgs | dxDiagramChangeConnectorTextArgs | dxDiagramResizeShapeArgs | dxDiagramMoveShapeArgs,
      component: dxDiagram,
      element: DxElement_[HTMLElement],
      operation: addShape | addShapeFromToolbox | deleteShape | deleteConnector | changeConnection | changeConnectorPoints,
      reason: DiagramRequestEditOperationReason
    ): RequestEditOperationEvent = {
      val __obj = js.Dynamic.literal(args = args.asInstanceOf[js.Any], component = component.asInstanceOf[js.Any], element = element.asInstanceOf[js.Any], operation = operation.asInstanceOf[js.Any], reason = reason.asInstanceOf[js.Any])
      __obj.asInstanceOf[RequestEditOperationEvent]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: RequestEditOperationEvent] (val x: Self) extends AnyVal {
      
      inline def setAllowed(value: Boolean): Self = StObject.set(x, "allowed", value.asInstanceOf[js.Any])
      
      inline def setAllowedUndefined: Self = StObject.set(x, "allowed", js.undefined)
      
      inline def setArgs(
        value: dxDiagramAddShapeArgs | dxDiagramAddShapeFromToolboxArgs | dxDiagramDeleteShapeArgs | dxDiagramDeleteConnectorArgs | dxDiagramChangeConnectionArgs | dxDiagramChangeConnectorPointsArgs | dxDiagramBeforeChangeShapeTextArgs | dxDiagramChangeShapeTextArgs | dxDiagramBeforeChangeConnectorTextArgs | dxDiagramChangeConnectorTextArgs | dxDiagramResizeShapeArgs | dxDiagramMoveShapeArgs
      ): Self = StObject.set(x, "args", value.asInstanceOf[js.Any])
      
      inline def setOperation(
        value: addShape | addShapeFromToolbox | deleteShape | deleteConnector | changeConnection | changeConnectorPoints
      ): Self = StObject.set(x, "operation", value.asInstanceOf[js.Any])
      
      inline def setReason(value: DiagramRequestEditOperationReason): Self = StObject.set(x, "reason", value.asInstanceOf[js.Any])
    }
  }
  
  trait RequestLayoutUpdateEvent
    extends StObject
       with EventInfo[dxDiagram] {
    
    var allowed: js.UndefOr[Boolean] = js.undefined
    
    val changes: js.Array[Any]
  }
  object RequestLayoutUpdateEvent {
    
    inline def apply(changes: js.Array[Any], component: dxDiagram, element: DxElement_[HTMLElement]): RequestLayoutUpdateEvent = {
      val __obj = js.Dynamic.literal(changes = changes.asInstanceOf[js.Any], component = component.asInstanceOf[js.Any], element = element.asInstanceOf[js.Any])
      __obj.asInstanceOf[RequestLayoutUpdateEvent]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: RequestLayoutUpdateEvent] (val x: Self) extends AnyVal {
      
      inline def setAllowed(value: Boolean): Self = StObject.set(x, "allowed", value.asInstanceOf[js.Any])
      
      inline def setAllowedUndefined: Self = StObject.set(x, "allowed", js.undefined)
      
      inline def setChanges(value: js.Array[Any]): Self = StObject.set(x, "changes", value.asInstanceOf[js.Any])
      
      inline def setChangesVarargs(value: Any*): Self = StObject.set(x, "changes", js.Array(value*))
    }
  }
  
  trait SelectionChangedEvent
    extends StObject
       with EventInfo[dxDiagram] {
    
    val items: js.Array[Item]
  }
  object SelectionChangedEvent {
    
    inline def apply(component: dxDiagram, element: DxElement_[HTMLElement], items: js.Array[Item]): SelectionChangedEvent = {
      val __obj = js.Dynamic.literal(component = component.asInstanceOf[js.Any], element = element.asInstanceOf[js.Any], items = items.asInstanceOf[js.Any])
      __obj.asInstanceOf[SelectionChangedEvent]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: SelectionChangedEvent] (val x: Self) extends AnyVal {
      
      inline def setItems(value: js.Array[Item]): Self = StObject.set(x, "items", value.asInstanceOf[js.Any])
      
      inline def setItemsVarargs(value: Item*): Self = StObject.set(x, "items", js.Array(value*))
    }
  }
}
