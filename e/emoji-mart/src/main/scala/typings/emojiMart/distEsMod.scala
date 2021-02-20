package typings.emojiMart

import typings.emojiMart.dataMod.Data
import typings.emojiMart.nimbleEmojiIndexMod.BaseEmoji
import typings.emojiMart.nimbleEmojiIndexMod.default
import typings.emojiMart.sharedPropsMod.EmojiSet
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distEsMod {
  
  @JSImport("emoji-mart/dist-es", "NimbleEmojiIndex")
  @js.native
  class NimbleEmojiIndex protected () extends default {
    def this(data: Data) = this()
  }
  
  @JSImport("emoji-mart/dist-es", "getEmojiDataFromNative")
  @js.native
  def getEmojiDataFromNative(nativeString: String, set: EmojiSet, data: Data): BaseEmoji = js.native
}
