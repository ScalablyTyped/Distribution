package typings.easeljs.createjsNs

import typings.std.HTMLCanvasElement
import typings.std.HTMLImageElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("createjs.SpriteSheetUtils")
@js.native
class SpriteSheetUtils () extends js.Object

/* static members */
@JSGlobal("createjs.SpriteSheetUtils")
@js.native
object SpriteSheetUtils extends js.Object {
  /**
    * @deprecated
    */
  def addFlippedFrames(spriteSheet: SpriteSheet): Unit = js.native
  def addFlippedFrames(spriteSheet: SpriteSheet, horizontal: Boolean): Unit = js.native
  def addFlippedFrames(spriteSheet: SpriteSheet, horizontal: Boolean, vertical: Boolean): Unit = js.native
  def addFlippedFrames(spriteSheet: SpriteSheet, horizontal: Boolean, vertical: Boolean, both: Boolean): Unit = js.native
  def extractFrame(spriteSheet: SpriteSheet, frameOrAnimation: String): HTMLImageElement = js.native
   // deprecated
  def extractFrame(spriteSheet: SpriteSheet, frameOrAnimation: Double): HTMLImageElement = js.native
  /**
    * @deprecated
    */
  def mergeAlpha(rgbImage: HTMLImageElement, alphaImage: HTMLImageElement): HTMLCanvasElement = js.native
  def mergeAlpha(rgbImage: HTMLImageElement, alphaImage: HTMLImageElement, canvas: HTMLCanvasElement): HTMLCanvasElement = js.native
}

