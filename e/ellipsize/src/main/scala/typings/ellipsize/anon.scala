package typings.ellipsize

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  @js.native
  trait Chars extends StObject {
    
    /**
      * after this char(s) the text can be ellipsized and the ellipse
      * rendered. (default: [' ', '-'])
      */
    var chars: js.UndefOr[js.Array[String]] = js.native
    
    /**
      * ellipse element (default: '...')
      */
    var ellipse: js.UndefOr[String] = js.native
    
    /**
      * truncate the text or not (default: true)
      */
    var truncate: js.UndefOr[Boolean] = js.native
  }
  object Chars {
    
    @scala.inline
    def apply(): Chars = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Chars]
    }
    
    @scala.inline
    implicit class CharsMutableBuilder[Self <: Chars] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setChars(value: js.Array[String]): Self = StObject.set(x, "chars", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCharsUndefined: Self = StObject.set(x, "chars", js.undefined)
      
      @scala.inline
      def setCharsVarargs(value: String*): Self = StObject.set(x, "chars", js.Array(value :_*))
      
      @scala.inline
      def setEllipse(value: String): Self = StObject.set(x, "ellipse", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setEllipseUndefined: Self = StObject.set(x, "ellipse", js.undefined)
      
      @scala.inline
      def setTruncate(value: Boolean): Self = StObject.set(x, "truncate", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTruncateUndefined: Self = StObject.set(x, "truncate", js.undefined)
    }
  }
}
