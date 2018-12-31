package typings
package atEmotionUtilsLib.utilsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait StyleSheet extends js.Object {
  var container: stdLib.HTMLElement
  var key: java.lang.String
  var nonce: js.UndefOr[java.lang.String] = js.undefined
  var tags: js.Array[stdLib.HTMLStyleElement]
  def flush(): scala.Unit
  def insert(rule: java.lang.String): scala.Unit
}

