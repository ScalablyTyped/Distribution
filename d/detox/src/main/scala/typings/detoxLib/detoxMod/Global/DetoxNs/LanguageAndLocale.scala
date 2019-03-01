package typings
package detoxLib.detoxMod.Global.DetoxNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait LanguageAndLocale extends js.Object {
  var language: js.UndefOr[java.lang.String] = js.undefined
  var locale: js.UndefOr[java.lang.String] = js.undefined
}

object LanguageAndLocale {
  @scala.inline
  def apply(language: java.lang.String = null, locale: java.lang.String = null): LanguageAndLocale = {
    val __obj = js.Dynamic.literal()
    if (language != null) __obj.updateDynamic("language")(language)
    if (locale != null) __obj.updateDynamic("locale")(locale)
    __obj.asInstanceOf[LanguageAndLocale]
  }
}

