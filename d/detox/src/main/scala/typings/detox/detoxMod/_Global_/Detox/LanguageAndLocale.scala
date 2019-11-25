package typings.detox.detoxMod._Global_.Detox

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait LanguageAndLocale extends js.Object {
  var language: js.UndefOr[String] = js.undefined
  var locale: js.UndefOr[String] = js.undefined
}

object LanguageAndLocale {
  @scala.inline
  def apply(language: String = null, locale: String = null): LanguageAndLocale = {
    val __obj = js.Dynamic.literal()
    if (language != null) __obj.updateDynamic("language")(language.asInstanceOf[js.Any])
    if (locale != null) __obj.updateDynamic("locale")(locale.asInstanceOf[js.Any])
    __obj.asInstanceOf[LanguageAndLocale]
  }
}

