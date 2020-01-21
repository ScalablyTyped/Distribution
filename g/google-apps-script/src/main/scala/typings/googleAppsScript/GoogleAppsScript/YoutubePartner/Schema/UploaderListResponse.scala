package typings.googleAppsScript.GoogleAppsScript.YoutubePartner.Schema

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait UploaderListResponse extends js.Object {
  var items: js.UndefOr[js.Array[Uploader]] = js.undefined
  var kind: js.UndefOr[String] = js.undefined
}

object UploaderListResponse {
  @scala.inline
  def apply(items: js.Array[Uploader] = null, kind: String = null): UploaderListResponse = {
    val __obj = js.Dynamic.literal()
    if (items != null) __obj.updateDynamic("items")(items.asInstanceOf[js.Any])
    if (kind != null) __obj.updateDynamic("kind")(kind.asInstanceOf[js.Any])
    __obj.asInstanceOf[UploaderListResponse]
  }
}

