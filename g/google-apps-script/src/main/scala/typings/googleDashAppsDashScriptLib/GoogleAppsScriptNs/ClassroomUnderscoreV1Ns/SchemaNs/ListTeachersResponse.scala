package typings
package googleDashAppsDashScriptLib.GoogleAppsScriptNs.ClassroomUnderscoreV1Ns.SchemaNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ListTeachersResponse extends js.Object {
  var nextPageToken: js.UndefOr[java.lang.String] = js.undefined
  var teachers: js.UndefOr[js.Array[Teacher]] = js.undefined
}

object ListTeachersResponse {
  @scala.inline
  def apply(nextPageToken: java.lang.String = null, teachers: js.Array[Teacher] = null): ListTeachersResponse = {
    val __obj = js.Dynamic.literal()
    if (nextPageToken != null) __obj.updateDynamic("nextPageToken")(nextPageToken)
    if (teachers != null) __obj.updateDynamic("teachers")(teachers)
    __obj.asInstanceOf[ListTeachersResponse]
  }
}

