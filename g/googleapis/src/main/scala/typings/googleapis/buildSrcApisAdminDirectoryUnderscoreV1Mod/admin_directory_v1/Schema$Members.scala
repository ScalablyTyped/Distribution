package typings.googleapis.buildSrcApisAdminDirectoryUnderscoreV1Mod.admin_directory_v1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * JSON response template for List Members operation in Directory API.
  */
@js.native
trait Schema$Members extends js.Object {
  /**
    * ETag of the resource.
    */
  var etag: js.UndefOr[String] = js.native
  /**
    * Kind of resource this is.
    */
  var kind: js.UndefOr[String] = js.native
  /**
    * List of member objects.
    */
  var members: js.UndefOr[js.Array[Schema$Member]] = js.native
  /**
    * Token used to access next page of this result.
    */
  var nextPageToken: js.UndefOr[String] = js.native
}

object Schema$Members {
  @scala.inline
  def apply(
    etag: String = null,
    kind: String = null,
    members: js.Array[Schema$Member] = null,
    nextPageToken: String = null
  ): Schema$Members = {
    val __obj = js.Dynamic.literal()
    if (etag != null) __obj.updateDynamic("etag")(etag.asInstanceOf[js.Any])
    if (kind != null) __obj.updateDynamic("kind")(kind.asInstanceOf[js.Any])
    if (members != null) __obj.updateDynamic("members")(members.asInstanceOf[js.Any])
    if (nextPageToken != null) __obj.updateDynamic("nextPageToken")(nextPageToken.asInstanceOf[js.Any])
    __obj.asInstanceOf[Schema$Members]
  }
}

