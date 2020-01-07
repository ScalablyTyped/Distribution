package typings.googleapis.buildSrcApisAdminDirectoryUnderscoreV1Mod.admin_directory_v1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * JSON response template to list Domains in Directory API.
  */
@js.native
trait Schema$Domains2 extends js.Object {
  /**
    * List of domain objects.
    */
  var domains: js.UndefOr[js.Array[Schema$Domains]] = js.native
  /**
    * ETag of the resource.
    */
  var etag: js.UndefOr[String] = js.native
  /**
    * Kind of resource this is.
    */
  var kind: js.UndefOr[String] = js.native
}

object Schema$Domains2 {
  @scala.inline
  def apply(domains: js.Array[Schema$Domains] = null, etag: String = null, kind: String = null): Schema$Domains2 = {
    val __obj = js.Dynamic.literal()
    if (domains != null) __obj.updateDynamic("domains")(domains.asInstanceOf[js.Any])
    if (etag != null) __obj.updateDynamic("etag")(etag.asInstanceOf[js.Any])
    if (kind != null) __obj.updateDynamic("kind")(kind.asInstanceOf[js.Any])
    __obj.asInstanceOf[Schema$Domains2]
  }
}

