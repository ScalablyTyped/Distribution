package typings
package atEmotionSheetLib.atEmotionSheetMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@emotion/sheet", "StyleSheet")
@js.native
class StyleSheet () extends js.Object {
  def this(options: Options) = this()
  var before: js.UndefOr[stdLib.Element | scala.Null] = js.native
  var container: stdLib.HTMLElement = js.native
  var ctr: scala.Double = js.native
  var isSpeedy: scala.Boolean = js.native
  var key: java.lang.String = js.native
  var maxLength: scala.Double = js.native
  var nonce: js.UndefOr[java.lang.String] = js.native
  var tags: js.Array[stdLib.HTMLStyleElement] = js.native
  def flush(): scala.Unit = js.native
  def insert(rule: java.lang.String): scala.Unit = js.native
}

