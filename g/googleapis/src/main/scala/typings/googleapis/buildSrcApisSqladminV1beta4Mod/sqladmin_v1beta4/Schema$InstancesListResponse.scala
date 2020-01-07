package typings.googleapis.buildSrcApisSqladminV1beta4Mod.sqladmin_v1beta4

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Database instances list response.
  */
@js.native
trait Schema$InstancesListResponse extends js.Object {
  /**
    * List of database instance resources.
    */
  var items: js.UndefOr[js.Array[Schema$DatabaseInstance]] = js.native
  /**
    * This is always sql#instancesList.
    */
  var kind: js.UndefOr[String] = js.native
  /**
    * The continuation token, used to page through large result sets. Provide
    * this value in a subsequent request to return the next page of results.
    */
  var nextPageToken: js.UndefOr[String] = js.native
  /**
    * List of warnings that ocurred while handling the request.
    */
  var warnings: js.UndefOr[js.Array[Schema$ApiWarning]] = js.native
}

object Schema$InstancesListResponse {
  @scala.inline
  def apply(
    items: js.Array[Schema$DatabaseInstance] = null,
    kind: String = null,
    nextPageToken: String = null,
    warnings: js.Array[Schema$ApiWarning] = null
  ): Schema$InstancesListResponse = {
    val __obj = js.Dynamic.literal()
    if (items != null) __obj.updateDynamic("items")(items.asInstanceOf[js.Any])
    if (kind != null) __obj.updateDynamic("kind")(kind.asInstanceOf[js.Any])
    if (nextPageToken != null) __obj.updateDynamic("nextPageToken")(nextPageToken.asInstanceOf[js.Any])
    if (warnings != null) __obj.updateDynamic("warnings")(warnings.asInstanceOf[js.Any])
    __obj.asInstanceOf[Schema$InstancesListResponse]
  }
}

