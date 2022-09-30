package typings.editly.anon

import org.scalablytyped.runtime.Instantiable1
import typings.fabric.anon.X
import typings.fabric.fabricImplMod.IPolylineOptions
import typings.fabric.mod.fabric.Polygon
import typings.std.SVGElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TypeofPolygon
  extends StObject
     with Instantiable1[/* points */ js.Array[X], Polygon] {
  
  /**
    * Returns Polygon instance from an SVG element
    * @param element Element to parse
    * @param [options] Options object
    */
  def fromElement(element: SVGElement): typings.fabric.fabricImplMod.Polygon = js.native
  def fromElement(element: SVGElement, options: IPolylineOptions): typings.fabric.fabricImplMod.Polygon = js.native
  
  /**
    * Returns fabric.Polygon instance from an object representation
    * @param object Object to create an instance from
    */
  def fromObject(`object`: Any): typings.fabric.fabricImplMod.Polygon = js.native
}
