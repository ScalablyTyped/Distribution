package typings.googleDashAppsDashScript.GoogleAppsScript.Dfareporting.Schema

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TargetableRemarketingListsListResponse extends js.Object {
  var kind: js.UndefOr[String] = js.undefined
  var nextPageToken: js.UndefOr[String] = js.undefined
  var targetableRemarketingLists: js.UndefOr[js.Array[TargetableRemarketingList]] = js.undefined
}

object TargetableRemarketingListsListResponse {
  @scala.inline
  def apply(
    kind: String = null,
    nextPageToken: String = null,
    targetableRemarketingLists: js.Array[TargetableRemarketingList] = null
  ): TargetableRemarketingListsListResponse = {
    val __obj = js.Dynamic.literal()
    if (kind != null) __obj.updateDynamic("kind")(kind.asInstanceOf[js.Any])
    if (nextPageToken != null) __obj.updateDynamic("nextPageToken")(nextPageToken.asInstanceOf[js.Any])
    if (targetableRemarketingLists != null) __obj.updateDynamic("targetableRemarketingLists")(targetableRemarketingLists.asInstanceOf[js.Any])
    __obj.asInstanceOf[TargetableRemarketingListsListResponse]
  }
}

