package typings.duplexer3

import typings.node.streamMod.Duplex
import typings.node.streamMod.DuplexOptions
import typings.std.ReadableStream
import typings.std.WritableStream
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  inline def apply(options: Options, writableStream: WritableStream[Any], readableStream: ReadableStream[Any]): Duplex = (^.asInstanceOf[js.Dynamic].apply(options.asInstanceOf[js.Any], writableStream.asInstanceOf[js.Any], readableStream.asInstanceOf[js.Any])).asInstanceOf[Duplex]
  inline def apply(writableStream: WritableStream[Any], readableStream: ReadableStream[Any]): Duplex = (^.asInstanceOf[js.Dynamic].apply(writableStream.asInstanceOf[js.Any], readableStream.asInstanceOf[js.Any])).asInstanceOf[Duplex]
  
  @JSImport("duplexer3", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  trait Options
    extends StObject
       with DuplexOptions {
    
    var bubbleErrors: js.UndefOr[Boolean] = js.undefined
  }
  object Options {
    
    inline def apply(): Options = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Options]
    }
    
    extension [Self <: Options](x: Self) {
      
      inline def setBubbleErrors(value: Boolean): Self = StObject.set(x, "bubbleErrors", value.asInstanceOf[js.Any])
      
      inline def setBubbleErrorsUndefined: Self = StObject.set(x, "bubbleErrors", js.undefined)
    }
  }
}
