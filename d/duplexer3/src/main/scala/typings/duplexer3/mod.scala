package typings.duplexer3

import typings.node.NodeJS.ReadableStream
import typings.node.NodeJS.WritableStream
import typings.node.streamMod.Duplex
import typings.node.streamMod.DuplexOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  inline def apply(options: Options, writableStream: WritableStream, readableStream: ReadableStream): Duplex = (^.asInstanceOf[js.Dynamic].apply(options.asInstanceOf[js.Any], writableStream.asInstanceOf[js.Any], readableStream.asInstanceOf[js.Any])).asInstanceOf[Duplex]
  inline def apply(writableStream: WritableStream, readableStream: ReadableStream): Duplex = (^.asInstanceOf[js.Dynamic].apply(writableStream.asInstanceOf[js.Any], readableStream.asInstanceOf[js.Any])).asInstanceOf[Duplex]
  
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
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Options] (val x: Self) extends AnyVal {
      
      inline def setBubbleErrors(value: Boolean): Self = StObject.set(x, "bubbleErrors", value.asInstanceOf[js.Any])
      
      inline def setBubbleErrorsUndefined: Self = StObject.set(x, "bubbleErrors", js.undefined)
    }
  }
}
