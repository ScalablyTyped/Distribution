package typings.expressUnless

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  trait Method extends StObject {
    
    var method: js.UndefOr[String | js.Array[String]] = js.undefined
    
    var methods: js.UndefOr[js.Array[String]] = js.undefined
    
    var url: String | js.RegExp
  }
  object Method {
    
    inline def apply(url: String | js.RegExp): Method = {
      val __obj = js.Dynamic.literal(url = url.asInstanceOf[js.Any])
      __obj.asInstanceOf[Method]
    }
    
    extension [Self <: Method](x: Self) {
      
      inline def setMethod(value: String | js.Array[String]): Self = StObject.set(x, "method", value.asInstanceOf[js.Any])
      
      inline def setMethodUndefined: Self = StObject.set(x, "method", js.undefined)
      
      inline def setMethodVarargs(value: String*): Self = StObject.set(x, "method", js.Array(value*))
      
      inline def setMethods(value: js.Array[String]): Self = StObject.set(x, "methods", value.asInstanceOf[js.Any])
      
      inline def setMethodsUndefined: Self = StObject.set(x, "methods", js.undefined)
      
      inline def setMethodsVarargs(value: String*): Self = StObject.set(x, "methods", js.Array(value*))
      
      inline def setUrl(value: String | js.RegExp): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
    }
  }
}
