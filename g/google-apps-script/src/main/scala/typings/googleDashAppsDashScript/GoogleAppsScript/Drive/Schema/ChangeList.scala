package typings.googleDashAppsDashScript.GoogleAppsScript.Drive.Schema

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ChangeList extends js.Object {
  var etag: js.UndefOr[String] = js.undefined
  var items: js.UndefOr[js.Array[Change]] = js.undefined
  var kind: js.UndefOr[String] = js.undefined
  var largestChangeId: js.UndefOr[String] = js.undefined
  var newStartPageToken: js.UndefOr[String] = js.undefined
  var nextLink: js.UndefOr[String] = js.undefined
  var nextPageToken: js.UndefOr[String] = js.undefined
  var selfLink: js.UndefOr[String] = js.undefined
}

object ChangeList {
  @scala.inline
  def apply(
    etag: String = null,
    items: js.Array[Change] = null,
    kind: String = null,
    largestChangeId: String = null,
    newStartPageToken: String = null,
    nextLink: String = null,
    nextPageToken: String = null,
    selfLink: String = null
  ): ChangeList = {
    val __obj = js.Dynamic.literal()
    if (etag != null) __obj.updateDynamic("etag")(etag)
    if (items != null) __obj.updateDynamic("items")(items)
    if (kind != null) __obj.updateDynamic("kind")(kind)
    if (largestChangeId != null) __obj.updateDynamic("largestChangeId")(largestChangeId)
    if (newStartPageToken != null) __obj.updateDynamic("newStartPageToken")(newStartPageToken)
    if (nextLink != null) __obj.updateDynamic("nextLink")(nextLink)
    if (nextPageToken != null) __obj.updateDynamic("nextPageToken")(nextPageToken)
    if (selfLink != null) __obj.updateDynamic("selfLink")(selfLink)
    __obj.asInstanceOf[ChangeList]
  }
}

