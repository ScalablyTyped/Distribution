package typings
package googleDashAppsDashScriptLib.GoogleAppsScriptNs.TagmanagerUnderscoreV2Ns.SchemaNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ListTagsResponse extends js.Object {
  var nextPageToken: js.UndefOr[java.lang.String] = js.undefined
  var tag: js.UndefOr[js.Array[Tag]] = js.undefined
}

object ListTagsResponse {
  @scala.inline
  def apply(nextPageToken: java.lang.String = null, tag: js.Array[Tag] = null): ListTagsResponse = {
    val __obj = js.Dynamic.literal()
    if (nextPageToken != null) __obj.updateDynamic("nextPageToken")(nextPageToken)
    if (tag != null) __obj.updateDynamic("tag")(tag)
    __obj.asInstanceOf[ListTagsResponse]
  }
}

