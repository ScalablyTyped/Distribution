package typings.freedom

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  trait Channel extends StObject {
    
    var channel: String
  }
  object Channel {
    
    @scala.inline
    def apply(channel: String): Channel = {
      val __obj = js.Dynamic.literal(channel = channel.asInstanceOf[js.Any])
      __obj.asInstanceOf[Channel]
    }
    
    @scala.inline
    implicit class ChannelMutableBuilder[Self <: Channel] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setChannel(value: String): Self = StObject.set(x, "channel", value.asInstanceOf[js.Any])
    }
  }
  
  trait RemoveEventListener extends StObject {
    
    def removeEventListener(s: String, f: js.Function, b: Boolean): Unit
  }
  object RemoveEventListener {
    
    @scala.inline
    def apply(removeEventListener: (String, js.Function, Boolean) => Unit): RemoveEventListener = {
      val __obj = js.Dynamic.literal(removeEventListener = js.Any.fromFunction3(removeEventListener))
      __obj.asInstanceOf[RemoveEventListener]
    }
    
    @scala.inline
    implicit class RemoveEventListenerMutableBuilder[Self <: RemoveEventListener] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setRemoveEventListener(value: (String, js.Function, Boolean) => Unit): Self = StObject.set(x, "removeEventListener", js.Any.fromFunction3(value))
    }
  }
  
  trait Stream extends StObject {
    
    var stream: Double
  }
  object Stream {
    
    @scala.inline
    def apply(stream: Double): Stream = {
      val __obj = js.Dynamic.literal(stream = stream.asInstanceOf[js.Any])
      __obj.asInstanceOf[Stream]
    }
    
    @scala.inline
    implicit class StreamMutableBuilder[Self <: Stream] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setStream(value: Double): Self = StObject.set(x, "stream", value.asInstanceOf[js.Any])
    }
  }
  
  trait Views extends StObject {
    
    var views: StringDictionary[js.Object]
  }
  object Views {
    
    @scala.inline
    def apply(views: StringDictionary[js.Object]): Views = {
      val __obj = js.Dynamic.literal(views = views.asInstanceOf[js.Any])
      __obj.asInstanceOf[Views]
    }
    
    @scala.inline
    implicit class ViewsMutableBuilder[Self <: Views] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setViews(value: StringDictionary[js.Object]): Self = StObject.set(x, "views", value.asInstanceOf[js.Any])
    }
  }
}
