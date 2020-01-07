package typings.googleapis.buildSrcApisDfareportingV3Dot3Mod.dfareporting_v3_3

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Creative Field Value List Response
  */
@js.native
trait Schema$CreativeFieldValuesListResponse extends js.Object {
  /**
    * Creative field value collection.
    */
  var creativeFieldValues: js.UndefOr[js.Array[Schema$CreativeFieldValue]] = js.native
  /**
    * Identifies what kind of resource this is. Value: the fixed string
    * &quot;dfareporting#creativeFieldValuesListResponse&quot;.
    */
  var kind: js.UndefOr[String] = js.native
  /**
    * Pagination token to be used for the next list operation.
    */
  var nextPageToken: js.UndefOr[String] = js.native
}

object Schema$CreativeFieldValuesListResponse {
  @scala.inline
  def apply(
    creativeFieldValues: js.Array[Schema$CreativeFieldValue] = null,
    kind: String = null,
    nextPageToken: String = null
  ): Schema$CreativeFieldValuesListResponse = {
    val __obj = js.Dynamic.literal()
    if (creativeFieldValues != null) __obj.updateDynamic("creativeFieldValues")(creativeFieldValues.asInstanceOf[js.Any])
    if (kind != null) __obj.updateDynamic("kind")(kind.asInstanceOf[js.Any])
    if (nextPageToken != null) __obj.updateDynamic("nextPageToken")(nextPageToken.asInstanceOf[js.Any])
    __obj.asInstanceOf[Schema$CreativeFieldValuesListResponse]
  }
}

