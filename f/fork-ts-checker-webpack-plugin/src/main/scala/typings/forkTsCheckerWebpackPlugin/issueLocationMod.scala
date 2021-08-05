package typings.forkTsCheckerWebpackPlugin

import typings.forkTsCheckerWebpackPlugin.issuePositionMod.IssuePosition
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object issueLocationMod {
  
  @JSImport("fork-ts-checker-webpack-plugin/lib/issue/IssueLocation", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def compareIssueLocations(): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("compareIssueLocations")().asInstanceOf[Double]
  inline def compareIssueLocations(locationA: Unit, locationB: IssueLocation): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("compareIssueLocations")(locationA.asInstanceOf[js.Any], locationB.asInstanceOf[js.Any])).asInstanceOf[Double]
  inline def compareIssueLocations(locationA: IssueLocation): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("compareIssueLocations")(locationA.asInstanceOf[js.Any]).asInstanceOf[Double]
  inline def compareIssueLocations(locationA: IssueLocation, locationB: IssueLocation): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("compareIssueLocations")(locationA.asInstanceOf[js.Any], locationB.asInstanceOf[js.Any])).asInstanceOf[Double]
  
  inline def formatIssueLocation(location: IssueLocation): String = ^.asInstanceOf[js.Dynamic].applyDynamic("formatIssueLocation")(location.asInstanceOf[js.Any]).asInstanceOf[String]
  
  trait IssueLocation extends StObject {
    
    var end: IssuePosition
    
    var start: IssuePosition
  }
  object IssueLocation {
    
    inline def apply(end: IssuePosition, start: IssuePosition): IssueLocation = {
      val __obj = js.Dynamic.literal(end = end.asInstanceOf[js.Any], start = start.asInstanceOf[js.Any])
      __obj.asInstanceOf[IssueLocation]
    }
    
    extension [Self <: IssueLocation](x: Self) {
      
      inline def setEnd(value: IssuePosition): Self = StObject.set(x, "end", value.asInstanceOf[js.Any])
      
      inline def setStart(value: IssuePosition): Self = StObject.set(x, "start", value.asInstanceOf[js.Any])
    }
  }
}
