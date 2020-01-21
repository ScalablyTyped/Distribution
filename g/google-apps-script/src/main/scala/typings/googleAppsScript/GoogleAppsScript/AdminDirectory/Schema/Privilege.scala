package typings.googleAppsScript.GoogleAppsScript.AdminDirectory.Schema

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
    if (childPrivileges != null) __obj.updateDynamic("childPrivileges")(childPrivileges.asInstanceOf[js.Any])
    if (etag != null) __obj.updateDynamic("etag")(etag.asInstanceOf[js.Any])
    if (!js.isUndefined(isOuScopable)) __obj.updateDynamic("isOuScopable")(isOuScopable.asInstanceOf[js.Any])
    if (kind != null) __obj.updateDynamic("kind")(kind.asInstanceOf[js.Any])
    if (privilegeName != null) __obj.updateDynamic("privilegeName")(privilegeName.asInstanceOf[js.Any])
    if (serviceId != null) __obj.updateDynamic("serviceId")(serviceId.asInstanceOf[js.Any])
    if (serviceName != null) __obj.updateDynamic("serviceName")(serviceName.asInstanceOf[js.Any])
    __obj.asInstanceOf[Privilege]
  }
}

