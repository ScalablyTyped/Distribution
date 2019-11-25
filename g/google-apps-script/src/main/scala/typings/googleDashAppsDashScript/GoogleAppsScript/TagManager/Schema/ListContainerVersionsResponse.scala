package typings.googleDashAppsDashScript.GoogleAppsScript.TagManager.Schema

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ListContainerVersionsResponse extends js.Object {
  var containerVersionHeader: js.UndefOr[js.Array[ContainerVersionHeader]] = js.undefined
  var nextPageToken: js.UndefOr[String] = js.undefined
}

object ListContainerVersionsResponse {
  @scala.inline
  def apply(containerVersionHeader: js.Array[ContainerVersionHeader] = null, nextPageToken: String = null): ListContainerVersionsResponse = {
    val __obj = js.Dynamic.literal()
    if (containerVersionHeader != null) __obj.updateDynamic("containerVersionHeader")(containerVersionHeader.asInstanceOf[js.Any])
    if (nextPageToken != null) __obj.updateDynamic("nextPageToken")(nextPageToken.asInstanceOf[js.Any])
    __obj.asInstanceOf[ListContainerVersionsResponse]
  }
}

