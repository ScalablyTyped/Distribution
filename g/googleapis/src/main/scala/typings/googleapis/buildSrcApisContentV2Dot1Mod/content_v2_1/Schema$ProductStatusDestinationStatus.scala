package typings.googleapis.buildSrcApisContentV2Dot1Mod.content_v2_1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Schema$ProductStatusDestinationStatus extends js.Object {
  /**
    * The name of the destination
    */
  var destination: js.UndefOr[String] = js.native
  var status: js.UndefOr[String] = js.native
}

object Schema$ProductStatusDestinationStatus {
  @scala.inline
  def apply(destination: String = null, status: String = null): Schema$ProductStatusDestinationStatus = {
    val __obj = js.Dynamic.literal()
    if (destination != null) __obj.updateDynamic("destination")(destination.asInstanceOf[js.Any])
    if (status != null) __obj.updateDynamic("status")(status.asInstanceOf[js.Any])
    __obj.asInstanceOf[Schema$ProductStatusDestinationStatus]
  }
}

