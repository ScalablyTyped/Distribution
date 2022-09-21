package typings.devextreme.mod.DevExpress.viz

import typings.devextreme.mod.DevExpress.core.DxElement_
import typings.devextreme.mod.DevExpress.data.DataSource
import typings.devextreme.mod.DevExpress.events.ChangedOptionInfo
import typings.devextreme.mod.DevExpress.events.EventInfo
import typings.devextreme.mod.DevExpress.events.InitializedEventInfo
import typings.devextreme.mod.DevExpress.events.NativeEventInfo
import typings.devextreme.mod.DevExpress.viz.BaseWidget.ExportInfo
import typings.devextreme.mod.DevExpress.viz.BaseWidget.FileSavingEventInfo
import typings.devextreme.mod.DevExpress.viz.BaseWidget.IncidentInfo
import typings.std.HTMLElement
import typings.std.MouseEvent
import typings.std.PointerEvent
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait dxTreeMap
  extends StObject
     with BaseWidget[dxTreeMapOptions]
     with _VizWidget {
  
  /**
    * Deselects all nodes in the UI component.
    */
  def clearSelection(): Unit = js.native
  
  /**
    * Drills one level up.
    */
  def drillUp(): Unit = js.native
  
  /**
    * Gets the current node.
    */
  def getCurrentNode(): dxTreeMapNode = js.native
  
  def getDataSource(): DataSource[Any, Any] = js.native
  
  /**
    * Gets the root node.
    */
  def getRootNode(): dxTreeMapNode = js.native
  
  /**
    * Hides the tooltip.
    */
  def hideTooltip(): Unit = js.native
  
  /**
    * Resets the drill down level.
    */
  def resetDrillDown(): Unit = js.native
}
object dxTreeMap {
  
  trait ClickEvent
    extends StObject
       with NativeEventInfo[dxTreeMap, MouseEvent | PointerEvent] {
    
    val node: dxTreeMapNode
  }
  object ClickEvent {
    
    inline def apply(component: dxTreeMap, element: DxElement_[HTMLElement], node: dxTreeMapNode): ClickEvent = {
      val __obj = js.Dynamic.literal(component = component.asInstanceOf[js.Any], element = element.asInstanceOf[js.Any], node = node.asInstanceOf[js.Any])
      __obj.asInstanceOf[ClickEvent]
    }
    
    extension [Self <: ClickEvent](x: Self) {
      
      inline def setNode(value: dxTreeMapNode): Self = StObject.set(x, "node", value.asInstanceOf[js.Any])
    }
  }
  
  type DisposingEvent = EventInfo[dxTreeMap]
  
  type DrawnEvent = EventInfo[dxTreeMap]
  
  trait DrillEvent
    extends StObject
       with EventInfo[dxTreeMap] {
    
    val node: dxTreeMapNode
  }
  object DrillEvent {
    
    inline def apply(component: dxTreeMap, element: DxElement_[HTMLElement], node: dxTreeMapNode): DrillEvent = {
      val __obj = js.Dynamic.literal(component = component.asInstanceOf[js.Any], element = element.asInstanceOf[js.Any], node = node.asInstanceOf[js.Any])
      __obj.asInstanceOf[DrillEvent]
    }
    
    extension [Self <: DrillEvent](x: Self) {
      
      inline def setNode(value: dxTreeMapNode): Self = StObject.set(x, "node", value.asInstanceOf[js.Any])
    }
  }
  
  type ExportedEvent = EventInfo[dxTreeMap]
  
  trait ExportingEvent
    extends StObject
       with EventInfo[dxTreeMap]
       with ExportInfo
  object ExportingEvent {
    
    inline def apply(component: dxTreeMap, element: DxElement_[HTMLElement], fileName: String, format: String): ExportingEvent = {
      val __obj = js.Dynamic.literal(component = component.asInstanceOf[js.Any], element = element.asInstanceOf[js.Any], fileName = fileName.asInstanceOf[js.Any], format = format.asInstanceOf[js.Any])
      __obj.asInstanceOf[ExportingEvent]
    }
  }
  
