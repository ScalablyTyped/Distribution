package typings.googleapis.androidenterpriseV1Mod.androidenterpriseV1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * A Permissions resource represents some extra capability, to be granted to
  * an Android app, which requires explicit consent. An enterprise admin must
  * consent to these permissions on behalf of their users before an entitlement
  * for the app can be created.  The permissions collection is read-only. The
  * information provided for each permission (localized name and description)
  * is intended to be used in the MDM user interface when obtaining consent
  * from the enterprise.
  */
@js.native
trait SchemaPermission extends js.Object {
  /**
    * A longer description of the Permissions resource, giving more details of
    * what it affects.
    */
  var description: js.UndefOr[String] = js.native
  /**
    * Identifies what kind of resource this is. Value: the fixed string
    * &quot;androidenterprise#permission&quot;.
    */
  var kind: js.UndefOr[String] = js.native
  /**
    * The name of the permission.
    */
  var name: js.UndefOr[String] = js.native
  /**
    * An opaque string uniquely identifying the permission.
    */
  var permissionId: js.UndefOr[String] = js.native
}

object SchemaPermission {
  @scala.inline
  def apply(description: String = null, kind: String = null, name: String = null, permissionId: String = null): SchemaPermission = {
    val __obj = js.Dynamic.literal()
    if (description != null) __obj.updateDynamic("description")(description.asInstanceOf[js.Any])
    if (kind != null) __obj.updateDynamic("kind")(kind.asInstanceOf[js.Any])
    if (name != null) __obj.updateDynamic("name")(name.asInstanceOf[js.Any])
    if (permissionId != null) __obj.updateDynamic("permissionId")(permissionId.asInstanceOf[js.Any])
    __obj.asInstanceOf[SchemaPermission]
  }
}

