package typings.duplexer3

import typings.node.NodeJS.ReadableStream
import typings.node.NodeJS.WritableStream
import typings.node.streamMod.Duplex
import typings.node.streamMod.DuplexOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("duplexer3", JSImport.Namespace)
  @js.native
  def apply(options: Options, writableStream: WritableStream, readableStream: ReadableStream): Duplex = js.native
  @JSImport("duplexer3", JSImport.Namespace)
  @js.native
  def apply(writableStream: WritableStream, readableStream: ReadableStream): Duplex = js.native
  
  @js.native
  trait Options extends DuplexOptions {
    
    var bubbleErrors: js.UndefOr[Boolean] = js.native
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
      def setBubbleErrors(value: Boolean): Self = StObject.set(x, "bubbleErrors", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setBubbleErrorsUndefined: Self = StObject.set(x, "bubbleErrors", js.undefined)
    }
  }
}
