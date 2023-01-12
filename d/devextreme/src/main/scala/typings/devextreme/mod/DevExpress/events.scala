package typings.devextreme.mod.DevExpress

import typings.devextreme.mod.DevExpress.core.DxElement_
import typings.devextreme.mod.global.JQueryEventObject
import typings.std.Element
import typings.std.Event
import typings.std.HTMLElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object events {
  
  trait Cancelable extends StObject {
    
    var cancel: js.UndefOr[Boolean] = js.undefined
  }
  object Cancelable {
    
    inline def apply(): Cancelable = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Cancelable]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Cancelable] (val x: Self) extends AnyVal {
      
      inline def setCancel(value: Boolean): Self = StObject.set(x, "cancel", value.asInstanceOf[js.Any])
      
      inline def setCancelUndefined: Self = StObject.set(x, "cancel", js.undefined)
    }
  }
  
  trait ChangedOptionInfo extends StObject {
    
    val fullName: String
    
    val name: String
    
    val previousValue: js.UndefOr[Any] = js.undefined
    
    val value: js.UndefOr[Any] = js.undefined
  }
  object ChangedOptionInfo {
    
    inline def apply(fullName: String, name: String): ChangedOptionInfo = {
      val __obj = js.Dynamic.literal(fullName = fullName.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
      __obj.asInstanceOf[ChangedOptionInfo]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: ChangedOptionInfo] (val x: Self) extends AnyVal {
      
      inline def setFullName(value: String): Self = StObject.set(x, "fullName", value.asInstanceOf[js.Any])
      
      inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      inline def setPreviousValue(value: Any): Self = StObject.set(x, "previousValue", value.asInstanceOf[js.Any])
      
      inline def setPreviousValueUndefined: Self = StObject.set(x, "previousValue", js.undefined)
      
      inline def setValue(value: Any): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
      
      inline def setValueUndefined: Self = StObject.set(x, "value", js.undefined)
    }
  }
  
  /** NOTE: Conditional type definitions are impossible to translate to Scala.
    * See https://www.typescriptlang.org/docs/handbook/2/conditional-types.html for an intro.
    * This RHS of the type alias is guess work. You should cast if it's not correct in your case.
    * TS definition: {{{
    {} extends devextreme.devextreme.DevExpress.events.EventType ? devextreme.devextreme.DevExpress.events.EventObject & TNativeEvent : devextreme.devextreme.DevExpress.events.EventType
    }}}
    */
  type DxEvent[TNativeEvent] = EventObject & TNativeEvent
  
  trait EventInfo[TComponent] extends StObject {
    
    val component: TComponent
    
    val element: DxElement_[HTMLElement]
    
    val model: js.UndefOr[Any] = js.undefined
  }
  object EventInfo {
    
    inline def apply[TComponent](component: TComponent, element: DxElement_[HTMLElement]): EventInfo[TComponent] = {
      val __obj = js.Dynamic.literal(component = component.asInstanceOf[js.Any], element = element.asInstanceOf[js.Any])
      __obj.asInstanceOf[EventInfo[TComponent]]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: EventInfo[?], TComponent] (val x: Self & EventInfo[TComponent]) extends AnyVal {
      
      inline def setComponent(value: TComponent): Self = StObject.set(x, "component", value.asInstanceOf[js.Any])
      
      inline def setElement(value: DxElement_[HTMLElement]): Self = StObject.set(x, "element", value.asInstanceOf[js.Any])
      
      inline def setModel(value: Any): Self = StObject.set(x, "model", value.asInstanceOf[js.Any])
      
      inline def setModelUndefined: Self = StObject.set(x, "model", js.undefined)
    }
  }
  
  trait EventObject extends StObject {
    
    /**
      * The DOM element within the current event propagation stage.
      */
    var currentTarget: Element
    
    /**
      * Data passed to the event handler.
      */
    var data: Any
    
    /**
      * The DOM element to which the currently-called event handler was attached.
      */
    var delegateTarget: Element
    
    /**
      * Checks if the preventDefault() method was called on this event object.
      */
    def isDefaultPrevented(): Boolean
    
    /**
      * Checks if the stopImmediatePropagation() method was called on this event object.
      */
    def isImmediatePropagationStopped(): Boolean
    
    /**
      * Checks if the stopPropagation() method was called on this event object.
      */
    def isPropagationStopped(): Boolean
    
    /**
      * Prevents the event&apos;s default action from triggering.
      */
    def preventDefault(): Unit
    
    /**
      * Stops the event&apos;s propagation up the DOM tree, preventing the rest of the handlers from being executed.
      */
    def stopImmediatePropagation(): Unit
    
    /**
      * Stops the event&apos;s propagation up the DOM tree, keeping parent handlers unnotified of the event.
      */
    def stopPropagation(): Unit
    
    /**
      * The DOM element that initiated the event.
      */
    var target: Element
  }
  object EventObject {
    
    inline def apply(
      currentTarget: Element,
      data: Any,
      delegateTarget: Element,
      isDefaultPrevented: () => Boolean,
      isImmediatePropagationStopped: () => Boolean,
      isPropagationStopped: () => Boolean,
      preventDefault: () => Unit,
      stopImmediatePropagation: () => Unit,
      stopPropagation: () => Unit,
      target: Element
    ): EventObject = {
      val __obj = js.Dynamic.literal(currentTarget = currentTarget.asInstanceOf[js.Any], data = data.asInstanceOf[js.Any], delegateTarget = delegateTarget.asInstanceOf[js.Any], isDefaultPrevented = js.Any.fromFunction0(isDefaultPrevented), isImmediatePropagationStopped = js.Any.fromFunction0(isImmediatePropagationStopped), isPropagationStopped = js.Any.fromFunction0(isPropagationStopped), preventDefault = js.Any.fromFunction0(preventDefault), stopImmediatePropagation = js.Any.fromFunction0(stopImmediatePropagation), stopPropagation = js.Any.fromFunction0(stopPropagation), target = target.asInstanceOf[js.Any])
      __obj.asInstanceOf[EventObject]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: EventObject] (val x: Self) extends AnyVal {
      
      inline def setCurrentTarget(value: Element): Self = StObject.set(x, "currentTarget", value.asInstanceOf[js.Any])
      
      inline def setData(value: Any): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
      
      inline def setDelegateTarget(value: Element): Self = StObject.set(x, "delegateTarget", value.asInstanceOf[js.Any])
      
      inline def setIsDefaultPrevented(value: () => Boolean): Self = StObject.set(x, "isDefaultPrevented", js.Any.fromFunction0(value))
      
      inline def setIsImmediatePropagationStopped(value: () => Boolean): Self = StObject.set(x, "isImmediatePropagationStopped", js.Any.fromFunction0(value))
      
      inline def setIsPropagationStopped(value: () => Boolean): Self = StObject.set(x, "isPropagationStopped", js.Any.fromFunction0(value))
      
      inline def setPreventDefault(value: () => Unit): Self = StObject.set(x, "preventDefault", js.Any.fromFunction0(value))
      
      inline def setStopImmediatePropagation(value: () => Unit): Self = StObject.set(x, "stopImmediatePropagation", js.Any.fromFunction0(value))
      
      inline def setStopPropagation(value: () => Unit): Self = StObject.set(x, "stopPropagation", js.Any.fromFunction0(value))
      
      inline def setTarget(value: Element): Self = StObject.set(x, "target", value.asInstanceOf[js.Any])
    }
  }
  
  /**
    * @deprecated Attention! This type is for internal purposes only. If you used it previously, please submit a ticket to our {@link https://supportcenter.devexpress.com/ticket/create Support Center}. We will check if there is an alternative solution.
    */
  trait EventType
    extends StObject
       with JQueryEventObject {
    
    var cancel: js.UndefOr[Boolean] = js.undefined
  }
  object EventType {
    
    inline def apply(): EventType = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[EventType]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: EventType] (val x: Self) extends AnyVal {
      
      inline def setCancel(value: Boolean): Self = StObject.set(x, "cancel", value.asInstanceOf[js.Any])
      
      inline def setCancelUndefined: Self = StObject.set(x, "cancel", js.undefined)
    }
  }
  
  trait InitializedEventInfo[TComponent] extends StObject {
    
    val component: js.UndefOr[TComponent] = js.undefined
    
    val element: js.UndefOr[DxElement_[HTMLElement]] = js.undefined
  }
  object InitializedEventInfo {
    
    inline def apply[TComponent](): InitializedEventInfo[TComponent] = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[InitializedEventInfo[TComponent]]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: InitializedEventInfo[?], TComponent] (val x: Self & InitializedEventInfo[TComponent]) extends AnyVal {
      
      inline def setComponent(value: TComponent): Self = StObject.set(x, "component", value.asInstanceOf[js.Any])
      
      inline def setComponentUndefined: Self = StObject.set(x, "component", js.undefined)
      
      inline def setElement(value: DxElement_[HTMLElement]): Self = StObject.set(x, "element", value.asInstanceOf[js.Any])
      
      inline def setElementUndefined: Self = StObject.set(x, "element", js.undefined)
    }
  }
  
  trait ItemInfo[TItemData] extends StObject {
    
    val itemData: js.UndefOr[TItemData] = js.undefined
    
    val itemElement: DxElement_[HTMLElement]
    
    val itemIndex: Double
  }
  object ItemInfo {
    
    inline def apply[TItemData](itemElement: DxElement_[HTMLElement], itemIndex: Double): ItemInfo[TItemData] = {
      val __obj = js.Dynamic.literal(itemElement = itemElement.asInstanceOf[js.Any], itemIndex = itemIndex.asInstanceOf[js.Any])
      __obj.asInstanceOf[ItemInfo[TItemData]]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: ItemInfo[?], TItemData] (val x: Self & ItemInfo[TItemData]) extends AnyVal {
      
      inline def setItemData(value: TItemData): Self = StObject.set(x, "itemData", value.asInstanceOf[js.Any])
      
      inline def setItemDataUndefined: Self = StObject.set(x, "itemData", js.undefined)
      
      inline def setItemElement(value: DxElement_[HTMLElement]): Self = StObject.set(x, "itemElement", value.asInstanceOf[js.Any])
      
      inline def setItemIndex(value: Double): Self = StObject.set(x, "itemIndex", value.asInstanceOf[js.Any])
    }
  }
  
  trait NativeEventInfo[TComponent, TNativeEvent] extends StObject {
    
    val component: TComponent
    
    val element: DxElement_[HTMLElement]
    
    val event: js.UndefOr[DxEvent[TNativeEvent]] = js.undefined
    
    val model: js.UndefOr[Any] = js.undefined
  }
  object NativeEventInfo {
    
    inline def apply[TComponent, TNativeEvent](component: TComponent, element: DxElement_[HTMLElement]): NativeEventInfo[TComponent, TNativeEvent] = {
      val __obj = js.Dynamic.literal(component = component.asInstanceOf[js.Any], element = element.asInstanceOf[js.Any])
      __obj.asInstanceOf[NativeEventInfo[TComponent, TNativeEvent]]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: NativeEventInfo[?, ?], TComponent, TNativeEvent] (val x: Self & (NativeEventInfo[TComponent, TNativeEvent])) extends AnyVal {
      
      inline def setComponent(value: TComponent): Self = StObject.set(x, "component", value.asInstanceOf[js.Any])
      
      inline def setElement(value: DxElement_[HTMLElement]): Self = StObject.set(x, "element", value.asInstanceOf[js.Any])
      
      inline def setEvent(value: DxEvent[TNativeEvent]): Self = StObject.set(x, "event", value.asInstanceOf[js.Any])
      
      inline def setEventUndefined: Self = StObject.set(x, "event", js.undefined)
      
      inline def setModel(value: Any): Self = StObject.set(x, "model", value.asInstanceOf[js.Any])
      
      inline def setModelUndefined: Self = StObject.set(x, "model", js.undefined)
    }
  }
  
  type event = DxEvent[Event]
}
