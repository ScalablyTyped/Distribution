package typings
package estreeLib.estreeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait ArrayExpression extends BaseNode {
  var elements: js.Array[estreeLib.Expression | SpreadElement]
  @JSName("type")
  var type_ArrayExpression: estreeLib.estreeLibStrings.ArrayExpression
}

