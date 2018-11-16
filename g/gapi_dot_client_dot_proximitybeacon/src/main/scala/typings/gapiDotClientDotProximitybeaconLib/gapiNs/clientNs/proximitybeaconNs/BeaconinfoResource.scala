package typings
package gapiDotClientDotProximitybeaconLib.gapiNs.clientNs.proximitybeaconNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait BeaconinfoResource extends js.Object {
  /**
               * Given one or more beacon observations, returns any beacon information
               * and attachments accessible to your application. Authorize by using the
               * [API key](https://developers.google.com/beacons/proximity/get-started#request_a_browser_api_key)
               * for the application.
               */
  def getforobserved(request: gapiDotClientDotProximitybeaconLib.Anon_AccesstokenPrettyPrintBearertoken): gapiDotClientLib.gapiNs.clientNs.Request[GetInfoForObservedBeaconsResponse]
}

