package typings.globrex.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Options extends js.Object {
  /**
    * Enable all advanced features from extglob.
    * Matching so called "extended" globs pattern like single character matching,
    * matching ranges of characters, group matching, etc.
    * Note: Interprets [a-d] as [abcd].
    * To match a literal -, include it as first or last character.
    * @default false
    */
  var extended: js.UndefOr[Boolean] = js.undefined
  /**
    * Parse input strings as it was a file path for special path related features.
    * This feature only makes sense if the input is a POSIX path like /foo/bar/hello.js or URLs.
    * When true the returned object will have an additional path object.
    * @default false
    */
  var filepath: js.UndefOr[Boolean] = js.undefined
  /**
    * When `globstar` is false globs like '/foo/ *' are transformed to the following '^\/foo\/.*$'
    * which will match any string beginning with '/foo/'
    * When the globstar option is true, the same '/foo/ *'
    * glob is transformed to '^\/foo\/[^/]*$' which will match any string beginning with '/foo/'
    * that does not have a '/' to the right of it. '/foo/ *' will match: '/foo/bar', '/foo/bar.txt' but not '/foo/bar/baz' or '/foo/bar/baz.txt'.
    * Note: When globstar is true, '/foo/ **' is equivalent to '/foo/ *' when globstar is false
    * @default false
    */
  var globstar: js.UndefOr[Boolean] = js.undefined
  /**
    * Be forgiving about multiple slashes, like /// and make everything after the first / optional
    * This is how bash glob works.
    * @default false
    */
  var strict: js.UndefOr[Boolean] = js.undefined
}

object Options {
  @scala.inline
  def apply(
    extended: js.UndefOr[Boolean] = js.undefined,
    filepath: js.UndefOr[Boolean] = js.undefined,
    globstar: js.UndefOr[Boolean] = js.undefined,
    strict: js.UndefOr[Boolean] = js.undefined
  ): Options = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(extended)) __obj.updateDynamic("extended")(extended.get.asInstanceOf[js.Any])
    if (!js.isUndefined(filepath)) __obj.updateDynamic("filepath")(filepath.get.asInstanceOf[js.Any])
    if (!js.isUndefined(globstar)) __obj.updateDynamic("globstar")(globstar.get.asInstanceOf[js.Any])
    if (!js.isUndefined(strict)) __obj.updateDynamic("strict")(strict.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[Options]
  }
}

