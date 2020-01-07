package typings.googleapis.buildSrcApisDfareportingV3Dot3Mod.dfareporting_v3_3

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Contains properties of a remarketing list&#39;s sharing information.
  * Sharing allows other accounts or advertisers to target to your remarketing
  * lists. This resource can be used to manage remarketing list sharing to
  * other accounts and advertisers.
  */
@js.native
trait Schema$RemarketingListShare extends js.Object {
  /**
    * Identifies what kind of resource this is. Value: the fixed string
    * &quot;dfareporting#remarketingListShare&quot;.
    */
  var kind: js.UndefOr[String] = js.native
  /**
    * Remarketing list ID. This is a read-only, auto-generated field.
    */
  var remarketingListId: js.UndefOr[String] = js.native
  /**
    * Accounts that the remarketing list is shared with.
    */
  var sharedAccountIds: js.UndefOr[js.Array[String]] = js.native
  /**
    * Advertisers that the remarketing list is shared with.
    */
  var sharedAdvertiserIds: js.UndefOr[js.Array[String]] = js.native
}

object Schema$RemarketingListShare {
  @scala.inline
  def apply(
    kind: String = null,
    remarketingListId: String = null,
    sharedAccountIds: js.Array[String] = null,
    sharedAdvertiserIds: js.Array[String] = null
  ): Schema$RemarketingListShare = {
    val __obj = js.Dynamic.literal()
    if (kind != null) __obj.updateDynamic("kind")(kind.asInstanceOf[js.Any])
    if (remarketingListId != null) __obj.updateDynamic("remarketingListId")(remarketingListId.asInstanceOf[js.Any])
    if (sharedAccountIds != null) __obj.updateDynamic("sharedAccountIds")(sharedAccountIds.asInstanceOf[js.Any])
    if (sharedAdvertiserIds != null) __obj.updateDynamic("sharedAdvertiserIds")(sharedAdvertiserIds.asInstanceOf[js.Any])
    __obj.asInstanceOf[Schema$RemarketingListShare]
  }
}

