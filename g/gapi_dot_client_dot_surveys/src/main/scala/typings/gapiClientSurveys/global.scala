package typings.gapiClientSurveys

import org.scalablytyped.runtime.TopLevel
import typings.gapiClientSurveys.gapi.client.surveys.MobileapppanelsResource
import typings.gapiClientSurveys.gapi.client.surveys.ResultsResource
import typings.gapiClientSurveys.gapi.client.surveys.SurveysResource
import typings.gapiClientSurveys.gapiClientSurveysStrings.surveys
import typings.gapiClientSurveys.gapiClientSurveysStrings.v2
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobalScope
@js.native
object global extends js.Object {
  @js.native
  object gapi extends js.Object {
    @js.native
    object client extends js.Object {
      val mobileapppanels: MobileapppanelsResource = js.native
      val results: ResultsResource = js.native
      /** Load Surveys API v2 */
      def load(name: surveys, version: v2): js.Thenable[Unit] = js.native
      def load(name: surveys, version: v2, callback: js.Function0[_]): Unit = js.native
      @js.native
      object surveys extends TopLevel[SurveysResource]
      
    }
    
  }
  
}

