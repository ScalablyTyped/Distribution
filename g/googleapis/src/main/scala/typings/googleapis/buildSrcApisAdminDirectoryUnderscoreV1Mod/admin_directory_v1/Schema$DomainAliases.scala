package typings.googleapis.buildSrcApisAdminDirectoryUnderscoreV1Mod.admin_directory_v1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * JSON response template to list domain aliases in Directory API.
  */
@js.native
trait Schema$DomainAliases extends js.Object {
  /**
    * List of domain alias objects.
    */
  var domainAliases: js.UndefOr[js.Array[Schema$DomainAlias]] = js.native
  /**
    * ETag of the resource.
    */
  var etag: js.UndefOr[String] = js.native
  /**
    * Kind of resource this is.
    */
  var kind: js.UndefOr[String] = js.native
}

object Schema$DomainAliases {
  @scala.inline
  def apply(domainAliases: js.Array[Schema$DomainAlias] = null, etag: String = null, kind: String = null): Schema$DomainAliases = {
    val __obj = js.Dynamic.literal()
    if (domainAliases != null) __obj.updateDynamic("domainAliases")(domainAliases.asInstanceOf[js.Any])
    if (etag != null) __obj.updateDynamic("etag")(etag.asInstanceOf[js.Any])
    if (kind != null) __obj.updateDynamic("kind")(kind.asInstanceOf[js.Any])
    __obj.asInstanceOf[Schema$DomainAliases]
  }
}

