package typings.endOfStream

import typings.node.NodeJS.ReadableStream
import typings.node.NodeJS.WritableStream
import typings.std.Error
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("end-of-stream", JSImport.Namespace)
  @js.native
  def apply(stream: Stream): js.Function0[Unit] = js.native
  @JSImport("end-of-stream", JSImport.Namespace)
  @js.native
  def apply(stream: Stream, callback: Callback): js.Function0[Unit] = js.native
  @JSImport("end-of-stream", JSImport.Namespace)
  @js.native
  def apply(stream: Stream, options: Options): js.Function0[Unit] = js.native
  @JSImport("end-of-stream", JSImport.Namespace)
  @js.native
  def apply(stream: Stream, options: Options, callback: Callback): js.Function0[Unit] = js.native
  
  type Callback = js.Function1[/* error */ js.UndefOr[Error | Null], Unit]
  
  @js.native
  trait Options extends StObject {
    
    var error: js.UndefOr[Boolean] = js.native
    
    var readable: js.UndefOr[Boolean] = js.native
    
    var writable: js.UndefOr[Boolean] = js.native
  }
  object Options {
    
    @scala.inline
    def apply(): Options = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Options]
    }
    
    @scala.inline
    implicit class OptionsMutableBuilder[Self <: Options] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setError(value: Boolean): Self = StObject.set(x, "error", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setErrorUndefined: Self = StObject.set(x, "error", js.undefined)
      
      @scala.inline
      def setReadable(value: Boolean): Self = StObject.set(x, "readable", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setReadableUndefined: Self = StObject.set(x, "readable", js.undefined)
      
      @scala.inline
      def setWritable(value: Boolean): Self = StObject.set(x, "writable", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setWritableUndefined: Self = StObject.set(x, "writable", js.undefined)
    }
  }
  
  type Stream = ReadableStream | WritableStream
}
