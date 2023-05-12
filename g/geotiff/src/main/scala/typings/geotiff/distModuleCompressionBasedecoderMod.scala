package typings.geotiff

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distModuleCompressionBasedecoderMod {
  
  @JSImport("geotiff/dist-module/compression/basedecoder", JSImport.Default)
  @js.native
  open class default ()
    extends StObject
       with BaseDecoder {
    
    /* CompleteClass */
    override def decode(fileDirectory: Any, buffer: Any): js.Promise[Any] = js.native
  }
  
  trait BaseDecoder extends StObject {
    
    def decode(fileDirectory: Any, buffer: Any): js.Promise[Any]
  }
  object BaseDecoder {
    
    inline def apply(decode: (Any, Any) => js.Promise[Any]): BaseDecoder = {
      val __obj = js.Dynamic.literal(decode = js.Any.fromFunction2(decode))
      __obj.asInstanceOf[BaseDecoder]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: BaseDecoder] (val x: Self) extends AnyVal {
      
      inline def setDecode(value: (Any, Any) => js.Promise[Any]): Self = StObject.set(x, "decode", js.Any.fromFunction2(value))
    }
  }
}
