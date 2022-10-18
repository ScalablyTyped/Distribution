package typings.devexpressUtils

import typings.devexpressUtils.libClassMinMaxMod.ExtendedMinMax
import typings.devexpressUtils.libGeometryInterfacesMod.IPoint
import typings.devexpressUtils.libGeometryPointMod.Point
import typings.devexpressUtils.libGeometryRectangleMod.Rectangle
import typings.devexpressUtils.libGeometrySegmentMod.Segment
import typings.devexpressUtils.libGeometryVectorMod.Vector
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libGeometryPolygonalChainMod {
  
  @JSImport("@devexpress/utils/lib/geometry/polygonal-chain", "PolygonalChain")
  @js.native
  open class PolygonalChain[T /* <: Point */] protected () extends StObject {
    def this(points: js.Array[T]) = this()
    
    def bounds: Rectangle = js.native
    
    def changeCoordinateCenterTo(p: IPoint): this.type = js.native
    
    def getSegment(edgeIndex: Double): Segment[Point] = js.native
    
    var points: js.Array[T] = js.native
    
    def projection(axis: Vector): ExtendedMinMax[T] = js.native
    
    def rotateAround(point: IPoint, angle: Double): this.type = js.native
    def rotateAround(point: IPoint, angle: Double, rightSC: Boolean): this.type = js.native
    def rotateAround(point: IPoint, angle: Double, rightSC: Boolean, byClockwise: Boolean): this.type = js.native
    def rotateAround(point: IPoint, angle: Double, rightSC: Unit, byClockwise: Boolean): this.type = js.native
  }
}
