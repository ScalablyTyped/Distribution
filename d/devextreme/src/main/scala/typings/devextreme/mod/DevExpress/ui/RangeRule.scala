package typings.devextreme.mod.DevExpress.ui

import typings.devextreme.devextremeStrings.range
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait RangeRule
  extends StObject
     with ValidationRule {
  
  /**
    * If set to true, empty values are valid.
    */
  var ignoreEmptyValue: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Specifies the maximum value allowed for the validated value.
    */
  var max: js.UndefOr[js.Date | Double] = js.undefined
  
  /**
    * Specifies the message that is shown if the rule is broken.
    */
  var message: js.UndefOr[String] = js.undefined
  
  /**
    * Specifies the minimum value allowed for the validated value.
    */
  var min: js.UndefOr[js.Date | Double] = js.undefined
  
  /**
    * Indicates whether the rule should be always checked for the target value or only when the target value changes.
    */
  var reevaluate: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Specifies the rule type. Set it to &apos;range&apos; to use the RangeRule.
    */
  var `type`: range
}
object RangeRule {
  
  inline def apply(): RangeRule = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")("range")
    __obj.asInstanceOf[RangeRule]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: RangeRule] (val x: Self) extends AnyVal {
    
    inline def setIgnoreEmptyValue(value: Boolean): Self = StObject.set(x, "ignoreEmptyValue", value.asInstanceOf[js.Any])
    
    inline def setIgnoreEmptyValueUndefined: Self = StObject.set(x, "ignoreEmptyValue", js.undefined)
    
    inline def setMax(value: js.Date | Double): Self = StObject.set(x, "max", value.asInstanceOf[js.Any])
    
    inline def setMaxUndefined: Self = StObject.set(x, "max", js.undefined)
    
    inline def setMessage(value: String): Self = StObject.set(x, "message", value.asInstanceOf[js.Any])
    
    inline def setMessageUndefined: Self = StObject.set(x, "message", js.undefined)
    
    inline def setMin(value: js.Date | Double): Self = StObject.set(x, "min", value.asInstanceOf[js.Any])
    
    inline def setMinUndefined: Self = StObject.set(x, "min", js.undefined)
    
    inline def setReevaluate(value: Boolean): Self = StObject.set(x, "reevaluate", value.asInstanceOf[js.Any])
    
    inline def setReevaluateUndefined: Self = StObject.set(x, "reevaluate", js.undefined)
    
    inline def setType(value: range): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
