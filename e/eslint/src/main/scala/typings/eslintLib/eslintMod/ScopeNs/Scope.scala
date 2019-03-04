package typings
package eslintLib.eslintMod.ScopeNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Scope extends js.Object {
  var block: estreeLib.estreeMod.Node
  var childScopes: js.Array[Scope]
  var functionExpressionScope: scala.Boolean
  var isStrict: scala.Boolean
  var references: js.Array[Reference]
  var set: stdLib.Map[java.lang.String, Variable]
  var through: js.Array[Reference]
  var `type`: eslintLib.eslintLibStrings.block | eslintLib.eslintLibStrings.`catch` | eslintLib.eslintLibStrings.`class` | eslintLib.eslintLibStrings.`for` | eslintLib.eslintLibStrings.function | eslintLib.eslintLibStrings.`function-expression-name` | eslintLib.eslintLibStrings.global | eslintLib.eslintLibStrings.module | eslintLib.eslintLibStrings.switch | eslintLib.eslintLibStrings.`with` | eslintLib.eslintLibStrings.TDZ
  var upper: Scope | scala.Null
  var variableScope: Scope
  var variables: js.Array[Variable]
}

object Scope {
  @scala.inline
  def apply(
    block: estreeLib.estreeMod.Node,
    childScopes: js.Array[Scope],
    functionExpressionScope: scala.Boolean,
    isStrict: scala.Boolean,
    references: js.Array[Reference],
    set: stdLib.Map[java.lang.String, Variable],
    through: js.Array[Reference],
    `type`: eslintLib.eslintLibStrings.block | eslintLib.eslintLibStrings.`catch` | eslintLib.eslintLibStrings.`class` | eslintLib.eslintLibStrings.`for` | eslintLib.eslintLibStrings.function | eslintLib.eslintLibStrings.`function-expression-name` | eslintLib.eslintLibStrings.global | eslintLib.eslintLibStrings.module | eslintLib.eslintLibStrings.switch | eslintLib.eslintLibStrings.`with` | eslintLib.eslintLibStrings.TDZ,
    variableScope: Scope,
    variables: js.Array[Variable],
    upper: Scope = null
  ): Scope = {
    val __obj = js.Dynamic.literal(block = block.asInstanceOf[js.Any], childScopes = childScopes, functionExpressionScope = functionExpressionScope, isStrict = isStrict, references = references, set = set, through = through, variableScope = variableScope, variables = variables)
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (upper != null) __obj.updateDynamic("upper")(upper)
    __obj.asInstanceOf[Scope]
  }
}

