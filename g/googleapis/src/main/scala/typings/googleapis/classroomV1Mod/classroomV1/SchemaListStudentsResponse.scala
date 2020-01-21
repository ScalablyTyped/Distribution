package typings.googleapis.classroomV1Mod.classroomV1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Response when listing students.
  */
@js.native
trait SchemaListStudentsResponse extends js.Object {
  /**
    * Token identifying the next page of results to return. If empty, no
    * further results are available.
    */
  var nextPageToken: js.UndefOr[String] = js.native
  /**
    * Students who match the list request.
    */
  var students: js.UndefOr[js.Array[SchemaStudent]] = js.native
}

object SchemaListStudentsResponse {
  @scala.inline
  def apply(nextPageToken: String = null, students: js.Array[SchemaStudent] = null): SchemaListStudentsResponse = {
    val __obj = js.Dynamic.literal()
    if (nextPageToken != null) __obj.updateDynamic("nextPageToken")(nextPageToken.asInstanceOf[js.Any])
    if (students != null) __obj.updateDynamic("students")(students.asInstanceOf[js.Any])
    __obj.asInstanceOf[SchemaListStudentsResponse]
  }
}

