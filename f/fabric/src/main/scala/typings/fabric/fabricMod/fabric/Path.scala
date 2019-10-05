package typings.fabric.fabricMod.fabric

import typings.fabric.fabricDashImplMod.IPathOptions
import typings.std.SVGElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("fabric", "fabric.Path")
@js.native
/**
	 * Constructor
	 * @param path Path data (sequence of coordinates and corresponding "command" tokens)
	 * @param [options] Options object
	 */
class Path ()
  extends typings.fabric.fabricDashImplMod.Path {
  def this(path: String) = this()
  def this(path: js.Array[typings.fabric.fabricDashImplMod.Point]) = this()
  def this(path: String, options: IPathOptions) = this()
  def this(path: js.Array[typings.fabric.fabricDashImplMod.Point], options: IPathOptions) = this()
}

/* static members */
@JSImport("fabric", "fabric.Path")
@js.native
object Path extends js.Object {
  /**
  	 * List of attribute names to account for when parsing SVG element (used by `fabric.Polygon.fromElement`)
  	 */
  var ATTRIBUTE_NAMES: js.Array[String] = js.native
  /**
  	 * Creates an instance of fabric.Path from an SVG <path> element
  	 * @param element to parse
  	 * @param callback Callback to invoke when an fabric.Path instance is created
  	 * @param [options] Options object
  	 */
  def fromElement(element: SVGElement, callback: js.Function): typings.fabric.fabricDashImplMod.Path = js.native
  def fromElement(element: SVGElement, callback: js.Function, options: IPathOptions): typings.fabric.fabricDashImplMod.Path = js.native
  /**
  	 * Creates an instance of fabric.Path from an object
  	 * @param callback Callback to invoke when an fabric.Path instance is created
  	 */
  def fromObject(`object`: js.Any, callback: js.Function): typings.fabric.fabricDashImplMod.Path = js.native
}

