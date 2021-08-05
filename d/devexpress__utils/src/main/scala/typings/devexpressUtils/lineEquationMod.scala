package typings.devexpressUtils

import typings.devexpressUtils.interfacesMod.IPoint
import typings.devexpressUtils.pointMod.Point
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object lineEquationMod {
  
  @JSImport("@devexpress/utils/lib/geometry/line-equation", "LineEquation")
  @js.native
  class LineEquation protected () extends StObject {
    def this(aParam: Double, bParam: Double, cParam: Double) = this()
    
    /* private */ var aParam: js.Any = js.native
    
    /* private */ var bParam: js.Any = js.native
    
    /* private */ var cParam: js.Any = js.native
    
    def equals(obj: LineEquation): Boolean = js.native
    
    def getIntersection(equation: LineEquation): Point | Null = js.native
  }
  /* static members */
  object LineEquation {
    
    @JSImport("@devexpress/utils/lib/geometry/line-equation", "LineEquation")
    @js.native
    val ^ : js.Any = js.native
    
    inline def equals(a: LineEquation, b: LineEquation): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("equals")(a.asInstanceOf[js.Any], b.asInstanceOf[js.Any])).asInstanceOf[Boolean]
    
    inline def fromPoints(pointA: IPoint, pointB: IPoint): LineEquation = (^.asInstanceOf[js.Dynamic].applyDynamic("fromPoints")(pointA.asInstanceOf[js.Any], pointB.asInstanceOf[js.Any])).asInstanceOf[LineEquation]
    
    inline def getIntersection(a: LineEquation, b: LineEquation): Point | Null = (^.asInstanceOf[js.Dynamic].applyDynamic("getIntersection")(a.asInstanceOf[js.Any], b.asInstanceOf[js.Any])).asInstanceOf[Point | Null]
  }
}
