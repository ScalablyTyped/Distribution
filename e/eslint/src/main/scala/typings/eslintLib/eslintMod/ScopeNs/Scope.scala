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

