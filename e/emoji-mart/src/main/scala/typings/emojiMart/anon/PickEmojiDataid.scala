package typings.emojiMart.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined std.Pick<emoji-mart.emoji-mart/dist-es.EmojiData, 'id'> */
trait PickEmojiDataid extends js.Object {
  var id: js.UndefOr[js.Any] = js.undefined
}

object PickEmojiDataid {
  @scala.inline
  def apply(id: js.Any = null): PickEmojiDataid = {
    val __obj = js.Dynamic.literal()
    if (id != null) __obj.updateDynamic("id")(id.asInstanceOf[js.Any])
    __obj.asInstanceOf[PickEmojiDataid]
  }
}

