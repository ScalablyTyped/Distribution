package typings.googleDashAppsDashScript.GoogleAppsScriptNs.DfareportingNs.SchemaNs

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
    if (kind != null) __obj.updateDynamic("kind")(kind)
    if (remarketingListId != null) __obj.updateDynamic("remarketingListId")(remarketingListId)
    if (sharedAccountIds != null) __obj.updateDynamic("sharedAccountIds")(sharedAccountIds)
    if (sharedAdvertiserIds != null) __obj.updateDynamic("sharedAdvertiserIds")(sharedAdvertiserIds)
    __obj.asInstanceOf[RemarketingListShare]
  }
}

