package typings.googleapis.buildSrcApisDfareportingV3Dot1Mod.dfareporting_v3_1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Creative Field List Response
  */
@js.native
trait Schema$CreativeFieldsListResponse extends js.Object {
  /**
    * Creative field collection.
    */
  var creativeFields: js.UndefOr[js.Array[Schema$CreativeField]] = js.native
  /**
    * Identifies what kind of resource this is. Value: the fixed string
    * &quot;dfareporting#creativeFieldsListResponse&quot;.
    */
  var kind: js.UndefOr[String] = js.native
  /**
    * Pagination token to be used for the next list operation.
    */
  var nextPageToken: js.UndefOr[String] = js.native
}

object Schema$CreativeFieldsListResponse {
  @scala.inline
  def apply(
    creativeFields: js.Array[Schema$CreativeField] = null,
    kind: String = null,
    nextPageToken: String = null
  ): Schema$CreativeFieldsListResponse = {
    val __obj = js.Dynamic.literal()
    if (creativeFields != null) __obj.updateDynamic("creativeFields")(creativeFields.asInstanceOf[js.Any])
    if (kind != null) __obj.updateDynamic("kind")(kind.asInstanceOf[js.Any])
    if (nextPageToken != null) __obj.updateDynamic("nextPageToken")(nextPageToken.asInstanceOf[js.Any])
    __obj.asInstanceOf[Schema$CreativeFieldsListResponse]
  }
}

