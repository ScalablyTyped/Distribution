package typings.googleapis.classroomV1Mod.classroomV1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Response when listing course aliases.
  */
@js.native
trait SchemaListCourseAliasesResponse extends js.Object {
  /**
    * The course aliases.
    */
  var aliases: js.UndefOr[js.Array[SchemaCourseAlias]] = js.native
  /**
    * Token identifying the next page of results to return. If empty, no
    * further results are available.
    */
  var nextPageToken: js.UndefOr[String] = js.native
}

object SchemaListCourseAliasesResponse {
  @scala.inline
  def apply(aliases: js.Array[SchemaCourseAlias] = null, nextPageToken: String = null): SchemaListCourseAliasesResponse = {
    val __obj = js.Dynamic.literal()
    if (aliases != null) __obj.updateDynamic("aliases")(aliases.asInstanceOf[js.Any])
    if (nextPageToken != null) __obj.updateDynamic("nextPageToken")(nextPageToken.asInstanceOf[js.Any])
    __obj.asInstanceOf[SchemaListCourseAliasesResponse]
  }
}

