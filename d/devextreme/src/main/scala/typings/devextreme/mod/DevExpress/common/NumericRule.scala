package typings.devextreme.mod.DevExpress.common

import typings.devextreme.devextremeStrings.numeric
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait NumericRule
  extends StObject
     with ValidationRule {
  
  /**
    * If set to true, empty values are valid.
    */
  var ignoreEmptyValue: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Specifies the message that is shown if the rule is broken.
    */
  var message: js.UndefOr[String] = js.undefined
  
  /**
    * Specifies the rule type. Set it to &apos;numeric&apos; to use the NumericRule.
    */
  var `type`: numeric
}
object NumericRule {
  
  inline def apply(): NumericRule = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")("numeric")
    __obj.asInstanceOf[NumericRule]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: NumericRule] (val x: Self) extends AnyVal {
    
    inline def setIgnoreEmptyValue(value: Boolean): Self = StObject.set(x, "ignoreEmptyValue", value.asInstanceOf[js.Any])
    
    inline def setIgnoreEmptyValueUndefined: Self = StObject.set(x, "ignoreEmptyValue", js.undefined)
    
    inline def setMessage(value: String): Self = StObject.set(x, "message", value.asInstanceOf[js.Any])
    
    inline def setMessageUndefined: Self = StObject.set(x, "message", js.undefined)
    
    inline def setType(value: numeric): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
