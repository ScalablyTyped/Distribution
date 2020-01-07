package typings.googleapis.buildSrcApisDnsV1beta2Mod.dns_v1beta2

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Schema$ChangesListResponse extends js.Object {
  var changes: js.UndefOr[js.Array[Schema$Change]] = js.native
  var header: js.UndefOr[Schema$ResponseHeader] = js.native
  /**
    * Type of resource.
    */
  var kind: js.UndefOr[String] = js.native
  var nextPageToken: js.UndefOr[String] = js.native
}

object Schema$ChangesListResponse {
  @scala.inline
  def apply(
    changes: js.Array[Schema$Change] = null,
    header: Schema$ResponseHeader = null,
    kind: String = null,
    nextPageToken: String = null
  ): Schema$ChangesListResponse = {
    val __obj = js.Dynamic.literal()
    if (changes != null) __obj.updateDynamic("changes")(changes.asInstanceOf[js.Any])
    if (header != null) __obj.updateDynamic("header")(header.asInstanceOf[js.Any])
    if (kind != null) __obj.updateDynamic("kind")(kind.asInstanceOf[js.Any])
    if (nextPageToken != null) __obj.updateDynamic("nextPageToken")(nextPageToken.asInstanceOf[js.Any])
    __obj.asInstanceOf[Schema$ChangesListResponse]
  }
}

