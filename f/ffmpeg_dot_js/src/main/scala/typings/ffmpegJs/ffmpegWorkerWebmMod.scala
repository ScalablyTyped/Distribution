package typings.ffmpegJs

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object ffmpegWorkerWebmMod {
  
  @JSImport("ffmpeg.js/ffmpeg-worker-webm", JSImport.Namespace)
  @js.native
  class ^ () extends Worker {
    def this(someParam: String) = this()
  }
  
  @js.native
  trait Data extends StObject {
    
    var data: String = js.native
    
    var `type`: String = js.native
  }
  object Data {
    
    @scala.inline
    def apply(data: String, `type`: String): Data = {
      val __obj = js.Dynamic.literal(data = data.asInstanceOf[js.Any])
      __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
      __obj.asInstanceOf[Data]
    }
    
    @scala.inline
    implicit class DataMutableBuilder[Self <: Data] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setData(value: String): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait OnMessageOptions extends StObject {
    
    var data: Data = js.native
  }
  object OnMessageOptions {
    
    @scala.inline
    def apply(data: Data): OnMessageOptions = {
      val __obj = js.Dynamic.literal(data = data.asInstanceOf[js.Any])
      __obj.asInstanceOf[OnMessageOptions]
    }
    
    @scala.inline
    implicit class OnMessageOptionsMutableBuilder[Self <: OnMessageOptions] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setData(value: Data): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait PostMessageOptions extends StObject {
    
    var arguments: js.Array[String] = js.native
    
    var `type`: String = js.native
  }
  object PostMessageOptions {
    
    @scala.inline
    def apply(arguments: js.Array[String], `type`: String): PostMessageOptions = {
      val __obj = js.Dynamic.literal(arguments = arguments.asInstanceOf[js.Any])
      __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
      __obj.asInstanceOf[PostMessageOptions]
    }
    
    @scala.inline
    implicit class PostMessageOptionsMutableBuilder[Self <: PostMessageOptions] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setArguments(value: js.Array[String]): Self = StObject.set(x, "arguments", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setArgumentsVarargs(value: String*): Self = StObject.set(x, "arguments", js.Array(value :_*))
      
      @scala.inline
      def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait Worker extends StObject {
    
    def onmessage(opts: OnMessageOptions): Unit = js.native
    
    def postMessage(opts: PostMessageOptions): Unit = js.native
    
    def terminate(): Unit = js.native
  }
  object Worker {
    
    @scala.inline
    def apply(
      onmessage: OnMessageOptions => Unit,
      postMessage: PostMessageOptions => Unit,
      terminate: () => Unit
    ): Worker = {
      val __obj = js.Dynamic.literal(onmessage = js.Any.fromFunction1(onmessage), postMessage = js.Any.fromFunction1(postMessage), terminate = js.Any.fromFunction0(terminate))
      __obj.asInstanceOf[Worker]
    }
    
    @scala.inline
    implicit class WorkerMutableBuilder[Self <: Worker] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setOnmessage(value: OnMessageOptions => Unit): Self = StObject.set(x, "onmessage", js.Any.fromFunction1(value))
      
      @scala.inline
      def setPostMessage(value: PostMessageOptions => Unit): Self = StObject.set(x, "postMessage", js.Any.fromFunction1(value))
      
      @scala.inline
      def setTerminate(value: () => Unit): Self = StObject.set(x, "terminate", js.Any.fromFunction0(value))
    }
  }
}
