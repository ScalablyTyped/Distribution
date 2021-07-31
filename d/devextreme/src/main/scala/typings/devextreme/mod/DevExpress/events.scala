package typings.devextreme.mod.DevExpress

import typings.std.Element
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object events {
  
  trait dxEvent
    extends StObject
       with typings.devextreme.mod.DevExpress.events.event {
    
    /**
      * [descr:dxEvent.currentTarget]
      */
    var currentTarget: Element
    
    /**
      * [descr:dxEvent.data]
      */
    var data: js.Any
    
    /**
      * [descr:dxEvent.delegateTarget]
      */
    var delegateTarget: Element
    
    /**
      * [descr:dxEvent.isDefaultPrevented()]
      */
    def isDefaultPrevented(): Boolean
    
    /**
      * [descr:dxEvent.isImmediatePropagationStopped()]
      */
    def isImmediatePropagationStopped(): Boolean
    
    /**
      * [descr:dxEvent.isPropagationStopped()]
      */
    def isPropagationStopped(): Boolean
    
    /**
      * [descr:dxEvent.preventDefault()]
      */
    def preventDefault(): Unit
    
    /**
      * [descr:dxEvent.stopImmediatePropagation()]
      */
    def stopImmediatePropagation(): Unit
    
    /**
      * [descr:dxEvent.stopPropagation()]
      */
    def stopPropagation(): Unit
    
    /**
      * [descr:dxEvent.target]
      */
    var target: Element
  }
  object dxEvent {
    
    @scala.inline
    def apply(
      currentTarget: Element,
      data: js.Any,
      delegateTarget: Element,
      isDefaultPrevented: () => Boolean,
      isImmediatePropagationStopped: () => Boolean,
      isPropagationStopped: () => Boolean,
      preventDefault: () => Unit,
      stopImmediatePropagation: () => Unit,
      stopPropagation: () => Unit,
      target: Element
    ): typings.devextreme.mod.DevExpress.events.dxEvent = {
      val __obj = js.Dynamic.literal(currentTarget = currentTarget.asInstanceOf[js.Any], data = data.asInstanceOf[js.Any], delegateTarget = delegateTarget.asInstanceOf[js.Any], isDefaultPrevented = js.Any.fromFunction0(isDefaultPrevented), isImmediatePropagationStopped = js.Any.fromFunction0(isImmediatePropagationStopped), isPropagationStopped = js.Any.fromFunction0(isPropagationStopped), preventDefault = js.Any.fromFunction0(preventDefault), stopImmediatePropagation = js.Any.fromFunction0(stopImmediatePropagation), stopPropagation = js.Any.fromFunction0(stopPropagation), target = target.asInstanceOf[js.Any])
      __obj.asInstanceOf[typings.devextreme.mod.DevExpress.events.dxEvent]
    }
    
    @scala.inline
    implicit class dxEventMutableBuilder[Self <: typings.devextreme.mod.DevExpress.events.dxEvent] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setCurrentTarget(value: Element): Self = StObject.set(x, "currentTarget", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setData(value: js.Any): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDelegateTarget(value: Element): Self = StObject.set(x, "delegateTarget", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIsDefaultPrevented(value: () => Boolean): Self = StObject.set(x, "isDefaultPrevented", js.Any.fromFunction0(value))
      
      @scala.inline
      def setIsImmediatePropagationStopped(value: () => Boolean): Self = StObject.set(x, "isImmediatePropagationStopped", js.Any.fromFunction0(value))
      
      @scala.inline
      def setIsPropagationStopped(value: () => Boolean): Self = StObject.set(x, "isPropagationStopped", js.Any.fromFunction0(value))
      
      @scala.inline
      def setPreventDefault(value: () => Unit): Self = StObject.set(x, "preventDefault", js.Any.fromFunction0(value))
      
      @scala.inline
      def setStopImmediatePropagation(value: () => Unit): Self = StObject.set(x, "stopImmediatePropagation", js.Any.fromFunction0(value))
      
      @scala.inline
      def setStopPropagation(value: () => Unit): Self = StObject.set(x, "stopPropagation", js.Any.fromFunction0(value))
      
      @scala.inline
      def setTarget(value: Element): Self = StObject.set(x, "target", value.asInstanceOf[js.Any])
    }
  }
  
  /* Rewritten from type alias, can be one of: 
    - typings.devextreme.mod.DevExpress.events.dxEvent
    - typings.devextreme.mod.global.JQueryEventObject
  */
  trait event extends StObject
  object event {
    
    @scala.inline
    def JQueryEventObject(): typings.devextreme.mod.global.JQueryEventObject = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[typings.devextreme.mod.global.JQueryEventObject]
    }
    
    @scala.inline
    def dxEvent(
      currentTarget: Element,
      data: js.Any,
      delegateTarget: Element,
      isDefaultPrevented: () => Boolean,
      isImmediatePropagationStopped: () => Boolean,
      isPropagationStopped: () => Boolean,
      preventDefault: () => Unit,
      stopImmediatePropagation: () => Unit,
      stopPropagation: () => Unit,
      target: Element
    ): typings.devextreme.mod.DevExpress.events.dxEvent = {
      val __obj = js.Dynamic.literal(currentTarget = currentTarget.asInstanceOf[js.Any], data = data.asInstanceOf[js.Any], delegateTarget = delegateTarget.asInstanceOf[js.Any], isDefaultPrevented = js.Any.fromFunction0(isDefaultPrevented), isImmediatePropagationStopped = js.Any.fromFunction0(isImmediatePropagationStopped), isPropagationStopped = js.Any.fromFunction0(isPropagationStopped), preventDefault = js.Any.fromFunction0(preventDefault), stopImmediatePropagation = js.Any.fromFunction0(stopImmediatePropagation), stopPropagation = js.Any.fromFunction0(stopPropagation), target = target.asInstanceOf[js.Any])
      __obj.asInstanceOf[typings.devextreme.mod.DevExpress.events.dxEvent]
    }
  }
}
