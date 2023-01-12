package typings.firebaseAuth

import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object gapi {
  
  type LoadCallback = js.Function0[Unit]
  
  trait LoadConfig extends StObject
  
  trait LoadOptions extends StObject {
    
    var callback: js.UndefOr[LoadCallback] = js.undefined
    
    var ontimeout: js.UndefOr[LoadCallback] = js.undefined
    
    var timeout: js.UndefOr[Double] = js.undefined
  }
  object LoadOptions {
    
    inline def apply(): LoadOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[LoadOptions]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: LoadOptions] (val x: Self) extends AnyVal {
      
      inline def setCallback(value: () => Unit): Self = StObject.set(x, "callback", js.Any.fromFunction0(value))
      
      inline def setCallbackUndefined: Self = StObject.set(x, "callback", js.undefined)
      
      inline def setOntimeout(value: () => Unit): Self = StObject.set(x, "ontimeout", js.Any.fromFunction0(value))
      
      inline def setOntimeoutUndefined: Self = StObject.set(x, "ontimeout", js.undefined)
      
      inline def setTimeout(value: Double): Self = StObject.set(x, "timeout", value.asInstanceOf[js.Any])
      
      inline def setTimeoutUndefined: Self = StObject.set(x, "timeout", js.undefined)
    }
  }
  
  object iframes {
    
    type Callback = js.Function1[/* iframe */ Iframe, Unit]
    
    @js.native
    trait Context extends StObject {
      
      def open(options: Record[String, Any]): js.Promise[Iframe] = js.native
      def open(options: Record[String, Any], callback: Callback): js.Promise[Iframe] = js.native
    }
    
    @js.native
    trait Iframe extends StObject {
      
      def ping(callback: SendCallback): js.Promise[js.Array[Any]] = js.native
      def ping(callback: SendCallback, data: Any): js.Promise[js.Array[Any]] = js.native
      
      def register[T /* <: Message */](message: String, handler: MessageHandler[T]): Unit = js.native
      def register[T /* <: Message */](message: String, handler: MessageHandler[T], filter: IframesFilter): Unit = js.native
      
      def restyle(style: Record[String, String | Boolean]): js.Promise[js.Array[Any]] = js.native
      def restyle(style: Record[String, String | Boolean], callback: SendCallback): js.Promise[js.Array[Any]] = js.native
      
      def send[T /* <: Message */, U /* <: Message */](`type`: String, data: T): Unit = js.native
      def send[T /* <: Message */, U /* <: Message */](`type`: String, data: T, callback: Unit, filter: IframesFilter): Unit = js.native
      def send[T /* <: Message */, U /* <: Message */](`type`: String, data: T, callback: MessageHandler[U]): Unit = js.native
      def send[T /* <: Message */, U /* <: Message */](`type`: String, data: T, callback: MessageHandler[U], filter: IframesFilter): Unit = js.native
    }
    
    type IframesFilter = js.Function1[/* iframe */ Iframe, Boolean]
    
    trait Message extends StObject {
      
      var `type`: String
    }
    object Message {
      
      inline def apply(`type`: String): Message = {
        val __obj = js.Dynamic.literal()
        __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
        __obj.asInstanceOf[Message]
      }
      
      @scala.inline
      implicit open class MutableBuilder[Self <: Message] (val x: Self) extends AnyVal {
        
        inline def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
      }
    }
    
    type MessageHandler[T /* <: Message */] = js.Function1[/* message */ T, Any | js.Promise[Unit]]
    
    type SendCallback = js.Function0[Unit]
  }
}
