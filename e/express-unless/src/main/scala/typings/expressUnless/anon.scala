package typings.expressUnless

import typings.std.RegExp
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  trait Method extends StObject {
    
    var method: js.UndefOr[String | js.Array[String]] = js.undefined
    
    var methods: js.UndefOr[js.Array[String]] = js.undefined
    
    var url: String | RegExp
  }
  object Method {
    
    @scala.inline
    def apply(url: String | RegExp): Method = {
      val __obj = js.Dynamic.literal(url = url.asInstanceOf[js.Any])
      __obj.asInstanceOf[Method]
    }
    
    @scala.inline
    implicit class MethodMutableBuilder[Self <: Method] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setMethod(value: String | js.Array[String]): Self = StObject.set(x, "method", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMethodUndefined: Self = StObject.set(x, "method", js.undefined)
      
      @scala.inline
      def setMethodVarargs(value: String*): Self = StObject.set(x, "method", js.Array(value :_*))
      
      @scala.inline
      def setMethods(value: js.Array[String]): Self = StObject.set(x, "methods", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMethodsUndefined: Self = StObject.set(x, "methods", js.undefined)
      
      @scala.inline
      def setMethodsVarargs(value: String*): Self = StObject.set(x, "methods", js.Array(value :_*))
      
      @scala.inline
      def setUrl(value: String | RegExp): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
    }
  }
}
