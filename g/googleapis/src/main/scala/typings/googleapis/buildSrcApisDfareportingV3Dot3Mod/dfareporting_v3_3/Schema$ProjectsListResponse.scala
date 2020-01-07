package typings.googleapis.buildSrcApisDfareportingV3Dot3Mod.dfareporting_v3_3

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Project List Response
  */
@js.native
trait Schema$ProjectsListResponse extends js.Object {
  /**
    * Identifies what kind of resource this is. Value: the fixed string
    * &quot;dfareporting#projectsListResponse&quot;.
    */
  var kind: js.UndefOr[String] = js.native
  /**
    * Pagination token to be used for the next list operation.
    */
  var nextPageToken: js.UndefOr[String] = js.native
  /**
    * Project collection.
    */
  var projects: js.UndefOr[js.Array[Schema$Project]] = js.native
}

object Schema$ProjectsListResponse {
  @scala.inline
  def apply(kind: String = null, nextPageToken: String = null, projects: js.Array[Schema$Project] = null): Schema$ProjectsListResponse = {
    val __obj = js.Dynamic.literal()
    if (kind != null) __obj.updateDynamic("kind")(kind.asInstanceOf[js.Any])
    if (nextPageToken != null) __obj.updateDynamic("nextPageToken")(nextPageToken.asInstanceOf[js.Any])
    if (projects != null) __obj.updateDynamic("projects")(projects.asInstanceOf[js.Any])
    __obj.asInstanceOf[Schema$ProjectsListResponse]
  }
}

