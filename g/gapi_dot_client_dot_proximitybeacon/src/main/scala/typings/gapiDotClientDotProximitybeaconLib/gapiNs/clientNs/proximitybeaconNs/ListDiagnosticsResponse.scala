package typings
package gapiDotClientDotProximitybeaconLib.gapiNs.clientNs.proximitybeaconNs

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
  var nextPageToken: js.UndefOr[java.lang.String] = js.undefined
}

object ListDiagnosticsResponse {
  @scala.inline
  def apply(diagnostics: js.Array[Diagnostics] = null, nextPageToken: java.lang.String = null): ListDiagnosticsResponse = {
    val __obj = js.Dynamic.literal()
    if (diagnostics != null) __obj.updateDynamic("diagnostics")(diagnostics)
    if (nextPageToken != null) __obj.updateDynamic("nextPageToken")(nextPageToken)
    __obj.asInstanceOf[ListDiagnosticsResponse]
  }
}

