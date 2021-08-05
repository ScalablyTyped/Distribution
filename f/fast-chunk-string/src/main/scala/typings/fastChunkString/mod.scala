package typings.fastChunkString

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  inline def apply(str: String, options: Options): js.Array[String] = (^.asInstanceOf[js.Dynamic].apply(str.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Array[String]]
  
  @JSImport("fast-chunk-string", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  trait Options extends StObject {
    
    var size: Double
    
    var unicodeAware: js.UndefOr[Boolean] = js.undefined
  }
  object Options {
    
    inline def apply(size: Double): Options = {
      val __obj = js.Dynamic.literal(size = size.asInstanceOf[js.Any])
      __obj.asInstanceOf[Options]
    }
    
    extension [Self <: Options](x: Self) {
      
      inline def setSize(value: Double): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
      
      inline def setUnicodeAware(value: Boolean): Self = StObject.set(x, "unicodeAware", value.asInstanceOf[js.Any])
      
      inline def setUnicodeAwareUndefined: Self = StObject.set(x, "unicodeAware", js.undefined)
    }
  }
}
