package typings.googleapis.buildSrcApisAdminDirectoryUnderscoreV1Mod.admin_directory_v1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * JSON response template for List privileges operation in Directory API.
  */
@js.native
trait Schema$Privileges extends js.Object {
  /**
    * ETag of the resource.
    */
  var etag: js.UndefOr[String] = js.native
  /**
    * A list of Privilege resources.
    */
  var items: js.UndefOr[js.Array[Schema$Privilege]] = js.native
  /**
    * The type of the API resource. This is always admin#directory#privileges.
    */
  var kind: js.UndefOr[String] = js.native
}

object Schema$Privileges {
  @scala.inline
  def apply(etag: String = null, items: js.Array[Schema$Privilege] = null, kind: String = null): Schema$Privileges = {
    val __obj = js.Dynamic.literal()
    if (etag != null) __obj.updateDynamic("etag")(etag.asInstanceOf[js.Any])
    if (items != null) __obj.updateDynamic("items")(items.asInstanceOf[js.Any])
    if (kind != null) __obj.updateDynamic("kind")(kind.asInstanceOf[js.Any])
    __obj.asInstanceOf[Schema$Privileges]
  }
}

