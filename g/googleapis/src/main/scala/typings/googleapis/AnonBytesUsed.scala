package typings.googleapis

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonBytesUsed extends js.Object {
  var bytesUsed: js.UndefOr[String] = js.native
  var serviceName: js.UndefOr[String] = js.native
}

object AnonBytesUsed {
  @scala.inline
  def apply(bytesUsed: String = null, serviceName: String = null): AnonBytesUsed = {
    val __obj = js.Dynamic.literal()
    if (bytesUsed != null) __obj.updateDynamic("bytesUsed")(bytesUsed.asInstanceOf[js.Any])
    if (serviceName != null) __obj.updateDynamic("serviceName")(serviceName.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonBytesUsed]
  }
}

