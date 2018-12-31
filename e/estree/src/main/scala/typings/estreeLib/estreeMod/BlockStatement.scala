package typings
package estreeLib.estreeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait BlockStatement extends BaseNode {
  var body: js.Array[Statement]
  var innerComments: js.UndefOr[js.Array[Comment]] = js.undefined
  @JSName("type")
  var type_BlockStatement: estreeLib.estreeLibStrings.BlockStatement
}

