package typings.googleAppsScript.GoogleAppsScript.AdminDirectory.Schema

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait UserPhoto extends js.Object {
  var etag: js.UndefOr[String] = js.undefined
  var height: js.UndefOr[Double] = js.undefined
  var id: js.UndefOr[String] = js.undefined
  var kind: js.UndefOr[String] = js.undefined
  var mimeType: js.UndefOr[String] = js.undefined
  var photoData: js.UndefOr[String] = js.undefined
  var primaryEmail: js.UndefOr[String] = js.undefined
  var width: js.UndefOr[Double] = js.undefined
}

object UserPhoto {
  @scala.inline
  def apply(
    etag: String = null,
    height: Int | Double = null,
    id: String = null,
    kind: String = null,
    mimeType: String = null,
    photoData: String = null,
    primaryEmail: String = null,
    width: Int | Double = null
  ): UserPhoto = {
    val __obj = js.Dynamic.literal()
    if (etag != null) __obj.updateDynamic("etag")(etag.asInstanceOf[js.Any])
    if (height != null) __obj.updateDynamic("height")(height.asInstanceOf[js.Any])
    if (id != null) __obj.updateDynamic("id")(id.asInstanceOf[js.Any])
    if (kind != null) __obj.updateDynamic("kind")(kind.asInstanceOf[js.Any])
    if (mimeType != null) __obj.updateDynamic("mimeType")(mimeType.asInstanceOf[js.Any])
    if (photoData != null) __obj.updateDynamic("photoData")(photoData.asInstanceOf[js.Any])
    if (primaryEmail != null) __obj.updateDynamic("primaryEmail")(primaryEmail.asInstanceOf[js.Any])
    if (width != null) __obj.updateDynamic("width")(width.asInstanceOf[js.Any])
    __obj.asInstanceOf[UserPhoto]
  }
}

