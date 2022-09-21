package typings.fabric.fabricImplMod

import typings.fabric.anon.ColorStops
import typings.std.CanvasGradient
import typings.std.CanvasRenderingContext2D
import typings.std.SVGGradientElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("fabric/fabric-impl", "Gradient")
@js.native
open class Gradient protected ()
  extends StObject
     with IGradientOptions {
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
  def this(options: ColorStops) = this()
  
  /**
    * Adds another colorStop
    * @param colorStop Object with offset and color
    */
  def addColorStop(colorStop: Any): Gradient = js.native
  
  /**
    * Returns an instance of CanvasGradient
    * @param ctx Context to render on
    */
  def toLive(ctx: CanvasRenderingContext2D): CanvasGradient = js.native
  
  /**
    * Returns object representation of a gradient
    */
  def toObject(): Any = js.native
  def toObject(propertiesToInclude: Any): Any = js.native
  
  /**
    * Returns SVG representation of an gradient
    * @param {Object} object Object to create a gradient for
    * @return {String} SVG representation of an gradient (linear/radial)
    */
  def toSVG(`object`: Any): String = js.native
}
/* static members */
object Gradient {
  
  @JSImport("fabric/fabric-impl", "Gradient")
  @js.native
  val ^ : js.Any = js.native
  
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
  inline def fromElement(el: SVGGradientElement, instance: Object): Gradient = (^.asInstanceOf[js.Dynamic].applyDynamic("fromElement")(el.asInstanceOf[js.Any], instance.asInstanceOf[js.Any])).asInstanceOf[Gradient]
}
