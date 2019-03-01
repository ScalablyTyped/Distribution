package typings
package gapiDotClientDotDfareportingLib.gapiNs.clientNs.dfareportingNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RemarketingListShare extends js.Object {
  /** Identifies what kind of resource this is. Value: the fixed string "dfareporting#remarketingListShare". */
  var kind: js.UndefOr[java.lang.String] = js.undefined
  /** Remarketing list ID. This is a read-only, auto-generated field. */
  var remarketingListId: js.UndefOr[java.lang.String] = js.undefined
  /** Accounts that the remarketing list is shared with. */
  var sharedAccountIds: js.UndefOr[js.Array[java.lang.String]] = js.undefined
  /** Advertisers that the remarketing list is shared with. */
  var sharedAdvertiserIds: js.UndefOr[js.Array[java.lang.String]] = js.undefined
}

object RemarketingListShare {
  @scala.inline
  def apply(
    kind: java.lang.String = null,
    remarketingListId: java.lang.String = null,
    sharedAccountIds: js.Array[java.lang.String] = null,
    sharedAdvertiserIds: js.Array[java.lang.String] = null
  ): RemarketingListShare = {
    val __obj = js.Dynamic.literal()
    if (kind != null) __obj.updateDynamic("kind")(kind)
    if (remarketingListId != null) __obj.updateDynamic("remarketingListId")(remarketingListId)
    if (sharedAccountIds != null) __obj.updateDynamic("sharedAccountIds")(sharedAccountIds)
    if (sharedAdvertiserIds != null) __obj.updateDynamic("sharedAdvertiserIds")(sharedAdvertiserIds)
    __obj.asInstanceOf[RemarketingListShare]
  }
}

