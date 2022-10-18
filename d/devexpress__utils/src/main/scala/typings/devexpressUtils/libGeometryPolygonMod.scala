package typings.devexpressUtils

import typings.devexpressUtils.libGeometryInterfacesMod.IRectangle
import typings.devexpressUtils.libGeometryPointMod.Point
import typings.devexpressUtils.libGeometryPolygonalChainMod.PolygonalChain
import typings.devexpressUtils.libGeometrySegmentMod.Segment
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libGeometryPolygonMod {
  
  @js.native
  sealed trait CollisionResult extends StObject
  @JSImport("@devexpress/utils/lib/geometry/polygon", "CollisionResult")
  @js.native
  object CollisionResult extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[CollisionResult & Double] = js.native
    
    @js.native
    sealed trait Contact
      extends StObject
         with CollisionResult
    /* 2 */ val Contact: typings.devexpressUtils.libGeometryPolygonMod.CollisionResult.Contact & Double = js.native
    
    @js.native
    sealed trait Intersect
      extends StObject
         with CollisionResult
    /* 1 */ val Intersect: typings.devexpressUtils.libGeometryPolygonMod.CollisionResult.Intersect & Double = js.native
    
    @js.native
    sealed trait None
      extends StObject
         with CollisionResult
    /* 0 */ val None: typings.devexpressUtils.libGeometryPolygonMod.CollisionResult.None & Double = js.native
  }
  
  @JSImport("@devexpress/utils/lib/geometry/polygon", "Polygon")
  @js.native
  open class Polygon[T /* <: Point */] protected () extends PolygonalChain[T] {
    def this(points: js.Array[T]) = this()
    
    def getEdge(edgeIndex: Double): Segment[Point] = js.native
    
    def numEdges: Double = js.native
  }
  /* static members */
  object Polygon {
    
    @JSImport("@devexpress/utils/lib/geometry/polygon", "Polygon")
    @js.native
    val ^ : js.Any = js.native
    
    inline def collision[T1 /* <: Point */, T2 /* <: Point */](a: Polygon[T1], b: Polygon[T2]): CollisionResult = (^.asInstanceOf[js.Dynamic].applyDynamic("collision")(a.asInstanceOf[js.Any], b.asInstanceOf[js.Any])).asInstanceOf[CollisionResult]
    
    inline def fromRectangle(rect: IRectangle): Polygon[Point] = ^.asInstanceOf[js.Dynamic].applyDynamic("fromRectangle")(rect.asInstanceOf[js.Any]).asInstanceOf[Polygon[Point]]
  }
}
