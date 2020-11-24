package typings.devexpressUtils

import typings.devexpressUtils.interfacesMod.IPoint
import typings.devexpressUtils.interfacesMod.IRectangle
import typings.devexpressUtils.pointMod.Point
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@devexpress/utils/lib/geometry/segment", JSImport.Namespace)
@js.native
object segmentMod extends js.Object {
  
  @js.native
  class Segment[T /* <: Point */] protected () extends js.Object {
    def this(startPoint: T, endPoint: T) = this()
    
    val center: Point = js.native
    
    def containsPoint(point: IPoint): Boolean = js.native
    def containsPoint(point: IPoint, accuracy: Double): Boolean = js.native
    
    var endPoint: T = js.native
    
    var intersectCore: js.Any = js.native
    
    def isIntersected[AnotherT /* <: Point */](segment: Segment[AnotherT]): Boolean = js.native
    
    def isIntersectedByRect(rect: IRectangle): Boolean = js.native
    
    val length: Double = js.native
    
    var startPoint: T = js.native
    
    val xLength: Double = js.native
    
    val yLength: Double = js.native
  }
}
