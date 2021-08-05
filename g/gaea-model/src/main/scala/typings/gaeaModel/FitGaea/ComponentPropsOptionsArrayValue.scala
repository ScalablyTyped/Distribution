package typings.gaeaModel.FitGaea

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ComponentPropsOptionsArrayValue extends StObject {
  
  /**
    * ComponentPropsOptionsArray 设置的 key
    */
  var key: String
  
  /**
    * 用户填入的值
    */
  var value: Double | String
}
object ComponentPropsOptionsArrayValue {
  
  inline def apply(key: String, value: Double | String): ComponentPropsOptionsArrayValue = {
    val __obj = js.Dynamic.literal(key = key.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    __obj.asInstanceOf[ComponentPropsOptionsArrayValue]
  }
  
  extension [Self <: ComponentPropsOptionsArrayValue](x: Self) {
    
    inline def setKey(value: String): Self = StObject.set(x, "key", value.asInstanceOf[js.Any])
    
    inline def setValue(value: Double | String): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
  }
}
