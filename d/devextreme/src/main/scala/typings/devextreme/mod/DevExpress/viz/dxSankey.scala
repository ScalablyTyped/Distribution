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
trait dxSankey
  extends StObject
     with BaseWidget[dxSankeyOptions]
     with _VizWidget {
  
  /**
    * Gets all sankey links.
    */
  def getAllLinks(): js.Array[dxSankeyLink] = js.native
  
  /**
    * Gets all sankey nodes.
    */
  def getAllNodes(): js.Array[dxSankeyNode] = js.native
  
  def getDataSource(): DataSource[Any, Any] = js.native
  
  /**
    * Hides all UI component tooltips.
    */
  def hideTooltip(): Unit = js.native
}
object dxSankey {
  
  type DisposingEvent = EventInfo[dxSankey]
  
  type DrawnEvent = EventInfo[dxSankey]
  
  type ExportedEvent = EventInfo[dxSankey]
  
  trait ExportingEvent
    extends StObject
       with EventInfo[dxSankey]
       with ExportInfo
  object ExportingEvent {
    
    inline def apply(component: dxSankey, element: DxElement_[HTMLElement], fileName: String, format: String): ExportingEvent = {
      val __obj = js.Dynamic.literal(component = component.asInstanceOf[js.Any], element = element.asInstanceOf[js.Any], fileName = fileName.asInstanceOf[js.Any], format = format.asInstanceOf[js.Any])
      __obj.asInstanceOf[ExportingEvent]
    }
  }
  
  type FileSavingEvent = FileSavingEventInfo[dxSankey]
  
  trait IncidentOccurredEvent
    extends StObject
       with EventInfo[dxSankey]
       with IncidentInfo
  object IncidentOccurredEvent {
    
    inline def apply(component: dxSankey, element: DxElement_[HTMLElement], target: Any): IncidentOccurredEvent = {
      val __obj = js.Dynamic.literal(component = component.asInstanceOf[js.Any], element = element.asInstanceOf[js.Any], target = target.asInstanceOf[js.Any])
      __obj.asInstanceOf[IncidentOccurredEvent]
    }
  }
  
  type InitializedEvent = InitializedEventInfo[dxSankey]
  
  trait LinkClickEvent
    extends StObject
       with NativeEventInfo[dxSankey, MouseEvent | PointerEvent] {
    
    val target: dxSankeyLink
  }
  object LinkClickEvent {
    
    inline def apply(component: dxSankey, element: DxElement_[HTMLElement], target: dxSankeyLink): LinkClickEvent = {
      val __obj = js.Dynamic.literal(component = component.asInstanceOf[js.Any], element = element.asInstanceOf[js.Any], target = target.asInstanceOf[js.Any])
      __obj.asInstanceOf[LinkClickEvent]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: LinkClickEvent] (val x: Self) extends AnyVal {
      
      inline def setTarget(value: dxSankeyLink): Self = StObject.set(x, "target", value.asInstanceOf[js.Any])
    }
  }
  
  trait LinkHoverEvent
    extends StObject
       with EventInfo[dxSankey] {
    
    val target: dxSankeyLink
  }
  object LinkHoverEvent {
    
    inline def apply(component: dxSankey, element: DxElement_[HTMLElement], target: dxSankeyLink): LinkHoverEvent = {
      val __obj = js.Dynamic.literal(component = component.asInstanceOf[js.Any], element = element.asInstanceOf[js.Any], target = target.asInstanceOf[js.Any])
      __obj.asInstanceOf[LinkHoverEvent]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: LinkHoverEvent] (val x: Self) extends AnyVal {
      
      inline def setTarget(value: dxSankeyLink): Self = StObject.set(x, "target", value.asInstanceOf[js.Any])
    }
  }
  
  trait NodeClickEvent
    extends StObject
       with NativeEventInfo[dxSankey, MouseEvent | PointerEvent] {
    
    val target: dxSankeyNode
  }
  object NodeClickEvent {
    
    inline def apply(component: dxSankey, element: DxElement_[HTMLElement], target: dxSankeyNode): NodeClickEvent = {
      val __obj = js.Dynamic.literal(component = component.asInstanceOf[js.Any], element = element.asInstanceOf[js.Any], target = target.asInstanceOf[js.Any])
      __obj.asInstanceOf[NodeClickEvent]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: NodeClickEvent] (val x: Self) extends AnyVal {
      
      inline def setTarget(value: dxSankeyNode): Self = StObject.set(x, "target", value.asInstanceOf[js.Any])
    }
  }
  
  trait NodeHoverEvent
    extends StObject
       with EventInfo[dxSankey] {
    
    val target: dxSankeyNode
  }
  object NodeHoverEvent {
    
    inline def apply(component: dxSankey, element: DxElement_[HTMLElement], target: dxSankeyNode): NodeHoverEvent = {
      val __obj = js.Dynamic.literal(component = component.asInstanceOf[js.Any], element = element.asInstanceOf[js.Any], target = target.asInstanceOf[js.Any])
      __obj.asInstanceOf[NodeHoverEvent]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: NodeHoverEvent] (val x: Self) extends AnyVal {
      
      inline def setTarget(value: dxSankeyNode): Self = StObject.set(x, "target", value.asInstanceOf[js.Any])
    }
  }
  
  trait OptionChangedEvent
    extends StObject
       with EventInfo[dxSankey]
       with ChangedOptionInfo
  object OptionChangedEvent {
    
    inline def apply(component: dxSankey, element: DxElement_[HTMLElement], fullName: String, name: String): OptionChangedEvent = {
      val __obj = js.Dynamic.literal(component = component.asInstanceOf[js.Any], element = element.asInstanceOf[js.Any], fullName = fullName.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
      __obj.asInstanceOf[OptionChangedEvent]
    }
  }
  
  type Properties = dxSankeyOptions
  
  /* Rewritten from type alias, can be one of: 
    - typings.devextreme.devextremeStrings.none
    - typings.devextreme.devextremeStrings.source
    - typings.devextreme.devextremeStrings.target
    - typings.devextreme.devextremeStrings.gradient
  */
  trait SankeyColorMode extends StObject
  object SankeyColorMode {
    
    inline def gradient: typings.devextreme.devextremeStrings.gradient = "gradient".asInstanceOf[typings.devextreme.devextremeStrings.gradient]
    
    inline def none: typings.devextreme.devextremeStrings.none = "none".asInstanceOf[typings.devextreme.devextremeStrings.none]
    
    inline def source: typings.devextreme.devextremeStrings.source = "source".asInstanceOf[typings.devextreme.devextremeStrings.source]
    
    inline def target: typings.devextreme.devextremeStrings.target = "target".asInstanceOf[typings.devextreme.devextremeStrings.target]
  }
}
