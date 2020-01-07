package typings.googleapis.buildSrcApisCloudsearchV1Mod.cloudsearch_v1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * List sources response.
  */
@js.native
trait Schema$ListQuerySourcesResponse extends js.Object {
  var nextPageToken: js.UndefOr[String] = js.native
  var sources: js.UndefOr[js.Array[Schema$QuerySource]] = js.native
}

object Schema$ListQuerySourcesResponse {
  @scala.inline
  def apply(nextPageToken: String = null, sources: js.Array[Schema$QuerySource] = null): Schema$ListQuerySourcesResponse = {
    val __obj = js.Dynamic.literal()
    if (nextPageToken != null) __obj.updateDynamic("nextPageToken")(nextPageToken.asInstanceOf[js.Any])
    if (sources != null) __obj.updateDynamic("sources")(sources.asInstanceOf[js.Any])
    __obj.asInstanceOf[Schema$ListQuerySourcesResponse]
  }
}

