package typings.emojiMart.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined std.Pick<emoji-mart.emoji-mart/dist-es.EmojiData, 'id'> */
@js.native
trait PickEmojiDataid extends js.Object {
  var id: js.UndefOr[js.Any] = js.native
}

object PickEmojiDataid {
  @scala.inline
  def apply(): PickEmojiDataid = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PickEmojiDataid]
  }
  @scala.inline
  implicit class PickEmojiDataidOps[Self <: PickEmojiDataid] (val x: Self) extends AnyVal {
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
    def setId(value: js.Any): Self = this.set("id", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteId: Self = this.set("id", js.undefined)
  }
  
}

