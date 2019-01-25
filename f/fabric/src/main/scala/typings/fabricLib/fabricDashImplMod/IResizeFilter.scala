package typings
package fabricLib.fabricDashImplMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IResizeFilter extends IBaseFilter {
  /**
  	 * LanczosLobes parameter for lanczos filter
  	 */
  var lanczosLobes: scala.Double = js.native
  /**
  	 * Resize type
  	 */
  var resizeType: java.lang.String = js.native
  /**
  	 * Scale factor for resizing, x axis
  	 */
  var scaleX: scala.Double = js.native
  /**
  	 * Scale factor for resizing, y axis
  	 */
  var scaleY: scala.Double = js.native
  /**
  	 * Applies filter to canvas element
  	 * @param canvasEl Canvas element to apply filter to
  	 */
  def applyTo(canvasEl: stdLib.HTMLCanvasElement): scala.Unit = js.native
}

