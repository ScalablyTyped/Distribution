package typings.devexpressUtils

import typings.devexpressUtils.interfacesMod.IPoint
import typings.devexpressUtils.pointMod.Point
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@devexpress/utils/lib/geometry/line-equation", JSImport.Namespace)
@js.native
object lineEquationMod extends js.Object {
  
  @js.native
  class LineEquation protected () extends js.Object {
    def this(aParam: Double, bParam: Double, cParam: Double) = this()
    
    var aParam: js.Any = js.native
    
    var bParam: js.Any = js.native
    
    var cParam: js.Any = js.native
    
    def equals(obj: LineEquation): Boolean = js.native
    
    def getIntersection(equation: LineEquation): Point | Null = js.native
  }
  /* static members */
  @js.native
  object LineEquation extends js.Object {
    
    def equals(a: LineEquation, b: LineEquation): Boolean = js.native
    
    def fromPoints(pointA: IPoint, pointB: IPoint): LineEquation = js.native
    
    def getIntersection(a: LineEquation, b: LineEquation): Point | Null = js.native
  }
}
