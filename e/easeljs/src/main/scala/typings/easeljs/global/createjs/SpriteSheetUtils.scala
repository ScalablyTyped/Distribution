package typings.easeljs.global.createjs

import typings.std.HTMLCanvasElement
import typings.std.HTMLImageElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSGlobal("createjs.SpriteSheetUtils")
@js.native
open class SpriteSheetUtils ()
  extends StObject
     with typings.easeljs.createjs.SpriteSheetUtils
/* static members */
object SpriteSheetUtils {
  
  @JSGlobal("createjs.SpriteSheetUtils")
  @js.native
  val ^ : js.Any = js.native
  
  /**
    * @deprecated
    */
  inline def addFlippedFrames(spriteSheet: typings.easeljs.createjs.SpriteSheet): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("addFlippedFrames")(spriteSheet.asInstanceOf[js.Any]).asInstanceOf[Unit]
  inline def addFlippedFrames(spriteSheet: typings.easeljs.createjs.SpriteSheet, horizontal: Boolean): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("addFlippedFrames")(spriteSheet.asInstanceOf[js.Any], horizontal.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def addFlippedFrames(spriteSheet: typings.easeljs.createjs.SpriteSheet, horizontal: Boolean, vertical: Boolean): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("addFlippedFrames")(spriteSheet.asInstanceOf[js.Any], horizontal.asInstanceOf[js.Any], vertical.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def addFlippedFrames(
    spriteSheet: typings.easeljs.createjs.SpriteSheet,
    horizontal: Boolean,
    vertical: Boolean,
    both: Boolean
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("addFlippedFrames")(spriteSheet.asInstanceOf[js.Any], horizontal.asInstanceOf[js.Any], vertical.asInstanceOf[js.Any], both.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def addFlippedFrames(
    spriteSheet: typings.easeljs.createjs.SpriteSheet,
    horizontal: Boolean,
    vertical: Unit,
    both: Boolean
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("addFlippedFrames")(spriteSheet.asInstanceOf[js.Any], horizontal.asInstanceOf[js.Any], vertical.asInstanceOf[js.Any], both.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def addFlippedFrames(spriteSheet: typings.easeljs.createjs.SpriteSheet, horizontal: Unit, vertical: Boolean): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("addFlippedFrames")(spriteSheet.asInstanceOf[js.Any], horizontal.asInstanceOf[js.Any], vertical.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def addFlippedFrames(
    spriteSheet: typings.easeljs.createjs.SpriteSheet,
    horizontal: Unit,
    vertical: Boolean,
    both: Boolean
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("addFlippedFrames")(spriteSheet.asInstanceOf[js.Any], horizontal.asInstanceOf[js.Any], vertical.asInstanceOf[js.Any], both.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def addFlippedFrames(spriteSheet: typings.easeljs.createjs.SpriteSheet, horizontal: Unit, vertical: Unit, both: Boolean): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("addFlippedFrames")(spriteSheet.asInstanceOf[js.Any], horizontal.asInstanceOf[js.Any], vertical.asInstanceOf[js.Any], both.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def extractFrame(spriteSheet: typings.easeljs.createjs.SpriteSheet, frameOrAnimation: String): HTMLImageElement = (^.asInstanceOf[js.Dynamic].applyDynamic("extractFrame")(spriteSheet.asInstanceOf[js.Any], frameOrAnimation.asInstanceOf[js.Any])).asInstanceOf[HTMLImageElement]
  // deprecated
  inline def extractFrame(spriteSheet: typings.easeljs.createjs.SpriteSheet, frameOrAnimation: Double): HTMLImageElement = (^.asInstanceOf[js.Dynamic].applyDynamic("extractFrame")(spriteSheet.asInstanceOf[js.Any], frameOrAnimation.asInstanceOf[js.Any])).asInstanceOf[HTMLImageElement]
  
  /**
    * @deprecated
    */
  inline def mergeAlpha(rgbImage: HTMLImageElement, alphaImage: HTMLImageElement): HTMLCanvasElement = (^.asInstanceOf[js.Dynamic].applyDynamic("mergeAlpha")(rgbImage.asInstanceOf[js.Any], alphaImage.asInstanceOf[js.Any])).asInstanceOf[HTMLCanvasElement]
  inline def mergeAlpha(rgbImage: HTMLImageElement, alphaImage: HTMLImageElement, canvas: HTMLCanvasElement): HTMLCanvasElement = (^.asInstanceOf[js.Dynamic].applyDynamic("mergeAlpha")(rgbImage.asInstanceOf[js.Any], alphaImage.asInstanceOf[js.Any], canvas.asInstanceOf[js.Any])).asInstanceOf[HTMLCanvasElement]
}
