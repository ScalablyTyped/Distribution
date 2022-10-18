package typings.devexpressUtils

import typings.devexpressUtils.libGeometryPointMod.Point
import typings.devexpressUtils.libGeometrySegmentMod.Segment
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libGeometryVectorMod {
  
  @JSImport("@devexpress/utils/lib/geometry/vector", "Vector")
  @js.native
  open class Vector () extends StObject {
    def this(x: Double) = this()
    def this(x: Double, y: Double) = this()
    def this(x: Unit, y: Double) = this()
    
    def length: Double = js.native
    
    def negative(): this.type = js.native
    
    def normalize(): Vector = js.native
    
    var x: Double = js.native
    
    var y: Double = js.native
  }
  /* static members */
  object Vector {
    
    @JSImport("@devexpress/utils/lib/geometry/vector", "Vector")
    @js.native
    val ^ : js.Any = js.native
    
    inline def angleBetween(a: Vector, b: Vector): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("angleBetween")(a.asInstanceOf[js.Any], b.asInstanceOf[js.Any])).asInstanceOf[Double]
    
    inline def fromPoints(begin: Point, end: Point): Vector = (^.asInstanceOf[js.Dynamic].applyDynamic("fromPoints")(begin.asInstanceOf[js.Any], end.asInstanceOf[js.Any])).asInstanceOf[Vector]
    
    inline def fromSegment(segment: Segment[Point]): Vector = ^.asInstanceOf[js.Dynamic].applyDynamic("fromSegment")(segment.asInstanceOf[js.Any]).asInstanceOf[Vector]
    
    inline def scalarProduct(a: Point, b: Point): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("scalarProduct")(a.asInstanceOf[js.Any], b.asInstanceOf[js.Any])).asInstanceOf[Double]
    inline def scalarProduct(a: Point, b: Vector): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("scalarProduct")(a.asInstanceOf[js.Any], b.asInstanceOf[js.Any])).asInstanceOf[Double]
    inline def scalarProduct(a: Vector, b: Point): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("scalarProduct")(a.asInstanceOf[js.Any], b.asInstanceOf[js.Any])).asInstanceOf[Double]
    inline def scalarProduct(a: Vector, b: Vector): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("scalarProduct")(a.asInstanceOf[js.Any], b.asInstanceOf[js.Any])).asInstanceOf[Double]
  }
}
