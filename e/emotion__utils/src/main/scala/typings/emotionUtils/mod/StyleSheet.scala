package typings.emotionUtils.mod

import typings.std.HTMLElement
import typings.std.HTMLStyleElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait StyleSheet extends js.Object {
  var container: HTMLElement = js.native
  var key: String = js.native
  var nonce: js.UndefOr[String] = js.native
  var tags: js.Array[HTMLStyleElement] = js.native
  def flush(): Unit = js.native
  def insert(rule: String): Unit = js.native
}

object StyleSheet {
  @scala.inline
  def apply(
    container: HTMLElement,
    flush: () => Unit,
    insert: String => Unit,
    key: String,
    tags: js.Array[HTMLStyleElement]
  ): StyleSheet = {
    val __obj = js.Dynamic.literal(container = container.asInstanceOf[js.Any], flush = js.Any.fromFunction0(flush), insert = js.Any.fromFunction1(insert), key = key.asInstanceOf[js.Any], tags = tags.asInstanceOf[js.Any])
    __obj.asInstanceOf[StyleSheet]
  }
  @scala.inline
  implicit class StyleSheetOps[Self <: StyleSheet] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setContainer(value: HTMLElement): Self = this.set("container", value.asInstanceOf[js.Any])
    @scala.inline
    def setFlush(value: () => Unit): Self = this.set("flush", js.Any.fromFunction0(value))
    @scala.inline
    def setInsert(value: String => Unit): Self = this.set("insert", js.Any.fromFunction1(value))
    @scala.inline
    def setKey(value: String): Self = this.set("key", value.asInstanceOf[js.Any])
    @scala.inline
    def setTagsVarargs(value: HTMLStyleElement*): Self = this.set("tags", js.Array(value :_*))
    @scala.inline
    def setTags(value: js.Array[HTMLStyleElement]): Self = this.set("tags", value.asInstanceOf[js.Any])
    @scala.inline
    def setNonce(value: String): Self = this.set("nonce", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteNonce: Self = this.set("nonce", js.undefined)
  }
  
}

