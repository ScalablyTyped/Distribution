package typings.devexpressUtils

import typings.devexpressUtils.interfacesMod.IPoint
import typings.devexpressUtils.minMaxMod.ExtendedMinMax
import typings.devexpressUtils.pointMod.Point
import typings.devexpressUtils.rectangleMod.Rectangle
import typings.devexpressUtils.segmentMod.Segment
import typings.devexpressUtils.vectorMod.Vector
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@devexpress/utils/lib/geometry/polygonal-chain", JSImport.Namespace)
@js.native
object polygonalChainMod extends js.Object {
  
  @js.native
  class PolygonalChain[T /* <: Point */] protected () extends js.Object {
    def this(points: js.Array[T]) = this()
    
    val bounds: Rectangle = js.native
    
    def changeCoordinateCenterTo(p: IPoint): this.type = js.native
    
    def getSegment(edgeIndex: Double): Segment[Point] = js.native
    
    var points: js.Array[T] = js.native
    
    def projection(axis: Vector): ExtendedMinMax[T] = js.native
    
    def rotateAround(point: IPoint, angle: Double): this.type = js.native
    def rotateAround(point: IPoint, angle: Double, rightSC: js.UndefOr[scala.Nothing], byClockwise: Boolean): this.type = js.native
    def rotateAround(point: IPoint, angle: Double, rightSC: Boolean): this.type = js.native
    def rotateAround(point: IPoint, angle: Double, rightSC: Boolean, byClockwise: Boolean): this.type = js.native
  }
}
