package typings
package gapiDotClientDotProximitybeaconLib.gapiNs.clientNs.proximitybeaconNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AdvertisedId extends js.Object {
  /**
    * The actual beacon identifier, as broadcast by the beacon hardware. Must be
    * [base64](http://tools.ietf.org/html/rfc4648#section-4) encoded in HTTP
    * requests, and will be so encoded (with padding) in responses. The base64
    * encoding should be of the binary byte-stream and not any textual (such as
    * hex) representation thereof.
    * Required.
    */
  var id: js.UndefOr[java.lang.String] = js.undefined
  /**
    * Specifies the identifier type.
    * Required.
    */
  var `type`: js.UndefOr[java.lang.String] = js.undefined
}

