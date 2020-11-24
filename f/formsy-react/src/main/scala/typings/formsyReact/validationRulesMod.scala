package typings.formsyReact

import org.scalablytyped.runtime.StringDictionary
import typings.formsyReact.interfacesMod.ValidationFunction
import typings.formsyReact.interfacesMod.Values
import typings.std.RegExp
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("formsy-react/dist/validationRules", JSImport.Namespace)
@js.native
object validationRulesMod extends js.Object {
  
  def addValidationRule[V](name: String, func: ValidationFunction[V]): Unit = js.native
  
  val default: Validations[js.Any] = js.native
  
  def isDefaultRequiredValue(value: js.Any): Boolean = js.native
  
  def isEmpty[V](value: V): Boolean = js.native
  
  def isExisty[V](value: V): Boolean = js.native
  
  def matchRegexp[V](_values: Values, value: V, regexp: RegExp): Boolean = js.native
  
  type Validations[V] = StringDictionary[ValidationFunction[V]]
}
