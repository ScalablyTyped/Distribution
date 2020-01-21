package typings.emotionSheet.mod

import typings.std.Element
import typings.std.HTMLElement
import typings.std.HTMLStyleElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@emotion/sheet", "StyleSheet")
@js.native
class StyleSheet () extends js.Object {
  def this(options: Options) = this()
  var before: js.UndefOr[Element | Null] = js.native
  var container: HTMLElement = js.native
  var ctr: Double = js.native
  var isSpeedy: Boolean = js.native
  var key: String = js.native
  var maxLength: Double = js.native
  var nonce: js.UndefOr[String] = js.native
  var tags: js.Array[HTMLStyleElement] = js.native
  def flush(): Unit = js.native
  def insert(rule: String): Unit = js.native
}

