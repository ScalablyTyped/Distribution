package typings.flatpickr

import typings.flatpickr.distTypesLocaleMod.Locale
import typings.flatpickr.distTypesOptionsMod.ParsedOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Config extends js.Object {
  var config: js.UndefOr[ParsedOptions] = js.undefined
  var l10n: js.UndefOr[Locale] = js.undefined
}

object Anon_Config {
  @scala.inline
  def apply(config: ParsedOptions = null, l10n: Locale = null): Anon_Config = {
    val __obj = js.Dynamic.literal()
    if (config != null) __obj.updateDynamic("config")(config.asInstanceOf[js.Any])
    if (l10n != null) __obj.updateDynamic("l10n")(l10n.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_Config]
  }
}

