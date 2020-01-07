package typings.googleapis.buildSrcApisAdminDirectoryUnderscoreV1Mod.admin_directory_v1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * JSON template for Photo object in Directory API.
  */
@js.native
trait Schema$UserPhoto extends js.Object {
  /**
    * ETag of the resource.
    */
  var etag: js.UndefOr[String] = js.native
  /**
    * Height in pixels of the photo
    */
  var height: js.UndefOr[Double] = js.native
  /**
    * Unique identifier of User (Read-only)
    */
  var id: js.UndefOr[String] = js.native
  /**
    * Kind of resource this is.
    */
  var kind: js.UndefOr[String] = js.native
  /**
    * Mime Type of the photo
    */
  var mimeType: js.UndefOr[String] = js.native
  /**
    * Base64 encoded photo data
    */
  var photoData: js.UndefOr[String] = js.native
  /**
    * Primary email of User (Read-only)
    */
  var primaryEmail: js.UndefOr[String] = js.native
  /**
    * Width in pixels of the photo
    */
  var width: js.UndefOr[Double] = js.native
}

object Schema$UserPhoto {
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
  ): Schema$UserPhoto = {
    val __obj = js.Dynamic.literal()
    if (etag != null) __obj.updateDynamic("etag")(etag.asInstanceOf[js.Any])
    if (height != null) __obj.updateDynamic("height")(height.asInstanceOf[js.Any])
    if (id != null) __obj.updateDynamic("id")(id.asInstanceOf[js.Any])
    if (kind != null) __obj.updateDynamic("kind")(kind.asInstanceOf[js.Any])
    if (mimeType != null) __obj.updateDynamic("mimeType")(mimeType.asInstanceOf[js.Any])
    if (photoData != null) __obj.updateDynamic("photoData")(photoData.asInstanceOf[js.Any])
    if (primaryEmail != null) __obj.updateDynamic("primaryEmail")(primaryEmail.asInstanceOf[js.Any])
    if (width != null) __obj.updateDynamic("width")(width.asInstanceOf[js.Any])
    __obj.asInstanceOf[Schema$UserPhoto]
  }
}

