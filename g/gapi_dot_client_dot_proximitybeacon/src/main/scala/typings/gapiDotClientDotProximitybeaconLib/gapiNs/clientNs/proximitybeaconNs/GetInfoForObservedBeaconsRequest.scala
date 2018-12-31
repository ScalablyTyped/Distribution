package typings
package gapiDotClientDotProximitybeaconLib.gapiNs.clientNs.proximitybeaconNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GetInfoForObservedBeaconsRequest extends js.Object {
  /**
    * Specifies what kind of attachments to include in the response.
    * When given, the response will include only attachments of the given types.
    * When empty, no attachments will be returned. Must be in the format
    * <var>namespace/type</var>. Accepts `&#42;` to specify all types in
    * all namespaces owned by the client.
    * Optional.
    */
  var namespacedTypes: js.UndefOr[js.Array[java.lang.String]] = js.undefined
  /**
    * The beacons that the client has encountered.
    * At least one must be given.
    */
  var observations: js.UndefOr[js.Array[Observation]] = js.undefined
}

