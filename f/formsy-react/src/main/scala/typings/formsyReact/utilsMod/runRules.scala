package typings.formsyReact.utilsMod

import typings.formsyReact.interfacesMod.Validations
import typings.formsyReact.interfacesMod.Values
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("formsy-react/dist/utils", "runRules")
@js.native
object runRules extends js.Object {
  
  def apply[V](value: V, currentValues: Values, validations: Validations[V], validationRules: Validations[V]): RulesResult = js.native
}
