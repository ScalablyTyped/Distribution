package typings.devexpressUtils

import org.scalablytyped.runtime.TopLevel
import typings.devexpressUtils.interfacesMod.IRectangle
import typings.devexpressUtils.pointMod.Point
import typings.devexpressUtils.polygonalChainMod.PolygonalChain
import typings.devexpressUtils.segmentMod.Segment
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@devexpress/utils/lib/geometry/polygon", JSImport.Namespace)
@js.native
object polygonMod extends js.Object {
  
  @js.native
  sealed trait CollisionResult extends js.Object
  @js.native
  object CollisionResult extends js.Object {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[CollisionResult with Double] = js.native
    
    @js.native
    sealed trait Contact extends CollisionResult
    /* 2 */ @js.native
    object Contact extends TopLevel[Contact with Double]
    
    @js.native
    sealed trait Intersect extends CollisionResult
    /* 1 */ @js.native
    object Intersect extends TopLevel[Intersect with Double]
    
    @js.native
    sealed trait None extends CollisionResult
    /* 0 */ @js.native
    object None extends TopLevel[None with Double]
  }
  
  @js.native
  class Polygon[T /* <: Point */] () extends PolygonalChain[T] {
    
    def getEdge(edgeIndex: Double): Segment[Point] = js.native
    
    val numEdges: Double = js.native
  }
  /* static members */
  @js.native
  object Polygon extends js.Object {
    
    def collision[T1 /* <: Point */, T2 /* <: Point */](a: Polygon[T1], b: Polygon[T2]): CollisionResult = js.native
    
    def fromRectangle(rect: IRectangle): Polygon[Point] = js.native
  }
}
