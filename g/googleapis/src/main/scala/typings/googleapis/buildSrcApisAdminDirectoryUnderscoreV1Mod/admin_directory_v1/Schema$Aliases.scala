package typings.googleapis.buildSrcApisAdminDirectoryUnderscoreV1Mod.admin_directory_v1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * JSON response template to list aliases in Directory API.
  */
@js.native
trait Schema$Aliases extends js.Object {
  /**
    * List of alias objects.
    */
  var aliases: js.UndefOr[js.Array[_]] = js.native
  /**
    * ETag of the resource.
    */
  var etag: js.UndefOr[String] = js.native
  /**
    * Kind of resource this is.
    */
  var kind: js.UndefOr[String] = js.native
}

object Schema$Aliases {
  @scala.inline
  def apply(aliases: js.Array[_] = null, etag: String = null, kind: String = null): Schema$Aliases = {
    val __obj = js.Dynamic.literal()
    if (aliases != null) __obj.updateDynamic("aliases")(aliases.asInstanceOf[js.Any])
    if (etag != null) __obj.updateDynamic("etag")(etag.asInstanceOf[js.Any])
    if (kind != null) __obj.updateDynamic("kind")(kind.asInstanceOf[js.Any])
    __obj.asInstanceOf[Schema$Aliases]
  }
}

