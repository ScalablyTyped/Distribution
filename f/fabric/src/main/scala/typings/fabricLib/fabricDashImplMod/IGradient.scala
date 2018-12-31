package typings
package fabricLib.fabricDashImplMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IGradient extends IGradientOptions {
  /**
  	 * Adds another colorStop
  	 * @param colorStop Object with offset and color
  	 */
  def addColorStop(colorStop: js.Any): IGradient = js.native
  /**
  	 * Returns an instance of CanvasGradient
  	 * @param ctx Context to render on
  	 */
  def toLive(ctx: stdLib.CanvasRenderingContext2D): stdLib.CanvasGradient = js.native
  def toLive(ctx: stdLib.CanvasRenderingContext2D, `object`: PathGroup): stdLib.CanvasGradient = js.native
  /**
  	 * Returns object representation of a gradient
  	 */
  def toObject(): js.Any = js.native
  /**
  	 * Returns SVG representation of an gradient
  	 * @param object Object to create a gradient for
  	 * @param normalize Whether coords should be normalized
  	 * @return SVG representation of an gradient (linear/radial)
  	 */
  def toSVG(`object`: Object): java.lang.String = js.native
  def toSVG(`object`: Object, normalize: scala.Boolean): java.lang.String = js.native
}

