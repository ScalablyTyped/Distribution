package typings.devtoolsProtocol.mod.Protocol

import typings.devtoolsProtocol.mod.Protocol.DOM.BackendNodeId
import typings.devtoolsProtocol.mod.Protocol.DOM.NodeId
import typings.devtoolsProtocol.mod.Protocol.Runtime.RemoteObject
import typings.devtoolsProtocol.mod.Protocol.Runtime.RemoteObjectId
import typings.devtoolsProtocol.mod.Protocol.Runtime.ScriptId
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object DOMDebugger {
  
  /* Rewritten from type alias, can be one of: 
    - typings.devtoolsProtocol.devtoolsProtocolStrings.`subtree-modified`
    - typings.devtoolsProtocol.devtoolsProtocolStrings.`attribute-modified`
    - typings.devtoolsProtocol.devtoolsProtocolStrings.`node-removed`
  */
  trait DOMBreakpointType extends StObject
  object DOMBreakpointType {
    
    @scala.inline
    def `attribute-modified`: typings.devtoolsProtocol.devtoolsProtocolStrings.`attribute-modified` = "attribute-modified".asInstanceOf[typings.devtoolsProtocol.devtoolsProtocolStrings.`attribute-modified`]
    
    @scala.inline
    def `node-removed`: typings.devtoolsProtocol.devtoolsProtocolStrings.`node-removed` = "node-removed".asInstanceOf[typings.devtoolsProtocol.devtoolsProtocolStrings.`node-removed`]
    
    @scala.inline
    def `subtree-modified`: typings.devtoolsProtocol.devtoolsProtocolStrings.`subtree-modified` = "subtree-modified".asInstanceOf[typings.devtoolsProtocol.devtoolsProtocolStrings.`subtree-modified`]
  }
  
  @js.native
  trait EventListener extends StObject {
    
    /**
      * Node the listener is added to (if any).
      */
    var backendNodeId: js.UndefOr[BackendNodeId] = js.native
    
    /**
      * Column number in the script (0-based).
      */
    var columnNumber: integer = js.native
    
    /**
      * Event handler function value.
      */
    var handler: js.UndefOr[RemoteObject] = js.native
    
    /**
      * Line number in the script (0-based).
      */
    var lineNumber: integer = js.native
    
    /**
      * `EventListener`'s once flag.
      */
    var once: Boolean = js.native
    
    /**
      * Event original handler function value.
      */
    var originalHandler: js.UndefOr[RemoteObject] = js.native
    
    /**
      * `EventListener`'s passive flag.
      */
    var passive: Boolean = js.native
    
    /**
      * Script id of the handler code.
      */
    var scriptId: ScriptId = js.native
    
    /**
      * `EventListener`'s type.
      */
    var `type`: String = js.native
    
    /**
      * `EventListener`'s useCapture.
      */
    var useCapture: Boolean = js.native
  }
  object EventListener {
    
    @scala.inline
    def apply(
      columnNumber: integer,
      lineNumber: integer,
      once: Boolean,
      passive: Boolean,
      scriptId: ScriptId,
      `type`: String,
      useCapture: Boolean
    ): EventListener = {
      val __obj = js.Dynamic.literal(columnNumber = columnNumber.asInstanceOf[js.Any], lineNumber = lineNumber.asInstanceOf[js.Any], once = once.asInstanceOf[js.Any], passive = passive.asInstanceOf[js.Any], scriptId = scriptId.asInstanceOf[js.Any], useCapture = useCapture.asInstanceOf[js.Any])
      __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
      __obj.asInstanceOf[EventListener]
    }
    
    @scala.inline
    implicit class EventListenerMutableBuilder[Self <: EventListener] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setBackendNodeId(value: BackendNodeId): Self = StObject.set(x, "backendNodeId", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setBackendNodeIdUndefined: Self = StObject.set(x, "backendNodeId", js.undefined)
      
      @scala.inline
      def setColumnNumber(value: integer): Self = StObject.set(x, "columnNumber", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHandler(value: RemoteObject): Self = StObject.set(x, "handler", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHandlerUndefined: Self = StObject.set(x, "handler", js.undefined)
      
      @scala.inline
      def setLineNumber(value: integer): Self = StObject.set(x, "lineNumber", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOnce(value: Boolean): Self = StObject.set(x, "once", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOriginalHandler(value: RemoteObject): Self = StObject.set(x, "originalHandler", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOriginalHandlerUndefined: Self = StObject.set(x, "originalHandler", js.undefined)
      
      @scala.inline
      def setPassive(value: Boolean): Self = StObject.set(x, "passive", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setScriptId(value: ScriptId): Self = StObject.set(x, "scriptId", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setUseCapture(value: Boolean): Self = StObject.set(x, "useCapture", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait GetEventListenersRequest extends StObject {
    
    /**
      * The maximum depth at which Node children should be retrieved, defaults to 1. Use -1 for the
      * entire subtree or provide an integer larger than 0.
      */
    var depth: js.UndefOr[integer] = js.native
    
    /**
      * Identifier of the object to return listeners for.
      */
    var objectId: RemoteObjectId = js.native
    
    /**
      * Whether or not iframes and shadow roots should be traversed when returning the subtree
      * (default is false). Reports listeners for all contexts if pierce is enabled.
      */
    var pierce: js.UndefOr[Boolean] = js.native
  }
  object GetEventListenersRequest {
    
    @scala.inline
    def apply(objectId: RemoteObjectId): GetEventListenersRequest = {
      val __obj = js.Dynamic.literal(objectId = objectId.asInstanceOf[js.Any])
      __obj.asInstanceOf[GetEventListenersRequest]
    }
    
    @scala.inline
    implicit class GetEventListenersRequestMutableBuilder[Self <: GetEventListenersRequest] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setDepth(value: integer): Self = StObject.set(x, "depth", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDepthUndefined: Self = StObject.set(x, "depth", js.undefined)
      
      @scala.inline
      def setObjectId(value: RemoteObjectId): Self = StObject.set(x, "objectId", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPierce(value: Boolean): Self = StObject.set(x, "pierce", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPierceUndefined: Self = StObject.set(x, "pierce", js.undefined)
    }
  }
  
  @js.native
  trait GetEventListenersResponse extends StObject {
    
    /**
      * Array of relevant listeners.
      */
    var listeners: js.Array[EventListener] = js.native
  }
  object GetEventListenersResponse {
    
    @scala.inline
    def apply(listeners: js.Array[EventListener]): GetEventListenersResponse = {
      val __obj = js.Dynamic.literal(listeners = listeners.asInstanceOf[js.Any])
      __obj.asInstanceOf[GetEventListenersResponse]
    }
    
    @scala.inline
    implicit class GetEventListenersResponseMutableBuilder[Self <: GetEventListenersResponse] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setListeners(value: js.Array[EventListener]): Self = StObject.set(x, "listeners", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setListenersVarargs(value: EventListener*): Self = StObject.set(x, "listeners", js.Array(value :_*))
    }
  }
  
  @js.native
  trait RemoveDOMBreakpointRequest extends StObject {
    
    /**
      * Identifier of the node to remove breakpoint from.
      */
    var nodeId: NodeId = js.native
    
    /**
      * Type of the breakpoint to remove.
      */
    var `type`: DOMBreakpointType = js.native
  }
  object RemoveDOMBreakpointRequest {
    
    @scala.inline
    def apply(nodeId: NodeId, `type`: DOMBreakpointType): RemoveDOMBreakpointRequest = {
      val __obj = js.Dynamic.literal(nodeId = nodeId.asInstanceOf[js.Any])
      __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
      __obj.asInstanceOf[RemoveDOMBreakpointRequest]
    }
    
    @scala.inline
    implicit class RemoveDOMBreakpointRequestMutableBuilder[Self <: RemoveDOMBreakpointRequest] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setNodeId(value: NodeId): Self = StObject.set(x, "nodeId", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setType(value: DOMBreakpointType): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait RemoveEventListenerBreakpointRequest extends StObject {
    
    /**
      * Event name.
      */
    var eventName: String = js.native
    
    /**
      * EventTarget interface name.
      */
    var targetName: js.UndefOr[String] = js.native
  }
  object RemoveEventListenerBreakpointRequest {
    
    @scala.inline
    def apply(eventName: String): RemoveEventListenerBreakpointRequest = {
      val __obj = js.Dynamic.literal(eventName = eventName.asInstanceOf[js.Any])
      __obj.asInstanceOf[RemoveEventListenerBreakpointRequest]
    }
    
    @scala.inline
    implicit class RemoveEventListenerBreakpointRequestMutableBuilder[Self <: RemoveEventListenerBreakpointRequest] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setEventName(value: String): Self = StObject.set(x, "eventName", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTargetName(value: String): Self = StObject.set(x, "targetName", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTargetNameUndefined: Self = StObject.set(x, "targetName", js.undefined)
    }
  }
  
  @js.native
  trait RemoveInstrumentationBreakpointRequest extends StObject {
    
    /**
      * Instrumentation name to stop on.
      */
    var eventName: String = js.native
  }
  object RemoveInstrumentationBreakpointRequest {
    
    @scala.inline
    def apply(eventName: String): RemoveInstrumentationBreakpointRequest = {
      val __obj = js.Dynamic.literal(eventName = eventName.asInstanceOf[js.Any])
      __obj.asInstanceOf[RemoveInstrumentationBreakpointRequest]
    }
    
    @scala.inline
    implicit class RemoveInstrumentationBreakpointRequestMutableBuilder[Self <: RemoveInstrumentationBreakpointRequest] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setEventName(value: String): Self = StObject.set(x, "eventName", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait RemoveXHRBreakpointRequest extends StObject {
    
    /**
      * Resource URL substring.
      */
    var url: String = js.native
  }
  object RemoveXHRBreakpointRequest {
    
    @scala.inline
    def apply(url: String): RemoveXHRBreakpointRequest = {
      val __obj = js.Dynamic.literal(url = url.asInstanceOf[js.Any])
      __obj.asInstanceOf[RemoveXHRBreakpointRequest]
    }
    
    @scala.inline
    implicit class RemoveXHRBreakpointRequestMutableBuilder[Self <: RemoveXHRBreakpointRequest] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setUrl(value: String): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait SetDOMBreakpointRequest extends StObject {
    
    /**
      * Identifier of the node to set breakpoint on.
      */
    var nodeId: NodeId = js.native
    
    /**
      * Type of the operation to stop upon.
      */
    var `type`: DOMBreakpointType = js.native
  }
  object SetDOMBreakpointRequest {
    
    @scala.inline
    def apply(nodeId: NodeId, `type`: DOMBreakpointType): SetDOMBreakpointRequest = {
      val __obj = js.Dynamic.literal(nodeId = nodeId.asInstanceOf[js.Any])
      __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
      __obj.asInstanceOf[SetDOMBreakpointRequest]
    }
    
    @scala.inline
    implicit class SetDOMBreakpointRequestMutableBuilder[Self <: SetDOMBreakpointRequest] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setNodeId(value: NodeId): Self = StObject.set(x, "nodeId", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setType(value: DOMBreakpointType): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait SetEventListenerBreakpointRequest extends StObject {
    
    /**
      * DOM Event name to stop on (any DOM event will do).
      */
    var eventName: String = js.native
    
    /**
      * EventTarget interface name to stop on. If equal to `"*"` or not provided, will stop on any
      * EventTarget.
      */
    var targetName: js.UndefOr[String] = js.native
  }
  object SetEventListenerBreakpointRequest {
    
    @scala.inline
    def apply(eventName: String): SetEventListenerBreakpointRequest = {
      val __obj = js.Dynamic.literal(eventName = eventName.asInstanceOf[js.Any])
      __obj.asInstanceOf[SetEventListenerBreakpointRequest]
    }
    
    @scala.inline
    implicit class SetEventListenerBreakpointRequestMutableBuilder[Self <: SetEventListenerBreakpointRequest] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setEventName(value: String): Self = StObject.set(x, "eventName", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTargetName(value: String): Self = StObject.set(x, "targetName", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTargetNameUndefined: Self = StObject.set(x, "targetName", js.undefined)
    }
  }
  
  @js.native
  trait SetInstrumentationBreakpointRequest extends StObject {
    
    /**
      * Instrumentation name to stop on.
      */
    var eventName: String = js.native
  }
  object SetInstrumentationBreakpointRequest {
    
    @scala.inline
    def apply(eventName: String): SetInstrumentationBreakpointRequest = {
      val __obj = js.Dynamic.literal(eventName = eventName.asInstanceOf[js.Any])
      __obj.asInstanceOf[SetInstrumentationBreakpointRequest]
    }
    
    @scala.inline
    implicit class SetInstrumentationBreakpointRequestMutableBuilder[Self <: SetInstrumentationBreakpointRequest] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setEventName(value: String): Self = StObject.set(x, "eventName", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait SetXHRBreakpointRequest extends StObject {
    
    /**
      * Resource URL substring. All XHRs having this substring in the URL will get stopped upon.
      */
    var url: String = js.native
  }
  object SetXHRBreakpointRequest {
    
    @scala.inline
    def apply(url: String): SetXHRBreakpointRequest = {
      val __obj = js.Dynamic.literal(url = url.asInstanceOf[js.Any])
      __obj.asInstanceOf[SetXHRBreakpointRequest]
    }
    
    @scala.inline
    implicit class SetXHRBreakpointRequestMutableBuilder[Self <: SetXHRBreakpointRequest] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setUrl(value: String): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
    }
  }
}
