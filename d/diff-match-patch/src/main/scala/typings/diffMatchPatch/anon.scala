package typings.diffMatchPatch

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  @js.native
  trait Chars1 extends StObject {
    
    var chars1: String = js.native
    
    var chars2: String = js.native
    
    var lineArray: js.Array[String] = js.native
  }
  object Chars1 {
    
    @scala.inline
    def apply(chars1: String, chars2: String, lineArray: js.Array[String]): Chars1 = {
      val __obj = js.Dynamic.literal(chars1 = chars1.asInstanceOf[js.Any], chars2 = chars2.asInstanceOf[js.Any], lineArray = lineArray.asInstanceOf[js.Any])
      __obj.asInstanceOf[Chars1]
    }
    
    @scala.inline
    implicit class Chars1MutableBuilder[Self <: Chars1] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setChars1(value: String): Self = StObject.set(x, "chars1", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setChars2(value: String): Self = StObject.set(x, "chars2", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLineArray(value: js.Array[String]): Self = StObject.set(x, "lineArray", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLineArrayVarargs(value: String*): Self = StObject.set(x, "lineArray", js.Array(value :_*))
    }
  }
}
