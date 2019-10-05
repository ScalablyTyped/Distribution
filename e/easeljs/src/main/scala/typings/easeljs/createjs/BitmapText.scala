package typings.easeljs.createjs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("createjs.BitmapText")
@js.native
class BitmapText () extends DisplayObject {
  def this(text: String) = this()
  def this(text: String, spriteSheet: SpriteSheet) = this()
  // properties
  var letterSpacing: Double = js.native
  var lineHeight: Double = js.native
  var spaceWidth: Double = js.native
  var spriteSheet: SpriteSheet = js.native
  var text: String = js.native
}

/* static members */
@JSGlobal("createjs.BitmapText")
@js.native
object BitmapText extends js.Object {
  var maxPoolSize: Double = js.native
}

