package typings
package easeljsLib.createjsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("createjs.BitmapText")
@js.native
class BitmapText () extends DisplayObject {
  def this(text: java.lang.String) = this()
  def this(text: java.lang.String, spriteSheet: SpriteSheet) = this()
  // properties
  var letterSpacing: scala.Double = js.native
  var lineHeight: scala.Double = js.native
  var spaceWidth: scala.Double = js.native
  var spriteSheet: SpriteSheet = js.native
  var text: java.lang.String = js.native
}

/* static members */
@JSGlobal("createjs.BitmapText")
@js.native
object BitmapText extends js.Object {
  var maxPoolSize: scala.Double = js.native
}

