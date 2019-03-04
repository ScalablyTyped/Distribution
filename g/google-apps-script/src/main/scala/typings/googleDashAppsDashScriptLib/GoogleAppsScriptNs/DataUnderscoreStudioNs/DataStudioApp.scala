package typings
package googleDashAppsDashScriptLib.GoogleAppsScriptNs.DataUnderscoreStudioNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DataStudioApp extends js.Object {
  def createCommunityConnector(): CommunityConnector
}

object DataStudioApp {
  @scala.inline
  def apply(createCommunityConnector: js.Function0[CommunityConnector]): DataStudioApp = {
    val __obj = js.Dynamic.literal(createCommunityConnector = createCommunityConnector)
  
    __obj.asInstanceOf[DataStudioApp]
  }
}

