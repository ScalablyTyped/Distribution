package typings
package globalizeLib.distGlobalizeUnitMod.distGlobalizeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait UnitFormatterOptions extends js.Object {
  /**
  		 * form: [String] eg. "long", "short" or "narrow".
  		 */
  var form: js.UndefOr[
    globalizeLib.globalizeLibStrings.long | globalizeLib.globalizeLibStrings.short | globalizeLib.globalizeLibStrings.narrow
  ] = js.undefined
  /**
  		 * numberFormatter: [Function] a number formatter function. Defaults to Globalize .numberFormatter() for the current locale using the default options.
  		 */
  var numberFormatter: js.UndefOr[globalizeLib.distGlobalizeNumberMod.distGlobalizeMod.NumberFormatterOptions] = js.undefined
}

object UnitFormatterOptions {
  @scala.inline
  def apply(
    form: globalizeLib.globalizeLibStrings.long | globalizeLib.globalizeLibStrings.short | globalizeLib.globalizeLibStrings.narrow = null,
    numberFormatter: globalizeLib.distGlobalizeNumberMod.distGlobalizeMod.NumberFormatterOptions = null
  ): UnitFormatterOptions = {
    val __obj = js.Dynamic.literal()
    if (form != null) __obj.updateDynamic("form")(form.asInstanceOf[js.Any])
    if (numberFormatter != null) __obj.updateDynamic("numberFormatter")(numberFormatter)
    __obj.asInstanceOf[UnitFormatterOptions]
  }
}

