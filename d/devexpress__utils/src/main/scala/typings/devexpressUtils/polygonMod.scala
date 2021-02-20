package typings.devexpressUtils

import typings.devexpressUtils.interfacesMod.IRectangle
import typings.devexpressUtils.pointMod.Point
import typings.devexpressUtils.polygonalChainMod.PolygonalChain
import typings.devexpressUtils.segmentMod.Segment
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object polygonMod {
  
  @js.native
  sealed trait CollisionResult extends StObject
  @JSImport("@devexpress/utils/lib/geometry/polygon", "CollisionResult")
  @js.native
  object CollisionResult extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[CollisionResult with Double] = js.native
    
    @js.native
    sealed trait Contact extends CollisionResult
    /* 2 */ val Contact: typings.devexpressUtils.polygonMod.CollisionResult.Contact with Double = js.native
    
    @js.native
    sealed trait Intersect extends CollisionResult
    /* 1 */ val Intersect: typings.devexpressUtils.polygonMod.CollisionResult.Intersect with Double = js.native
    
    @js.native
    sealed trait None extends CollisionResult
    /* 0 */ val None: typings.devexpressUtils.polygonMod.CollisionResult.None with Double = js.native
  }
  
  @JSImport("@devexpress/utils/lib/geometry/polygon", "Polygon")
  @js.native
  class Polygon[T /* <: Point */] protected () extends PolygonalChain[T] {
    def this(points: js.Array[T]) = this()
    
    def getEdge(edgeIndex: Double): Segment[Point] = js.native
    
    val numEdges: Double = js.native
  }
  /* static members */
  object Polygon {
    
    @JSImport("@devexpress/utils/lib/geometry/polygon", "Polygon.collision")
    @js.native
    def collision[T1 /* <: Point */, T2 /* <: Point */](a: Polygon[T1], b: Polygon[T2]): CollisionResult = js.native
    
    @JSImport("@devexpress/utils/lib/geometry/polygon", "Polygon.fromRectangle")
    @js.native
    def fromRectangle(rect: IRectangle): Polygon[Point] = js.native
  }
}
