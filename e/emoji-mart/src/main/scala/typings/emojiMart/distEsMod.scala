package typings.emojiMart

import typings.emojiMart.dataMod.Data
import typings.emojiMart.nimbleEmojiIndexMod.BaseEmoji
import typings.emojiMart.nimbleEmojiIndexMod.default
import typings.emojiMart.sharedPropsMod.EmojiSet
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("emoji-mart/dist-es", JSImport.Namespace)
@js.native
object distEsMod extends js.Object {
  
  def getEmojiDataFromNative(nativeString: String, set: EmojiSet, data: Data): BaseEmoji = js.native
  
  @js.native
  class NimbleEmojiIndex protected () extends default {
    def this(data: Data) = this()
  }
}
