package typings.esprima.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ParseOptions extends js.Object {
  var comment: js.UndefOr[Boolean] = js.native
  var jsx: js.UndefOr[Boolean] = js.native
  var loc: js.UndefOr[Boolean] = js.native
  var range: js.UndefOr[Boolean] = js.native
  var tokens: js.UndefOr[Boolean] = js.native
  var tolerant: js.UndefOr[Boolean] = js.native
}

object ParseOptions {
  @scala.inline
  def apply(): ParseOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ParseOptions]
  }
  @scala.inline
  implicit class ParseOptionsOps[Self <: ParseOptions] (val x: Self) extends AnyVal {
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
    def setComment(value: Boolean): Self = this.set("comment", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteComment: Self = this.set("comment", js.undefined)
    @scala.inline
    def setJsx(value: Boolean): Self = this.set("jsx", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteJsx: Self = this.set("jsx", js.undefined)
    @scala.inline
    def setLoc(value: Boolean): Self = this.set("loc", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLoc: Self = this.set("loc", js.undefined)
    @scala.inline
    def setRange(value: Boolean): Self = this.set("range", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRange: Self = this.set("range", js.undefined)
    @scala.inline
    def setTokens(value: Boolean): Self = this.set("tokens", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTokens: Self = this.set("tokens", js.undefined)
    @scala.inline
    def setTolerant(value: Boolean): Self = this.set("tolerant", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTolerant: Self = this.set("tolerant", js.undefined)
  }
  
}

