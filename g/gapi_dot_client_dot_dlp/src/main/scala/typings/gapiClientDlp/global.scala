package typings.gapiClientDlp

import typings.gapiClientDlp.gapi.client.dlp.ContentResource
import typings.gapiClientDlp.gapi.client.dlp.DataSourceResource
import typings.gapiClientDlp.gapi.client.dlp.InspectResource
import typings.gapiClientDlp.gapi.client.dlp.RiskAnalysisResource
import typings.gapiClientDlp.gapi.client.dlp.RootCategoriesResource
import typings.gapiClientDlp.gapiClientDlpStrings.dlp
import typings.gapiClientDlp.gapiClientDlpStrings.v2beta1
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
      val content: ContentResource = js.native
      val dataSource: DataSourceResource = js.native
      val inspect: InspectResource = js.native
      val riskAnalysis: RiskAnalysisResource = js.native
      val rootCategories: RootCategoriesResource = js.native
      /** Load DLP API v2beta1 */
      def load(name: dlp, version: v2beta1): js.Thenable[Unit] = js.native
      def load(name: dlp, version: v2beta1, callback: js.Function0[_]): Unit = js.native
    }
    
  }
  
}

