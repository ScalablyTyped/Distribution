package typings.engineIoParser

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  trait Compress extends StObject {
    
    var compress: Boolean
  }
  object Compress {
    
    inline def apply(compress: Boolean): Compress = {
      val __obj = js.Dynamic.literal(compress = compress.asInstanceOf[js.Any])
      __obj.asInstanceOf[Compress]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Compress] (val x: Self) extends AnyVal {
      
      inline def setCompress(value: Boolean): Self = StObject.set(x, "compress", value.asInstanceOf[js.Any])
    }
  }
}
