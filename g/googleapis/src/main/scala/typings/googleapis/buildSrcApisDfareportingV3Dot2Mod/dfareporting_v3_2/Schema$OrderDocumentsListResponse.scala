package typings.googleapis.buildSrcApisDfareportingV3Dot2Mod.dfareporting_v3_2

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Order document List Response
  */
@js.native
trait Schema$OrderDocumentsListResponse extends js.Object {
  /**
    * Identifies what kind of resource this is. Value: the fixed string
    * &quot;dfareporting#orderDocumentsListResponse&quot;.
    */
  var kind: js.UndefOr[String] = js.native
  /**
    * Pagination token to be used for the next list operation.
    */
  var nextPageToken: js.UndefOr[String] = js.native
  /**
    * Order document collection
    */
  var orderDocuments: js.UndefOr[js.Array[Schema$OrderDocument]] = js.native
}

object Schema$OrderDocumentsListResponse {
  @scala.inline
  def apply(
    kind: String = null,
    nextPageToken: String = null,
    orderDocuments: js.Array[Schema$OrderDocument] = null
  ): Schema$OrderDocumentsListResponse = {
    val __obj = js.Dynamic.literal()
    if (kind != null) __obj.updateDynamic("kind")(kind.asInstanceOf[js.Any])
    if (nextPageToken != null) __obj.updateDynamic("nextPageToken")(nextPageToken.asInstanceOf[js.Any])
    if (orderDocuments != null) __obj.updateDynamic("orderDocuments")(orderDocuments.asInstanceOf[js.Any])
    __obj.asInstanceOf[Schema$OrderDocumentsListResponse]
  }
}

