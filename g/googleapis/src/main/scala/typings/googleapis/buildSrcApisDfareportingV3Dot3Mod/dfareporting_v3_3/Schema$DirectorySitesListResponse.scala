package typings.googleapis.buildSrcApisDfareportingV3Dot3Mod.dfareporting_v3_3

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Directory Site List Response
  */
@js.native
trait Schema$DirectorySitesListResponse extends js.Object {
  /**
    * Directory site collection.
    */
  var directorySites: js.UndefOr[js.Array[Schema$DirectorySite]] = js.native
  /**
    * Identifies what kind of resource this is. Value: the fixed string
    * &quot;dfareporting#directorySitesListResponse&quot;.
    */
  var kind: js.UndefOr[String] = js.native
  /**
    * Pagination token to be used for the next list operation.
    */
  var nextPageToken: js.UndefOr[String] = js.native
}

object Schema$DirectorySitesListResponse {
  @scala.inline
  def apply(
    directorySites: js.Array[Schema$DirectorySite] = null,
    kind: String = null,
    nextPageToken: String = null
  ): Schema$DirectorySitesListResponse = {
    val __obj = js.Dynamic.literal()
    if (directorySites != null) __obj.updateDynamic("directorySites")(directorySites.asInstanceOf[js.Any])
    if (kind != null) __obj.updateDynamic("kind")(kind.asInstanceOf[js.Any])
    if (nextPageToken != null) __obj.updateDynamic("nextPageToken")(nextPageToken.asInstanceOf[js.Any])
    __obj.asInstanceOf[Schema$DirectorySitesListResponse]
  }
}

