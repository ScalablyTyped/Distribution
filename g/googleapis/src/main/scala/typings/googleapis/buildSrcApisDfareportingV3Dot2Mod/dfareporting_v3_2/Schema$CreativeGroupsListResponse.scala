package typings.googleapis.buildSrcApisDfareportingV3Dot2Mod.dfareporting_v3_2

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Creative Group List Response
  */
@js.native
trait Schema$CreativeGroupsListResponse extends js.Object {
  /**
    * Creative group collection.
    */
  var creativeGroups: js.UndefOr[js.Array[Schema$CreativeGroup]] = js.native
  /**
    * Identifies what kind of resource this is. Value: the fixed string
    * &quot;dfareporting#creativeGroupsListResponse&quot;.
    */
  var kind: js.UndefOr[String] = js.native
  /**
    * Pagination token to be used for the next list operation.
    */
  var nextPageToken: js.UndefOr[String] = js.native
}

object Schema$CreativeGroupsListResponse {
  @scala.inline
  def apply(
    creativeGroups: js.Array[Schema$CreativeGroup] = null,
    kind: String = null,
    nextPageToken: String = null
  ): Schema$CreativeGroupsListResponse = {
    val __obj = js.Dynamic.literal()
    if (creativeGroups != null) __obj.updateDynamic("creativeGroups")(creativeGroups.asInstanceOf[js.Any])
    if (kind != null) __obj.updateDynamic("kind")(kind.asInstanceOf[js.Any])
    if (nextPageToken != null) __obj.updateDynamic("nextPageToken")(nextPageToken.asInstanceOf[js.Any])
    __obj.asInstanceOf[Schema$CreativeGroupsListResponse]
  }
}

