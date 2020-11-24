package typings.easeljs.global.createjs

import typings.std.HTMLCanvasElement
import typings.std.HTMLImageElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSGlobal("createjs.SpriteSheetUtils")
@js.native
class SpriteSheetUtils ()
  extends typings.easeljs.createjs.SpriteSheetUtils
/* static members */
@JSGlobal("createjs.SpriteSheetUtils")
@js.native
object SpriteSheetUtils extends js.Object {
  
  /**
    * @deprecated
    */
  def addFlippedFrames(spriteSheet: typings.easeljs.createjs.SpriteSheet): Unit = js.native
  def addFlippedFrames(
    spriteSheet: typings.easeljs.createjs.SpriteSheet,
    horizontal: js.UndefOr[scala.Nothing],
    vertical: js.UndefOr[scala.Nothing],
    both: Boolean
  ): Unit = js.native
  def addFlippedFrames(
    spriteSheet: typings.easeljs.createjs.SpriteSheet,
    horizontal: js.UndefOr[scala.Nothing],
    vertical: Boolean
  ): Unit = js.native
  def addFlippedFrames(
    spriteSheet: typings.easeljs.createjs.SpriteSheet,
    horizontal: js.UndefOr[scala.Nothing],
    vertical: Boolean,
    both: Boolean
  ): Unit = js.native
  def addFlippedFrames(spriteSheet: typings.easeljs.createjs.SpriteSheet, horizontal: Boolean): Unit = js.native
  def addFlippedFrames(
    spriteSheet: typings.easeljs.createjs.SpriteSheet,
    horizontal: Boolean,
    vertical: js.UndefOr[scala.Nothing],
    both: Boolean
  ): Unit = js.native
  def addFlippedFrames(spriteSheet: typings.easeljs.createjs.SpriteSheet, horizontal: Boolean, vertical: Boolean): Unit = js.native
  def addFlippedFrames(
    spriteSheet: typings.easeljs.createjs.SpriteSheet,
    horizontal: Boolean,
    vertical: Boolean,
    both: Boolean
  ): Unit = js.native
  
  def extractFrame(spriteSheet: typings.easeljs.createjs.SpriteSheet, frameOrAnimation: String): HTMLImageElement = js.native
   // deprecated
  def extractFrame(spriteSheet: typings.easeljs.createjs.SpriteSheet, frameOrAnimation: Double): HTMLImageElement = js.native
  
  /**
    * @deprecated
    */
  def mergeAlpha(rgbImage: HTMLImageElement, alphaImage: HTMLImageElement): HTMLCanvasElement = js.native
  def mergeAlpha(rgbImage: HTMLImageElement, alphaImage: HTMLImageElement, canvas: HTMLCanvasElement): HTMLCanvasElement = js.native
}
