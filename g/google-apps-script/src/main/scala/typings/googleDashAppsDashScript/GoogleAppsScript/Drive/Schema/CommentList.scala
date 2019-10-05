package typings.googleDashAppsDashScript.GoogleAppsScript.Drive.Schema

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CommentList extends js.Object {
  var items: js.UndefOr[js.Array[Comment]] = js.undefined
  var kind: js.UndefOr[String] = js.undefined
  var nextLink: js.UndefOr[String] = js.undefined
  var nextPageToken: js.UndefOr[String] = js.undefined
  var selfLink: js.UndefOr[String] = js.undefined
}

object CommentList {
  @scala.inline
  def apply(
    items: js.Array[Comment] = null,
    kind: String = null,
    nextLink: String = null,
    nextPageToken: String = null,
    selfLink: String = null
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

