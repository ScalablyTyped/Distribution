package typings.framebus

import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object typesMod {
  
  type FramebusOnHandler = js.Function2[/* data */ FramebusSubscriberArg, /* reply */ FramebusReplyHandler, Unit]
  
  @js.native
  trait FramebusPayload extends StObject {
    
    var data: js.UndefOr[String] = js.native
    
    var event: String = js.native
    
    var eventData: js.UndefOr[FramebusSubscriberArg] = js.native
    
    var origin: String = js.native
    
    var reply: js.UndefOr[String | ReplyFunction] = js.native
  }
  object FramebusPayload {
    
    @scala.inline
    def apply(event: String, origin: String): FramebusPayload = {
      val __obj = js.Dynamic.literal(event = event.asInstanceOf[js.Any], origin = origin.asInstanceOf[js.Any])
      __obj.asInstanceOf[FramebusPayload]
    }
    
    @scala.inline
    implicit class FramebusPayloadMutableBuilder[Self <: FramebusPayload] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setData(value: String): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDataUndefined: Self = StObject.set(x, "data", js.undefined)
      
      @scala.inline
      def setEvent(value: String): Self = StObject.set(x, "event", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setEventData(value: FramebusSubscriberArg): Self = StObject.set(x, "eventData", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setEventDataUndefined: Self = StObject.set(x, "eventData", js.undefined)
      
      @scala.inline
      def setOrigin(value: String): Self = StObject.set(x, "origin", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setReply(value: String | ReplyFunction): Self = StObject.set(x, "reply", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setReplyFunction1(value: /* repeated */ js.Any => Unit): Self = StObject.set(x, "reply", js.Any.fromFunction1(value))
      
      @scala.inline
      def setReplyUndefined: Self = StObject.set(x, "reply", js.undefined)
    }
  }
  
  type FramebusReplyHandler = js.Function1[/* data */ js.Any, Unit]
  
  type FramebusSubscribeHandler = js.Function2[
    /* data */ js.UndefOr[
      FramebusSubscriberArg | (/* import warning: SimplifyRecursiveTypeAlias.enterTsTypeRef rewrittenOpt applyOrElse Simplified recursive type alias framebus.framebus/dist/lib/types.FramebusSubscribeHandler */ js.Object)
    ], 
    /* reply */ js.UndefOr[
      /* import warning: SimplifyRecursiveTypeAlias.enterTsTypeRef rewrittenOpt applyOrElse Simplified recursive type alias framebus.framebus/dist/lib/types.FramebusSubscribeHandler */ js.Object
    ], 
    Unit
  ]
  
  type FramebusSubscriber = Record[String, FramebusSubscription]
  
  type FramebusSubscriberArg = Record[String, js.Any]
  
  type FramebusSubscription = Record[String, js.Array[FramebusSubscribeHandler]]
  
  type ReplyFunction = js.Function1[/* repeated */ js.Any, Unit]
  
  object global {
    
    @js.native
    trait Window extends StObject {
      
      def Window(): typings.framebus.typesMod.global.Window = js.native
    }
    object Window {
      
      @scala.inline
      def apply(Window: () => Window): Window = {
        val __obj = js.Dynamic.literal(Window = js.Any.fromFunction0(Window))
        __obj.asInstanceOf[Window]
      }
      
      @scala.inline
      implicit class WindowMutableBuilder[Self <: Window] (val x: Self) extends AnyVal {
        
        @scala.inline
        def setWindow(value: () => Window): Self = StObject.set(x, "Window", js.Any.fromFunction0(value))
      }
    }
  }
}
