package typings
package fabricLib.fabricDashImplMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait IResizeFilter extends js.Object {
  /**
  	 * LanczosLobes parameter for lanczos filter
  	 */
  var lanczosLobes: scala.Double
  /**
  	 * Resize type
  	 */
  var resizeType: java.lang.String
  /**
  	 * Scale factor for resizing, x axis
  	 */
  var scaleX: scala.Double
  /**
  	 * Scale factor for resizing, y axis
  	 */
  var scaleY: scala.Double
  /**
  	 * Applies filter to canvas element
  	 * @param canvasEl Canvas element to apply filter to
  	 */
  def applyTo(canvasEl: stdLib.HTMLCanvasElement): scala.Unit
}

