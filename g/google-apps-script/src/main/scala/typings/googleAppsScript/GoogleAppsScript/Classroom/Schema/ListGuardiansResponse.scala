package typings.googleAppsScript.GoogleAppsScript.Classroom.Schema

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ListGuardiansResponse extends js.Object {
  var guardians: js.UndefOr[js.Array[Guardian]] = js.undefined
  var nextPageToken: js.UndefOr[String] = js.undefined
}

object ListGuardiansResponse {
  @scala.inline
  def apply(guardians: js.Array[Guardian] = null, nextPageToken: String = null): ListGuardiansResponse = {
    val __obj = js.Dynamic.literal()
    if (guardians != null) __obj.updateDynamic("guardians")(guardians.asInstanceOf[js.Any])
    if (nextPageToken != null) __obj.updateDynamic("nextPageToken")(nextPageToken.asInstanceOf[js.Any])
    __obj.asInstanceOf[ListGuardiansResponse]
  }
}

