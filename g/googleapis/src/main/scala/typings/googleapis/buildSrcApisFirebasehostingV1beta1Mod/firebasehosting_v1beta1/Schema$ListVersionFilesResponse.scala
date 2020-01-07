package typings.googleapis.buildSrcApisFirebasehostingV1beta1Mod.firebasehosting_v1beta1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Schema$ListVersionFilesResponse extends js.Object {
  /**
    * The list path/hashes in the specified version.
    */
  var files: js.UndefOr[js.Array[Schema$VersionFile]] = js.native
  /**
    * The pagination token, if more results exist.
    */
  var nextPageToken: js.UndefOr[String] = js.native
}

object Schema$ListVersionFilesResponse {
  @scala.inline
  def apply(files: js.Array[Schema$VersionFile] = null, nextPageToken: String = null): Schema$ListVersionFilesResponse = {
    val __obj = js.Dynamic.literal()
    if (files != null) __obj.updateDynamic("files")(files.asInstanceOf[js.Any])
    if (nextPageToken != null) __obj.updateDynamic("nextPageToken")(nextPageToken.asInstanceOf[js.Any])
    __obj.asInstanceOf[Schema$ListVersionFilesResponse]
  }
}

