package typings.googleDashAppsDashScript.GoogleAppsScript.Dfareporting.Schema

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RemarketingListsListResponse extends js.Object {
  var kind: js.UndefOr[String] = js.undefined
  var nextPageToken: js.UndefOr[String] = js.undefined
  var remarketingLists: js.UndefOr[js.Array[RemarketingList]] = js.undefined
}

object RemarketingListsListResponse {
  @scala.inline
  def apply(
    kind: String = null,
    nextPageToken: String = null,
    remarketingLists: js.Array[RemarketingList] = null
  ): RemarketingListsListResponse = {
    val __obj = js.Dynamic.literal()
    if (kind != null) __obj.updateDynamic("kind")(kind)
    if (nextPageToken != null) __obj.updateDynamic("nextPageToken")(nextPageToken)
    if (remarketingLists != null) __obj.updateDynamic("remarketingLists")(remarketingLists)
    __obj.asInstanceOf[RemarketingListsListResponse]
  }
}

