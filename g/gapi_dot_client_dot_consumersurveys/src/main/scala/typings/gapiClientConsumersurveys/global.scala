package typings.gapiClientConsumersurveys

import typings.gapiClientConsumersurveys.gapi.client.consumersurveys.MobileapppanelsResource
import typings.gapiClientConsumersurveys.gapi.client.consumersurveys.ResultsResource
import typings.gapiClientConsumersurveys.gapi.client.consumersurveys.SurveysResource
import typings.gapiClientConsumersurveys.gapiClientConsumersurveysStrings.consumersurveys
import typings.gapiClientConsumersurveys.gapiClientConsumersurveysStrings.v2
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
      val surveys: SurveysResource = js.native
      /** Load Consumer Surveys API v2 */
      def load(name: consumersurveys, version: v2): js.Thenable[Unit] = js.native
      def load(name: consumersurveys, version: v2, callback: js.Function0[_]): Unit = js.native
    }
    
  }
  
}

