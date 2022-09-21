package typings.devexpressUtils

import typings.devexpressUtils.interfacesMod.IPoint
import typings.devexpressUtils.minMaxMod.ExtendedMinMax
import typings.devexpressUtils.pointMod.Point
import typings.devexpressUtils.rectangleMod.Rectangle
import typings.devexpressUtils.segmentMod.Segment
import typings.devexpressUtils.vectorMod.Vector
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object polygonalChainMod {
  
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
