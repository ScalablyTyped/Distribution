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

