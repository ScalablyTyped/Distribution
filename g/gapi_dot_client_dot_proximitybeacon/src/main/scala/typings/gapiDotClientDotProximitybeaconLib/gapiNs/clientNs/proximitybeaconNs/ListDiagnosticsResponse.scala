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

