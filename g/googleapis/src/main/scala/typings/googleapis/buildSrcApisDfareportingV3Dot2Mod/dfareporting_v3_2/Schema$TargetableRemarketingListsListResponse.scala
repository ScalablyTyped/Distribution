package typings.googleapis.buildSrcApisDfareportingV3Dot2Mod.dfareporting_v3_2

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Targetable remarketing list response
  */
@js.native
trait Schema$TargetableRemarketingListsListResponse extends js.Object {
  /**
    * Identifies what kind of resource this is. Value: the fixed string
    * &quot;dfareporting#targetableRemarketingListsListResponse&quot;.
    */
  var kind: js.UndefOr[String] = js.native
  /**
    * Pagination token to be used for the next list operation.
    */
  var nextPageToken: js.UndefOr[String] = js.native
  /**
    * Targetable remarketing list collection.
    */
  var targetableRemarketingLists: js.UndefOr[js.Array[Schema$TargetableRemarketingList]] = js.native
}

object Schema$TargetableRemarketingListsListResponse {
  @scala.inline
  def apply(
    kind: String = null,
    nextPageToken: String = null,
    targetableRemarketingLists: js.Array[Schema$TargetableRemarketingList] = null
  ): Schema$TargetableRemarketingListsListResponse = {
    val __obj = js.Dynamic.literal()
    if (kind != null) __obj.updateDynamic("kind")(kind.asInstanceOf[js.Any])
    if (nextPageToken != null) __obj.updateDynamic("nextPageToken")(nextPageToken.asInstanceOf[js.Any])
    if (targetableRemarketingLists != null) __obj.updateDynamic("targetableRemarketingLists")(targetableRemarketingLists.asInstanceOf[js.Any])
    __obj.asInstanceOf[Schema$TargetableRemarketingListsListResponse]
  }
}

