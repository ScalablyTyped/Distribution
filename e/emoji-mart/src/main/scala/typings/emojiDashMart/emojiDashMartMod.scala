package typings.emojiDashMart

import typings.emojiDashMart.distDashEsUtilsDataMod.Data
import typings.emojiDashMart.distDashEsUtilsEmojiDashIndexNimbleDashEmojiDashIndexMod.BaseEmoji
import typings.emojiDashMart.distDashEsUtilsSharedDashPropsMod.EmojiSet
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("emoji-mart", JSImport.Namespace)
@js.native
object emojiDashMartMod extends js.Object {
  @js.native
  class NimbleEmojiIndex protected ()
    extends typings.emojiDashMart.distDashEsMod.NimbleEmojiIndex {
    def this(data: Data) = this()
  }
  
  def getEmojiDataFromNative(nativeString: String, set: EmojiSet, data: Data): BaseEmoji = js.native
}

