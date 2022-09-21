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
import typings.devextreme.mod.DevExpress.viz.dxFunnel.Item
import typings.std.HTMLElement
import typings.std.MouseEvent
import typings.std.PointerEvent
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait dxFunnel
  extends StObject
     with BaseWidget[dxFunnelOptions]
     with _VizWidget {
  
  /**
    * Cancels the selection of all funnel items.
    */
  def clearSelection(): Unit = js.native
  
  /**
    * Provides access to all funnel items.
    */
  def getAllItems(): js.Array[Item] = js.native
  
  def getDataSource(): DataSource[Any, Any] = js.native
  
  /**
    * Hides all UI component tooltips.
    */
  def hideTooltip(): Unit = js.native
}
object dxFunnel {
  
  type DisposingEvent = EventInfo[dxFunnel]
  
  type DrawnEvent = EventInfo[dxFunnel]
  
  type ExportedEvent = EventInfo[dxFunnel]
  
  trait ExportingEvent
    extends StObject
       with EventInfo[dxFunnel]
       with ExportInfo
  object ExportingEvent {
    
    inline def apply(component: dxFunnel, element: DxElement_[HTMLElement], fileName: String, format: String): ExportingEvent = {
      val __obj = js.Dynamic.literal(component = component.asInstanceOf[js.Any], element = element.asInstanceOf[js.Any], fileName = fileName.asInstanceOf[js.Any], format = format.asInstanceOf[js.Any])
      __obj.asInstanceOf[ExportingEvent]
    }
  }
  
  type FileSavingEvent = FileSavingEventInfo[dxFunnel]
  
  /* Rewritten from type alias, can be one of: 
    - typings.devextreme.devextremeStrings.dynamicHeight
    - typings.devextreme.devextremeStrings.dynamicSlope
  */
  trait FunnelAlgorithm extends StObject
  object FunnelAlgorithm {
    
    inline def dynamicHeight: typings.devextreme.devextremeStrings.dynamicHeight = "dynamicHeight".asInstanceOf[typings.devextreme.devextremeStrings.dynamicHeight]
    
    inline def dynamicSlope: typings.devextreme.devextremeStrings.dynamicSlope = "dynamicSlope".asInstanceOf[typings.devextreme.devextremeStrings.dynamicSlope]
  }
  
  /**
    * @deprecated Attention! This type is for internal purposes only. If you used it previously, please submit a ticket to our {@link https://supportcenter.devexpress.com/ticket/create Support Center}. We will check if there is an alternative solution.
    */
  trait FunnelItemInfo extends StObject {
    
    val item: Item
  }
  object FunnelItemInfo {
    
    inline def apply(item: Item): FunnelItemInfo = {
      val __obj = js.Dynamic.literal(item = item.asInstanceOf[js.Any])
      __obj.asInstanceOf[FunnelItemInfo]
    }
    
    extension [Self <: FunnelItemInfo](x: Self) {
      
      inline def setItem(value: Item): Self = StObject.set(x, "item", value.asInstanceOf[js.Any])
    }
  }
  
  /* Rewritten from type alias, can be one of: 
    - typings.devextreme.devextremeStrings.hide
    - typings.devextreme.devextremeStrings.none
    - typings.devextreme.devextremeStrings.shift
  */
  trait FunnelLabelOverlap extends StObject
  object FunnelLabelOverlap {
    
    inline def hide: typings.devextreme.devextremeStrings.hide = "hide".asInstanceOf[typings.devextreme.devextremeStrings.hide]
    
    inline def none: typings.devextreme.devextremeStrings.none = "none".asInstanceOf[typings.devextreme.devextremeStrings.none]
    
    inline def shift: typings.devextreme.devextremeStrings.shift = "shift".asInstanceOf[typings.devextreme.devextremeStrings.shift]
  }
  
  trait HoverChangedEvent
    extends StObject
       with EventInfo[dxFunnel]
       with FunnelItemInfo
  object HoverChangedEvent {
    
    inline def apply(component: dxFunnel, element: DxElement_[HTMLElement], item: Item): HoverChangedEvent = {
      val __obj = js.Dynamic.literal(component = component.asInstanceOf[js.Any], element = element.asInstanceOf[js.Any], item = item.asInstanceOf[js.Any])
      __obj.asInstanceOf[HoverChangedEvent]
    }
  }
  
  trait IncidentOccurredEvent
    extends StObject
       with EventInfo[dxFunnel]
       with IncidentInfo
  object IncidentOccurredEvent {
    
    inline def apply(component: dxFunnel, element: DxElement_[HTMLElement], target: Any): IncidentOccurredEvent = {
      val __obj = js.Dynamic.literal(component = component.asInstanceOf[js.Any], element = element.asInstanceOf[js.Any], target = target.asInstanceOf[js.Any])
      __obj.asInstanceOf[IncidentOccurredEvent]
    }
  }
  
  type InitializedEvent = InitializedEventInfo[dxFunnel]
  
  type Item = dxFunnelItem
  
  trait ItemClickEvent
    extends StObject
       with NativeEventInfo[dxFunnel, MouseEvent | PointerEvent]
       with FunnelItemInfo
  object ItemClickEvent {
    
    inline def apply(component: dxFunnel, element: DxElement_[HTMLElement], item: Item): ItemClickEvent = {
      val __obj = js.Dynamic.literal(component = component.asInstanceOf[js.Any], element = element.asInstanceOf[js.Any], item = item.asInstanceOf[js.Any])
      __obj.asInstanceOf[ItemClickEvent]
    }
  }
  
  trait LegendClickEvent
    extends StObject
       with NativeEventInfo[dxFunnel, MouseEvent | PointerEvent]
       with FunnelItemInfo
  object LegendClickEvent {
    
    inline def apply(component: dxFunnel, element: DxElement_[HTMLElement], item: Item): LegendClickEvent = {
      val __obj = js.Dynamic.literal(component = component.asInstanceOf[js.Any], element = element.asInstanceOf[js.Any], item = item.asInstanceOf[js.Any])
      __obj.asInstanceOf[LegendClickEvent]
    }
  }
  
  type LegendItem = FunnelLegendItem
  
  trait OptionChangedEvent
    extends StObject
       with EventInfo[dxFunnel]
       with ChangedOptionInfo
  object OptionChangedEvent {
    
    inline def apply(component: dxFunnel, element: DxElement_[HTMLElement], fullName: String, name: String): OptionChangedEvent = {
      val __obj = js.Dynamic.literal(component = component.asInstanceOf[js.Any], element = element.asInstanceOf[js.Any], fullName = fullName.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
      __obj.asInstanceOf[OptionChangedEvent]
    }
  }
  
  type Properties = dxFunnelOptions
  
  trait SelectionChangedEvent
    extends StObject
       with EventInfo[dxFunnel]
       with FunnelItemInfo
  object SelectionChangedEvent {
    
    inline def apply(component: dxFunnel, element: DxElement_[HTMLElement], item: Item): SelectionChangedEvent = {
      val __obj = js.Dynamic.literal(component = component.asInstanceOf[js.Any], element = element.asInstanceOf[js.Any], item = item.asInstanceOf[js.Any])
      __obj.asInstanceOf[SelectionChangedEvent]
    }
  }
}
