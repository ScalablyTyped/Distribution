package typings.eslintDashScope.eslintDashScopeMod

import typings.eslint.eslintStrings.TDZ
import typings.eslint.eslintStrings.`catch`
import typings.eslint.eslintStrings.`class`
import typings.eslint.eslintStrings.`for`
import typings.eslint.eslintStrings.`function-expression-name`
import typings.eslint.eslintStrings.`with`
import typings.eslint.eslintStrings.block
import typings.eslint.eslintStrings.function
import typings.eslint.eslintStrings.global
import typings.eslint.eslintStrings.module
import typings.eslint.eslintStrings.switch
import typings.estree.estreeMod.Node
import typings.std.Map
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("eslint-scope", "Scope")
@js.native
class Scope ()
  extends typings.eslint.eslintMod.Scope.Scope {
  /* CompleteClass */
  override var block: Node = js.native
  /* CompleteClass */
  override var childScopes: js.Array[typings.eslint.eslintMod.Scope.Scope] = js.native
  @JSName("childScopes")
  var childScopes_Scope: js.Array[Scope] = js.native
  /* CompleteClass */
  override var functionExpressionScope: Boolean = js.native
  /* CompleteClass */
  override var isStrict: Boolean = js.native
  /* CompleteClass */
  override var references: js.Array[typings.eslint.eslintMod.Scope.Reference] = js.native
  @JSName("references")
  var references_Scope: js.Array[Reference] = js.native
  /* CompleteClass */
  override var set: Map[String, typings.eslint.eslintMod.Scope.Variable] = js.native
  @JSName("set")
  var set_Scope: Map[String, Variable] = js.native
  /* CompleteClass */
  override var through: js.Array[typings.eslint.eslintMod.Scope.Reference] = js.native
  @JSName("through")
  var through_Scope: js.Array[Reference] = js.native
  /* CompleteClass */
  override var `type`: block | `catch` | `class` | `for` | function | `function-expression-name` | global | module | switch | `with` | TDZ = js.native
  @JSName("type")
  var type_Scope: typings.eslintDashScope.eslintDashScopeStrings.block | typings.eslintDashScope.eslintDashScopeStrings.`catch` | typings.eslintDashScope.eslintDashScopeStrings.`class` | typings.eslintDashScope.eslintDashScopeStrings.`for` | typings.eslintDashScope.eslintDashScopeStrings.function | typings.eslintDashScope.eslintDashScopeStrings.`function-expression-name` | typings.eslintDashScope.eslintDashScopeStrings.global | typings.eslintDashScope.eslintDashScopeStrings.module | typings.eslintDashScope.eslintDashScopeStrings.switch | typings.eslintDashScope.eslintDashScopeStrings.`with` | typings.eslintDashScope.eslintDashScopeStrings.TDZ = js.native
  /* CompleteClass */
  override var upper: typings.eslint.eslintMod.Scope.Scope | Null = js.native
  @JSName("upper")
  var upper_Scope: Scope | Null = js.native
  /* CompleteClass */
  override var variableScope: typings.eslint.eslintMod.Scope.Scope = js.native
  @JSName("variableScope")
  var variableScope_Scope: Scope = js.native
  /* CompleteClass */
  override var variables: js.Array[typings.eslint.eslintMod.Scope.Variable] = js.native
  @JSName("variables")
  var variables_Scope: js.Array[Variable] = js.native
}

