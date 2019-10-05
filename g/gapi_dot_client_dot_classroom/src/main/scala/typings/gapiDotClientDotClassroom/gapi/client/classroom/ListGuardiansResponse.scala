package typings.gapiDotClientDotClassroom.gapi.client.classroom

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ListGuardiansResponse extends js.Object {
  /**
    * Guardians on this page of results that met the criteria specified in
    * the request.
    */
  var guardians: js.UndefOr[js.Array[Guardian]] = js.undefined
  /**
    * Token identifying the next page of results to return. If empty, no further
    * results are available.
    */
  var nextPageToken: js.UndefOr[String] = js.undefined
}

object ListGuardiansResponse {
  @scala.inline
  def apply(guardians: js.Array[Guardian] = null, nextPageToken: String = null): ListGuardiansResponse = {
    val __obj = js.Dynamic.literal()
    if (guardians != null) __obj.updateDynamic("guardians")(guardians)
    if (nextPageToken != null) __obj.updateDynamic("nextPageToken")(nextPageToken)
    __obj.asInstanceOf[ListGuardiansResponse]
  }
}

