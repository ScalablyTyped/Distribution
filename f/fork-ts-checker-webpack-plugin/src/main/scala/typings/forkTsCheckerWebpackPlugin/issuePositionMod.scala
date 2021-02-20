package typings.forkTsCheckerWebpackPlugin

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object issuePositionMod {
  
  @JSImport("fork-ts-checker-webpack-plugin/lib/issue/IssuePosition", "compareIssuePositions")
  @js.native
  def compareIssuePositions(): Double = js.native
  @JSImport("fork-ts-checker-webpack-plugin/lib/issue/IssuePosition", "compareIssuePositions")
  @js.native
  def compareIssuePositions(positionA: js.UndefOr[scala.Nothing], positionB: IssuePosition): Double = js.native
  @JSImport("fork-ts-checker-webpack-plugin/lib/issue/IssuePosition", "compareIssuePositions")
  @js.native
  def compareIssuePositions(positionA: IssuePosition): Double = js.native
  @JSImport("fork-ts-checker-webpack-plugin/lib/issue/IssuePosition", "compareIssuePositions")
  @js.native
  def compareIssuePositions(positionA: IssuePosition, positionB: IssuePosition): Double = js.native
  
  @js.native
  trait IssuePosition extends StObject {
    
    var column: Double = js.native
    
    var line: Double = js.native
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
