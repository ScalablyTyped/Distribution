package typings
package expoLib.expoMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ExpoWebGLRenderingContext
  extends reactLib.WebGLRenderingContext {
  def endFrameEXP(): scala.Unit
}

object ExpoWebGLRenderingContext {
  @scala.inline
  def apply(endFrameEXP: js.Function0[scala.Unit]): ExpoWebGLRenderingContext = {
    val __obj = js.Dynamic.literal(endFrameEXP = endFrameEXP)
  
    __obj.asInstanceOf[ExpoWebGLRenderingContext]
  }
}

