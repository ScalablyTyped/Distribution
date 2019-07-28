package typings.gapiDotClientDotCompute.gapiNs.clientNs.computeNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DisksResizeRequest extends js.Object {
  /** The new size of the persistent disk, which is specified in GB. */
  var sizeGb: js.UndefOr[String] = js.undefined
}

object DisksResizeRequest {
  @scala.inline
  def apply(sizeGb: String = null): DisksResizeRequest = {
    val __obj = js.Dynamic.literal()
    if (sizeGb != null) __obj.updateDynamic("sizeGb")(sizeGb)
    __obj.asInstanceOf[DisksResizeRequest]
  }
}

