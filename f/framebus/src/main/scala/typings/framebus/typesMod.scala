package typings.framebus

import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object typesMod {
  
  type FramebusOnHandler = js.Function2[/* data */ FramebusSubscriberArg, /* reply */ FramebusReplyHandler, Unit]
  
  trait FramebusPayload extends StObject {
    
    var data: js.UndefOr[String] = js.undefined
    
    var event: String
    
    var eventData: js.UndefOr[FramebusSubscriberArg] = js.undefined
    
    var origin: String
    
    var reply: js.UndefOr[String | ReplyFunction] = js.undefined
  }
  object FramebusPayload {
    
    inline def apply(event: String, origin: String): FramebusPayload = {
      val __obj = js.Dynamic.literal(event = event.asInstanceOf[js.Any], origin = origin.asInstanceOf[js.Any])
      __obj.asInstanceOf[FramebusPayload]
    }
    
    extension [Self <: FramebusPayload](x: Self) {
      
      inline def setData(value: String): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
      
      inline def setDataUndefined: Self = StObject.set(x, "data", js.undefined)
      
      inline def setEvent(value: String): Self = StObject.set(x, "event", value.asInstanceOf[js.Any])
      
      inline def setEventData(value: FramebusSubscriberArg): Self = StObject.set(x, "eventData", value.asInstanceOf[js.Any])
      
      inline def setEventDataUndefined: Self = StObject.set(x, "eventData", js.undefined)
      
      inline def setOrigin(value: String): Self = StObject.set(x, "origin", value.asInstanceOf[js.Any])
      
      inline def setReply(value: String | ReplyFunction): Self = StObject.set(x, "reply", value.asInstanceOf[js.Any])
      
      inline def setReplyUndefined: Self = StObject.set(x, "reply", js.undefined)
    }
  }
  
  type FramebusReplyHandler = js.Function1[/* data */ Any, Unit]
  
  @js.native
  trait FramebusSubscribeHandler extends StObject {
    
    def apply(): Unit = js.native
    def apply(data: Unit, reply: FramebusSubscribeHandler): Unit = js.native
    def apply(data: FramebusSubscribeHandler): Unit = js.native
    def apply(data: FramebusSubscribeHandler, reply: FramebusSubscribeHandler): Unit = js.native
    def apply(data: FramebusSubscriberArg): Unit = js.native
    def apply(data: FramebusSubscriberArg, reply: FramebusSubscribeHandler): Unit = js.native
  }
  
  type FramebusSubscriber = Record[String, FramebusSubscription]
  
  type FramebusSubscriberArg = Record[String, Any]
  
  type FramebusSubscription = Record[String, js.Array[FramebusSubscribeHandler]]
  
  @js.native
  trait ReplyFunction extends StObject {
    
    def apply(args: Any*): Unit = js.native
  }
  
  object global {
    
    trait Window extends StObject {
      
      def Window(): typings.framebus.typesMod.global.Window
    }
    object Window {
      
      inline def apply(Window: () => Window): Window = {
        val __obj = js.Dynamic.literal(Window = js.Any.fromFunction0(Window))
        __obj.asInstanceOf[Window]
      }
      
      extension [Self <: Window](x: Self) {
        
        inline def setWindow(value: () => Window): Self = StObject.set(x, "Window", js.Any.fromFunction0(value))
      }
    }
  }
}
