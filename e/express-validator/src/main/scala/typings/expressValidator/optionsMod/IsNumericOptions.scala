package typings.expressValidator.optionsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IsNumericOptions extends js.Object {
  var locale: js.UndefOr[AlphanumericLocale] = js.undefined
  var no_symbols: Boolean
}

object IsNumericOptions {
  @scala.inline
  def apply(no_symbols: Boolean, locale: AlphanumericLocale = null): IsNumericOptions = {
    val __obj = js.Dynamic.literal(no_symbols = no_symbols.asInstanceOf[js.Any])
    if (locale != null) __obj.updateDynamic("locale")(locale.asInstanceOf[js.Any])
    __obj.asInstanceOf[IsNumericOptions]
  }
}

