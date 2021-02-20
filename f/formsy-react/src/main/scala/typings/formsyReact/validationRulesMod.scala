package typings.formsyReact

import org.scalablytyped.runtime.Shortcut
import org.scalablytyped.runtime.StringDictionary
import typings.formsyReact.interfacesMod.ValidationFunction
import typings.formsyReact.interfacesMod.Values
import typings.std.RegExp
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object validationRulesMod extends Shortcut {
  
  @JSImport("formsy-react/dist/validationRules", JSImport.Default)
  @js.native
  val default: Validations[js.Any] = js.native
  
  @JSImport("formsy-react/dist/validationRules", "addValidationRule")
  @js.native
  def addValidationRule[V](name: String, func: ValidationFunction[V]): Unit = js.native
  
  @JSImport("formsy-react/dist/validationRules", "isDefaultRequiredValue")
  @js.native
  def isDefaultRequiredValue(value: js.Any): Boolean = js.native
  
  @JSImport("formsy-react/dist/validationRules", "isEmpty")
  @js.native
  def isEmpty[V](value: V): Boolean = js.native
  
  @JSImport("formsy-react/dist/validationRules", "isExisty")
  @js.native
  def isExisty[V](value: V): Boolean = js.native
  
  @JSImport("formsy-react/dist/validationRules", "matchRegexp")
  @js.native
  def matchRegexp[V](_values: Values, value: V, regexp: RegExp): Boolean = js.native
  
  type Validations[V] = StringDictionary[ValidationFunction[V]]
  
  type _To = Validations[js.Any]
  
  /* This means you don't have to write `default`, but can instead just say `validationRulesMod.foo` */
  override def _to: Validations[js.Any] = default
}
