package typings
package googleDashAppsDashScriptLib.GoogleAppsScriptNs.TagManagerNs.SchemaNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ListContainersResponse extends js.Object {
  var container: js.UndefOr[js.Array[Container]] = js.undefined
  var nextPageToken: js.UndefOr[java.lang.String] = js.undefined
}

object ListContainersResponse {
  @scala.inline
  def apply(container: js.Array[Container] = null, nextPageToken: java.lang.String = null): ListContainersResponse = {
    val __obj = js.Dynamic.literal()
    if (container != null) __obj.updateDynamic("container")(container)
    if (nextPageToken != null) __obj.updateDynamic("nextPageToken")(nextPageToken)
    __obj.asInstanceOf[ListContainersResponse]
  }
}

