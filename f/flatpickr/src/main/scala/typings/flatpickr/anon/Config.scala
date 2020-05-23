package typings.flatpickr.anon

import typings.flatpickr.localeMod.Locale
import typings.flatpickr.optionsMod.ParsedOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Config extends js.Object {
  var config: js.UndefOr[ParsedOptions] = js.undefined
  var l10n: js.UndefOr[Locale] = js.undefined
}

object Config {
  @scala.inline
  def apply(config: ParsedOptions = null, l10n: Locale = null): Config = {
    val __obj = js.Dynamic.literal()
    if (config != null) __obj.updateDynamic("config")(config.asInstanceOf[js.Any])
    if (l10n != null) __obj.updateDynamic("l10n")(l10n.asInstanceOf[js.Any])
    __obj.asInstanceOf[Config]
  }
}

