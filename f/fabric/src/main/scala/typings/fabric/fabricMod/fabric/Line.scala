package typings.fabric.fabricMod.fabric

import typings.fabric.fabricDashImplMod.ILineOptions
import typings.std.SVGElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("fabric", "fabric.Line")
@js.native
/**
	 * Constructor
	 * @param [points] Array of points
	 * @param [options] Options object
	 */
class Line ()
  extends typings.fabric.fabricDashImplMod.Line {
  def this(points: js.Array[Double]) = this()
  def this(points: js.Array[Double], objObjects: ILineOptions) = this()
}

/* static members */
@JSImport("fabric", "fabric.Line")
@js.native
object Line extends js.Object {
  var ATTRIBUTE_NAMES: js.Array[String] = js.native
  /**
  	 * Returns fabric.Line instance from an SVG element
  	 * @static
  	 * @memberOf fabric.Line
  	 * @param {SVGElement} element Element to parse
  	 * @param {Object} [options] Options object
  	 * @param {Function} [callback] callback function invoked after parsing
  	 */
  def fromElement(element: SVGElement): typings.fabric.fabricDashImplMod.Line = js.native
  def fromElement(element: SVGElement, callback: js.Function): typings.fabric.fabricDashImplMod.Line = js.native
  def fromElement(element: SVGElement, callback: js.Function, options: ILineOptions): typings.fabric.fabricDashImplMod.Line = js.native
  /**
  	 * Returns fabric.Line instance from an object representation
  	 * @param object Object to create an instance from
  	 */
  def fromObject(`object`: js.Any): typings.fabric.fabricDashImplMod.Line = js.native
}

