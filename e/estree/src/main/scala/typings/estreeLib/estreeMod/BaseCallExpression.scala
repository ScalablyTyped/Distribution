package typings
package estreeLib.estreeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait BaseCallExpression extends BaseNode {
  var arguments: js.Array[estreeLib.Expression | SpreadElement]
  var callee: estreeLib.Expression | Super
}

