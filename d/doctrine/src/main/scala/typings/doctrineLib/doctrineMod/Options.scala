package typings
package doctrineLib.doctrineMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Options extends js.Object {
  /**
    * Set to `true` to add `lineNumber` to each node, specifying the line on
    * which the node is found in the source. Default: `false`.
    */
  var lineNumbers: js.UndefOr[scala.Boolean] = js.undefined
  /**
    * Set to `true` to preserve leading and trailing whitespace when extracting
    * comment text.
    */
  var preserveWhitespace: js.UndefOr[scala.Boolean] = js.undefined
  /**
    * set to `true` to keep parsing even when syntax errors occur. Default:
    * `false`.
    */
  var recoverable: js.UndefOr[scala.Boolean] = js.undefined
  /**
    * Set to `true` to allow optional parameters to be specified in brackets
    * (`@param {string} [foo]`). Default: `false`.
    */
  var sloppy: js.UndefOr[scala.Boolean] = js.undefined
  /**
    * Set to `true` to throw an error when syntax errors occur. If false then
    * errors will be added to `tag.errors` instead.
    */
  var strict: js.UndefOr[scala.Boolean] = js.undefined
  /**
    * An array of tags to return. When specified, Doctrine returns
    * only tags in this array. For example, if `tags` is `["param"]`, then only
    * `@param` tags will be returned. Default: `null`.
    */
  var tags: js.UndefOr[js.Array[java.lang.String]] = js.undefined
  /**
    * Set to `true` to delete the leading `/ **`, any `*` that begins a line,
    * and the trailing `* /` from the source text. Default: `false`.
    */
  var unwrap: js.UndefOr[scala.Boolean] = js.undefined
}

object Options {
  @scala.inline
  def apply(
    lineNumbers: js.UndefOr[scala.Boolean] = js.undefined,
    preserveWhitespace: js.UndefOr[scala.Boolean] = js.undefined,
    recoverable: js.UndefOr[scala.Boolean] = js.undefined,
    sloppy: js.UndefOr[scala.Boolean] = js.undefined,
    strict: js.UndefOr[scala.Boolean] = js.undefined,
    tags: js.Array[java.lang.String] = null,
    unwrap: js.UndefOr[scala.Boolean] = js.undefined
  ): Options = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(lineNumbers)) __obj.updateDynamic("lineNumbers")(lineNumbers)
    if (!js.isUndefined(preserveWhitespace)) __obj.updateDynamic("preserveWhitespace")(preserveWhitespace)
    if (!js.isUndefined(recoverable)) __obj.updateDynamic("recoverable")(recoverable)
    if (!js.isUndefined(sloppy)) __obj.updateDynamic("sloppy")(sloppy)
    if (!js.isUndefined(strict)) __obj.updateDynamic("strict")(strict)
    if (tags != null) __obj.updateDynamic("tags")(tags)
    if (!js.isUndefined(unwrap)) __obj.updateDynamic("unwrap")(unwrap)
    __obj.asInstanceOf[Options]
  }
}

