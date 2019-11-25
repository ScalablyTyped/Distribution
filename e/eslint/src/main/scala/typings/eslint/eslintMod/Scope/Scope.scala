package typings.eslint.eslintMod.Scope

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

trait Scope extends js.Object {
  var block: Node
  var childScopes: js.Array[typings.eslint.eslintMod.Scope.Scope]
  var functionExpressionScope: Boolean
  var isStrict: Boolean
  var references: js.Array[Reference]
  var set: Map[String, Variable]
  var through: js.Array[Reference]
  var `type`: block | `catch` | `class` | `for` | function | `function-expression-name` | global | module | switch | `with` | TDZ
  var upper: typings.eslint.eslintMod.Scope.Scope | Null
  var variableScope: typings.eslint.eslintMod.Scope.Scope
  var variables: js.Array[Variable]
}

object Scope {
  @scala.inline
  def apply(
    block: Node,
    childScopes: js.Array[typings.eslint.eslintMod.Scope.Scope],
    functionExpressionScope: Boolean,
    isStrict: Boolean,
    references: js.Array[Reference],
    set: Map[String, Variable],
    through: js.Array[Reference],
    `type`: block | `catch` | `class` | `for` | function | `function-expression-name` | global | module | switch | `with` | TDZ,
    variableScope: typings.eslint.eslintMod.Scope.Scope,
    variables: js.Array[Variable],
    upper: typings.eslint.eslintMod.Scope.Scope = null
  ): Scope = {
    val __obj = js.Dynamic.literal(block = block.asInstanceOf[js.Any], childScopes = childScopes.asInstanceOf[js.Any], functionExpressionScope = functionExpressionScope.asInstanceOf[js.Any], isStrict = isStrict.asInstanceOf[js.Any], references = references.asInstanceOf[js.Any], set = set.asInstanceOf[js.Any], through = through.asInstanceOf[js.Any], variableScope = variableScope.asInstanceOf[js.Any], variables = variables.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (upper != null) __obj.updateDynamic("upper")(upper.asInstanceOf[js.Any])
    __obj.asInstanceOf[Scope]
  }
}

