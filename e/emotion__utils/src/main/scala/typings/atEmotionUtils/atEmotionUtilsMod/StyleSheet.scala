package typings.atEmotionUtils.atEmotionUtilsMod

import typings.std.HTMLElement
import typings.std.HTMLStyleElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait StyleSheet extends js.Object {
  var container: HTMLElement
  var key: String
  var nonce: js.UndefOr[String] = js.undefined
  var tags: js.Array[HTMLStyleElement]
  def flush(): Unit
  def insert(rule: String): Unit
}

object StyleSheet {
  @scala.inline
  def apply(
    container: HTMLElement,
    flush: () => Unit,
    insert: String => Unit,
    key: String,
    tags: js.Array[HTMLStyleElement],
    nonce: String = null
  ): StyleSheet = {
    val __obj = js.Dynamic.literal(container = container, flush = js.Any.fromFunction0(flush), insert = js.Any.fromFunction1(insert), key = key, tags = tags)
    if (nonce != null) __obj.updateDynamic("nonce")(nonce)
    __obj.asInstanceOf[StyleSheet]
  }
}

