package typings.googleapis.buildSrcApisClassroomV1Mod.classroom_v1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Response when listing guardians.
  */
@js.native
trait Schema$ListGuardiansResponse extends js.Object {
  /**
    * Guardians on this page of results that met the criteria specified in the
    * request.
    */
  var guardians: js.UndefOr[js.Array[Schema$Guardian]] = js.native
  /**
    * Token identifying the next page of results to return. If empty, no
    * further results are available.
    */
  var nextPageToken: js.UndefOr[String] = js.native
}

object Schema$ListGuardiansResponse {
  @scala.inline
  def apply(guardians: js.Array[Schema$Guardian] = null, nextPageToken: String = null): Schema$ListGuardiansResponse = {
    val __obj = js.Dynamic.literal()
    if (guardians != null) __obj.updateDynamic("guardians")(guardians.asInstanceOf[js.Any])
    if (nextPageToken != null) __obj.updateDynamic("nextPageToken")(nextPageToken.asInstanceOf[js.Any])
    __obj.asInstanceOf[Schema$ListGuardiansResponse]
  }
}

