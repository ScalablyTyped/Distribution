package typings.globalize.distGlobalizeUnitMod.distGlobalizeMod

import typings.globalize.distGlobalizeNumberMod.distGlobalizeMod.NumberFormatterOptions
import typings.globalize.globalizeStrings.long
import typings.globalize.globalizeStrings.narrow
import typings.globalize.globalizeStrings.short
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait UnitFormatterOptions extends js.Object {
  /**
  		 * form: [String] eg. "long", "short" or "narrow".
  		 */
  var form: js.UndefOr[long | short | narrow] = js.undefined
  /**
  		 * numberFormatter: [Function] a number formatter function. Defaults to Globalize .numberFormatter() for the current locale using the default options.
  		 */
  var numberFormatter: js.UndefOr[NumberFormatterOptions] = js.undefined
}

object UnitFormatterOptions {
  @scala.inline
  def apply(form: long | short | narrow = null, numberFormatter: NumberFormatterOptions = null): UnitFormatterOptions = {
    val __obj = js.Dynamic.literal()
    if (form != null) __obj.updateDynamic("form")(form.asInstanceOf[js.Any])
    if (numberFormatter != null) __obj.updateDynamic("numberFormatter")(numberFormatter)
    __obj.asInstanceOf[UnitFormatterOptions]
  }
}

