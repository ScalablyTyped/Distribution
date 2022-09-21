package typings.devextreme.mod.DevExpress.ui

import typings.devextreme.mod.DevExpress.core.DxElement_
import typings.devextreme.mod.DevExpress.events.ChangedOptionInfo
import typings.devextreme.mod.DevExpress.events.EventInfo
import typings.devextreme.mod.DevExpress.events.InitializedEventInfo
import typings.devextreme.mod.DevExpress.events.ItemInfo
import typings.devextreme.mod.DevExpress.events.NativeEventInfo
import typings.devextreme.mod.DevExpress.ui.Editor.ValueChangedInfo
import typings.devextreme.mod.DevExpress.ui.dxDropDownList.SelectionChangedInfo
import typings.devextreme.mod.DevExpress.ui.dxList.ScrollInfo
import typings.devextreme.mod.DevExpress.ui.dxPopup.TitleRenderedInfo
import typings.std.Event
import typings.std.HTMLElement
import typings.std.KeyboardEvent
import typings.std.MouseEvent
import typings.std.PointerEvent
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object dxLookup {
  
  type ClosedEvent = EventInfo[dxLookup]
  
  type ContentReadyEvent = EventInfo[dxLookup]
  
  type DisposingEvent = EventInfo[dxLookup]
  
  type InitializedEvent = InitializedEventInfo[dxLookup]
  
  trait ItemClickEvent
    extends StObject
       with NativeEventInfo[dxLookup, KeyboardEvent | MouseEvent | PointerEvent]
       with ItemInfo[Any]
  object ItemClickEvent {
    
    inline def apply(
      component: dxLookup,
      element: DxElement_[HTMLElement],
      itemElement: DxElement_[HTMLElement],
      itemIndex: Double
    ): ItemClickEvent = {
      val __obj = js.Dynamic.literal(component = component.asInstanceOf[js.Any], element = element.asInstanceOf[js.Any], itemElement = itemElement.asInstanceOf[js.Any], itemIndex = itemIndex.asInstanceOf[js.Any])
      __obj.asInstanceOf[ItemClickEvent]
    }
  }
  
  type OpenedEvent = EventInfo[dxLookup]
  
  trait OptionChangedEvent
    extends StObject
       with EventInfo[dxLookup]
       with ChangedOptionInfo
  object OptionChangedEvent {
    
    inline def apply(component: dxLookup, element: DxElement_[HTMLElement], fullName: String, name: String): OptionChangedEvent = {
      val __obj = js.Dynamic.literal(component = component.asInstanceOf[js.Any], element = element.asInstanceOf[js.Any], fullName = fullName.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
      __obj.asInstanceOf[OptionChangedEvent]
    }
  }
  
  type PageLoadingEvent = EventInfo[dxLookup]
  
  type Properties = dxLookupOptions
  
  type PullRefreshEvent = EventInfo[dxLookup]
  
  trait ScrollEvent
    extends StObject
       with NativeEventInfo[dxLookup, MouseEvent | Event]
       with ScrollInfo
  object ScrollEvent {
    
    inline def apply(
      component: dxLookup,
      element: DxElement_[HTMLElement],
      reachedBottom: Boolean,
      reachedLeft: Boolean,
      reachedRight: Boolean,
      reachedTop: Boolean
    ): ScrollEvent = {
      val __obj = js.Dynamic.literal(component = component.asInstanceOf[js.Any], element = element.asInstanceOf[js.Any], reachedBottom = reachedBottom.asInstanceOf[js.Any], reachedLeft = reachedLeft.asInstanceOf[js.Any], reachedRight = reachedRight.asInstanceOf[js.Any], reachedTop = reachedTop.asInstanceOf[js.Any])
      __obj.asInstanceOf[ScrollEvent]
    }
  }
  
  trait SelectionChangedEvent
    extends StObject
       with EventInfo[dxLookup]
       with SelectionChangedInfo[Any]
  object SelectionChangedEvent {
    
    inline def apply(component: dxLookup, element: DxElement_[HTMLElement], selectedItem: Any): SelectionChangedEvent = {
      val __obj = js.Dynamic.literal(component = component.asInstanceOf[js.Any], element = element.asInstanceOf[js.Any], selectedItem = selectedItem.asInstanceOf[js.Any])
      __obj.asInstanceOf[SelectionChangedEvent]
    }
  }
  
  trait TitleRenderedEvent
    extends StObject
       with EventInfo[dxLookup]
       with TitleRenderedInfo
  object TitleRenderedEvent {
    
    inline def apply(component: dxLookup, element: DxElement_[HTMLElement], titleElement: DxElement_[HTMLElement]): TitleRenderedEvent = {
      val __obj = js.Dynamic.literal(component = component.asInstanceOf[js.Any], element = element.asInstanceOf[js.Any], titleElement = titleElement.asInstanceOf[js.Any])
      __obj.asInstanceOf[TitleRenderedEvent]
    }
  }
  
  trait ValueChangedEvent
    extends StObject
       with NativeEventInfo[dxLookup, KeyboardEvent | MouseEvent | PointerEvent | Event]
       with ValueChangedInfo
  object ValueChangedEvent {
    
    inline def apply(component: dxLookup, element: DxElement_[HTMLElement]): ValueChangedEvent = {
      val __obj = js.Dynamic.literal(component = component.asInstanceOf[js.Any], element = element.asInstanceOf[js.Any])
      __obj.asInstanceOf[ValueChangedEvent]
    }
  }
}
