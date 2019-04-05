package typings
package googleDashAppsDashScriptLib.GoogleAppsScriptNs.AdminDirectoryNs.SchemaNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Privilege extends js.Object {
  var childPrivileges: js.UndefOr[js.Array[Privilege]] = js.undefined
  var etag: js.UndefOr[java.lang.String] = js.undefined
  var isOuScopable: js.UndefOr[scala.Boolean] = js.undefined
  var kind: js.UndefOr[java.lang.String] = js.undefined
  var privilegeName: js.UndefOr[java.lang.String] = js.undefined
  var serviceId: js.UndefOr[java.lang.String] = js.undefined
  var serviceName: js.UndefOr[java.lang.String] = js.undefined
}

object Privilege {
  @scala.inline
  def apply(
    childPrivileges: js.Array[Privilege] = null,
    etag: java.lang.String = null,
    isOuScopable: js.UndefOr[scala.Boolean] = js.undefined,
    kind: java.lang.String = null,
    privilegeName: java.lang.String = null,
    serviceId: java.lang.String = null,
    serviceName: java.lang.String = null
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

