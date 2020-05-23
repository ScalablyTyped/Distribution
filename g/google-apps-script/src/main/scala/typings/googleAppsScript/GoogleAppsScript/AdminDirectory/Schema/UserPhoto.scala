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
    height: js.UndefOr[Double] = js.undefined,
    id: String = null,
    kind: String = null,
    mimeType: String = null,
    photoData: String = null,
    primaryEmail: String = null,
    width: js.UndefOr[Double] = js.undefined
  ): UserPhoto = {
    val __obj = js.Dynamic.literal()
    if (etag != null) __obj.updateDynamic("etag")(etag.asInstanceOf[js.Any])
    if (!js.isUndefined(height)) __obj.updateDynamic("height")(height.get.asInstanceOf[js.Any])
    if (id != null) __obj.updateDynamic("id")(id.asInstanceOf[js.Any])
    if (kind != null) __obj.updateDynamic("kind")(kind.asInstanceOf[js.Any])
    if (mimeType != null) __obj.updateDynamic("mimeType")(mimeType.asInstanceOf[js.Any])
    if (photoData != null) __obj.updateDynamic("photoData")(photoData.asInstanceOf[js.Any])
    if (primaryEmail != null) __obj.updateDynamic("primaryEmail")(primaryEmail.asInstanceOf[js.Any])
    if (!js.isUndefined(width)) __obj.updateDynamic("width")(width.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[UserPhoto]
  }
}

