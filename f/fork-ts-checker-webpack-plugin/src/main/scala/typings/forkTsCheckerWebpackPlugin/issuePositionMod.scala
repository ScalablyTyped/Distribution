package typings.forkTsCheckerWebpackPlugin

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object issuePositionMod {
  
  @JSImport("fork-ts-checker-webpack-plugin/lib/issue/IssuePosition", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @scala.inline
  def compareIssuePositions(): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("compareIssuePositions")().asInstanceOf[Double]
  @scala.inline
  def compareIssuePositions(positionA: Unit, positionB: IssuePosition): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("compareIssuePositions")(positionA.asInstanceOf[js.Any], positionB.asInstanceOf[js.Any])).asInstanceOf[Double]
  @scala.inline
  def compareIssuePositions(positionA: IssuePosition): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("compareIssuePositions")(positionA.asInstanceOf[js.Any]).asInstanceOf[Double]
  @scala.inline
  def compareIssuePositions(positionA: IssuePosition, positionB: IssuePosition): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("compareIssuePositions")(positionA.asInstanceOf[js.Any], positionB.asInstanceOf[js.Any])).asInstanceOf[Double]
  
  trait IssuePosition extends StObject {
    
    var column: Double
    
    var line: Double
  }
  object IssuePosition {
    
    @scala.inline
    def apply(column: Double, line: Double): IssuePosition = {
      val __obj = js.Dynamic.literal(column = column.asInstanceOf[js.Any], line = line.asInstanceOf[js.Any])
      __obj.asInstanceOf[IssuePosition]
    }
    
    @scala.inline
    implicit class IssuePositionMutableBuilder[Self <: IssuePosition] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setColumn(value: Double): Self = StObject.set(x, "column", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLine(value: Double): Self = StObject.set(x, "line", value.asInstanceOf[js.Any])
    }
  }
}
