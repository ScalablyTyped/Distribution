package typings.documentdb

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  @js.native
  trait Condition extends StObject {
    
    /** Conditional HTTP method header value. */
    var condition: String = js.native
    
    /** Conditional HTTP method header type. */
    var `type`: String = js.native
  }
  object Condition {
    
    @scala.inline
    def apply(condition: String, `type`: String): Condition = {
      val __obj = js.Dynamic.literal(condition = condition.asInstanceOf[js.Any])
      __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
      __obj.asInstanceOf[Condition]
    }
    
    @scala.inline
    implicit class ConditionMutableBuilder[Self <: Condition] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setCondition(value: String): Self = StObject.set(x, "condition", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    }
  }
}
