package typings.devextreme.mod.DevExpress.ui

import typings.devextreme.devextremeStrings.email
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait EmailRule
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
    * Specifies the rule type. Set it to &apos;email&apos; to use the EmailRule.
    */
  var `type`: email
}
object EmailRule {
  
  inline def apply(): EmailRule = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")("email")
    __obj.asInstanceOf[EmailRule]
  }
  
  extension [Self <: EmailRule](x: Self) {
    
    inline def setIgnoreEmptyValue(value: Boolean): Self = StObject.set(x, "ignoreEmptyValue", value.asInstanceOf[js.Any])
    
    inline def setIgnoreEmptyValueUndefined: Self = StObject.set(x, "ignoreEmptyValue", js.undefined)
    
    inline def setMessage(value: String): Self = StObject.set(x, "message", value.asInstanceOf[js.Any])
    
    inline def setMessageUndefined: Self = StObject.set(x, "message", js.undefined)
    
    inline def setType(value: email): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
