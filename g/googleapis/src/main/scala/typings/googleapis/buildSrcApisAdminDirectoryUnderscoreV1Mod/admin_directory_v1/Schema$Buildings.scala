package typings.googleapis.buildSrcApisAdminDirectoryUnderscoreV1Mod.admin_directory_v1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * JSON template for Building List Response object in Directory API.
  */
@js.native
trait Schema$Buildings extends js.Object {
  /**
    * The Buildings in this page of results.
    */
  var buildings: js.UndefOr[js.Array[Schema$Building]] = js.native
  /**
    * ETag of the resource.
    */
  var etag: js.UndefOr[String] = js.native
  /**
    * Kind of resource this is.
    */
  var kind: js.UndefOr[String] = js.native
  /**
    * The continuation token, used to page through large result sets. Provide
    * this value in a subsequent request to return the next page of results.
    */
  var nextPageToken: js.UndefOr[String] = js.native
}

object Schema$Buildings {
  @scala.inline
  def apply(
    buildings: js.Array[Schema$Building] = null,
    etag: String = null,
    kind: String = null,
    nextPageToken: String = null
  ): Schema$Buildings = {
    val __obj = js.Dynamic.literal()
    if (buildings != null) __obj.updateDynamic("buildings")(buildings.asInstanceOf[js.Any])
    if (etag != null) __obj.updateDynamic("etag")(etag.asInstanceOf[js.Any])
    if (kind != null) __obj.updateDynamic("kind")(kind.asInstanceOf[js.Any])
    if (nextPageToken != null) __obj.updateDynamic("nextPageToken")(nextPageToken.asInstanceOf[js.Any])
    __obj.asInstanceOf[Schema$Buildings]
  }
}

