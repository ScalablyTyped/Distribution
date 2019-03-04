package typings
package emojiDashMartLib.distDashEsUtilsEmojiDashIndexNimbleDashEmojiDashIndexMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait NimbleEmojiIndex extends js.Object {
  var emojis: org.scalablytyped.runtime.StringDictionary[EmojiData] = js.native
  /** Mapping of string to keyof emojis */
  var emoticons: org.scalablytyped.runtime.StringDictionary[java.lang.String] = js.native
  def search(query: java.lang.String): js.Array[EmojiData] | scala.Null = js.native
  @JSName("search")
  def search_(query: emojiDashMartLib.emojiDashMartLibStrings.Empty): scala.Null = js.native
}

