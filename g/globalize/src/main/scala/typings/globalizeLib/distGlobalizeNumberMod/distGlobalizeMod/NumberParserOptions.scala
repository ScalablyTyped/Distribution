package typings
package globalizeLib.distGlobalizeNumberMod.distGlobalizeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait NumberParserOptions extends js.Object {
  /**
  		 * decimal (default), or percent.
  		 */
  var style: js.UndefOr[
    globalizeLib.globalizeLibStrings.decimal | globalizeLib.globalizeLibStrings.percent
  ] = js.undefined
}

object NumberParserOptions {
  @scala.inline
  def apply(style: globalizeLib.globalizeLibStrings.decimal | globalizeLib.globalizeLibStrings.percent = null): NumberParserOptions = {
    val __obj = js.Dynamic.literal()
    if (style != null) __obj.updateDynamic("style")(style.asInstanceOf[js.Any])
    __obj.asInstanceOf[NumberParserOptions]
  }
}

