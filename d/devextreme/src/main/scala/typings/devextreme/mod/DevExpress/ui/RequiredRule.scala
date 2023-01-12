package typings.devextreme.mod.DevExpress.ui

import typings.devextreme.devextremeStrings.required
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait RequiredRule
  extends StObject
     with ValidationRule {
  
  /**
    * Specifies the message that is shown if the rule is broken.
    */
  var message: js.UndefOr[String] = js.undefined
  
  /**
    * Indicates whether to remove the Space characters from the validated value.
    */
  var trim: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Specifies the rule type. Set it to &apos;required&apos; to use the RequiredRule.
    */
  var `type`: required
}
object RequiredRule {
  
  inline def apply(): RequiredRule = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")("required")
    __obj.asInstanceOf[RequiredRule]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: RequiredRule] (val x: Self) extends AnyVal {
    
    inline def setMessage(value: String): Self = StObject.set(x, "message", value.asInstanceOf[js.Any])
    
    inline def setMessageUndefined: Self = StObject.set(x, "message", js.undefined)
    
    inline def setTrim(value: Boolean): Self = StObject.set(x, "trim", value.asInstanceOf[js.Any])
    
    inline def setTrimUndefined: Self = StObject.set(x, "trim", js.undefined)
    
    inline def setType(value: required): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
