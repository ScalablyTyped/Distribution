package typings.fabric.fabricImplMod

import typings.fabric.anon.X
import typings.std.SVGElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
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
  
  @JSImport("fabric/fabric-impl", "Polygon")
  @js.native
  val ^ : js.Any = js.native
  
  /**
    * Returns Polygon instance from an SVG element
    * @param element Element to parse
    * @param [options] Options object
    */
  @scala.inline
  def fromElement(element: SVGElement): Polygon = ^.asInstanceOf[js.Dynamic].applyDynamic("fromElement")(element.asInstanceOf[js.Any]).asInstanceOf[Polygon]
  @scala.inline
  def fromElement(element: SVGElement, options: IPolylineOptions): Polygon = (^.asInstanceOf[js.Dynamic].applyDynamic("fromElement")(element.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Polygon]
  
  /**
    * Returns fabric.Polygon instance from an object representation
    * @param object Object to create an instance from
    */
  @scala.inline
  def fromObject(`object`: js.Any): Polygon = ^.asInstanceOf[js.Dynamic].applyDynamic("fromObject")(`object`.asInstanceOf[js.Any]).asInstanceOf[Polygon]
}
