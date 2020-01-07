package typings.googleapis.buildSrcApisSecuritycenterV1beta1Mod.securitycenter_v1beta1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Response message for listing sources.
  */
@js.native
trait Schema$ListSourcesResponse extends js.Object {
  /**
    * Token to retrieve the next page of results, or empty if there are no more
    * results.
    */
  var nextPageToken: js.UndefOr[String] = js.native
  /**
    * Sources belonging to the requested parent.
    */
  var sources: js.UndefOr[js.Array[Schema$Source]] = js.native
}

object Schema$ListSourcesResponse {
  @scala.inline
  def apply(nextPageToken: String = null, sources: js.Array[Schema$Source] = null): Schema$ListSourcesResponse = {
    val __obj = js.Dynamic.literal()
    if (nextPageToken != null) __obj.updateDynamic("nextPageToken")(nextPageToken.asInstanceOf[js.Any])
    if (sources != null) __obj.updateDynamic("sources")(sources.asInstanceOf[js.Any])
    __obj.asInstanceOf[Schema$ListSourcesResponse]
  }
}

