package typings.globalize.globalizeMod

import typings.globalize.globalizeStrings.decimal
import typings.globalize.globalizeStrings.percent
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait NumberParserOptions extends js.Object {
  /**
    * decimal (default), or percent.
    */
  var style: js.UndefOr[decimal | percent] = js.undefined
}

object NumberParserOptions {
  @scala.inline
  def apply(style: decimal | percent = null): NumberParserOptions = {
    val __obj = js.Dynamic.literal()
    if (style != null) __obj.updateDynamic("style")(style.asInstanceOf[js.Any])
    __obj.asInstanceOf[NumberParserOptions]
  }
}

