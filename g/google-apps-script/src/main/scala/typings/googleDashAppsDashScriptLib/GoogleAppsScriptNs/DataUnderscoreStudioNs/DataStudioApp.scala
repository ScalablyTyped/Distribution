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
  def apply(createCommunityConnector: () => CommunityConnector): DataStudioApp = {
    val __obj = js.Dynamic.literal(createCommunityConnector = js.Any.fromFunction0(createCommunityConnector))
  
    __obj.asInstanceOf[DataStudioApp]
  }
}

