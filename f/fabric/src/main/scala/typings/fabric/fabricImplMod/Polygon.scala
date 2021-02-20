package typings.fabric.fabricImplMod

import typings.fabric.anon.X
import typings.std.SVGElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("fabric/fabric-impl", "Polygon")
@js.native
class Polygon protected () extends Polyline {
  /**
    * Constructor
    * @param points Array of points
    * @param [options] Options object
    */
  def this(points: js.Array[X]) = this()
  def this(points: js.Array[X], options: IPolylineOptions) = this()
}
/* static members */
object Polygon {
  
  /**
    * Returns Polygon instance from an SVG element
    * @param element Element to parse
    * @param [options] Options object
    */
  @JSImport("fabric/fabric-impl", "Polygon.fromElement")
  @js.native
  def fromElement(element: SVGElement): Polygon = js.native
  @JSImport("fabric/fabric-impl", "Polygon.fromElement")
  @js.native
  def fromElement(element: SVGElement, options: IPolylineOptions): Polygon = js.native
  
  /**
    * Returns fabric.Polygon instance from an object representation
    * @param object Object to create an instance from
    */
  @JSImport("fabric/fabric-impl", "Polygon.fromObject")
  @js.native
  def fromObject(`object`: js.Any): Polygon = js.native
}
