package typings.googleapis.buildSrcApisDfareportingV3Dot2Mod.dfareporting_v3_2

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Remarketing list response
  */
@js.native
trait Schema$RemarketingListsListResponse extends js.Object {
  /**
    * Identifies what kind of resource this is. Value: the fixed string
    * &quot;dfareporting#remarketingListsListResponse&quot;.
    */
  var kind: js.UndefOr[String] = js.native
  /**
    * Pagination token to be used for the next list operation.
    */
  var nextPageToken: js.UndefOr[String] = js.native
  /**
    * Remarketing list collection.
    */
  var remarketingLists: js.UndefOr[js.Array[Schema$RemarketingList]] = js.native
}

object Schema$RemarketingListsListResponse {
  @scala.inline
  def apply(
    kind: String = null,
    nextPageToken: String = null,
    remarketingLists: js.Array[Schema$RemarketingList] = null
  ): Schema$RemarketingListsListResponse = {
    val __obj = js.Dynamic.literal()
    if (kind != null) __obj.updateDynamic("kind")(kind.asInstanceOf[js.Any])
    if (nextPageToken != null) __obj.updateDynamic("nextPageToken")(nextPageToken.asInstanceOf[js.Any])
    if (remarketingLists != null) __obj.updateDynamic("remarketingLists")(remarketingLists.asInstanceOf[js.Any])
    __obj.asInstanceOf[Schema$RemarketingListsListResponse]
  }
}

