package typings.devextreme.mod.default

import typings.devextreme.mod.DevExpress.events.event
import typings.std.Element
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object events {
  
  @JSImport("devextreme", "default.events")
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("devextreme", "default.events.dxEvent")
  @js.native
  class dxEvent ()
    extends StObject
       with typings.devextreme.mod.DevExpress.events.dxEvent {
    
    /**
      * [descr:dxEvent.currentTarget]
      */
    /* CompleteClass */
    var currentTarget: Element = js.native
    
    /**
      * [descr:dxEvent.data]
      */
    /* CompleteClass */
    var data: js.Any = js.native
    
    /**
      * [descr:dxEvent.delegateTarget]
      */
    /* CompleteClass */
    var delegateTarget: Element = js.native
    
    /**
      * [descr:dxEvent.isDefaultPrevented()]
      */
    /* CompleteClass */
    override def isDefaultPrevented(): Boolean = js.native
    
    /**
      * [descr:dxEvent.isImmediatePropagationStopped()]
      */
    /* CompleteClass */
    override def isImmediatePropagationStopped(): Boolean = js.native
    
    /**
      * [descr:dxEvent.isPropagationStopped()]
      */
    /* CompleteClass */
    override def isPropagationStopped(): Boolean = js.native
    
    /**
      * [descr:dxEvent.preventDefault()]
      */
    /* CompleteClass */
    override def preventDefault(): Unit = js.native
    
    /**
      * [descr:dxEvent.stopImmediatePropagation()]
      */
    /* CompleteClass */
    override def stopImmediatePropagation(): Unit = js.native
    
    /**
      * [descr:dxEvent.stopPropagation()]
      */
    /* CompleteClass */
    override def stopPropagation(): Unit = js.native
    
    /**
      * [descr:dxEvent.target]
      */
    /* CompleteClass */
    var target: Element = js.native
  }
  
  inline def eventsHandler(event: typings.devextreme.mod.DevExpress.events.dxEvent, extraParameters: js.Any): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("eventsHandler")(event.asInstanceOf[js.Any], extraParameters.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  
  inline def off(element: js.Array[Element]): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("off")(element.asInstanceOf[js.Any]).asInstanceOf[Unit]
  inline def off(element: js.Array[Element], eventName: String): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("off")(element.asInstanceOf[js.Any], eventName.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def off(element: js.Array[Element], eventName: String, handler: js.Function): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("off")(element.asInstanceOf[js.Any], eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def off(element: js.Array[Element], eventName: String, selector: String): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("off")(element.asInstanceOf[js.Any], eventName.asInstanceOf[js.Any], selector.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def off(element: js.Array[Element], eventName: String, selector: String, handler: js.Function): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("off")(element.asInstanceOf[js.Any], eventName.asInstanceOf[js.Any], selector.asInstanceOf[js.Any], handler.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def off(element: Element): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("off")(element.asInstanceOf[js.Any]).asInstanceOf[Unit]
  inline def off(element: Element, eventName: String): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("off")(element.asInstanceOf[js.Any], eventName.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def off(element: Element, eventName: String, handler: js.Function): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("off")(element.asInstanceOf[js.Any], eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def off(element: Element, eventName: String, selector: String): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("off")(element.asInstanceOf[js.Any], eventName.asInstanceOf[js.Any], selector.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def off(element: Element, eventName: String, selector: String, handler: js.Function): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("off")(element.asInstanceOf[js.Any], eventName.asInstanceOf[js.Any], selector.asInstanceOf[js.Any], handler.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def on(element: js.Array[Element], eventName: String, data: js.Any, handler: js.Function): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("on")(element.asInstanceOf[js.Any], eventName.asInstanceOf[js.Any], data.asInstanceOf[js.Any], handler.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def on(element: js.Array[Element], eventName: String, handler: js.Function): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("on")(element.asInstanceOf[js.Any], eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def on(
    element: js.Array[Element],
    eventName: String,
    selector: String,
    data: js.Any,
    handler: js.Function
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("on")(element.asInstanceOf[js.Any], eventName.asInstanceOf[js.Any], selector.asInstanceOf[js.Any], data.asInstanceOf[js.Any], handler.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def on(element: js.Array[Element], eventName: String, selector: String, handler: js.Function): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("on")(element.asInstanceOf[js.Any], eventName.asInstanceOf[js.Any], selector.asInstanceOf[js.Any], handler.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def on(element: Element, eventName: String, data: js.Any, handler: js.Function): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("on")(element.asInstanceOf[js.Any], eventName.asInstanceOf[js.Any], data.asInstanceOf[js.Any], handler.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def on(element: Element, eventName: String, handler: js.Function): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("on")(element.asInstanceOf[js.Any], eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def on(element: Element, eventName: String, selector: String, data: js.Any, handler: js.Function): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("on")(element.asInstanceOf[js.Any], eventName.asInstanceOf[js.Any], selector.asInstanceOf[js.Any], data.asInstanceOf[js.Any], handler.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def on(element: Element, eventName: String, selector: String, handler: js.Function): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("on")(element.asInstanceOf[js.Any], eventName.asInstanceOf[js.Any], selector.asInstanceOf[js.Any], handler.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def one(element: js.Array[Element], eventName: String, data: js.Any, handler: js.Function): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("one")(element.asInstanceOf[js.Any], eventName.asInstanceOf[js.Any], data.asInstanceOf[js.Any], handler.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def one(element: js.Array[Element], eventName: String, handler: js.Function): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("one")(element.asInstanceOf[js.Any], eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def one(
    element: js.Array[Element],
    eventName: String,
    selector: String,
    data: js.Any,
    handler: js.Function
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("one")(element.asInstanceOf[js.Any], eventName.asInstanceOf[js.Any], selector.asInstanceOf[js.Any], data.asInstanceOf[js.Any], handler.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def one(element: js.Array[Element], eventName: String, selector: String, handler: js.Function): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("one")(element.asInstanceOf[js.Any], eventName.asInstanceOf[js.Any], selector.asInstanceOf[js.Any], handler.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def one(element: Element, eventName: String, data: js.Any, handler: js.Function): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("one")(element.asInstanceOf[js.Any], eventName.asInstanceOf[js.Any], data.asInstanceOf[js.Any], handler.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def one(element: Element, eventName: String, handler: js.Function): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("one")(element.asInstanceOf[js.Any], eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def one(element: Element, eventName: String, selector: String, data: js.Any, handler: js.Function): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("one")(element.asInstanceOf[js.Any], eventName.asInstanceOf[js.Any], selector.asInstanceOf[js.Any], data.asInstanceOf[js.Any], handler.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def one(element: Element, eventName: String, selector: String, handler: js.Function): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("one")(element.asInstanceOf[js.Any], eventName.asInstanceOf[js.Any], selector.asInstanceOf[js.Any], handler.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def trigger(element: js.Array[Element], event: String): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("trigger")(element.asInstanceOf[js.Any], event.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def trigger(element: js.Array[Element], event: String, extraParameters: js.Any): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("trigger")(element.asInstanceOf[js.Any], event.asInstanceOf[js.Any], extraParameters.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def trigger(element: js.Array[Element], event: event): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("trigger")(element.asInstanceOf[js.Any], event.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def trigger(element: js.Array[Element], event: event, extraParameters: js.Any): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("trigger")(element.asInstanceOf[js.Any], event.asInstanceOf[js.Any], extraParameters.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def trigger(element: Element, event: String): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("trigger")(element.asInstanceOf[js.Any], event.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def trigger(element: Element, event: String, extraParameters: js.Any): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("trigger")(element.asInstanceOf[js.Any], event.asInstanceOf[js.Any], extraParameters.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def trigger(element: Element, event: event): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("trigger")(element.asInstanceOf[js.Any], event.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def trigger(element: Element, event: event, extraParameters: js.Any): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("trigger")(element.asInstanceOf[js.Any], event.asInstanceOf[js.Any], extraParameters.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def triggerHandler(element: js.Array[Element], event: String): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("triggerHandler")(element.asInstanceOf[js.Any], event.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def triggerHandler(element: js.Array[Element], event: String, extraParameters: js.Any): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("triggerHandler")(element.asInstanceOf[js.Any], event.asInstanceOf[js.Any], extraParameters.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def triggerHandler(element: js.Array[Element], event: event): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("triggerHandler")(element.asInstanceOf[js.Any], event.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def triggerHandler(element: js.Array[Element], event: event, extraParameters: js.Any): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("triggerHandler")(element.asInstanceOf[js.Any], event.asInstanceOf[js.Any], extraParameters.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def triggerHandler(element: Element, event: String): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("triggerHandler")(element.asInstanceOf[js.Any], event.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def triggerHandler(element: Element, event: String, extraParameters: js.Any): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("triggerHandler")(element.asInstanceOf[js.Any], event.asInstanceOf[js.Any], extraParameters.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def triggerHandler(element: Element, event: event): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("triggerHandler")(element.asInstanceOf[js.Any], event.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def triggerHandler(element: Element, event: event, extraParameters: js.Any): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("triggerHandler")(element.asInstanceOf[js.Any], event.asInstanceOf[js.Any], extraParameters.asInstanceOf[js.Any])).asInstanceOf[Unit]
}
