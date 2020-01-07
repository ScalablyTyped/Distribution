package typings.googleapis.buildSrcApisScriptV1Mod.script_v1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Response with the list of the versions for the specified script project.
  */
@js.native
trait Schema$ListVersionsResponse extends js.Object {
  /**
    * The token use to fetch the next page of records. if not exist in the
    * response, that means no more versions to list.
    */
  var nextPageToken: js.UndefOr[String] = js.native
  /**
    * The list of versions.
    */
  var versions: js.UndefOr[js.Array[Schema$Version]] = js.native
}

object Schema$ListVersionsResponse {
  @scala.inline
  def apply(nextPageToken: String = null, versions: js.Array[Schema$Version] = null): Schema$ListVersionsResponse = {
    val __obj = js.Dynamic.literal()
    if (nextPageToken != null) __obj.updateDynamic("nextPageToken")(nextPageToken.asInstanceOf[js.Any])
    if (versions != null) __obj.updateDynamic("versions")(versions.asInstanceOf[js.Any])
    __obj.asInstanceOf[Schema$ListVersionsResponse]
  }
}

