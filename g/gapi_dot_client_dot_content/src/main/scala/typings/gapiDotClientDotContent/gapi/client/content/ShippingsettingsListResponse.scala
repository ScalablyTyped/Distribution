package typings.gapiDotClientDotContent.gapi.client.content

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ShippingsettingsListResponse extends js.Object {
  /** Identifies what kind of resource this is. Value: the fixed string "content#shippingsettingsListResponse". */
  var kind: js.UndefOr[String] = js.undefined
  /** The token for the retrieval of the next page of shipping settings. */
  var nextPageToken: js.UndefOr[String] = js.undefined
  var resources: js.UndefOr[js.Array[ShippingSettings]] = js.undefined
}

object ShippingsettingsListResponse {
  @scala.inline
  def apply(kind: String = null, nextPageToken: String = null, resources: js.Array[ShippingSettings] = null): ShippingsettingsListResponse = {
    val __obj = js.Dynamic.literal()
    if (kind != null) __obj.updateDynamic("kind")(kind)
    if (nextPageToken != null) __obj.updateDynamic("nextPageToken")(nextPageToken)
    if (resources != null) __obj.updateDynamic("resources")(resources)
    __obj.asInstanceOf[ShippingsettingsListResponse]
  }
}

