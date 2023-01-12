package typings.devextreme.mod.DevExpress.ui

import typings.devextreme.devextremeStrings.stringLength
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait StringLengthRule
  extends StObject
     with ValidationRule {
  
  /**
    * If set to true, empty values are valid.
    */
  var ignoreEmptyValue: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Specifies the maximum length allowed for the validated value.
    */
  var max: js.UndefOr[Double] = js.undefined
  
  /**
    * Specifies the message that is shown if the rule is broken.
    */
  var message: js.UndefOr[String] = js.undefined
  
  /**
    * Specifies the minimum length allowed for the validated value.
    */
  var min: js.UndefOr[Double] = js.undefined
  
  /**
    * Indicates whether or not to remove the Space characters from the validated value.
    */
  var trim: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Specifies the rule type. Set it to &apos;stringLength&apos; to use the StringLengthRule.
    */
  var `type`: stringLength
}
object StringLengthRule {
  
  inline def apply(): StringLengthRule = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")("stringLength")
    __obj.asInstanceOf[StringLengthRule]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: StringLengthRule] (val x: Self) extends AnyVal {
    
    inline def setIgnoreEmptyValue(value: Boolean): Self = StObject.set(x, "ignoreEmptyValue", value.asInstanceOf[js.Any])
    
    inline def setIgnoreEmptyValueUndefined: Self = StObject.set(x, "ignoreEmptyValue", js.undefined)
    
    inline def setMax(value: Double): Self = StObject.set(x, "max", value.asInstanceOf[js.Any])
    
    inline def setMaxUndefined: Self = StObject.set(x, "max", js.undefined)
    
    inline def setMessage(value: String): Self = StObject.set(x, "message", value.asInstanceOf[js.Any])
    
    inline def setMessageUndefined: Self = StObject.set(x, "message", js.undefined)
    
    inline def setMin(value: Double): Self = StObject.set(x, "min", value.asInstanceOf[js.Any])
    
    inline def setMinUndefined: Self = StObject.set(x, "min", js.undefined)
    
    inline def setTrim(value: Boolean): Self = StObject.set(x, "trim", value.asInstanceOf[js.Any])
    
    inline def setTrimUndefined: Self = StObject.set(x, "trim", js.undefined)
    
    inline def setType(value: stringLength): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
