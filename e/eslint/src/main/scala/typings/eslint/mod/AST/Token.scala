package typings.eslint.mod.AST

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Token extends js.Object {
  var loc: SourceLocation = js.native
  var range: Range = js.native
  var `type`: TokenType = js.native
  var value: String = js.native
}

object Token {
  @scala.inline
  def apply(loc: SourceLocation, range: Range, `type`: TokenType, value: String): Token = {
    val __obj = js.Dynamic.literal(loc = loc.asInstanceOf[js.Any], range = range.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Token]
  }
  @scala.inline
  implicit class TokenOps[Self <: Token] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setLoc(value: SourceLocation): Self = this.set("loc", value.asInstanceOf[js.Any])
    @scala.inline
    def setRange(value: Range): Self = this.set("range", value.asInstanceOf[js.Any])
    @scala.inline
    def setType(value: TokenType): Self = this.set("type", value.asInstanceOf[js.Any])
    @scala.inline
    def setValue(value: String): Self = this.set("value", value.asInstanceOf[js.Any])
  }
  
}

