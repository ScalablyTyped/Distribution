package typings.googleapis.buildSrcApisDnsV1beta2Mod.dns_v1beta2

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Schema$PoliciesListResponse extends js.Object {
  var header: js.UndefOr[Schema$ResponseHeader] = js.native
  /**
    * Type of resource.
    */
  var kind: js.UndefOr[String] = js.native
  var nextPageToken: js.UndefOr[String] = js.native
  var policies: js.UndefOr[js.Array[Schema$Policy]] = js.native
}

object Schema$PoliciesListResponse {
  @scala.inline
  def apply(
    header: Schema$ResponseHeader = null,
    kind: String = null,
    nextPageToken: String = null,
    policies: js.Array[Schema$Policy] = null
  ): Schema$PoliciesListResponse = {
    val __obj = js.Dynamic.literal()
    if (header != null) __obj.updateDynamic("header")(header.asInstanceOf[js.Any])
    if (kind != null) __obj.updateDynamic("kind")(kind.asInstanceOf[js.Any])
    if (nextPageToken != null) __obj.updateDynamic("nextPageToken")(nextPageToken.asInstanceOf[js.Any])
    if (policies != null) __obj.updateDynamic("policies")(policies.asInstanceOf[js.Any])
    __obj.asInstanceOf[Schema$PoliciesListResponse]
  }
}

