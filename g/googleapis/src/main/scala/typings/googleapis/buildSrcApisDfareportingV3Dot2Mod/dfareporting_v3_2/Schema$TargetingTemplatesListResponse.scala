package typings.googleapis.buildSrcApisDfareportingV3Dot2Mod.dfareporting_v3_2

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Targeting Template List Response
  */
@js.native
trait Schema$TargetingTemplatesListResponse extends js.Object {
  /**
    * Identifies what kind of resource this is. Value: the fixed string
    * &quot;dfareporting#targetingTemplatesListResponse&quot;.
    */
  var kind: js.UndefOr[String] = js.native
  /**
    * Pagination token to be used for the next list operation.
    */
  var nextPageToken: js.UndefOr[String] = js.native
  /**
    * Targeting template collection.
    */
  var targetingTemplates: js.UndefOr[js.Array[Schema$TargetingTemplate]] = js.native
}

object Schema$TargetingTemplatesListResponse {
  @scala.inline
  def apply(
    kind: String = null,
    nextPageToken: String = null,
    targetingTemplates: js.Array[Schema$TargetingTemplate] = null
  ): Schema$TargetingTemplatesListResponse = {
    val __obj = js.Dynamic.literal()
    if (kind != null) __obj.updateDynamic("kind")(kind.asInstanceOf[js.Any])
    if (nextPageToken != null) __obj.updateDynamic("nextPageToken")(nextPageToken.asInstanceOf[js.Any])
    if (targetingTemplates != null) __obj.updateDynamic("targetingTemplates")(targetingTemplates.asInstanceOf[js.Any])
    __obj.asInstanceOf[Schema$TargetingTemplatesListResponse]
  }
}

