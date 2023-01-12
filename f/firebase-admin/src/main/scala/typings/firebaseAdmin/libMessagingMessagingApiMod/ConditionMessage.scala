package typings.firebaseAdmin.libMessagingMessagingApiMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ConditionMessage
  extends StObject
     with BaseMessage
     with Message {
  
  var condition: String
}
object ConditionMessage {
  
  inline def apply(condition: String): ConditionMessage = {
    val __obj = js.Dynamic.literal(condition = condition.asInstanceOf[js.Any])
    __obj.asInstanceOf[ConditionMessage]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ConditionMessage] (val x: Self) extends AnyVal {
    
    inline def setCondition(value: String): Self = StObject.set(x, "condition", value.asInstanceOf[js.Any])
  }
}
