package typings.fabric.fabricDashImplMod

import typings.std.CanvasGradient
import typings.std.CanvasRenderingContext2D
import typings.std.SVGGradientElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("fabric/fabric-impl", "Gradient")
@js.native
class Gradient () extends IGradientOptions {
  /**
  	 * Adds another colorStop
  	 * @param colorStop Object with offset and color
  	 */
  def addColorStop(colorStop: js.Any): Gradient = js.native
  /**
  	 * Returns an instance of CanvasGradient
  	 * @param ctx Context to render on
  	 */
  def toLive(ctx: CanvasRenderingContext2D): CanvasGradient = js.native
  /**
  	 * Returns object representation of a gradient
  	 */
  def toObject(): js.Any = js.native
  def toObject(propertiesToInclude: js.Any): js.Any = js.native
  /**
  	 * Returns SVG representation of an gradient
  	 * @param {Object} object Object to create a gradient for
  	 * @return {String} SVG representation of an gradient (linear/radial)
  	 */
  def toSVG(`object`: js.Any): String = js.native
}

/* static members */
@JSImport("fabric/fabric-impl", "Gradient")
@js.native
object Gradient extends js.Object {
  /**
  	 * Returns {@link fabric.Gradient} instance from its object representation
  	 * @static
  	 * @memberOf fabric.Gradient
  	 * @param {Object} obj
  	 * @param {Object} [options] Options object
  	 */
  def forObject(obj: js.Any): Gradient = js.native
  def forObject(obj: js.Any, options: IGradientOptions): Gradient = js.native
  /**
  	 * Returns {@link fabric.Gradient} instance from an SVG element
  	 * @static
  	 * @memberOf fabric.Gradient
  	 * @param {SVGGradientElement} el SVG gradient element
  	 * @param {fabric.Object} instance
  	 * @return {fabric.Gradient} Gradient instance
  	 * @see http://www.w3.org/TR/SVG/pservers.html#LinearGradientElement
  	 * @see http://www.w3.org/TR/SVG/pservers.html#RadialGradientElement
  	 */
  def fromElement(el: SVGGradientElement, instance: Object): Gradient = js.native
}

