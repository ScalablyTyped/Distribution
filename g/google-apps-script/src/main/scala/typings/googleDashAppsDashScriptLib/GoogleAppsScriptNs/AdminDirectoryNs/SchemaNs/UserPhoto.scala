package typings
package googleDashAppsDashScriptLib.GoogleAppsScriptNs.AdminDirectoryNs.SchemaNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait UserPhoto extends js.Object {
  var etag: js.UndefOr[java.lang.String] = js.undefined
  var height: js.UndefOr[scala.Double] = js.undefined
  var id: js.UndefOr[java.lang.String] = js.undefined
  var kind: js.UndefOr[java.lang.String] = js.undefined
  var mimeType: js.UndefOr[java.lang.String] = js.undefined
  var photoData: js.UndefOr[java.lang.String] = js.undefined
  var primaryEmail: js.UndefOr[java.lang.String] = js.undefined
  var width: js.UndefOr[scala.Double] = js.undefined
}

object UserPhoto {
  @scala.inline
  def apply(
    etag: java.lang.String = null,
    height: scala.Int | scala.Double = null,
    id: java.lang.String = null,
    kind: java.lang.String = null,
    mimeType: java.lang.String = null,
    photoData: java.lang.String = null,
    primaryEmail: java.lang.String = null,
    width: scala.Int | scala.Double = null
  ): UserPhoto = {
    val __obj = js.Dynamic.literal()
    if (etag != null) __obj.updateDynamic("etag")(etag)
    if (height != null) __obj.updateDynamic("height")(height.asInstanceOf[js.Any])
    if (id != null) __obj.updateDynamic("id")(id)
    if (kind != null) __obj.updateDynamic("kind")(kind)
    if (mimeType != null) __obj.updateDynamic("mimeType")(mimeType)
    if (photoData != null) __obj.updateDynamic("photoData")(photoData)
    if (primaryEmail != null) __obj.updateDynamic("primaryEmail")(primaryEmail)
    if (width != null) __obj.updateDynamic("width")(width.asInstanceOf[js.Any])
    __obj.asInstanceOf[UserPhoto]
  }
}

