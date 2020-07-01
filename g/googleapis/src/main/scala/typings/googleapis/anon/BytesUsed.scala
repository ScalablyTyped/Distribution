package typings.googleapis.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait BytesUsed extends js.Object {
  var bytesUsed: js.UndefOr[String] = js.native
  var serviceName: js.UndefOr[String] = js.native
}

object BytesUsed {
  @scala.inline
  def apply(bytesUsed: String = null, serviceName: String = null): BytesUsed = {
    val __obj = js.Dynamic.literal()
    if (bytesUsed != null) __obj.updateDynamic("bytesUsed")(bytesUsed.asInstanceOf[js.Any])
    if (serviceName != null) __obj.updateDynamic("serviceName")(serviceName.asInstanceOf[js.Any])
    __obj.asInstanceOf[BytesUsed]
  }
}

