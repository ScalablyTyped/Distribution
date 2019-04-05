package typings
package googleDashAppsDashScriptLib.GoogleAppsScriptNs.DriveNs.SchemaNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CommentList extends js.Object {
  var items: js.UndefOr[js.Array[Comment]] = js.undefined
  var kind: js.UndefOr[java.lang.String] = js.undefined
  var nextLink: js.UndefOr[java.lang.String] = js.undefined
  var nextPageToken: js.UndefOr[java.lang.String] = js.undefined
  var selfLink: js.UndefOr[java.lang.String] = js.undefined
}

object CommentList {
  @scala.inline
  def apply(
    items: js.Array[Comment] = null,
    kind: java.lang.String = null,
    nextLink: java.lang.String = null,
    nextPageToken: java.lang.String = null,
    selfLink: java.lang.String = null
  ): CommentList = {
    val __obj = js.Dynamic.literal()
    if (items != null) __obj.updateDynamic("items")(items)
    if (kind != null) __obj.updateDynamic("kind")(kind)
    if (nextLink != null) __obj.updateDynamic("nextLink")(nextLink)
    if (nextPageToken != null) __obj.updateDynamic("nextPageToken")(nextPageToken)
    if (selfLink != null) __obj.updateDynamic("selfLink")(selfLink)
    __obj.asInstanceOf[CommentList]
  }
}

