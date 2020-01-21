package typings.googleAppsScript.GoogleAppsScript.YoutubePartner.Schema

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ContentOwnerListResponse extends js.Object {
  var items: js.UndefOr[js.Array[ContentOwner]] = js.undefined
  var kind: js.UndefOr[String] = js.undefined
}

object ContentOwnerListResponse {
  @scala.inline
  def apply(items: js.Array[ContentOwner] = null, kind: String = null): ContentOwnerListResponse = {
    val __obj = js.Dynamic.literal()
    if (items != null) __obj.updateDynamic("items")(items.asInstanceOf[js.Any])
    if (kind != null) __obj.updateDynamic("kind")(kind.asInstanceOf[js.Any])
    __obj.asInstanceOf[ContentOwnerListResponse]
  }
}

