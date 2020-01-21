package typings.googleapis.cloudsearchV1Mod.cloudsearchV1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * List sources response.
  */
@js.native
trait SchemaListQuerySourcesResponse extends js.Object {
  var nextPageToken: js.UndefOr[String] = js.native
  var sources: js.UndefOr[js.Array[SchemaQuerySource]] = js.native
}

object SchemaListQuerySourcesResponse {
  @scala.inline
  def apply(nextPageToken: String = null, sources: js.Array[SchemaQuerySource] = null): SchemaListQuerySourcesResponse = {
    val __obj = js.Dynamic.literal()
    if (nextPageToken != null) __obj.updateDynamic("nextPageToken")(nextPageToken.asInstanceOf[js.Any])
    if (sources != null) __obj.updateDynamic("sources")(sources.asInstanceOf[js.Any])
    __obj.asInstanceOf[SchemaListQuerySourcesResponse]
  }
}

