package typings.devexpressUtils

import typings.devexpressUtils.libGeometryInterfacesMod.IPoint
import typings.devexpressUtils.libGeometryInterfacesMod.IRectangle
import typings.devexpressUtils.libGeometryPointMod.Point
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libGeometrySegmentMod {
  
  @JSImport("@devexpress/utils/lib/geometry/segment", "Segment")
  @js.native
  open class Segment[T /* <: Point */] protected () extends StObject {
    def this(startPoint: T, endPoint: T) = this()
    
    def center: Point = js.native
    
    def containsPoint(point: IPoint): Boolean = js.native
    def containsPoint(point: IPoint, accuracy: Double): Boolean = js.native
    
    var endPoint: T = js.native
    
    /* private */ var intersectCore: Any = js.native
    
    def isIntersected[AnotherT /* <: Point */](segment: Segment[AnotherT]): Boolean = js.native
    
    def isIntersectedByRect(rect: IRectangle): Boolean = js.native
    
    def length: Double = js.native
    
    var startPoint: T = js.native
    
    def xLength: Double = js.native
    
    def yLength: Double = js.native
  }
}
