package typings
package estreeLib.estreeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait BaseFunction extends BaseNode {
  var async: js.UndefOr[scala.Boolean] = js.undefined
  // The body is either BlockStatement or Expression because arrow functions
  // can have a body that's either. FunctionDeclarations and
  // FunctionExpressions have only BlockStatement bodies.
  var body: BlockStatement | estreeLib.Expression
  var generator: js.UndefOr[scala.Boolean] = js.undefined
  var params: js.Array[Pattern]
}

