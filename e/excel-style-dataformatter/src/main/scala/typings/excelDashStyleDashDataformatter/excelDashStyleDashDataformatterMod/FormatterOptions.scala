package typings.excelDashStyleDashDataformatter.excelDashStyleDashDataformatterMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait FormatterOptions extends js.Object {
  var UTCOffset: js.UndefOr[Double | Null] = js.undefined
  var debug: js.UndefOr[Boolean] = js.undefined
  var locale: js.UndefOr[String] = js.undefined
  var locales: js.UndefOr[js.Array[LocalesOptions]] = js.undefined
  var transformCode: js.UndefOr[js.Function1[/* code */ js.Any, _]] = js.undefined
}

object FormatterOptions {
  @scala.inline
  def apply(
    UTCOffset: Int | Double = null,
    debug: js.UndefOr[Boolean] = js.undefined,
    locale: String = null,
    locales: js.Array[LocalesOptions] = null,
    transformCode: /* code */ js.Any => _ = null
  ): FormatterOptions = {
    val __obj = js.Dynamic.literal()
    if (UTCOffset != null) __obj.updateDynamic("UTCOffset")(UTCOffset.asInstanceOf[js.Any])
    if (!js.isUndefined(debug)) __obj.updateDynamic("debug")(debug.asInstanceOf[js.Any])
    if (locale != null) __obj.updateDynamic("locale")(locale.asInstanceOf[js.Any])
    if (locales != null) __obj.updateDynamic("locales")(locales.asInstanceOf[js.Any])
    if (transformCode != null) __obj.updateDynamic("transformCode")(js.Any.fromFunction1(transformCode))
    __obj.asInstanceOf[FormatterOptions]
  }
}

