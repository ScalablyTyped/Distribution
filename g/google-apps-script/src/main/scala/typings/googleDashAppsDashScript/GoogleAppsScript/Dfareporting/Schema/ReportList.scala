package typings.googleDashAppsDashScript.GoogleAppsScript.Dfareporting.Schema

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ReportList extends js.Object {
  var etag: js.UndefOr[String] = js.undefined
  var items: js.UndefOr[js.Array[Report]] = js.undefined
  var kind: js.UndefOr[String] = js.undefined
  var nextPageToken: js.UndefOr[String] = js.undefined
}

object ReportList {
  @scala.inline
  def apply(
    etag: String = null,
    items: js.Array[Report] = null,
    kind: String = null,
    nextPageToken: String = null
  ): ReportList = {
    val __obj = js.Dynamic.literal()
    if (etag != null) __obj.updateDynamic("etag")(etag)
    if (items != null) __obj.updateDynamic("items")(items)
    if (kind != null) __obj.updateDynamic("kind")(kind)
    if (nextPageToken != null) __obj.updateDynamic("nextPageToken")(nextPageToken)
    __obj.asInstanceOf[ReportList]
  }
}

