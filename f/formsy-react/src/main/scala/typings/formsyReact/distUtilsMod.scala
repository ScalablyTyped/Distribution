package typings.formsyReact

import typings.formsyReact.distInterfacesMod.ValidationError
import typings.formsyReact.distInterfacesMod.Validations
import typings.formsyReact.distInterfacesMod.Values
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distUtilsMod {
  
  @JSImport("formsy-react/dist/utils", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def isArray(value: Any): /* is std.Array<unknown> */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isArray")(value.asInstanceOf[js.Any]).asInstanceOf[/* is std.Array<unknown> */ Boolean]
  
  inline def isDate(value: Any): /* is std.Date */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isDate")(value.asInstanceOf[js.Any]).asInstanceOf[/* is std.Date */ Boolean]
  
  inline def isFunction(value: Any): /* is std.Function */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isFunction")(value.asInstanceOf[js.Any]).asInstanceOf[/* is std.Function */ Boolean]
  
  inline def isNumber(value: Any): /* is number */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isNumber")(value.asInstanceOf[js.Any]).asInstanceOf[/* is number */ Boolean]
  
  inline def isObject(value: Any): /* is object */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isObject")(value.asInstanceOf[js.Any]).asInstanceOf[/* is object */ Boolean]
  
  inline def isRegex(value: Any): /* is std.RegExp */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isRegex")(value.asInstanceOf[js.Any]).asInstanceOf[/* is std.RegExp */ Boolean]
  
  inline def isSame(a: Any, b: Any): Any = (^.asInstanceOf[js.Dynamic].applyDynamic("isSame")(a.asInstanceOf[js.Any], b.asInstanceOf[js.Any])).asInstanceOf[Any]
  
  inline def isString(value: Any): /* is string */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isString")(value.asInstanceOf[js.Any]).asInstanceOf[/* is string */ Boolean]
  
  inline def isTypeUndefined(value: Any): /* is undefined */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isTypeUndefined")(value.asInstanceOf[js.Any]).asInstanceOf[/* is undefined */ Boolean]
  
  inline def isValueNullOrUndefined(value: Any): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isValueNullOrUndefined")(value.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  
  inline def isValueStringEmpty(value: String): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isValueStringEmpty")(value.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  
  inline def isValueUndefined(value: Any): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isValueUndefined")(value.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  
  inline def noop(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("noop")().asInstanceOf[Unit]
  
  inline def protectAgainstParamReassignment(value: Any): Any = ^.asInstanceOf[js.Dynamic].applyDynamic("protectAgainstParamReassignment")(value.asInstanceOf[js.Any]).asInstanceOf[Any]
  
  inline def runRules[V](value: V, currentValues: Values, validations: Validations[V], validationRules: Validations[V]): RulesResult = (^.asInstanceOf[js.Dynamic].applyDynamic("runRules")(value.asInstanceOf[js.Any], currentValues.asInstanceOf[js.Any], validations.asInstanceOf[js.Any], validationRules.asInstanceOf[js.Any])).asInstanceOf[RulesResult]
  
  inline def throttle(callback: Any, interval: Any): js.Function1[/* repeated */ Any, Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("throttle")(callback.asInstanceOf[js.Any], interval.asInstanceOf[js.Any])).asInstanceOf[js.Function1[/* repeated */ Any, Unit]]
  
  trait RulesResult extends StObject {
    
    var errors: js.Array[ValidationError]
    
    var failed: js.Array[String]
    
    var success: js.Array[String]
  }
  object RulesResult {
    
    inline def apply(errors: js.Array[ValidationError], failed: js.Array[String], success: js.Array[String]): RulesResult = {
      val __obj = js.Dynamic.literal(errors = errors.asInstanceOf[js.Any], failed = failed.asInstanceOf[js.Any], success = success.asInstanceOf[js.Any])
      __obj.asInstanceOf[RulesResult]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: RulesResult] (val x: Self) extends AnyVal {
      
      inline def setErrors(value: js.Array[ValidationError]): Self = StObject.set(x, "errors", value.asInstanceOf[js.Any])
      
      inline def setErrorsVarargs(value: ValidationError*): Self = StObject.set(x, "errors", js.Array(value*))
      
      inline def setFailed(value: js.Array[String]): Self = StObject.set(x, "failed", value.asInstanceOf[js.Any])
      
      inline def setFailedVarargs(value: String*): Self = StObject.set(x, "failed", js.Array(value*))
      
      inline def setSuccess(value: js.Array[String]): Self = StObject.set(x, "success", value.asInstanceOf[js.Any])
      
      inline def setSuccessVarargs(value: String*): Self = StObject.set(x, "success", js.Array(value*))
    }
  }
}
