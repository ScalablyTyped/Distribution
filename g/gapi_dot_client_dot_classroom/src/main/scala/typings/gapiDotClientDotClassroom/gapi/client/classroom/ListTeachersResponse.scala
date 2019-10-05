package typings.gapiDotClientDotClassroom.gapi.client.classroom

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ListTeachersResponse extends js.Object {
  /**
    * Token identifying the next page of results to return. If empty, no further
    * results are available.
    */
  var nextPageToken: js.UndefOr[String] = js.undefined
  /** Teachers who match the list request. */
  var teachers: js.UndefOr[js.Array[Teacher]] = js.undefined
}

object ListTeachersResponse {
  @scala.inline
  def apply(nextPageToken: String = null, teachers: js.Array[Teacher] = null): ListTeachersResponse = {
    val __obj = js.Dynamic.literal()
    if (nextPageToken != null) __obj.updateDynamic("nextPageToken")(nextPageToken)
    if (teachers != null) __obj.updateDynamic("teachers")(teachers)
    __obj.asInstanceOf[ListTeachersResponse]
  }
}

