package typings.googleapis.buildSrcApisDnsV1Mod.dns_v1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Schema$ResourceRecordSetsListResponse extends js.Object {
  var header: js.UndefOr[Schema$ResponseHeader] = js.native
  /**
    * Type of resource.
    */
  var kind: js.UndefOr[String] = js.native
  var nextPageToken: js.UndefOr[String] = js.native
  var rrsets: js.UndefOr[js.Array[Schema$ResourceRecordSet]] = js.native
}

object Schema$ResourceRecordSetsListResponse {
  @scala.inline
  def apply(
    header: Schema$ResponseHeader = null,
    kind: String = null,
    nextPageToken: String = null,
    rrsets: js.Array[Schema$ResourceRecordSet] = null
  ): Schema$ResourceRecordSetsListResponse = {
    val __obj = js.Dynamic.literal()
    if (header != null) __obj.updateDynamic("header")(header.asInstanceOf[js.Any])
    if (kind != null) __obj.updateDynamic("kind")(kind.asInstanceOf[js.Any])
    if (nextPageToken != null) __obj.updateDynamic("nextPageToken")(nextPageToken.asInstanceOf[js.Any])
    if (rrsets != null) __obj.updateDynamic("rrsets")(rrsets.asInstanceOf[js.Any])
    __obj.asInstanceOf[Schema$ResourceRecordSetsListResponse]
  }
}

