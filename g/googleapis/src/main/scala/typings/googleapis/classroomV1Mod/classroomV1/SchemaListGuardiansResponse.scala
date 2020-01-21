package typings.googleapis.classroomV1Mod.classroomV1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Response when listing guardians.
  */
@js.native
trait SchemaListGuardiansResponse extends js.Object {
  /**
    * Guardians on this page of results that met the criteria specified in the
    * request.
    */
  var guardians: js.UndefOr[js.Array[SchemaGuardian]] = js.native
  /**
    * Token identifying the next page of results to return. If empty, no
    * further results are available.
    */
  var nextPageToken: js.UndefOr[String] = js.native
}

object SchemaListGuardiansResponse {
  @scala.inline
  def apply(guardians: js.Array[SchemaGuardian] = null, nextPageToken: String = null): SchemaListGuardiansResponse = {
    val __obj = js.Dynamic.literal()
    if (guardians != null) __obj.updateDynamic("guardians")(guardians.asInstanceOf[js.Any])
    if (nextPageToken != null) __obj.updateDynamic("nextPageToken")(nextPageToken.asInstanceOf[js.Any])
    __obj.asInstanceOf[SchemaListGuardiansResponse]
  }
}

