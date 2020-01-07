package typings.googleapis.buildSrcApisClassroomV1Mod.classroom_v1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Response when listing students.
  */
@js.native
trait Schema$ListStudentsResponse extends js.Object {
  /**
    * Token identifying the next page of results to return. If empty, no
    * further results are available.
    */
  var nextPageToken: js.UndefOr[String] = js.native
  /**
    * Students who match the list request.
    */
  var students: js.UndefOr[js.Array[Schema$Student]] = js.native
}

object Schema$ListStudentsResponse {
  @scala.inline
  def apply(nextPageToken: String = null, students: js.Array[Schema$Student] = null): Schema$ListStudentsResponse = {
    val __obj = js.Dynamic.literal()
    if (nextPageToken != null) __obj.updateDynamic("nextPageToken")(nextPageToken.asInstanceOf[js.Any])
    if (students != null) __obj.updateDynamic("students")(students.asInstanceOf[js.Any])
    __obj.asInstanceOf[Schema$ListStudentsResponse]
  }
}

