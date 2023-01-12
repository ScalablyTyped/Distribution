package typings.fullcalendarCommon.anon

import typings.fullcalendarCommon.fullcalendarCommonStrings.SET_OPTION
import typings.fullcalendarCommon.mod.Action
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait OptionName
  extends StObject
     with Action {
  
  var optionName: String
  
  var rawOptionValue: Any
  
  var `type`: SET_OPTION
}
object OptionName {
  
  inline def apply(optionName: String, rawOptionValue: Any): OptionName = {
    val __obj = js.Dynamic.literal(optionName = optionName.asInstanceOf[js.Any], rawOptionValue = rawOptionValue.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("SET_OPTION")
    __obj.asInstanceOf[OptionName]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: OptionName] (val x: Self) extends AnyVal {
    
    inline def setOptionName(value: String): Self = StObject.set(x, "optionName", value.asInstanceOf[js.Any])
    
    inline def setRawOptionValue(value: Any): Self = StObject.set(x, "rawOptionValue", value.asInstanceOf[js.Any])
    
    inline def setType(value: SET_OPTION): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
