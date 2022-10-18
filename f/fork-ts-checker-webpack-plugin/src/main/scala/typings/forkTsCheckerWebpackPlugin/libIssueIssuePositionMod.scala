package typings.forkTsCheckerWebpackPlugin

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libIssueIssuePositionMod {
  
  @JSImport("fork-ts-checker-webpack-plugin/lib/issue/issue-position", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def compareIssuePositions(): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("compareIssuePositions")().asInstanceOf[Double]
  inline def compareIssuePositions(positionA: Unit, positionB: IssuePosition): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("compareIssuePositions")(positionA.asInstanceOf[js.Any], positionB.asInstanceOf[js.Any])).asInstanceOf[Double]
  inline def compareIssuePositions(positionA: IssuePosition): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("compareIssuePositions")(positionA.asInstanceOf[js.Any]).asInstanceOf[Double]
  inline def compareIssuePositions(positionA: IssuePosition, positionB: IssuePosition): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("compareIssuePositions")(positionA.asInstanceOf[js.Any], positionB.asInstanceOf[js.Any])).asInstanceOf[Double]
  
  trait IssuePosition extends StObject {
    
    var column: Double
    
    var line: Double
  }
  object IssuePosition {
    
    inline def apply(column: Double, line: Double): IssuePosition = {
      val __obj = js.Dynamic.literal(column = column.asInstanceOf[js.Any], line = line.asInstanceOf[js.Any])
      __obj.asInstanceOf[IssuePosition]
    }
    
    extension [Self <: IssuePosition](x: Self) {
      
      inline def setColumn(value: Double): Self = StObject.set(x, "column", value.asInstanceOf[js.Any])
      
      inline def setLine(value: Double): Self = StObject.set(x, "line", value.asInstanceOf[js.Any])
    }
  }
}
