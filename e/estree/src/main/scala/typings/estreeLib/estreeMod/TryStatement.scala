package typings
package estreeLib.estreeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait TryStatement extends BaseNode {
  var block: BlockStatement
  var finalizer: js.UndefOr[BlockStatement | scala.Null] = js.undefined
  var handler: js.UndefOr[CatchClause | scala.Null] = js.undefined
  @JSName("type")
  var type_TryStatement: estreeLib.estreeLibStrings.TryStatement
}

