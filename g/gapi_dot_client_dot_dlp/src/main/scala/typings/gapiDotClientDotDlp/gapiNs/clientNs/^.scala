package typings.gapiDotClientDotDlp.gapiNs.clientNs

import typings.gapiDotClientDotDlp.gapiDotClientDotDlpStrings.dlp
import typings.gapiDotClientDotDlp.gapiDotClientDotDlpStrings.v2beta1
import typings.gapiDotClientDotDlp.gapiNs.clientNs.dlpNs.ContentResource
import typings.gapiDotClientDotDlp.gapiNs.clientNs.dlpNs.DataSourceResource
import typings.gapiDotClientDotDlp.gapiNs.clientNs.dlpNs.InspectResource
import typings.gapiDotClientDotDlp.gapiNs.clientNs.dlpNs.RiskAnalysisResource
import typings.gapiDotClientDotDlp.gapiNs.clientNs.dlpNs.RootCategoriesResource
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("gapi.client")
@js.native
object ^ extends js.Object {
  val content: ContentResource = js.native
  val dataSource: DataSourceResource = js.native
  val inspect: InspectResource = js.native
  val riskAnalysis: RiskAnalysisResource = js.native
  val rootCategories: RootCategoriesResource = js.native
  /** Load DLP API v2beta1 */
  def load(name: dlp, version: v2beta1): js.Thenable[Unit] = js.native
  def load(name: dlp, version: v2beta1, callback: js.Function0[_]): Unit = js.native
}

