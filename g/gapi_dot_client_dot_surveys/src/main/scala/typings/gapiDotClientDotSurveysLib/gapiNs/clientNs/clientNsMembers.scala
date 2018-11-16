package typings
package gapiDotClientDotSurveysLib.gapiNs.clientNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("gapi.client")
@js.native
object clientNsMembers extends js.Object {
  val mobileapppanels: gapiDotClientDotSurveysLib.gapiNs.clientNs.surveysNs.MobileapppanelsResource = js.native
  val results: gapiDotClientDotSurveysLib.gapiNs.clientNs.surveysNs.ResultsResource = js.native
  val surveys: gapiDotClientDotSurveysLib.gapiNs.clientNs.surveysNs.SurveysResource = js.native
  /** Load Surveys API v2 */
  def load(
    name: gapiDotClientDotSurveysLib.gapiDotClientDotSurveysLibStrings.surveys,
    version: gapiDotClientDotSurveysLib.gapiDotClientDotSurveysLibStrings.v2
  ): stdLib.PromiseLike[scala.Unit] = js.native
  def load(
    name: gapiDotClientDotSurveysLib.gapiDotClientDotSurveysLibStrings.surveys,
    version: gapiDotClientDotSurveysLib.gapiDotClientDotSurveysLibStrings.v2,
    callback: js.Function0[_]
  ): scala.Unit = js.native
}

