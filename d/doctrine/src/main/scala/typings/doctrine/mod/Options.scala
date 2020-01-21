package typings.doctrine.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Options extends js.Object {
  /**
    * Set to `true` to add `lineNumber` to each node, specifying the line on
    * which the node is found in the source. Default: `false`.
    */
  var lineNumbers: js.UndefOr[Boolean] = js.undefined
  /**
    * Set to `true` to preserve leading and trailing whitespace when extracting
    * comment text.
    */
  var preserveWhitespace: js.UndefOr[Boolean] = js.undefined
  /**
    * set to `true` to keep parsing even when syntax errors occur. Default:
    * `false`.
    */
  var recoverable: js.UndefOr[Boolean] = js.undefined
  /**
    * Set to `true` to allow optional parameters to be specified in brackets
    * (`@param {string} [foo]`). Default: `false`.
    */
  var sloppy: js.UndefOr[Boolean] = js.undefined
  /**
    * Set to `true` to throw an error when syntax errors occur. If false then
    * errors will be added to `tag.errors` instead.
    */
  var strict: js.UndefOr[Boolean] = js.undefined
  /**
    * An array of tags to return. When specified, Doctrine returns
    * only tags in this array. For example, if `tags` is `["param"]`, then only
    * `@param` tags will be returned. Default: `null`.
    */
  var tags: js.UndefOr[js.Array[String]] = js.undefined
  /**
    * Set to `true` to delete the leading `/ **`, any `*` that begins a line,
    * and the trailing `* /` from the source text. Default: `false`.
    */
  var unwrap: js.UndefOr[Boolean] = js.undefined
}

object Options {
  @scala.inline
  def apply(
    lineNumbers: js.UndefOr[Boolean] = js.undefined,
    preserveWhitespace: js.UndefOr[Boolean] = js.undefined,
    recoverable: js.UndefOr[Boolean] = js.undefined,
    sloppy: js.UndefOr[Boolean] = js.undefined,
    strict: js.UndefOr[Boolean] = js.undefined,
    tags: js.Array[String] = null,
    unwrap: js.UndefOr[Boolean] = js.undefined
  ): Options = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(lineNumbers)) __obj.updateDynamic("lineNumbers")(lineNumbers.asInstanceOf[js.Any])
    if (!js.isUndefined(preserveWhitespace)) __obj.updateDynamic("preserveWhitespace")(preserveWhitespace.asInstanceOf[js.Any])
    if (!js.isUndefined(recoverable)) __obj.updateDynamic("recoverable")(recoverable.asInstanceOf[js.Any])
    if (!js.isUndefined(sloppy)) __obj.updateDynamic("sloppy")(sloppy.asInstanceOf[js.Any])
    if (!js.isUndefined(strict)) __obj.updateDynamic("strict")(strict.asInstanceOf[js.Any])
    if (tags != null) __obj.updateDynamic("tags")(tags.asInstanceOf[js.Any])
    if (!js.isUndefined(unwrap)) __obj.updateDynamic("unwrap")(unwrap.asInstanceOf[js.Any])
    __obj.asInstanceOf[Options]
  }
}

