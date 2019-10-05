package typings.googleDashAppsDashScript.GoogleAppsScript.Drive.Schema

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RevisionList extends js.Object {
  var etag: js.UndefOr[String] = js.undefined
  var items: js.UndefOr[js.Array[Revision]] = js.undefined
  var kind: js.UndefOr[String] = js.undefined
  var nextPageToken: js.UndefOr[String] = js.undefined
  var selfLink: js.UndefOr[String] = js.undefined
}

object RevisionList {
  @scala.inline
  def apply(
    etag: String = null,
    items: js.Array[Revision] = null,
    kind: String = null,
    nextPageToken: String = null,
    selfLink: String = null
  ): RevisionList = {
    val __obj = js.Dynamic.literal()
    if (etag != null) __obj.updateDynamic("etag")(etag)
    if (items != null) __obj.updateDynamic("items")(items)
    if (kind != null) __obj.updateDynamic("kind")(kind)
    if (nextPageToken != null) __obj.updateDynamic("nextPageToken")(nextPageToken)
    if (selfLink != null) __obj.updateDynamic("selfLink")(selfLink)
    __obj.asInstanceOf[RevisionList]
  }
}

