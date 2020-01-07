package typings.googleapis.buildSrcApisDnsV1beta2Mod.dns_v1beta2

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Schema$ResponseHeader extends js.Object {
  var operationId: js.UndefOr[String] = js.native
}

object Schema$ResponseHeader {
  @scala.inline
  def apply(operationId: String = null): Schema$ResponseHeader = {
    val __obj = js.Dynamic.literal()
    if (operationId != null) __obj.updateDynamic("operationId")(operationId.asInstanceOf[js.Any])
    __obj.asInstanceOf[Schema$ResponseHeader]
  }
}

