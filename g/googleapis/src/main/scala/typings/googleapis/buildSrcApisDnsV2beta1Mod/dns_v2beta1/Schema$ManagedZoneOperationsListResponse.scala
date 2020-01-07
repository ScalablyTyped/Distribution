package typings.googleapis.buildSrcApisDnsV2beta1Mod.dns_v2beta1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Schema$ManagedZoneOperationsListResponse extends js.Object {
  var header: js.UndefOr[Schema$ResponseHeader] = js.native
  /**
    * Type of resource.
    */
  var kind: js.UndefOr[String] = js.native
  var nextPageToken: js.UndefOr[String] = js.native
  var operations: js.UndefOr[js.Array[Schema$Operation]] = js.native
}

object Schema$ManagedZoneOperationsListResponse {
  @scala.inline
  def apply(
    header: Schema$ResponseHeader = null,
    kind: String = null,
    nextPageToken: String = null,
    operations: js.Array[Schema$Operation] = null
  ): Schema$ManagedZoneOperationsListResponse = {
    val __obj = js.Dynamic.literal()
    if (header != null) __obj.updateDynamic("header")(header.asInstanceOf[js.Any])
    if (kind != null) __obj.updateDynamic("kind")(kind.asInstanceOf[js.Any])
    if (nextPageToken != null) __obj.updateDynamic("nextPageToken")(nextPageToken.asInstanceOf[js.Any])
    if (operations != null) __obj.updateDynamic("operations")(operations.asInstanceOf[js.Any])
    __obj.asInstanceOf[Schema$ManagedZoneOperationsListResponse]
  }
}

