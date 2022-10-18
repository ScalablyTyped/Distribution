package typings.formsyReact

import org.scalablytyped.runtime.StringDictionary
import typings.formsyReact.distInterfacesMod.ValidationFunction
import typings.formsyReact.distInterfacesMod.Values
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distValidationRulesMod {
  
  @JSImport("formsy-react/dist/validationRules", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("formsy-react/dist/validationRules", JSImport.Default)
  @js.native
  val default: Validations[Any] = js.native
  
  inline def addValidationRule[V](name: String, func: ValidationFunction[V]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("addValidationRule")(name.asInstanceOf[js.Any], func.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def isDefaultRequiredValue(value: Any): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isDefaultRequiredValue")(value.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  
  inline def isEmpty[V](value: V): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isEmpty")(value.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  
  inline def isExisty[V](value: V): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isExisty")(value.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  
  inline def matchRegexp[V](_values: Values, value: V, regexp: js.RegExp): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("matchRegexp")(_values.asInstanceOf[js.Any], value.asInstanceOf[js.Any], regexp.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  
  type Validations[V] = StringDictionary[ValidationFunction[V]]
}
