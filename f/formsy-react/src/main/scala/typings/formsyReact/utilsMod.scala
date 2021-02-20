package typings.formsyReact

import typings.formsyReact.interfacesMod.ValidationError
import typings.formsyReact.interfacesMod.Validations
import typings.formsyReact.interfacesMod.Values
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object utilsMod {
  
  @JSImport("formsy-react/dist/utils", "isArray")
  @js.native
  def isArray(value: js.Any): /* is std.Array<unknown> */ Boolean = js.native
  
  @JSImport("formsy-react/dist/utils", "isDate")
  @js.native
  def isDate(value: js.Any): /* is std.Date */ Boolean = js.native
  
  @JSImport("formsy-react/dist/utils", "isFunction")
  @js.native
  def isFunction(value: js.Any): /* is std.Function */ Boolean = js.native
  
  @JSImport("formsy-react/dist/utils", "isNumber")
  @js.native
  def isNumber(value: js.Any): /* is number */ Boolean = js.native
  
  @JSImport("formsy-react/dist/utils", "isObject")
  @js.native
  def isObject(value: js.Any): /* is object */ Boolean = js.native
  
  @JSImport("formsy-react/dist/utils", "isRegex")
  @js.native
  def isRegex(value: js.Any): /* is std.RegExp */ Boolean = js.native
  
  @JSImport("formsy-react/dist/utils", "isSame")
  @js.native
  def isSame(a: js.Any, b: js.Any): js.Any = js.native
  
  @JSImport("formsy-react/dist/utils", "isString")
  @js.native
  def isString(value: js.Any): /* is string */ Boolean = js.native
  
  @JSImport("formsy-react/dist/utils", "isTypeUndefined")
  @js.native
  def isTypeUndefined(value: js.Any): /* is undefined */ Boolean = js.native
  
  @JSImport("formsy-react/dist/utils", "isValueNullOrUndefined")
  @js.native
  def isValueNullOrUndefined(value: js.Any): Boolean = js.native
  
  @JSImport("formsy-react/dist/utils", "isValueStringEmpty")
  @js.native
  def isValueStringEmpty(value: String): Boolean = js.native
  
  @JSImport("formsy-react/dist/utils", "isValueUndefined")
  @js.native
  def isValueUndefined(value: js.Any): Boolean = js.native
  
  @JSImport("formsy-react/dist/utils", "noop")
  @js.native
  def noop(): Unit = js.native
  
  @JSImport("formsy-react/dist/utils", "protectAgainstParamReassignment")
  @js.native
  def protectAgainstParamReassignment(value: js.Any): js.Any = js.native
  
  @JSImport("formsy-react/dist/utils", "runRules")
  @js.native
  def runRules[V](value: V, currentValues: Values, validations: Validations[V], validationRules: Validations[V]): RulesResult = js.native
  
  @JSImport("formsy-react/dist/utils", "throttle")
  @js.native
  def throttle(callback: js.Any, interval: js.Any): js.Function1[/* repeated */ js.Any, Unit] = js.native
  
  @js.native
  trait RulesResult extends StObject {
    
    var errors: js.Array[ValidationError] = js.native
    
    var failed: js.Array[String] = js.native
    
    var success: js.Array[String] = js.native
  }
  object RulesResult {
    
    @scala.inline
    def apply(errors: js.Array[ValidationError], failed: js.Array[String], success: js.Array[String]): RulesResult = {
      val __obj = js.Dynamic.literal(errors = errors.asInstanceOf[js.Any], failed = failed.asInstanceOf[js.Any], success = success.asInstanceOf[js.Any])
      __obj.asInstanceOf[RulesResult]
    }
    
    @scala.inline
    implicit class RulesResultMutableBuilder[Self <: RulesResult] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setErrors(value: js.Array[ValidationError]): Self = StObject.set(x, "errors", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setErrorsVarargs(value: ValidationError*): Self = StObject.set(x, "errors", js.Array(value :_*))
      
      @scala.inline
      def setFailed(value: js.Array[String]): Self = StObject.set(x, "failed", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFailedVarargs(value: String*): Self = StObject.set(x, "failed", js.Array(value :_*))
      
      @scala.inline
      def setSuccess(value: js.Array[String]): Self = StObject.set(x, "success", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSuccessVarargs(value: String*): Self = StObject.set(x, "success", js.Array(value :_*))
    }
  }
}
