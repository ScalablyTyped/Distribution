package typings.fabric.fabricMod.fabric

import typings.fabric.Anon_ColorStops
import typings.fabric.fabricDashImplMod.IGradientOptions
import typings.std.SVGGradientElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("fabric", "fabric.Gradient")
@js.native
class Gradient protected ()
  extends typings.fabric.fabricDashImplMod.Gradient {
  /**
    * Constructor
    * @param {Object} options Options object with type, coords, gradientUnits and colorStops
    * @param {Object} [options.type] gradient type linear or radial
    * @param {Object} [options.gradientUnits] gradient units
    * @param {Object} [options.offsetX] SVG import compatibility
    * @param {Object} [options.offsetY] SVG import compatibility
    * @param {Object[]} options.colorStops contains the colorstops.
    * @param {Object} options.coords contains the coords of the gradient
    * @param {Number} [options.coords.x1] X coordiante of the first point for linear or of the focal point for radial
    * @param {Number} [options.coords.y1] Y coordiante of the first point for linear or of the focal point for radial
    * @param {Number} [options.coords.x2] X coordiante of the second point for linear or of the center point for radial
    * @param {Number} [options.coords.y2] Y coordiante of the second point for linear or of the center point for radial
    * @param {Number} [options.coords.r1] only for radial gradient, radius of the inner circle
    * @param {Number} [options.coords.r2] only for radial gradient, radius of the external circle
    * @return {fabric.Gradient} thisArg
    */
  def this(options: Anon_ColorStops) = this()
}

/* static members */
@JSImport("fabric", "fabric.Gradient")
@js.native
object Gradient extends js.Object {
  /**
  	 * Returns {@link fabric.Gradient} instance from its object representation
  	 * @static
  	 * @memberOf fabric.Gradient
  	 * @param {Object} obj
  	 * @param {Object} [options] Options object
  	 */
  def forObject(obj: js.Any): typings.fabric.fabricDashImplMod.Gradient = js.native
  def forObject(obj: js.Any, options: IGradientOptions): typings.fabric.fabricDashImplMod.Gradient = js.native
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
  def fromElement(el: SVGGradientElement, instance: typings.fabric.fabricDashImplMod.Object): typings.fabric.fabricDashImplMod.Gradient = js.native
}

