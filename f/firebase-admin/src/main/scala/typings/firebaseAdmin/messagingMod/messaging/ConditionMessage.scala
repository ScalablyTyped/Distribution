package typings.firebaseAdmin.messagingMod.messaging

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ConditionMessage
  extends BaseMessage
     with Message {
  
  var condition: String = js.native
}
object ConditionMessage {
  
  @scala.inline
  def apply(condition: String): ConditionMessage = {
    val __obj = js.Dynamic.literal(condition = condition.asInstanceOf[js.Any])
    __obj.asInstanceOf[ConditionMessage]
  }
  
  @scala.inline
  implicit class ConditionMessageMutableBuilder[Self <: ConditionMessage] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCondition(value: String): Self = StObject.set(x, "condition", value.asInstanceOf[js.Any])
  }
}
