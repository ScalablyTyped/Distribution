package typings.easeljs.createjs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SpriteStage extends Stage {
  var isWebGL: Boolean = js.native
  // methods
  def clearImageTexture(image: js.Object): Unit = js.native
  def updateViewport(width: Double, height: Double): Unit = js.native
}

