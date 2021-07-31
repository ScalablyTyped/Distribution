package typings.formsyReact

import org.scalablytyped.runtime.StringDictionary
import typings.formsyReact.interfacesMod.ValidationFunction
import typings.formsyReact.interfacesMod.Values
import typings.std.RegExp
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object validationRulesMod {
  
  @JSImport("formsy-react/dist/validationRules", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("formsy-react/dist/validationRules", JSImport.Default)
  @js.native
  val default: Validations[js.Any] = js.native
  
  @scala.inline
  def addValidationRule[V](name: String, func: ValidationFunction[V]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("addValidationRule")(name.asInstanceOf[js.Any], func.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  @scala.inline
  def isDefaultRequiredValue(value: js.Any): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isDefaultRequiredValue")(value.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  
  @scala.inline
  def isEmpty[V](value: V): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isEmpty")(value.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  
  @scala.inline
  def isExisty[V](value: V): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isExisty")(value.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  
  @scala.inline
  def matchRegexp[V](_values: Values, value: V, regexp: RegExp): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("matchRegexp")(_values.asInstanceOf[js.Any], value.asInstanceOf[js.Any], regexp.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  
  type Validations[V] = StringDictionary[ValidationFunction[V]]
}
