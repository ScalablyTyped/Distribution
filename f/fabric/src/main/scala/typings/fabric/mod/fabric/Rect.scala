package typings.fabric.mod.fabric

import typings.fabric.fabricImplMod.IRectOptions
import typings.std.SVGElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("fabric", "fabric.Rect")
@js.native
/**
  * Constructor
  * @param [options] Options object
  */
class Rect ()
  extends typings.fabric.fabricImplMod.Rect {
  def this(options: IRectOptions) = this()
}

/* static members */
@JSImport("fabric", "fabric.Rect")
@js.native
object Rect extends js.Object {
  /**
    * List of attribute names to account for when parsing SVG element (used by `fabric.Rect.fromElement`)
    */
  var ATTRIBUTE_NAMES: js.Array[String] = js.native
  /**
    * Returns Rect instance from an SVG element
    * @param element Element to parse
    * @param [options] Options object
    */
  def fromElement(element: SVGElement): typings.fabric.fabricImplMod.Rect = js.native
  def fromElement(element: SVGElement, options: IRectOptions): typings.fabric.fabricImplMod.Rect = js.native
  /**
    * Returns Rect instance from an object representation
    * @param object Object to create an instance from
    */
  def fromObject(`object`: js.Any): typings.fabric.fabricImplMod.Rect = js.native
}

