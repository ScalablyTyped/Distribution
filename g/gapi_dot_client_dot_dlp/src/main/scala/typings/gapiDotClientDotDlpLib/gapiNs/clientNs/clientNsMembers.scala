package typings
package gapiDotClientDotDlpLib.gapiNs.clientNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("gapi.client")
@js.native
object clientNsMembers extends js.Object {
  val content: gapiDotClientDotDlpLib.gapiNs.clientNs.dlpNs.ContentResource = js.native
  val dataSource: gapiDotClientDotDlpLib.gapiNs.clientNs.dlpNs.DataSourceResource = js.native
  val inspect: gapiDotClientDotDlpLib.gapiNs.clientNs.dlpNs.InspectResource = js.native
  val riskAnalysis: gapiDotClientDotDlpLib.gapiNs.clientNs.dlpNs.RiskAnalysisResource = js.native
  val rootCategories: gapiDotClientDotDlpLib.gapiNs.clientNs.dlpNs.RootCategoriesResource = js.native
  /** Load DLP API v2beta1 */
  def load(
    name: gapiDotClientDotDlpLib.gapiDotClientDotDlpLibStrings.dlp,
    version: gapiDotClientDotDlpLib.gapiDotClientDotDlpLibStrings.v2beta1
  ): js.Thenable[scala.Unit] = js.native
  def load(
    name: gapiDotClientDotDlpLib.gapiDotClientDotDlpLibStrings.dlp,
    version: gapiDotClientDotDlpLib.gapiDotClientDotDlpLibStrings.v2beta1,
    callback: js.Function0[_]
  ): scala.Unit = js.native
}

