package typings
package emojioneLib.emojioneMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("emojione", JSImport.Namespace)
@js.native
object emojioneModMembers extends js.Object {
  var ascii: scala.Boolean = js.native
  var cacheBustParam: java.lang.String = js.native
  var imagePathPNG: java.lang.String = js.native
  var imagePathSVG: java.lang.String = js.native
  var imagePathSVGSprites: java.lang.String = js.native
  var imageType: emojioneLib.emojioneLibStrings.png | emojioneLib.emojioneLibStrings.svg = js.native
  var sprites: scala.Boolean = js.native
  var unicodeAlt: scala.Boolean = js.native
  var unicodeRegexp: java.lang.String = js.native
  def shortnameToImage(str: java.lang.String): java.lang.String = js.native
  def shortnameToUnicode(str: java.lang.String): java.lang.String = js.native
  def toImage(str: java.lang.String): java.lang.String = js.native
  def toShort(str: java.lang.String): java.lang.String = js.native
  def unicodeToImage(str: java.lang.String): java.lang.String = js.native
}

