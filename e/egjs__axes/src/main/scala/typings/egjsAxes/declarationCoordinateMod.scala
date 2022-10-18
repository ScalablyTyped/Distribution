package typings.egjsAxes

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object declarationCoordinateMod {
  
  @JSImport("@egjs/axes/declaration/Coordinate", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def getCirculatedPos(pos: Double, range: js.Array[Double], circular: js.Array[Boolean]): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("getCirculatedPos")(pos.asInstanceOf[js.Any], range.asInstanceOf[js.Any], circular.asInstanceOf[js.Any])).asInstanceOf[Double]
  
  inline def getDuration(distance: Double, deceleration: Any): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("getDuration")(distance.asInstanceOf[js.Any], deceleration.asInstanceOf[js.Any])).asInstanceOf[Double]
  
  inline def getInsidePosition(destPos: Double, range: js.Array[Double], circular: js.Array[Boolean]): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("getInsidePosition")(destPos.asInstanceOf[js.Any], range.asInstanceOf[js.Any], circular.asInstanceOf[js.Any])).asInstanceOf[Double]
  inline def getInsidePosition(destPos: Double, range: js.Array[Double], circular: js.Array[Boolean], bounce: js.Array[Double]): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("getInsidePosition")(destPos.asInstanceOf[js.Any], range.asInstanceOf[js.Any], circular.asInstanceOf[js.Any], bounce.asInstanceOf[js.Any])).asInstanceOf[Double]
  
  inline def isCircularable(destPos: Double, range: js.Array[Double], circular: js.Array[Boolean]): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("isCircularable")(destPos.asInstanceOf[js.Any], range.asInstanceOf[js.Any], circular.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  
  inline def isEndofBounce(pos: Double, range: js.Array[Double], bounce: js.Array[Double], circular: js.Array[Boolean]): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("isEndofBounce")(pos.asInstanceOf[js.Any], range.asInstanceOf[js.Any], bounce.asInstanceOf[js.Any], circular.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  
  inline def isOutside(pos: Double, range: js.Array[Double]): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("isOutside")(pos.asInstanceOf[js.Any], range.asInstanceOf[js.Any])).asInstanceOf[Boolean]
}