  type FileSavingEvent = FileSavingEventInfo[dxTreeMap]
  
  trait HoverChangedEvent
    extends StObject
       with EventInfo[dxTreeMap]
       with InteractionInfo
  object HoverChangedEvent {
    
    inline def apply(component: dxTreeMap, element: DxElement_[HTMLElement], node: dxTreeMapNode): HoverChangedEvent = {
      val __obj = js.Dynamic.literal(component = component.asInstanceOf[js.Any], element = element.asInstanceOf[js.Any], node = node.asInstanceOf[js.Any])
      __obj.asInstanceOf[HoverChangedEvent]
    }
  }
  
  trait IncidentOccurredEvent
    extends StObject
       with EventInfo[dxTreeMap]
       with IncidentInfo
  object IncidentOccurredEvent {
    
    inline def apply(component: dxTreeMap, element: DxElement_[HTMLElement], target: Any): IncidentOccurredEvent = {
      val __obj = js.Dynamic.literal(component = component.asInstanceOf[js.Any], element = element.asInstanceOf[js.Any], target = target.asInstanceOf[js.Any])
      __obj.asInstanceOf[IncidentOccurredEvent]
    }
  }
  
  type InitializedEvent = InitializedEventInfo[dxTreeMap]
  
  trait InteractionInfo extends StObject {
    
    val node: dxTreeMapNode
  }
  object InteractionInfo {
    
    inline def apply(node: dxTreeMapNode): InteractionInfo = {
      val __obj = js.Dynamic.literal(node = node.asInstanceOf[js.Any])
      __obj.asInstanceOf[InteractionInfo]
    }
    
    extension [Self <: InteractionInfo](x: Self) {
      
      inline def setNode(value: dxTreeMapNode): Self = StObject.set(x, "node", value.asInstanceOf[js.Any])
    }
  }
  
  trait NodesInitializedEvent
    extends StObject
       with EventInfo[dxTreeMap] {
    
    val root: dxTreeMapNode
  }
  object NodesInitializedEvent {
    
    inline def apply(component: dxTreeMap, element: DxElement_[HTMLElement], root: dxTreeMapNode): NodesInitializedEvent = {
      val __obj = js.Dynamic.literal(component = component.asInstanceOf[js.Any], element = element.asInstanceOf[js.Any], root = root.asInstanceOf[js.Any])
      __obj.asInstanceOf[NodesInitializedEvent]
    }
    
    extension [Self <: NodesInitializedEvent](x: Self) {
      
      inline def setRoot(value: dxTreeMapNode): Self = StObject.set(x, "root", value.asInstanceOf[js.Any])
    }
  }
  
  trait NodesRenderingEvent
    extends StObject
       with EventInfo[dxTreeMap] {
    
    val node: dxTreeMapNode
  }
  object NodesRenderingEvent {
    
    inline def apply(component: dxTreeMap, element: DxElement_[HTMLElement], node: dxTreeMapNode): NodesRenderingEvent = {
      val __obj = js.Dynamic.literal(component = component.asInstanceOf[js.Any], element = element.asInstanceOf[js.Any], node = node.asInstanceOf[js.Any])
      __obj.asInstanceOf[NodesRenderingEvent]
    }
    
    extension [Self <: NodesRenderingEvent](x: Self) {
      
      inline def setNode(value: dxTreeMapNode): Self = StObject.set(x, "node", value.asInstanceOf[js.Any])
    }
  }
  
  trait OptionChangedEvent
    extends StObject
       with EventInfo[dxTreeMap]
       with ChangedOptionInfo
  object OptionChangedEvent {
    
    inline def apply(component: dxTreeMap, element: DxElement_[HTMLElement], fullName: String, name: String): OptionChangedEvent = {
      val __obj = js.Dynamic.literal(component = component.asInstanceOf[js.Any], element = element.asInstanceOf[js.Any], fullName = fullName.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
      __obj.asInstanceOf[OptionChangedEvent]
    }
  }
  
