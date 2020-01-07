package typings.googleapis.buildSrcApisAdminDirectoryUnderscoreV1Mod.admin_directory_v1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * JSON response template for List Groups operation in Directory API.
  */
@js.native
trait Schema$Groups extends js.Object {
  /**
    * ETag of the resource.
    */
  var etag: js.UndefOr[String] = js.native
  /**
    * List of group objects.
    */
  var groups: js.UndefOr[js.Array[Schema$Group]] = js.native
  /**
    * Kind of resource this is.
    */
  var kind: js.UndefOr[String] = js.native
  /**
    * Token used to access next page of this result.
    */
  var nextPageToken: js.UndefOr[String] = js.native
}

object Schema$Groups {
  @scala.inline
  def apply(
    etag: String = null,
    groups: js.Array[Schema$Group] = null,
    kind: String = null,
    nextPageToken: String = null
  ): Schema$Groups = {
    val __obj = js.Dynamic.literal()
    if (etag != null) __obj.updateDynamic("etag")(etag.asInstanceOf[js.Any])
    if (groups != null) __obj.updateDynamic("groups")(groups.asInstanceOf[js.Any])
    if (kind != null) __obj.updateDynamic("kind")(kind.asInstanceOf[js.Any])
    if (nextPageToken != null) __obj.updateDynamic("nextPageToken")(nextPageToken.asInstanceOf[js.Any])
    __obj.asInstanceOf[Schema$Groups]
  }
}

