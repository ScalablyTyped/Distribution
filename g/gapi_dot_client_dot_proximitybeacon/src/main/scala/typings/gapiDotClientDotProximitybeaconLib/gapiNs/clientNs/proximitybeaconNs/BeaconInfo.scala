package typings
package gapiDotClientDotProximitybeaconLib.gapiNs.clientNs.proximitybeaconNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait BeaconInfo extends js.Object {
  /** The ID advertised by the beacon. */
  var advertisedId: js.UndefOr[AdvertisedId] = js.undefined
  /**
    * Attachments matching the type(s) requested.
    * May be empty if no attachment types were requested.
    */
  var attachments: js.UndefOr[js.Array[AttachmentInfo]] = js.undefined
  /** The name under which the beacon is registered. */
  var beaconName: js.UndefOr[java.lang.String] = js.undefined
}

