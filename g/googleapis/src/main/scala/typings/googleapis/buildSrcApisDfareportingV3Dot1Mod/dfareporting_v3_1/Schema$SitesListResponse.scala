package typings.googleapis.buildSrcApisDfareportingV3Dot1Mod.dfareporting_v3_1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Site List Response
  */
@js.native
trait Schema$SitesListResponse extends js.Object {
  /**
    * Identifies what kind of resource this is. Value: the fixed string
    * &quot;dfareporting#sitesListResponse&quot;.
    */
  var kind: js.UndefOr[String] = js.native
  /**
    * Pagination token to be used for the next list operation.
    */
  var nextPageToken: js.UndefOr[String] = js.native
  /**
    * Site collection.
    */
  var sites: js.UndefOr[js.Array[Schema$Site]] = js.native
}

object Schema$SitesListResponse {
  @scala.inline
  def apply(kind: String = null, nextPageToken: String = null, sites: js.Array[Schema$Site] = null): Schema$SitesListResponse = {
    val __obj = js.Dynamic.literal()
    if (kind != null) __obj.updateDynamic("kind")(kind.asInstanceOf[js.Any])
    if (nextPageToken != null) __obj.updateDynamic("nextPageToken")(nextPageToken.asInstanceOf[js.Any])
    if (sites != null) __obj.updateDynamic("sites")(sites.asInstanceOf[js.Any])
    __obj.asInstanceOf[Schema$SitesListResponse]
  }
}

