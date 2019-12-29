package typings.atEmotionUtils.atEmotionUtilsMod

import org.scalablytyped.runtime.StringDictionary
import typings.atEmotionUtils.atEmotionUtilsBooleans.`true`
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
    val __obj = js.Dynamic.literal(inserted = inserted.asInstanceOf[js.Any], key = key.asInstanceOf[js.Any], registered = registered.asInstanceOf[js.Any], sheet = sheet.asInstanceOf[js.Any], stylis = js.Any.fromFunction2(stylis))
    if (compat != null) __obj.updateDynamic("compat")(compat.asInstanceOf[js.Any])
    if (nonce != null) __obj.updateDynamic("nonce")(nonce.asInstanceOf[js.Any])
    __obj.asInstanceOf[EmotionCache]
  }
}

