package typings.googleapis.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ActionCondition extends StObject {
  
  var action: js.UndefOr[`10`] = js.undefined
  
  var condition: js.UndefOr[CreatedBefore] = js.undefined
}
object ActionCondition {
  
  inline def apply(): ActionCondition = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ActionCondition]
  }
  
  extension [Self <: ActionCondition](x: Self) {
    
    inline def setAction(value: `10`): Self = StObject.set(x, "action", value.asInstanceOf[js.Any])
    
    inline def setActionUndefined: Self = StObject.set(x, "action", js.undefined)
    
    inline def setCondition(value: CreatedBefore): Self = StObject.set(x, "condition", value.asInstanceOf[js.Any])
    
    inline def setConditionUndefined: Self = StObject.set(x, "condition", js.undefined)
  }
}
