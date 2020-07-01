package typings.googleapis.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait PrivilegeName extends js.Object {
  var privilegeName: js.UndefOr[String] = js.native
  var serviceId: js.UndefOr[String] = js.native
}

object PrivilegeName {
  @scala.inline
  def apply(privilegeName: String = null, serviceId: String = null): PrivilegeName = {
    val __obj = js.Dynamic.literal()
    if (privilegeName != null) __obj.updateDynamic("privilegeName")(privilegeName.asInstanceOf[js.Any])
    if (serviceId != null) __obj.updateDynamic("serviceId")(serviceId.asInstanceOf[js.Any])
    __obj.asInstanceOf[PrivilegeName]
  }
}

