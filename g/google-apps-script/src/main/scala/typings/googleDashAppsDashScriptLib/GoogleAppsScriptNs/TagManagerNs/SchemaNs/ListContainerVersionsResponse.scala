package typings
package googleDashAppsDashScriptLib.GoogleAppsScriptNs.TagManagerNs.SchemaNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ListContainerVersionsResponse extends js.Object {
  var containerVersionHeader: js.UndefOr[js.Array[ContainerVersionHeader]] = js.undefined
  var nextPageToken: js.UndefOr[java.lang.String] = js.undefined
}

object ListContainerVersionsResponse {
  @scala.inline
  def apply(
    containerVersionHeader: js.Array[ContainerVersionHeader] = null,
    nextPageToken: java.lang.String = null
  ): ListContainerVersionsResponse = {
    val __obj = js.Dynamic.literal()
    if (containerVersionHeader != null) __obj.updateDynamic("containerVersionHeader")(containerVersionHeader)
    if (nextPageToken != null) __obj.updateDynamic("nextPageToken")(nextPageToken)
    __obj.asInstanceOf[ListContainerVersionsResponse]
  }
}

