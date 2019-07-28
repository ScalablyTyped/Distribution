package typings.escodegen.escodegenMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IndentOptions extends js.Object {
  /**
    * Adjust the indentation of multiline comments to keep asterisks vertically aligned. Default is false.
    */
  var adjustMultilineComment: js.UndefOr[Boolean] = js.undefined
  /**
    * Base indent level. Default is 0.
    */
  var base: js.UndefOr[Double] = js.undefined
  /**
    * Indent string. Default is 4 spaces ('    ').
    */
  var style: js.UndefOr[String] = js.undefined
}

object IndentOptions {
  @scala.inline
  def apply(
    adjustMultilineComment: js.UndefOr[Boolean] = js.undefined,
    base: Int | Double = null,
    style: String = null
  ): IndentOptions = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(adjustMultilineComment)) __obj.updateDynamic("adjustMultilineComment")(adjustMultilineComment)
    if (base != null) __obj.updateDynamic("base")(base.asInstanceOf[js.Any])
    if (style != null) __obj.updateDynamic("style")(style)
    __obj.asInstanceOf[IndentOptions]
  }
}

