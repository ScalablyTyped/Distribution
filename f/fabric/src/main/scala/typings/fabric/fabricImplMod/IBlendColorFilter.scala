package typings.fabric.fabricImplMod

import typings.std.HTMLCanvasElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IBlendColorFilter extends IBaseFilter {
  
  var alpha: js.UndefOr[Double] = js.native
  
  /**
    * Applies filter to canvas element
    * @param canvasEl Canvas element to apply filter to
    */
  def applyTo(canvasEl: HTMLCanvasElement): Unit = js.native
  
  var color: js.UndefOr[String] = js.native
  
  var mode: js.UndefOr[String] = js.native
}
