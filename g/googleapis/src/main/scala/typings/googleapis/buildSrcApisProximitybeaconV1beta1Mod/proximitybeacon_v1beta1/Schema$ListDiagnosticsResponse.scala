package typings.googleapis.buildSrcApisProximitybeaconV1beta1Mod.proximitybeacon_v1beta1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Response that contains the requested diagnostics.
  */
@js.native
trait Schema$ListDiagnosticsResponse extends js.Object {
  /**
    * The diagnostics matching the given request.
    */
  var diagnostics: js.UndefOr[js.Array[Schema$Diagnostics]] = js.native
  /**
    * Token that can be used for pagination. Returned only if the request
    * matches more beacons than can be returned in this response.
    */
  var nextPageToken: js.UndefOr[String] = js.native
}

object Schema$ListDiagnosticsResponse {
  @scala.inline
  def apply(diagnostics: js.Array[Schema$Diagnostics] = null, nextPageToken: String = null): Schema$ListDiagnosticsResponse = {
    val __obj = js.Dynamic.literal()
    if (diagnostics != null) __obj.updateDynamic("diagnostics")(diagnostics.asInstanceOf[js.Any])
    if (nextPageToken != null) __obj.updateDynamic("nextPageToken")(nextPageToken.asInstanceOf[js.Any])
    __obj.asInstanceOf[Schema$ListDiagnosticsResponse]
  }
}

