package typings.ellipsize

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  trait Chars extends StObject {
    
    /**
      * after this char(s) the text can be ellipsized and the ellipse
      * rendered. (default: [' ', '-'])
      */
    var chars: js.UndefOr[js.Array[String]] = js.undefined
    
    /**
      * ellipse element (default: '...')
      */
    var ellipse: js.UndefOr[String] = js.undefined
    
    /**
      * truncate the text or not (default: true)
      */
    var truncate: js.UndefOr[Boolean] = js.undefined
  }
  object Chars {
    
    inline def apply(): Chars = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Chars]
    }
    
    extension [Self <: Chars](x: Self) {
      
      inline def setChars(value: js.Array[String]): Self = StObject.set(x, "chars", value.asInstanceOf[js.Any])
      
      inline def setCharsUndefined: Self = StObject.set(x, "chars", js.undefined)
      
      inline def setCharsVarargs(value: String*): Self = StObject.set(x, "chars", js.Array(value :_*))
      
      inline def setEllipse(value: String): Self = StObject.set(x, "ellipse", value.asInstanceOf[js.Any])
      
      inline def setEllipseUndefined: Self = StObject.set(x, "ellipse", js.undefined)
      
      inline def setTruncate(value: Boolean): Self = StObject.set(x, "truncate", value.asInstanceOf[js.Any])
      
      inline def setTruncateUndefined: Self = StObject.set(x, "truncate", js.undefined)
    }
  }
}
