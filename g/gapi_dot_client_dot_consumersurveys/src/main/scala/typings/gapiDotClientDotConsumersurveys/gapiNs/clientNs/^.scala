package typings.gapiDotClientDotConsumersurveys.gapiNs.clientNs

import typings.gapiDotClientDotConsumersurveys.gapiDotClientDotConsumersurveysStrings.consumersurveys
import typings.gapiDotClientDotConsumersurveys.gapiDotClientDotConsumersurveysStrings.v2
import typings.gapiDotClientDotConsumersurveys.gapiNs.clientNs.consumersurveysNs.MobileapppanelsResource
import typings.gapiDotClientDotConsumersurveys.gapiNs.clientNs.consumersurveysNs.ResultsResource
import typings.gapiDotClientDotConsumersurveys.gapiNs.clientNs.consumersurveysNs.SurveysResource
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("gapi.client")
@js.native
object ^ extends js.Object {
  val mobileapppanels: MobileapppanelsResource = js.native
  val results: ResultsResource = js.native
  val surveys: SurveysResource = js.native
  /** Load Consumer Surveys API v2 */
  def load(name: consumersurveys, version: v2): js.Thenable[Unit] = js.native
  def load(name: consumersurveys, version: v2, callback: js.Function0[_]): Unit = js.native
}

