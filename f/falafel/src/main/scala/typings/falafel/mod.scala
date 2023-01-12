package typings.falafel

import org.scalablytyped.runtime.NumberDictionary
import org.scalablytyped.runtime.StringDictionary
import typings.node.bufferMod.global.Buffer
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  inline def apply(src: String, fn: WalkerFunction): Result = (^.asInstanceOf[js.Dynamic].apply(src.asInstanceOf[js.Any], fn.asInstanceOf[js.Any])).asInstanceOf[Result]
  inline def apply(src: String, opts: OptionsObject, fn: WalkerFunction): Result = (^.asInstanceOf[js.Dynamic].apply(src.asInstanceOf[js.Any], opts.asInstanceOf[js.Any], fn.asInstanceOf[js.Any])).asInstanceOf[Result]
  inline def apply(src: FullOptionsObject, fn: WalkerFunction): Result = (^.asInstanceOf[js.Dynamic].apply(src.asInstanceOf[js.Any], fn.asInstanceOf[js.Any])).asInstanceOf[Result]
  inline def apply(src: Buffer, fn: WalkerFunction): Result = (^.asInstanceOf[js.Dynamic].apply(src.asInstanceOf[js.Any], fn.asInstanceOf[js.Any])).asInstanceOf[Result]
  inline def apply(src: Buffer, opts: OptionsObject, fn: WalkerFunction): Result = (^.asInstanceOf[js.Dynamic].apply(src.asInstanceOf[js.Any], opts.asInstanceOf[js.Any], fn.asInstanceOf[js.Any])).asInstanceOf[Result]
  
  @JSImport("falafel", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  trait FullOptionsObject
    extends StObject
       with OptionsObject {
    
    var src: String
  }
  object FullOptionsObject {
    
    inline def apply(parser: Any, src: String): FullOptionsObject = {
      val __obj = js.Dynamic.literal(parser = parser.asInstanceOf[js.Any], src = src.asInstanceOf[js.Any])
      __obj.asInstanceOf[FullOptionsObject]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: FullOptionsObject] (val x: Self) extends AnyVal {
      
      inline def setSrc(value: String): Self = StObject.set(x, "src", value.asInstanceOf[js.Any])
    }
  }
  
  trait OptionsObject
    extends StObject
       with /* key */ NumberDictionary[Any]
       with /* key */ StringDictionary[Any] {
    
    var parser: Any
  }
  object OptionsObject {
    
    inline def apply(parser: Any): OptionsObject = {
      val __obj = js.Dynamic.literal(parser = parser.asInstanceOf[js.Any])
      __obj.asInstanceOf[OptionsObject]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: OptionsObject] (val x: Self) extends AnyVal {
      
      inline def setParser(value: Any): Self = StObject.set(x, "parser", value.asInstanceOf[js.Any])
    }
  }
  
  trait Result extends StObject {
    
    var chunks: js.Array[Any]
    
    def inspect(): String
  }
  object Result {
    
    inline def apply(chunks: js.Array[Any], inspect: () => String): Result = {
      val __obj = js.Dynamic.literal(chunks = chunks.asInstanceOf[js.Any], inspect = js.Any.fromFunction0(inspect))
      __obj.asInstanceOf[Result]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Result] (val x: Self) extends AnyVal {
      
      inline def setChunks(value: js.Array[Any]): Self = StObject.set(x, "chunks", value.asInstanceOf[js.Any])
      
      inline def setChunksVarargs(value: Any*): Self = StObject.set(x, "chunks", js.Array(value*))
      
      inline def setInspect(value: () => String): Self = StObject.set(x, "inspect", js.Any.fromFunction0(value))
    }
  }
  
  type WalkerFunction = js.Function2[/* nodeOrChild */ Any, /* nodeOrNull */ Any, Unit]
}
