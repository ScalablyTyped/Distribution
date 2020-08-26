package typings.diff.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait LinesOptions extends BaseOptions {
  /**
    * `true` to ignore leading and trailing whitespace. This is the same as `diffTrimmedLines()`.
    */
  var ignoreWhitespace: js.UndefOr[Boolean] = js.native
  /**
    * `true` to treat newline characters as separate tokens. This allows for changes to the newline structure
    * to occur independently of the line content and to be treated as such. In general this is the more
    * human friendly form of `diffLines()` and `diffLines()` is better suited for patches and other computer
    * friendly output.
    */
  var newlineIsToken: js.UndefOr[Boolean] = js.native
}

object LinesOptions {
  @scala.inline
  def apply(): LinesOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[LinesOptions]
  }
  @scala.inline
  implicit class LinesOptionsOps[Self <: LinesOptions] (val x: Self) extends AnyVal {
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
    def setIgnoreWhitespace(value: Boolean): Self = this.set("ignoreWhitespace", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteIgnoreWhitespace: Self = this.set("ignoreWhitespace", js.undefined)
    @scala.inline
    def setNewlineIsToken(value: Boolean): Self = this.set("newlineIsToken", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteNewlineIsToken: Self = this.set("newlineIsToken", js.undefined)
  }
  
}

