package typings.documentdb.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Trigger extends UserScriptable {
  
  /** The trigger operation. Should be one of 'all', 'create', 'update', 'delete', or 'replace'. */
  var triggerOperation: TriggerOperation = js.native
  
  /** The type of the trigger. Should be either 'pre' or 'post'. */
  var triggerType: js.UndefOr[TriggerType] = js.native
}
object Trigger {
  
  @scala.inline
  def apply(id: String, triggerOperation: TriggerOperation): Trigger = {
    val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any], triggerOperation = triggerOperation.asInstanceOf[js.Any])
    __obj.asInstanceOf[Trigger]
  }
  
  @scala.inline
  implicit class TriggerMutableBuilder[Self <: Trigger] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setTriggerOperation(value: TriggerOperation): Self = StObject.set(x, "triggerOperation", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTriggerType(value: TriggerType): Self = StObject.set(x, "triggerType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTriggerTypeUndefined: Self = StObject.set(x, "triggerType", js.undefined)
  }
}