  type Properties = dxTreeMapOptions
  
  trait SelectionChangedEvent
    extends StObject
       with EventInfo[dxTreeMap]
       with InteractionInfo
  object SelectionChangedEvent {
    
    inline def apply(component: dxTreeMap, element: DxElement_[HTMLElement], node: dxTreeMapNode): SelectionChangedEvent = {
      val __obj = js.Dynamic.literal(component = component.asInstanceOf[js.Any], element = element.asInstanceOf[js.Any], node = node.asInstanceOf[js.Any])
      __obj.asInstanceOf[SelectionChangedEvent]
    }
  }
  
  /* Rewritten from type alias, can be one of: 
    - typings.devextreme.devextremeStrings.discrete
    - typings.devextreme.devextremeStrings.gradient
    - typings.devextreme.devextremeStrings.none
    - typings.devextreme.devextremeStrings.range
  */
  trait TreeMapColorizerType extends StObject
  object TreeMapColorizerType {
    
    inline def discrete: typings.devextreme.devextremeStrings.discrete = "discrete".asInstanceOf[typings.devextreme.devextremeStrings.discrete]
    
    inline def gradient: typings.devextreme.devextremeStrings.gradient = "gradient".asInstanceOf[typings.devextreme.devextremeStrings.gradient]
    
    inline def none: typings.devextreme.devextremeStrings.none = "none".asInstanceOf[typings.devextreme.devextremeStrings.none]
    
    inline def range: typings.devextreme.devextremeStrings.range = "range".asInstanceOf[typings.devextreme.devextremeStrings.range]
  }
  
  /* Rewritten from type alias, can be one of: 
    - typings.devextreme.devextremeStrings.sliceanddice
    - typings.devextreme.devextremeStrings.squarified
    - typings.devextreme.devextremeStrings.strip
  */
  trait TreeMapLayoutAlgorithm extends StObject
  object TreeMapLayoutAlgorithm {
    
    inline def sliceanddice: typings.devextreme.devextremeStrings.sliceanddice = "sliceanddice".asInstanceOf[typings.devextreme.devextremeStrings.sliceanddice]
    
    inline def squarified: typings.devextreme.devextremeStrings.squarified = "squarified".asInstanceOf[typings.devextreme.devextremeStrings.squarified]
    
    inline def strip: typings.devextreme.devextremeStrings.strip = "strip".asInstanceOf[typings.devextreme.devextremeStrings.strip]
  }
  
  /* Rewritten from type alias, can be one of: 
    - typings.devextreme.devextremeStrings.leftBottomRightTop
    - typings.devextreme.devextremeStrings.leftTopRightBottom
    - typings.devextreme.devextremeStrings.rightBottomLeftTop
    - typings.devextreme.devextremeStrings.rightTopLeftBottom
  */
  trait TreeMapLayoutDirection extends StObject
  object TreeMapLayoutDirection {
    
    inline def leftBottomRightTop: typings.devextreme.devextremeStrings.leftBottomRightTop = "leftBottomRightTop".asInstanceOf[typings.devextreme.devextremeStrings.leftBottomRightTop]
    
    inline def leftTopRightBottom: typings.devextreme.devextremeStrings.leftTopRightBottom = "leftTopRightBottom".asInstanceOf[typings.devextreme.devextremeStrings.leftTopRightBottom]
    
    inline def rightBottomLeftTop: typings.devextreme.devextremeStrings.rightBottomLeftTop = "rightBottomLeftTop".asInstanceOf[typings.devextreme.devextremeStrings.rightBottomLeftTop]
    
    inline def rightTopLeftBottom: typings.devextreme.devextremeStrings.rightTopLeftBottom = "rightTopLeftBottom".asInstanceOf[typings.devextreme.devextremeStrings.rightTopLeftBottom]
  }
}
