package typings.editly.anon

import org.scalablytyped.runtime.Instantiable0
import typings.fabric.fabricImplMod.ICircleOptions
import typings.fabric.mod.fabric.Circle
import typings.std.SVGElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TypeofCircle
  extends StObject
     with Instantiable0[Circle] {
  
  /**
    * List of attribute names to account for when parsing SVG element (used by {@link fabric.Circle.fromElement})
    */
  var ATTRIBUTE_NAMES: js.Array[String] = js.native
  
  /**
    * Returns Circle instance from an SVG element
    * @param element Element to parse
    * @param [options] Options object
    */
  def fromElement(element: SVGElement, options: ICircleOptions): typings.fabric.fabricImplMod.Circle = js.native
  
  /**
    * Returns Circle instance from an object representation
    * @param object Object to create an instance from
    */
  def fromObject(`object`: Any): typings.fabric.fabricImplMod.Circle = js.native
}
