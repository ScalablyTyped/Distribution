package typings.fabric.mod.fabric

import typings.fabric.anon.X
import typings.fabric.fabricImplMod.IPolylineOptions
import typings.std.SVGElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("fabric", "fabric.Polygon")
@js.native
class Polygon protected ()
  extends typings.fabric.fabricImplMod.Polygon {
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
  
  @JSImport("fabric", "fabric.Polygon")
  @js.native
  val ^ : js.Any = js.native
  
  /**
    * Returns Polygon instance from an SVG element
    * @param element Element to parse
    * @param [options] Options object
    */
  @scala.inline
  def fromElement(element: SVGElement): typings.fabric.fabricImplMod.Polygon = ^.asInstanceOf[js.Dynamic].applyDynamic("fromElement")(element.asInstanceOf[js.Any]).asInstanceOf[typings.fabric.fabricImplMod.Polygon]
  @scala.inline
  def fromElement(element: SVGElement, options: IPolylineOptions): typings.fabric.fabricImplMod.Polygon = (^.asInstanceOf[js.Dynamic].applyDynamic("fromElement")(element.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[typings.fabric.fabricImplMod.Polygon]
  
  /**
    * Returns fabric.Polygon instance from an object representation
    * @param object Object to create an instance from
    */
  @scala.inline
  def fromObject(`object`: js.Any): typings.fabric.fabricImplMod.Polygon = ^.asInstanceOf[js.Dynamic].applyDynamic("fromObject")(`object`.asInstanceOf[js.Any]).asInstanceOf[typings.fabric.fabricImplMod.Polygon]
}
