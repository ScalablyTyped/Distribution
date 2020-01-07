package typings.googleapis

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Anon_PrivilegeName extends js.Object {
  var privilegeName: js.UndefOr[String] = js.native
  var serviceId: js.UndefOr[String] = js.native
}

object Anon_PrivilegeName {
  @scala.inline
  def apply(privilegeName: String = null, serviceId: String = null): Anon_PrivilegeName = {
    val __obj = js.Dynamic.literal()
    if (privilegeName != null) __obj.updateDynamic("privilegeName")(privilegeName.asInstanceOf[js.Any])
    if (serviceId != null) __obj.updateDynamic("serviceId")(serviceId.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_PrivilegeName]
  }
}

