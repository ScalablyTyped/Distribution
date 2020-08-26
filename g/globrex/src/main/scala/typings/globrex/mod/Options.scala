package typings.globrex.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Options extends js.Object {
  /**
    * Enable all advanced features from extglob.
    * Matching so called "extended" globs pattern like single character matching,
    * matching ranges of characters, group matching, etc.
    * Note: Interprets [a-d] as [abcd].
    * To match a literal -, include it as first or last character.
    * @default false
    */
  var extended: js.UndefOr[Boolean] = js.native
  /**
    * Parse input strings as it was a file path for special path related features.
    * This feature only makes sense if the input is a POSIX path like /foo/bar/hello.js or URLs.
    * When true the returned object will have an additional path object.
    * @default false
    */
  var filepath: js.UndefOr[Boolean] = js.native
  /**
    * When `globstar` is false globs like '/foo/ *' are transformed to the following '^\/foo\/.*$'
    * which will match any string beginning with '/foo/'
    * When the globstar option is true, the same '/foo/ *'
    * glob is transformed to '^\/foo\/[^/]*$' which will match any string beginning with '/foo/'
    * that does not have a '/' to the right of it. '/foo/ *' will match: '/foo/bar', '/foo/bar.txt' but not '/foo/bar/baz' or '/foo/bar/baz.txt'.
    * Note: When globstar is true, '/foo/ **' is equivalent to '/foo/ *' when globstar is false
    * @default false
    */
  var globstar: js.UndefOr[Boolean] = js.native
  /**
    * Be forgiving about multiple slashes, like /// and make everything after the first / optional
    * This is how bash glob works.
    * @default false
    */
  var strict: js.UndefOr[Boolean] = js.native
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
    def setExtended(value: Boolean): Self = this.set("extended", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteExtended: Self = this.set("extended", js.undefined)
    @scala.inline
    def setFilepath(value: Boolean): Self = this.set("filepath", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFilepath: Self = this.set("filepath", js.undefined)
    @scala.inline
    def setGlobstar(value: Boolean): Self = this.set("globstar", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteGlobstar: Self = this.set("globstar", js.undefined)
    @scala.inline
    def setStrict(value: Boolean): Self = this.set("strict", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteStrict: Self = this.set("strict", js.undefined)
  }
  
}

