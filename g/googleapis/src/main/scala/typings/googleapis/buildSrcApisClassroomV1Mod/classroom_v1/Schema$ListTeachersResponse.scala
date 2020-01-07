package typings.googleapis.buildSrcApisClassroomV1Mod.classroom_v1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Response when listing teachers.
  */
@js.native
trait Schema$ListTeachersResponse extends js.Object {
  /**
    * Token identifying the next page of results to return. If empty, no
    * further results are available.
    */
  var nextPageToken: js.UndefOr[String] = js.native
  /**
    * Teachers who match the list request.
    */
  var teachers: js.UndefOr[js.Array[Schema$Teacher]] = js.native
}

object Schema$ListTeachersResponse {
  @scala.inline
  def apply(nextPageToken: String = null, teachers: js.Array[Schema$Teacher] = null): Schema$ListTeachersResponse = {
    val __obj = js.Dynamic.literal()
    if (nextPageToken != null) __obj.updateDynamic("nextPageToken")(nextPageToken.asInstanceOf[js.Any])
    if (teachers != null) __obj.updateDynamic("teachers")(teachers.asInstanceOf[js.Any])
    __obj.asInstanceOf[Schema$ListTeachersResponse]
  }
}

