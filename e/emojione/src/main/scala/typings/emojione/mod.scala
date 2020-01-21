package typings.emojione

import org.scalablytyped.runtime.StringDictionary
import typings.emojione.emojioneStrings.png
import typings.emojione.emojioneStrings.svg
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("emojione", JSImport.Namespace)
@js.native
object mod extends js.Object {
  var ascii: Boolean = js.native
  var cacheBustParam: String = js.native
  var imagePathPNG: String = js.native
  var imagePathSVG: String = js.native
  var imagePathSVGSprites: String = js.native
  var imageType: png | svg = js.native
  var sprites: Boolean = js.native
  var unicodeAlt: Boolean = js.native
  var unicodeRegexp: String = js.native
  def shortnameToImage(str: String): String = js.native
  def shortnameToUnicode(str: String): String = js.native
  def toImage(str: String): String = js.native
  def toShort(str: String): String = js.native
  def unicodeToImage(str: String): String = js.native
  @js.native
  object emojioneList extends /* key */ StringDictionary[AnonFname]
  
}

