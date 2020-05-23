package typings.fabric.fabricImplMod

import typings.std.HTMLCanvasElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IResizeFilter extends IBaseFilter {
  /**
    * LanczosLobes parameter for lanczos filter
    */
  var lanczosLobes: Double = js.native
  /**
    * Resize type
    */
  var resizeType: String = js.native
  /**
    * Scale factor for resizing, x axis
    */
  var scaleX: Double = js.native
  /**
    * Scale factor for resizing, y axis
    */
  var scaleY: Double = js.native
  /**
    * Applies filter to canvas element
    * @param canvasEl Canvas element to apply filter to
    */
  def applyTo(canvasEl: HTMLCanvasElement): Unit = js.native
}

