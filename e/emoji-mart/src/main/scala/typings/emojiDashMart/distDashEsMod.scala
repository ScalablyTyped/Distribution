package typings.emojiDashMart

import typings.emojiDashMart.distDashEsUtilsDataMod.Data
import typings.emojiDashMart.distDashEsUtilsEmojiDashIndexNimbleDashEmojiDashIndexMod.BaseEmoji
import typings.emojiDashMart.distDashEsUtilsEmojiDashIndexNimbleDashEmojiDashIndexMod.default
import typings.emojiDashMart.distDashEsUtilsSharedDashPropsMod.EmojiSet
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("emoji-mart/dist-es", JSImport.Namespace)
@js.native
object distDashEsMod extends js.Object {
  @js.native
  class NimbleEmojiIndex protected () extends default {
    def this(data: Data) = this()
  }
  
  def getEmojiDataFromNative(nativeString: String, set: EmojiSet, data: Data): BaseEmoji = js.native
}

