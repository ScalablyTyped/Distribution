package typings.emojione

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  @js.native
  trait Fname extends StObject {
    
    var fname: String = js.native
    
    var isCanonical: Boolean = js.native
    
    var uc: String = js.native
    
    var unicode: js.Array[String] = js.native
  }
  object Fname {
    
    @scala.inline
    def apply(fname: String, isCanonical: Boolean, uc: String, unicode: js.Array[String]): Fname = {
      val __obj = js.Dynamic.literal(fname = fname.asInstanceOf[js.Any], isCanonical = isCanonical.asInstanceOf[js.Any], uc = uc.asInstanceOf[js.Any], unicode = unicode.asInstanceOf[js.Any])
      __obj.asInstanceOf[Fname]
    }
    
    @scala.inline
    implicit class FnameMutableBuilder[Self <: Fname] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setFname(value: String): Self = StObject.set(x, "fname", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIsCanonical(value: Boolean): Self = StObject.set(x, "isCanonical", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setUc(value: String): Self = StObject.set(x, "uc", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setUnicode(value: js.Array[String]): Self = StObject.set(x, "unicode", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setUnicodeVarargs(value: String*): Self = StObject.set(x, "unicode", js.Array(value :_*))
    }
  }
}
