package typings.doctrine.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Options extends js.Object {
  /**
    * Set to `true` to add `lineNumber` to each node, specifying the line on
    * which the node is found in the source. Default: `false`.
    */
  var lineNumbers: js.UndefOr[Boolean] = js.native
  /**
    * Set to `true` to preserve leading and trailing whitespace when extracting
    * comment text.
    */
  var preserveWhitespace: js.UndefOr[Boolean] = js.native
  /**
    * set to `true` to keep parsing even when syntax errors occur. Default:
    * `false`.
    */
  var recoverable: js.UndefOr[Boolean] = js.native
  /**
    * Set to `true` to allow optional parameters to be specified in brackets
    * (`@param {string} [foo]`). Default: `false`.
    */
  var sloppy: js.UndefOr[Boolean] = js.native
  /**
    * Set to `true` to throw an error when syntax errors occur. If false then
    * errors will be added to `tag.errors` instead.
    */
  var strict: js.UndefOr[Boolean] = js.native
  /**
    * An array of tags to return. When specified, Doctrine returns
    * only tags in this array. For example, if `tags` is `["param"]`, then only
    * `@param` tags will be returned. Default: `null`.
    */
  var tags: js.UndefOr[js.Array[String]] = js.native
  /**
    * Set to `true` to delete the leading `/ **`, any `*` that begins a line,
    * and the trailing `* /` from the source text. Default: `false`.
    */
  var unwrap: js.UndefOr[Boolean] = js.native
}

object Options {
  @scala.inline
  def apply(): Options = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Options]
  }
  @scala.inline
  implicit class OptionsOps[Self <: Options] (val x: Self) extends AnyVal {
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
    def setLineNumbers(value: Boolean): Self = this.set("lineNumbers", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLineNumbers: Self = this.set("lineNumbers", js.undefined)
    @scala.inline
    def setPreserveWhitespace(value: Boolean): Self = this.set("preserveWhitespace", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePreserveWhitespace: Self = this.set("preserveWhitespace", js.undefined)
    @scala.inline
    def setRecoverable(value: Boolean): Self = this.set("recoverable", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRecoverable: Self = this.set("recoverable", js.undefined)
    @scala.inline
    def setSloppy(value: Boolean): Self = this.set("sloppy", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSloppy: Self = this.set("sloppy", js.undefined)
    @scala.inline
    def setStrict(value: Boolean): Self = this.set("strict", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteStrict: Self = this.set("strict", js.undefined)
    @scala.inline
    def setTagsVarargs(value: String*): Self = this.set("tags", js.Array(value :_*))
    @scala.inline
    def setTags(value: js.Array[String]): Self = this.set("tags", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTags: Self = this.set("tags", js.undefined)
    @scala.inline
    def setUnwrap(value: Boolean): Self = this.set("unwrap", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteUnwrap: Self = this.set("unwrap", js.undefined)
  }
  
}

