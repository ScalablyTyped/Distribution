package typings.googleapis

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Anon_BytesUsed extends js.Object {
  var bytesUsed: js.UndefOr[String] = js.native
  var serviceName: js.UndefOr[String] = js.native
}

object Anon_BytesUsed {
  @scala.inline
  def apply(bytesUsed: String = null, serviceName: String = null): Anon_BytesUsed = {
    val __obj = js.Dynamic.literal()
    if (bytesUsed != null) __obj.updateDynamic("bytesUsed")(bytesUsed.asInstanceOf[js.Any])
    if (serviceName != null) __obj.updateDynamic("serviceName")(serviceName.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_BytesUsed]
  }
}

