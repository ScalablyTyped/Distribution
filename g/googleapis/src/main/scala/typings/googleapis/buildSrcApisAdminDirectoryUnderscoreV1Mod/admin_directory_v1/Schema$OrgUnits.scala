package typings.googleapis.buildSrcApisAdminDirectoryUnderscoreV1Mod.admin_directory_v1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * JSON response template for List Organization Units operation in Directory
  * API.
  */
@js.native
trait Schema$OrgUnits extends js.Object {
  /**
    * ETag of the resource.
    */
  var etag: js.UndefOr[String] = js.native
  /**
    * Kind of resource this is.
    */
  var kind: js.UndefOr[String] = js.native
  /**
    * List of user objects.
    */
  var organizationUnits: js.UndefOr[js.Array[Schema$OrgUnit]] = js.native
}

object Schema$OrgUnits {
  @scala.inline
  def apply(etag: String = null, kind: String = null, organizationUnits: js.Array[Schema$OrgUnit] = null): Schema$OrgUnits = {
    val __obj = js.Dynamic.literal()
    if (etag != null) __obj.updateDynamic("etag")(etag.asInstanceOf[js.Any])
    if (kind != null) __obj.updateDynamic("kind")(kind.asInstanceOf[js.Any])
    if (organizationUnits != null) __obj.updateDynamic("organizationUnits")(organizationUnits.asInstanceOf[js.Any])
    __obj.asInstanceOf[Schema$OrgUnits]
  }
}

