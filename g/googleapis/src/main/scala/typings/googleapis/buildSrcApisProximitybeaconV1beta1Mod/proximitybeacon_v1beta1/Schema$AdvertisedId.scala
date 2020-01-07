package typings.googleapis.buildSrcApisProximitybeaconV1beta1Mod.proximitybeacon_v1beta1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Defines a unique identifier of a beacon as broadcast by the device.
  */
@js.native
trait Schema$AdvertisedId extends js.Object {
  /**
    * The actual beacon identifier, as broadcast by the beacon hardware. Must
    * be [base64](http://tools.ietf.org/html/rfc4648#section-4) encoded in HTTP
    * requests, and will be so encoded (with padding) in responses. The base64
    * encoding should be of the binary byte-stream and not any textual (such as
    * hex) representation thereof. Required.
    */
  var id: js.UndefOr[String] = js.native
  /**
    * Specifies the identifier type. Required.
    */
  var `type`: js.UndefOr[String] = js.native
}

object Schema$AdvertisedId {
  @scala.inline
  def apply(id: String = null, `type`: String = null): Schema$AdvertisedId = {
    val __obj = js.Dynamic.literal()
    if (id != null) __obj.updateDynamic("id")(id.asInstanceOf[js.Any])
    if (`type` != null) __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Schema$AdvertisedId]
  }
}

