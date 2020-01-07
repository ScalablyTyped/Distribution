package typings.googleapis.buildSrcApisAdminDirectoryUnderscoreV1Mod.admin_directory_v1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * JSON template for Domain object in Directory API.
  */
@js.native
trait Schema$Domains extends js.Object {
  /**
    * Creation time of the domain. (Read-only).
    */
  var creationTime: js.UndefOr[String] = js.native
  /**
    * List of domain alias objects. (Read-only)
    */
  var domainAliases: js.UndefOr[js.Array[Schema$DomainAlias]] = js.native
  /**
    * The domain name of the customer.
    */
  var domainName: js.UndefOr[String] = js.native
  /**
    * ETag of the resource.
    */
  var etag: js.UndefOr[String] = js.native
  /**
    * Indicates if the domain is a primary domain (Read-only).
    */
  var isPrimary: js.UndefOr[Boolean] = js.native
  /**
    * Kind of resource this is.
    */
  var kind: js.UndefOr[String] = js.native
  /**
    * Indicates the verification state of a domain. (Read-only).
    */
  var verified: js.UndefOr[Boolean] = js.native
}

object Schema$Domains {
  @scala.inline
  def apply(
    creationTime: String = null,
    domainAliases: js.Array[Schema$DomainAlias] = null,
    domainName: String = null,
    etag: String = null,
    isPrimary: js.UndefOr[Boolean] = js.undefined,
    kind: String = null,
    verified: js.UndefOr[Boolean] = js.undefined
  ): Schema$Domains = {
    val __obj = js.Dynamic.literal()
    if (creationTime != null) __obj.updateDynamic("creationTime")(creationTime.asInstanceOf[js.Any])
    if (domainAliases != null) __obj.updateDynamic("domainAliases")(domainAliases.asInstanceOf[js.Any])
    if (domainName != null) __obj.updateDynamic("domainName")(domainName.asInstanceOf[js.Any])
    if (etag != null) __obj.updateDynamic("etag")(etag.asInstanceOf[js.Any])
    if (!js.isUndefined(isPrimary)) __obj.updateDynamic("isPrimary")(isPrimary.asInstanceOf[js.Any])
    if (kind != null) __obj.updateDynamic("kind")(kind.asInstanceOf[js.Any])
    if (!js.isUndefined(verified)) __obj.updateDynamic("verified")(verified.asInstanceOf[js.Any])
    __obj.asInstanceOf[Schema$Domains]
  }
}

