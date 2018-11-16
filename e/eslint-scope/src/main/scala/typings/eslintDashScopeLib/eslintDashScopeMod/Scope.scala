package typings
package eslintDashScopeLib.eslintDashScopeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("eslint-scope", "Scope")
@js.native
class Scope ()
  extends eslintLib.eslintMod.ScopeNs.Scope {
  /* CompleteClass */
  override var block: estreeLib.estreeMod.Node = js.native
  /* CompleteClass */
  override var childScopes: js.Array[eslintLib.eslintMod.ScopeNs.Scope] = js.native
  @JSName("childScopes")
  var childScopes_Scope: js.Array[Scope] = js.native
  /* CompleteClass */
  override var functionExpressionScope: scala.Boolean = js.native
  /* CompleteClass */
  override var isStrict: scala.Boolean = js.native
  /* CompleteClass */
  override var references: js.Array[eslintLib.eslintMod.ScopeNs.Reference] = js.native
  @JSName("references")
  var references_Scope: js.Array[Reference] = js.native
  /* CompleteClass */
  override var set: stdLib.Map[java.lang.String, eslintLib.eslintMod.ScopeNs.Variable] = js.native
  @JSName("set")
  var set_Scope: stdLib.Map[java.lang.String, Variable] = js.native
  /* CompleteClass */
  override var through: js.Array[eslintLib.eslintMod.ScopeNs.Reference] = js.native
  @JSName("through")
  var through_Scope: js.Array[Reference] = js.native
  /* CompleteClass */
  override var `type`: eslintLib.eslintLibStrings.block | eslintLib.eslintLibStrings.`catch` | eslintLib.eslintLibStrings.`class` | eslintLib.eslintLibStrings.`for` | eslintLib.eslintLibStrings.function | eslintLib.eslintLibStrings.`function-expression-name` | eslintLib.eslintLibStrings.global | eslintLib.eslintLibStrings.module | eslintLib.eslintLibStrings.switch | eslintLib.eslintLibStrings.`with` | eslintLib.eslintLibStrings.TDZ = js.native
  @JSName("type")
  var type_Scope: eslintDashScopeLib.eslintDashScopeLibStrings.block | eslintDashScopeLib.eslintDashScopeLibStrings.`catch` | eslintDashScopeLib.eslintDashScopeLibStrings.`class` | eslintDashScopeLib.eslintDashScopeLibStrings.`for` | eslintDashScopeLib.eslintDashScopeLibStrings.function | eslintDashScopeLib.eslintDashScopeLibStrings.`function-expression-name` | eslintDashScopeLib.eslintDashScopeLibStrings.global | eslintDashScopeLib.eslintDashScopeLibStrings.module | eslintDashScopeLib.eslintDashScopeLibStrings.switch | eslintDashScopeLib.eslintDashScopeLibStrings.`with` | eslintDashScopeLib.eslintDashScopeLibStrings.TDZ = js.native
  /* CompleteClass */
  override var upper: eslintLib.eslintMod.ScopeNs.Scope | scala.Null = js.native
  @JSName("upper")
  var upper_Scope: Scope | scala.Null = js.native
  /* CompleteClass */
  override var variableScope: eslintLib.eslintMod.ScopeNs.Scope = js.native
  @JSName("variableScope")
  var variableScope_Scope: Scope = js.native
  /* CompleteClass */
  override var variables: js.Array[eslintLib.eslintMod.ScopeNs.Variable] = js.native
  @JSName("variables")
  var variables_Scope: js.Array[Variable] = js.native
}

