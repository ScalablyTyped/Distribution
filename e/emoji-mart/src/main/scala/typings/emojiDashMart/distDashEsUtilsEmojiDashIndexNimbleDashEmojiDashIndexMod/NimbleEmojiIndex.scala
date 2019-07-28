package typings.emojiDashMart.distDashEsUtilsEmojiDashIndexNimbleDashEmojiDashIndexMod

import org.scalablytyped.runtime.StringDictionary
import typings.emojiDashMart.emojiDashMartStrings.Empty
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait NimbleEmojiIndex extends js.Object {
  var emojis: StringDictionary[EmojiData] = js.native
  /** Mapping of string to keyof emojis */
  var emoticons: StringDictionary[String] = js.native
  def search(query: String): js.Array[EmojiData] | Null = js.native
  def search(query: Empty): Null = js.native
}

