package typings.googleapis.buildSrcApisComposerV1beta1Mod.composer_v1beta1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * The ImageVersions in a project and location.
  */
@js.native
trait Schema$ListImageVersionsResponse extends js.Object {
  /**
    * The list of supported ImageVersions in a location.
    */
  var imageVersions: js.UndefOr[js.Array[Schema$ImageVersion]] = js.native
  /**
    * The page token used to query for the next page if one exists.
    */
  var nextPageToken: js.UndefOr[String] = js.native
}

object Schema$ListImageVersionsResponse {
  @scala.inline
  def apply(imageVersions: js.Array[Schema$ImageVersion] = null, nextPageToken: String = null): Schema$ListImageVersionsResponse = {
    val __obj = js.Dynamic.literal()
    if (imageVersions != null) __obj.updateDynamic("imageVersions")(imageVersions.asInstanceOf[js.Any])
    if (nextPageToken != null) __obj.updateDynamic("nextPageToken")(nextPageToken.asInstanceOf[js.Any])
    __obj.asInstanceOf[Schema$ListImageVersionsResponse]
  }
}

