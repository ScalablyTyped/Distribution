package typings
package atEmotionUtilsLib.atEmotionUtilsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait EmotionCache extends js.Object {
  var compat: js.UndefOr[atEmotionUtilsLib.atEmotionUtilsLibNumbers.`true`] = js.undefined
  var inserted: org.scalablytyped.runtime.StringDictionary[java.lang.String | atEmotionUtilsLib.atEmotionUtilsLibNumbers.`true`]
  var key: java.lang.String
  var nonce: js.UndefOr[java.lang.String] = js.undefined
  var registered: RegisteredCache
  var sheet: StyleSheet
  def stylis(key: java.lang.String, value: java.lang.String): js.Array[java.lang.String]
}

object EmotionCache {
  @scala.inline
  def apply(
    inserted: org.scalablytyped.runtime.StringDictionary[java.lang.String | atEmotionUtilsLib.atEmotionUtilsLibNumbers.`true`],
    key: java.lang.String,
    registered: RegisteredCache,
    sheet: StyleSheet,
    stylis: (java.lang.String, java.lang.String) => js.Array[java.lang.String],
    compat: atEmotionUtilsLib.atEmotionUtilsLibNumbers.`true` = null,
    nonce: java.lang.String = null
  ): EmotionCache = {
    val __obj = js.Dynamic.literal(inserted = inserted, key = key, registered = registered, sheet = sheet, stylis = js.Any.fromFunction2(stylis))
    if (compat != null) __obj.updateDynamic("compat")(compat)
    if (nonce != null) __obj.updateDynamic("nonce")(nonce)
    __obj.asInstanceOf[EmotionCache]
  }
}

