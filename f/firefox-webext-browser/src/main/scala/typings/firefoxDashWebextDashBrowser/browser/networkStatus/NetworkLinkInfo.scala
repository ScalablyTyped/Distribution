package typings.firefoxDashWebextDashBrowser.browser.networkStatus

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* networkStatus types */
trait NetworkLinkInfo extends js.Object {
  /** If known, the network id or name. */
  var id: js.UndefOr[String] = js.undefined
  /** Status of the network link, if "unknown" then link is usually assumed to be "up" */
  var status: _NetworkLinkInfoStatus
  /** If known, the type of network connection that is avialable. */
  var `type`: _NetworkLinkInfoType
}

object NetworkLinkInfo {
  @scala.inline
  def apply(status: _NetworkLinkInfoStatus, `type`: _NetworkLinkInfoType, id: String = null): NetworkLinkInfo = {
    val __obj = js.Dynamic.literal(status = status)
    __obj.updateDynamic("type")(`type`)
    if (id != null) __obj.updateDynamic("id")(id)
    __obj.asInstanceOf[NetworkLinkInfo]
  }
}

