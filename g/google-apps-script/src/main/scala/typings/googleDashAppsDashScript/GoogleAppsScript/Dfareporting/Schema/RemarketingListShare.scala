package typings.googleDashAppsDashScript.GoogleAppsScript.Dfareporting.Schema

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RemarketingListShare extends js.Object {
  var kind: js.UndefOr[String] = js.undefined
  var remarketingListId: js.UndefOr[String] = js.undefined
  var sharedAccountIds: js.UndefOr[js.Array[String]] = js.undefined
  var sharedAdvertiserIds: js.UndefOr[js.Array[String]] = js.undefined
}

object RemarketingListShare {
  @scala.inline
  def apply(
    kind: String = null,
    remarketingListId: String = null,
    sharedAccountIds: js.Array[String] = null,
    sharedAdvertiserIds: js.Array[String] = null
  ): RemarketingListShare = {
    val __obj = js.Dynamic.literal()
    if (kind != null) __obj.updateDynamic("kind")(kind.asInstanceOf[js.Any])
    if (remarketingListId != null) __obj.updateDynamic("remarketingListId")(remarketingListId.asInstanceOf[js.Any])
    if (sharedAccountIds != null) __obj.updateDynamic("sharedAccountIds")(sharedAccountIds.asInstanceOf[js.Any])
    if (sharedAdvertiserIds != null) __obj.updateDynamic("sharedAdvertiserIds")(sharedAdvertiserIds.asInstanceOf[js.Any])
    __obj.asInstanceOf[RemarketingListShare]
  }
}

