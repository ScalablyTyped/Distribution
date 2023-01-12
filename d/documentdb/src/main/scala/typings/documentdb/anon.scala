package typings.documentdb

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  trait Condition extends StObject {
    
    /** Conditional HTTP method header value. */
    var condition: String
    
    /** Conditional HTTP method header type. */
    var `type`: String
  }
  object Condition {
    
    inline def apply(condition: String, `type`: String): Condition = {
      val __obj = js.Dynamic.literal(condition = condition.asInstanceOf[js.Any])
      __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
      __obj.asInstanceOf[Condition]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Condition] (val x: Self) extends AnyVal {
      
      inline def setCondition(value: String): Self = StObject.set(x, "condition", value.asInstanceOf[js.Any])
      
      inline def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    }
  }
}
