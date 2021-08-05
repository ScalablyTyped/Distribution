package typings.gaeaModel.FitGaea

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait EventTriggerCondition extends StObject {
  
  var name: String
  
  // 是否由自己的生命周期触发
  var selfCallback: js.UndefOr[Boolean] = js.undefined
  
  // 触发类型
  var `type`: String
}
object EventTriggerCondition {
  
  inline def apply(name: String, `type`: String): EventTriggerCondition = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[EventTriggerCondition]
  }
  
  extension [Self <: EventTriggerCondition](x: Self) {
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setSelfCallback(value: Boolean): Self = StObject.set(x, "selfCallback", value.asInstanceOf[js.Any])
    
    inline def setSelfCallbackUndefined: Self = StObject.set(x, "selfCallback", js.undefined)
    
    inline def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
