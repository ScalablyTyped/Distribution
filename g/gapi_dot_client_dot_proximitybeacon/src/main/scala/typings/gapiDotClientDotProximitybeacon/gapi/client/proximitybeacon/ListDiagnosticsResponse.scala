package typings.gapiDotClientDotProximitybeacon.gapi.client.proximitybeacon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ListDiagnosticsResponse extends js.Object {
  /** The diagnostics matching the given request. */
  var diagnostics: js.UndefOr[js.Array[Diagnostics]] = js.undefined
  /**
    * Token that can be used for pagination. Returned only if the
    * request matches more beacons than can be returned in this response.
    */
  var nextPageToken: js.UndefOr[String] = js.undefined
}

object ListDiagnosticsResponse {
  @scala.inline
  def apply(diagnostics: js.Array[Diagnostics] = null, nextPageToken: String = null): ListDiagnosticsResponse = {
    val __obj = js.Dynamic.literal()
    if (diagnostics != null) __obj.updateDynamic("diagnostics")(diagnostics.asInstanceOf[js.Any])
    if (nextPageToken != null) __obj.updateDynamic("nextPageToken")(nextPageToken.asInstanceOf[js.Any])
    __obj.asInstanceOf[ListDiagnosticsResponse]
  }
}

