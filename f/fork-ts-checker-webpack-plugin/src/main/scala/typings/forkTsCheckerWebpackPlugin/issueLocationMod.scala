package typings.forkTsCheckerWebpackPlugin

import typings.forkTsCheckerWebpackPlugin.issuePositionMod.IssuePosition
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object issueLocationMod {
  
  @JSImport("fork-ts-checker-webpack-plugin/lib/issue/IssueLocation", "compareIssueLocations")
  @js.native
  def compareIssueLocations(): Double = js.native
  @JSImport("fork-ts-checker-webpack-plugin/lib/issue/IssueLocation", "compareIssueLocations")
  @js.native
  def compareIssueLocations(locationA: js.UndefOr[scala.Nothing], locationB: IssueLocation): Double = js.native
  @JSImport("fork-ts-checker-webpack-plugin/lib/issue/IssueLocation", "compareIssueLocations")
  @js.native
  def compareIssueLocations(locationA: IssueLocation): Double = js.native
  @JSImport("fork-ts-checker-webpack-plugin/lib/issue/IssueLocation", "compareIssueLocations")
  @js.native
  def compareIssueLocations(locationA: IssueLocation, locationB: IssueLocation): Double = js.native
  
  @JSImport("fork-ts-checker-webpack-plugin/lib/issue/IssueLocation", "formatIssueLocation")
  @js.native
  def formatIssueLocation(location: IssueLocation): String = js.native
  
  @js.native
  trait IssueLocation extends StObject {
    
    var end: IssuePosition = js.native
    
    var start: IssuePosition = js.native
  }
  object IssueLocation {
    
    @scala.inline
    def apply(end: IssuePosition, start: IssuePosition): IssueLocation = {
      val __obj = js.Dynamic.literal(end = end.asInstanceOf[js.Any], start = start.asInstanceOf[js.Any])
      __obj.asInstanceOf[IssueLocation]
    }
    
    @scala.inline
    implicit class IssueLocationMutableBuilder[Self <: IssueLocation] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setEnd(value: IssuePosition): Self = StObject.set(x, "end", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStart(value: IssuePosition): Self = StObject.set(x, "start", value.asInstanceOf[js.Any])
    }
  }
}
