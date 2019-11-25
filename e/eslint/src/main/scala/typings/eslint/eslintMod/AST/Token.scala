package typings.eslint.eslintMod.AST

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Token extends js.Object {
  var loc: SourceLocation
  var range: Range
  var `type`: TokenType
  var value: String
}

object Token {
  @scala.inline
  def apply(loc: SourceLocation, range: Range, `type`: TokenType, value: String): Token = {
    val __obj = js.Dynamic.literal(loc = loc.asInstanceOf[js.Any], range = range.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Token]
  }
}

