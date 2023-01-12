package typings.easyXHeaders

import typings.node.bufferMod.global.Buffer
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object stringDecoderMod {
  
  /* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
  @JSImport("string_decoder", "StringDecoder")
  @js.native
  open class StringDecoder protected ()
    extends StObject
       with NodeStringDecoder {
    def this(encoding: String) = this()
    
    /* CompleteClass */
    override def detectIncompleteChar(buffer: Buffer): Double = js.native
    
    /* CompleteClass */
    override def write(buffer: Buffer): String = js.native
  }
  
  trait NodeStringDecoder extends StObject {
    
    def detectIncompleteChar(buffer: Buffer): Double
    
    def write(buffer: Buffer): String
  }
  object NodeStringDecoder {
    
    inline def apply(detectIncompleteChar: Buffer => Double, write: Buffer => String): NodeStringDecoder = {
      val __obj = js.Dynamic.literal(detectIncompleteChar = js.Any.fromFunction1(detectIncompleteChar), write = js.Any.fromFunction1(write))
      __obj.asInstanceOf[NodeStringDecoder]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: NodeStringDecoder] (val x: Self) extends AnyVal {
      
      inline def setDetectIncompleteChar(value: Buffer => Double): Self = StObject.set(x, "detectIncompleteChar", js.Any.fromFunction1(value))
      
      inline def setWrite(value: Buffer => String): Self = StObject.set(x, "write", js.Any.fromFunction1(value))
    }
  }
}
