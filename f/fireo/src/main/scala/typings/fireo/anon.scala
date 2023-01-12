package typings.fireo

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  trait Cursor extends StObject {
    
    var cursor: String
    
    var list: js.Array[Any]
  }
  object Cursor {
    
    inline def apply(cursor: String, list: js.Array[Any]): Cursor = {
      val __obj = js.Dynamic.literal(cursor = cursor.asInstanceOf[js.Any], list = list.asInstanceOf[js.Any])
      __obj.asInstanceOf[Cursor]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Cursor] (val x: Self) extends AnyVal {
      
      inline def setCursor(value: String): Self = StObject.set(x, "cursor", value.asInstanceOf[js.Any])
      
      inline def setList(value: js.Array[Any]): Self = StObject.set(x, "list", value.asInstanceOf[js.Any])
      
      inline def setListVarargs(value: Any*): Self = StObject.set(x, "list", js.Array(value*))
    }
  }
}
