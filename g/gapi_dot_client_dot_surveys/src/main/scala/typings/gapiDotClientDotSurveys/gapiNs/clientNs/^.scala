package typings.gapiDotClientDotSurveys.gapiNs.clientNs

import typings.gapiDotClientDotSurveys.gapiDotClientDotSurveysStrings.v2
import typings.gapiDotClientDotSurveys.gapiNs.clientNs.surveysNs.MobileapppanelsResource
import typings.gapiDotClientDotSurveys.gapiNs.clientNs.surveysNs.ResultsResource
import typings.gapiDotClientDotSurveys.gapiNs.clientNs.surveysNs.SurveysResource
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("gapi.client")
@js.native
object ^ extends js.Object {
  val mobileapppanels: MobileapppanelsResource = js.native
  val results: ResultsResource = js.native
  val surveys: SurveysResource = js.native
  /** Load Surveys API v2 */
  def load(name: typings.gapiDotClientDotSurveys.gapiDotClientDotSurveysStrings.surveys, version: v2): js.Thenable[Unit] = js.native
  def load(
    name: typings.gapiDotClientDotSurveys.gapiDotClientDotSurveysStrings.surveys,
    version: v2,
    callback: js.Function0[_]
  ): Unit = js.native
}

