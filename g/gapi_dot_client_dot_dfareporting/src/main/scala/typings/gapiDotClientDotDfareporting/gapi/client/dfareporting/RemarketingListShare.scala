package typings.gapiDotClientDotDfareporting.gapi.client.dfareporting

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RemarketingListShare extends js.Object {
  /** Identifies what kind of resource this is. Value: the fixed string "dfareporting#remarketingListShare". */
  var kind: js.UndefOr[String] = js.undefined
  /** Remarketing list ID. This is a read-only, auto-generated field. */
  var remarketingListId: js.UndefOr[String] = js.undefined
  /** Accounts that the remarketing list is shared with. */
  var sharedAccountIds: js.UndefOr[js.Array[String]] = js.undefined
  /** Advertisers that the remarketing list is shared with. */
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

