package typings.googleapis.classroomV1Mod.classroomV1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Response when listing teachers.
  */
@js.native
trait SchemaListTeachersResponse extends js.Object {
  /**
    * Token identifying the next page of results to return. If empty, no
    * further results are available.
    */
  var nextPageToken: js.UndefOr[String] = js.native
  /**
    * Teachers who match the list request.
    */
  var teachers: js.UndefOr[js.Array[SchemaTeacher]] = js.native
}

object SchemaListTeachersResponse {
  @scala.inline
  def apply(nextPageToken: String = null, teachers: js.Array[SchemaTeacher] = null): SchemaListTeachersResponse = {
    val __obj = js.Dynamic.literal()
    if (nextPageToken != null) __obj.updateDynamic("nextPageToken")(nextPageToken.asInstanceOf[js.Any])
    if (teachers != null) __obj.updateDynamic("teachers")(teachers.asInstanceOf[js.Any])
    __obj.asInstanceOf[SchemaListTeachersResponse]
  }
}

