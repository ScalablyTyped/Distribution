package typings
package eslintLib.eslintMod.ASTNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Program
  extends estreeLib.estreeMod.Program {
  @JSName("comments")
  var comments_Program: js.Array[estreeLib.estreeMod.Comment]
  @JSName("loc")
  var loc_Program: SourceLocation
  @JSName("range")
  var range_Program: Range
  var tokens: js.Array[Token]
}

