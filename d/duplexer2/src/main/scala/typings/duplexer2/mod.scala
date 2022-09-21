package typings.duplexer2

import typings.node.streamMod.DuplexOptions
import typings.std.ReadableStream
import typings.std.WritableStream
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  inline def apply(options: Duplexer2Options, writable: WritableStream[Any], readable: ReadableStream[Any]): Any = (^.asInstanceOf[js.Dynamic].apply(options.asInstanceOf[js.Any], writable.asInstanceOf[js.Any], readable.asInstanceOf[js.Any])).asInstanceOf[Any]
  inline def apply(writable: WritableStream[Any], readable: ReadableStream[Any]): Any = (^.asInstanceOf[js.Dynamic].apply(writable.asInstanceOf[js.Any], readable.asInstanceOf[js.Any])).asInstanceOf[Any]
  
  @JSImport("duplexer2", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  trait Duplexer2Options
    extends StObject
       with DuplexOptions {
    
    var bubbleErrors: js.UndefOr[Boolean] = js.undefined
  }
  object Duplexer2Options {
    
    inline def apply(): Duplexer2Options = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Duplexer2Options]
    }
    
    extension [Self <: Duplexer2Options](x: Self) {
      
      inline def setBubbleErrors(value: Boolean): Self = StObject.set(x, "bubbleErrors", value.asInstanceOf[js.Any])
      
      inline def setBubbleErrorsUndefined: Self = StObject.set(x, "bubbleErrors", js.undefined)
    }
  }
}
