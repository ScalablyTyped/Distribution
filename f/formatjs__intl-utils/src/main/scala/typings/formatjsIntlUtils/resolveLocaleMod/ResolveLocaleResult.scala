package typings.formatjsIntlUtils.resolveLocaleMod

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ResolveLocaleResult
  extends /* k */ StringDictionary[js.Any] {
  var dataLocale: String
  var locale: String
}

object ResolveLocaleResult {
  @scala.inline
  def apply(dataLocale: String, locale: String, StringDictionary: /* k */ StringDictionary[js.Any] = null): ResolveLocaleResult = {
    val __obj = js.Dynamic.literal(dataLocale = dataLocale.asInstanceOf[js.Any], locale = locale.asInstanceOf[js.Any])
    if (StringDictionary != null) js.Dynamic.global.Object.assign(__obj, StringDictionary)
    __obj.asInstanceOf[ResolveLocaleResult]
  }
}

