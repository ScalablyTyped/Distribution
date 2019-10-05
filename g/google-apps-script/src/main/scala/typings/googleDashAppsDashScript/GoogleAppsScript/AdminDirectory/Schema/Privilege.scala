package typings.googleDashAppsDashScript.GoogleAppsScript.AdminDirectory.Schema

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Privilege extends js.Object {
  var childPrivileges: js.UndefOr[js.Array[Privilege]] = js.undefined
  var etag: js.UndefOr[String] = js.undefined
  var isOuScopable: js.UndefOr[Boolean] = js.undefined
  var kind: js.UndefOr[String] = js.undefined
  var privilegeName: js.UndefOr[String] = js.undefined
  var serviceId: js.UndefOr[String] = js.undefined
  var serviceName: js.UndefOr[String] = js.undefined
}

object Privilege {
  @scala.inline
  def apply(
    childPrivileges: js.Array[Privilege] = null,
    etag: String = null,
    isOuScopable: js.UndefOr[Boolean] = js.undefined,
    kind: String = null,
    privilegeName: String = null,
    serviceId: String = null,
    serviceName: String = null
  ): Privilege = {
    val __obj = js.Dynamic.literal()
    if (childPrivileges != null) __obj.updateDynamic("childPrivileges")(childPrivileges)
    if (etag != null) __obj.updateDynamic("etag")(etag)
    if (!js.isUndefined(isOuScopable)) __obj.updateDynamic("isOuScopable")(isOuScopable)
    if (kind != null) __obj.updateDynamic("kind")(kind)
    if (privilegeName != null) __obj.updateDynamic("privilegeName")(privilegeName)
    if (serviceId != null) __obj.updateDynamic("serviceId")(serviceId)
    if (serviceName != null) __obj.updateDynamic("serviceName")(serviceName)
    __obj.asInstanceOf[Privilege]
  }
}

