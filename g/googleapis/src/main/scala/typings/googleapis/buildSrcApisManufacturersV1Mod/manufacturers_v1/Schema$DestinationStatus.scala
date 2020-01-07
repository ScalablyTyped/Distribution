package typings.googleapis.buildSrcApisManufacturersV1Mod.manufacturers_v1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * The destination status.
  */
@js.native
trait Schema$DestinationStatus extends js.Object {
  /**
    * The name of the destination.
    */
  var destination: js.UndefOr[String] = js.native
  /**
    * The status of the destination.
    */
  var status: js.UndefOr[String] = js.native
}

object Schema$DestinationStatus {
  @scala.inline
  def apply(destination: String = null, status: String = null): Schema$DestinationStatus = {
    val __obj = js.Dynamic.literal()
    if (destination != null) __obj.updateDynamic("destination")(destination.asInstanceOf[js.Any])
    if (status != null) __obj.updateDynamic("status")(status.asInstanceOf[js.Any])
    __obj.asInstanceOf[Schema$DestinationStatus]
  }
}

