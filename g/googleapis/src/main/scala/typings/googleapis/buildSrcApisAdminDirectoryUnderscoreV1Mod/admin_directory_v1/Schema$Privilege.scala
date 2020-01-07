package typings.googleapis.buildSrcApisAdminDirectoryUnderscoreV1Mod.admin_directory_v1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * JSON template for privilege resource in Directory API.
  */
@js.native
trait Schema$Privilege extends js.Object {
  /**
    * A list of child privileges. Privileges for a service form a tree. Each
    * privilege can have a list of child privileges; this list is empty for a
    * leaf privilege.
    */
  var childPrivileges: js.UndefOr[js.Array[Schema$Privilege]] = js.native
  /**
    * ETag of the resource.
    */
  var etag: js.UndefOr[String] = js.native
  /**
    * If the privilege can be restricted to an organization unit.
    */
  var isOuScopable: js.UndefOr[Boolean] = js.native
  /**
    * The type of the API resource. This is always admin#directory#privilege.
    */
  var kind: js.UndefOr[String] = js.native
  /**
    * The name of the privilege.
    */
  var privilegeName: js.UndefOr[String] = js.native
  /**
    * The obfuscated ID of the service this privilege is for.
    */
  var serviceId: js.UndefOr[String] = js.native
  /**
    * The name of the service this privilege is for.
    */
  var serviceName: js.UndefOr[String] = js.native
}

object Schema$Privilege {
  @scala.inline
  def apply(
    childPrivileges: js.Array[Schema$Privilege] = null,
    etag: String = null,
    isOuScopable: js.UndefOr[Boolean] = js.undefined,
    kind: String = null,
    privilegeName: String = null,
    serviceId: String = null,
    serviceName: String = null
  ): Schema$Privilege = {
    val __obj = js.Dynamic.literal()
    if (childPrivileges != null) __obj.updateDynamic("childPrivileges")(childPrivileges.asInstanceOf[js.Any])
    if (etag != null) __obj.updateDynamic("etag")(etag.asInstanceOf[js.Any])
    if (!js.isUndefined(isOuScopable)) __obj.updateDynamic("isOuScopable")(isOuScopable.asInstanceOf[js.Any])
    if (kind != null) __obj.updateDynamic("kind")(kind.asInstanceOf[js.Any])
    if (privilegeName != null) __obj.updateDynamic("privilegeName")(privilegeName.asInstanceOf[js.Any])
    if (serviceId != null) __obj.updateDynamic("serviceId")(serviceId.asInstanceOf[js.Any])
    if (serviceName != null) __obj.updateDynamic("serviceName")(serviceName.asInstanceOf[js.Any])
    __obj.asInstanceOf[Schema$Privilege]
  }
}

