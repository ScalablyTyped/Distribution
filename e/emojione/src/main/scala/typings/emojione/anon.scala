package typings.emojione

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  trait Fname extends StObject {
    
    var fname: String
    
    var isCanonical: Boolean
    
    var uc: String
    
    var unicode: js.Array[String]
  }
  object Fname {
    
    inline def apply(fname: String, isCanonical: Boolean, uc: String, unicode: js.Array[String]): Fname = {
      val __obj = js.Dynamic.literal(fname = fname.asInstanceOf[js.Any], isCanonical = isCanonical.asInstanceOf[js.Any], uc = uc.asInstanceOf[js.Any], unicode = unicode.asInstanceOf[js.Any])
      __obj.asInstanceOf[Fname]
    }
    
    extension [Self <: Fname](x: Self) {
      
      inline def setFname(value: String): Self = StObject.set(x, "fname", value.asInstanceOf[js.Any])
      
      inline def setIsCanonical(value: Boolean): Self = StObject.set(x, "isCanonical", value.asInstanceOf[js.Any])
      
      inline def setUc(value: String): Self = StObject.set(x, "uc", value.asInstanceOf[js.Any])
      
      inline def setUnicode(value: js.Array[String]): Self = StObject.set(x, "unicode", value.asInstanceOf[js.Any])
      
      inline def setUnicodeVarargs(value: String*): Self = StObject.set(x, "unicode", js.Array(value :_*))
    }
  }
}
