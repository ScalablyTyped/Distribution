package typings.devexpressUtils

import typings.devexpressUtils.interfacesMod.IPoint
import typings.devexpressUtils.pointMod.Point
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object lineEquationMod {
  
  @JSImport("@devexpress/utils/lib/geometry/line-equation", "LineEquation")
  @js.native
  class LineEquation protected () extends StObject {
    def this(aParam: Double, bParam: Double, cParam: Double) = this()
    
    var aParam: js.Any = js.native
    
    var bParam: js.Any = js.native
    
    var cParam: js.Any = js.native
    
    def equals(obj: LineEquation): Boolean = js.native
    
    def getIntersection(equation: LineEquation): Point | Null = js.native
  }
  /* static members */
  object LineEquation {
    
    @JSImport("@devexpress/utils/lib/geometry/line-equation", "LineEquation.equals")
    @js.native
    def equals(a: LineEquation, b: LineEquation): Boolean = js.native
    
    @JSImport("@devexpress/utils/lib/geometry/line-equation", "LineEquation.fromPoints")
    @js.native
    def fromPoints(pointA: IPoint, pointB: IPoint): LineEquation = js.native
    
    @JSImport("@devexpress/utils/lib/geometry/line-equation", "LineEquation.getIntersection")
    @js.native
    def getIntersection(a: LineEquation, b: LineEquation): Point | Null = js.native
  }
}
