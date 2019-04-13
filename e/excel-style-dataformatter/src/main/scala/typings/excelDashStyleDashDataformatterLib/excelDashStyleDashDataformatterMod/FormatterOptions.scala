package typings
package excelDashStyleDashDataformatterLib.excelDashStyleDashDataformatterMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait FormatterOptions extends js.Object {
  var UTCOffset: js.UndefOr[scala.Double | scala.Null] = js.undefined
  var debug: js.UndefOr[scala.Boolean] = js.undefined
  var locale: js.UndefOr[java.lang.String] = js.undefined
  var locales: js.UndefOr[js.Array[LocalesOptions]] = js.undefined
  var transformCode: js.UndefOr[js.Function1[/* code */ js.Any, _]] = js.undefined
}

object FormatterOptions {
  @scala.inline
  def apply(
    UTCOffset: scala.Int | scala.Double = null,
    debug: js.UndefOr[scala.Boolean] = js.undefined,
    locale: java.lang.String = null,
    locales: js.Array[LocalesOptions] = null,
    transformCode: /* code */ js.Any => _ = null
  ): FormatterOptions = {
    val __obj = js.Dynamic.literal()
    if (UTCOffset != null) __obj.updateDynamic("UTCOffset")(UTCOffset.asInstanceOf[js.Any])
    if (!js.isUndefined(debug)) __obj.updateDynamic("debug")(debug)
    if (locale != null) __obj.updateDynamic("locale")(locale)
    if (locales != null) __obj.updateDynamic("locales")(locales)
    if (transformCode != null) __obj.updateDynamic("transformCode")(js.Any.fromFunction1(transformCode))
    __obj.asInstanceOf[FormatterOptions]
  }
}

