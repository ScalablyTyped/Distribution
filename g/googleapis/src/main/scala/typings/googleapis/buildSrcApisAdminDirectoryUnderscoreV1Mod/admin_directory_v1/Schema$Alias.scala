package typings.googleapis.buildSrcApisAdminDirectoryUnderscoreV1Mod.admin_directory_v1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * JSON template for Alias object in Directory API.
  */
@js.native
trait Schema$Alias extends js.Object {
  /**
    * A alias email
    */
  var alias: js.UndefOr[String] = js.native
  /**
    * ETag of the resource.
    */
  var etag: js.UndefOr[String] = js.native
  /**
    * Unique id of the group (Read-only) Unique id of the user (Read-only)
    */
  var id: js.UndefOr[String] = js.native
  /**
    * Kind of resource this is.
    */
  var kind: js.UndefOr[String] = js.native
  /**
    * Group&#39;s primary email (Read-only) User&#39;s primary email
    * (Read-only)
    */
  var primaryEmail: js.UndefOr[String] = js.native
}

object Schema$Alias {
  @scala.inline
  def apply(
    alias: String = null,
    etag: String = null,
    id: String = null,
    kind: String = null,
    primaryEmail: String = null
  ): Schema$Alias = {
    val __obj = js.Dynamic.literal()
    if (alias != null) __obj.updateDynamic("alias")(alias.asInstanceOf[js.Any])
    if (etag != null) __obj.updateDynamic("etag")(etag.asInstanceOf[js.Any])
    if (id != null) __obj.updateDynamic("id")(id.asInstanceOf[js.Any])
    if (kind != null) __obj.updateDynamic("kind")(kind.asInstanceOf[js.Any])
    if (primaryEmail != null) __obj.updateDynamic("primaryEmail")(primaryEmail.asInstanceOf[js.Any])
    __obj.asInstanceOf[Schema$Alias]
  }
}

