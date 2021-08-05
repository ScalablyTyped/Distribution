package typings.endOfStream

import typings.node.NodeJS.ReadableStream
import typings.node.NodeJS.WritableStream
import typings.std.Error
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  inline def apply(stream: Stream): js.Function0[Unit] = ^.asInstanceOf[js.Dynamic].apply(stream.asInstanceOf[js.Any]).asInstanceOf[js.Function0[Unit]]
  inline def apply(stream: Stream, callback: Callback): js.Function0[Unit] = (^.asInstanceOf[js.Dynamic].apply(stream.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[js.Function0[Unit]]
  inline def apply(stream: Stream, options: Options): js.Function0[Unit] = (^.asInstanceOf[js.Dynamic].apply(stream.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Function0[Unit]]
  inline def apply(stream: Stream, options: Options, callback: Callback): js.Function0[Unit] = (^.asInstanceOf[js.Dynamic].apply(stream.asInstanceOf[js.Any], options.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[js.Function0[Unit]]
  
  @JSImport("end-of-stream", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  type Callback = js.Function1[/* error */ js.UndefOr[Error | Null], Unit]
  
  trait Options extends StObject {
    
    var error: js.UndefOr[Boolean] = js.undefined
    
    var readable: js.UndefOr[Boolean] = js.undefined
    
    var writable: js.UndefOr[Boolean] = js.undefined
  }
  object Options {
    
    inline def apply(): Options = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Options]
    }
    
    extension [Self <: Options](x: Self) {
      
      inline def setError(value: Boolean): Self = StObject.set(x, "error", value.asInstanceOf[js.Any])
      
      inline def setErrorUndefined: Self = StObject.set(x, "error", js.undefined)
      
      inline def setReadable(value: Boolean): Self = StObject.set(x, "readable", value.asInstanceOf[js.Any])
      
      inline def setReadableUndefined: Self = StObject.set(x, "readable", js.undefined)
      
      inline def setWritable(value: Boolean): Self = StObject.set(x, "writable", value.asInstanceOf[js.Any])
      
      inline def setWritableUndefined: Self = StObject.set(x, "writable", js.undefined)
    }
  }
  
  type Stream = ReadableStream | WritableStream
}
