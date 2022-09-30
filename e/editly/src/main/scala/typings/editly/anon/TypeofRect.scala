package typings.editly.anon

import org.scalablytyped.runtime.Instantiable0
import typings.fabric.fabricImplMod.IRectOptions
import typings.fabric.mod.fabric.Rect
import typings.std.SVGElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TypeofRect
  extends StObject
     with Instantiable0[Rect] {
  
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
  def fromObject(`object`: Any): typings.fabric.fabricImplMod.Rect = js.native
}
