package typings.fluentuiReactComponentEventListener

import typings.react.mod.RefObject
import typings.std.Node
import typings.std.Window
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object typesMod {
  
  type EventHandler[T /* <: EventTypes */] = js.Function1[
    /* import warning: importer.ImportType#apply Failed type conversion: std.DocumentEventMap[T] */ /* e */ js.Any, 
    Unit
  ]
  
  @js.native
  trait EventListenerOptions[T /* <: EventTypes */] extends StObject {
    
    /** Indicating that events of this type will be dispatched to the registered listener before being dispatched to any EventTarget beneath it in the DOM tree. */
    var capture: js.UndefOr[Boolean] = js.native
    
    /** A function which receives a notification when an event of the specified type occurs. */
    var listener: EventHandler[T] = js.native
    
    /** A target node. Use `target` or `targetRef` prop. */
    var target: js.UndefOr[Target] = js.native
    
    /** A ref object with a target node. */
    var targetRef: js.UndefOr[TargetRef] = js.native
    
    /** A case-sensitive string representing the event type to listen for. */
    var `type`: T = js.native
  }
  object EventListenerOptions {
    
    @scala.inline
    def apply[T /* <: EventTypes */](
      listener: /* import warning: importer.ImportType#apply Failed type conversion: std.DocumentEventMap[T] */ /* e */ js.Any => Unit,
      `type`: T
    ): EventListenerOptions[T] = {
      val __obj = js.Dynamic.literal(listener = js.Any.fromFunction1(listener))
      __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
      __obj.asInstanceOf[EventListenerOptions[T]]
    }
    
    @scala.inline
    implicit class EventListenerOptionsMutableBuilder[Self <: EventListenerOptions[_], T /* <: EventTypes */] (val x: Self with EventListenerOptions[T]) extends AnyVal {
      
      @scala.inline
      def setCapture(value: Boolean): Self = StObject.set(x, "capture", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCaptureUndefined: Self = StObject.set(x, "capture", js.undefined)
      
      @scala.inline
      def setListener(
        value: /* import warning: importer.ImportType#apply Failed type conversion: std.DocumentEventMap[T] */ /* e */ js.Any => Unit
      ): Self = StObject.set(x, "listener", js.Any.fromFunction1(value))
      
      @scala.inline
      def setTarget(value: Target): Self = StObject.set(x, "target", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTargetRef(value: TargetRef): Self = StObject.set(x, "targetRef", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTargetRefUndefined: Self = StObject.set(x, "targetRef", js.undefined)
      
      @scala.inline
      def setTargetUndefined: Self = StObject.set(x, "target", js.undefined)
      
      @scala.inline
      def setType(value: T): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    }
  }
  
  /* Rewritten from type alias, can be one of: 
    - typings.fluentuiReactComponentEventListener.fluentuiReactComponentEventListenerStrings.fullscreenchange
    - typings.fluentuiReactComponentEventListener.fluentuiReactComponentEventListenerStrings.fullscreenerror
    - typings.fluentuiReactComponentEventListener.fluentuiReactComponentEventListenerStrings.pointerlockchange
    - typings.fluentuiReactComponentEventListener.fluentuiReactComponentEventListenerStrings.pointerlockerror
    - typings.fluentuiReactComponentEventListener.fluentuiReactComponentEventListenerStrings.readystatechange
    - typings.fluentuiReactComponentEventListener.fluentuiReactComponentEventListenerStrings.visibilitychange
  */
  trait EventTypes extends StObject
  
  type Target = Node | Window
  
  type TargetRef = RefObject[Target]
}
