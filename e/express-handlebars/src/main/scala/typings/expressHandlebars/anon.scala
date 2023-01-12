package typings.expressHandlebars

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  trait Views extends StObject {
    
    var views: String | js.Array[String]
  }
  object Views {
    
    inline def apply(views: String | js.Array[String]): Views = {
      val __obj = js.Dynamic.literal(views = views.asInstanceOf[js.Any])
      __obj.asInstanceOf[Views]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Views] (val x: Self) extends AnyVal {
      
      inline def setViews(value: String | js.Array[String]): Self = StObject.set(x, "views", value.asInstanceOf[js.Any])
      
      inline def setViewsVarargs(value: String*): Self = StObject.set(x, "views", js.Array(value*))
    }
  }
}
