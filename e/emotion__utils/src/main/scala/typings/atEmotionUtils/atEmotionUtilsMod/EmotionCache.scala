package typings.atEmotionUtils.atEmotionUtilsMod

import org.scalablytyped.runtime.StringDictionary
import typings.atEmotionUtils.atEmotionUtilsNumbers.`true`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait EmotionCache extends js.Object {
  var compat: js.UndefOr[`true`] = js.undefined
  var inserted: StringDictionary[String | `true`]
  var key: String
  var nonce: js.UndefOr[String] = js.undefined
  var registered: RegisteredCache
  var sheet: StyleSheet
  def stylis(key: String, value: String): js.Array[String]
}

object EmotionCache {
  @scala.inline
  def apply(
    inserted: StringDictionary[String | `true`],
    key: String,
    registered: RegisteredCache,
    sheet: StyleSheet,
    stylis: (String, String) => js.Array[String],
    compat: `true` = null,
    nonce: String = null
  ): EmotionCache = {
    val __obj = js.Dynamic.literal(inserted = inserted, key = key, registered = registered, sheet = sheet, stylis = js.Any.fromFunction2(stylis))
    if (compat != null) __obj.updateDynamic("compat")(compat)
    if (nonce != null) __obj.updateDynamic("nonce")(nonce)
    __obj.asInstanceOf[EmotionCache]
  }
}

