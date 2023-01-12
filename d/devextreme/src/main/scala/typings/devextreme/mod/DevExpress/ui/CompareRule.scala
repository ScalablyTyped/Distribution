package typings.devextreme.mod.DevExpress.ui

import typings.devextreme.devextremeStrings.compare
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CompareRule
  extends StObject
     with ValidationRule {
  
  /**
    * Specifies the function whose return value is used for comparison with the validated value.
    */
  var comparisonTarget: js.UndefOr[js.Function0[Any]] = js.undefined
  
  /**
    * Specifies the operator to be used for comparing the validated value with the target.
    */
  var comparisonType: js.UndefOr[ComparisonOperator] = js.undefined
  
  /**
    * If set to true, empty values are valid.
    */
  var ignoreEmptyValue: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Specifies the message that is shown if the rule is broken.
    */
  var message: js.UndefOr[String] = js.undefined
  
  /**
    * Specifies the rule type. Set it to &apos;compare&apos; to use the CompareRule.
    */
  var `type`: compare
}
object CompareRule {
  
  inline def apply(): CompareRule = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")("compare")
    __obj.asInstanceOf[CompareRule]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: CompareRule] (val x: Self) extends AnyVal {
    
    inline def setComparisonTarget(value: () => Any): Self = StObject.set(x, "comparisonTarget", js.Any.fromFunction0(value))
    
    inline def setComparisonTargetUndefined: Self = StObject.set(x, "comparisonTarget", js.undefined)
    
    inline def setComparisonType(value: ComparisonOperator): Self = StObject.set(x, "comparisonType", value.asInstanceOf[js.Any])
    
    inline def setComparisonTypeUndefined: Self = StObject.set(x, "comparisonType", js.undefined)
    
    inline def setIgnoreEmptyValue(value: Boolean): Self = StObject.set(x, "ignoreEmptyValue", value.asInstanceOf[js.Any])
    
    inline def setIgnoreEmptyValueUndefined: Self = StObject.set(x, "ignoreEmptyValue", js.undefined)
    
    inline def setMessage(value: String): Self = StObject.set(x, "message", value.asInstanceOf[js.Any])
    
    inline def setMessageUndefined: Self = StObject.set(x, "message", js.undefined)
    
    inline def setType(value: compare): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
