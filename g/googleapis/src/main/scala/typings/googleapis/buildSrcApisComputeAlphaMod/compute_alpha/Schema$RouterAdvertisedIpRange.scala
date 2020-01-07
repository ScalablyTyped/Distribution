package typings.googleapis.buildSrcApisComputeAlphaMod.compute_alpha

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Description-tagged IP ranges for the router to advertise.
  */
@js.native
trait Schema$RouterAdvertisedIpRange extends js.Object {
  /**
    * User-specified description for the IP range.
    */
  var description: js.UndefOr[String] = js.native
  /**
    * The IP range to advertise. The value must be a CIDR-formatted string.
    */
  var range: js.UndefOr[String] = js.native
}

object Schema$RouterAdvertisedIpRange {
  @scala.inline
  def apply(description: String = null, range: String = null): Schema$RouterAdvertisedIpRange = {
    val __obj = js.Dynamic.literal()
    if (description != null) __obj.updateDynamic("description")(description.asInstanceOf[js.Any])
    if (range != null) __obj.updateDynamic("range")(range.asInstanceOf[js.Any])
    __obj.asInstanceOf[Schema$RouterAdvertisedIpRange]
  }
}

