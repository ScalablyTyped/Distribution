package typings.eslint.eslintMod.ASTNs

import typings.estree.estreeMod.Position
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SourceLocation extends js.Object {
  var end: Position
  var start: Position
}

object SourceLocation {
  @scala.inline
  def apply(end: Position, start: Position): SourceLocation = {
    val __obj = js.Dynamic.literal(end = end, start = start)
  
    __obj.asInstanceOf[SourceLocation]
  }
}

