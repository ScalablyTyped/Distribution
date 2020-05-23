package typings.gapiClientPrediction

import typings.gapiClientPrediction.gapi.client.prediction.HostedmodelsResource
import typings.gapiClientPrediction.gapi.client.prediction.TrainedmodelsResource
import typings.gapiClientPrediction.gapiClientPredictionStrings.prediction
import typings.gapiClientPrediction.gapiClientPredictionStrings.v1Dot6
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
      val hostedmodels: HostedmodelsResource = js.native
      val trainedmodels: TrainedmodelsResource = js.native
      /** Load Prediction API v1.6 */
      def load(name: prediction, version: v1Dot6): js.Thenable[Unit] = js.native
      def load(name: prediction, version: v1Dot6, callback: js.Function0[_]): Unit = js.native
    }
    
  }
  
}

