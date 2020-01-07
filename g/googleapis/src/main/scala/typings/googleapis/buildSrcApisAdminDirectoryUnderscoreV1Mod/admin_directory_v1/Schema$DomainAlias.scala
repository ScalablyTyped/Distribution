package typings.googleapis.buildSrcApisAdminDirectoryUnderscoreV1Mod.admin_directory_v1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * JSON template for Domain Alias object in Directory API.
  */
@js.native
trait Schema$DomainAlias extends js.Object {
  /**
    * The creation time of the domain alias. (Read-only).
    */
  var creationTime: js.UndefOr[String] = js.native
  /**
    * The domain alias name.
    */
  var domainAliasName: js.UndefOr[String] = js.native
  /**
    * ETag of the resource.
    */
  var etag: js.UndefOr[String] = js.native
  /**
    * Kind of resource this is.
    */
  var kind: js.UndefOr[String] = js.native
  /**
    * The parent domain name that the domain alias is associated with. This can
    * either be a primary or secondary domain name within a customer.
    */
  var parentDomainName: js.UndefOr[String] = js.native
  /**
    * Indicates the verification state of a domain alias. (Read-only)
    */
  var verified: js.UndefOr[Boolean] = js.native
}

object Schema$DomainAlias {
  @scala.inline
  def apply(
    creationTime: String = null,
    domainAliasName: String = null,
    etag: String = null,
    kind: String = null,
    parentDomainName: String = null,
    verified: js.UndefOr[Boolean] = js.undefined
  ): Schema$DomainAlias = {
    val __obj = js.Dynamic.literal()
    if (creationTime != null) __obj.updateDynamic("creationTime")(creationTime.asInstanceOf[js.Any])
    if (domainAliasName != null) __obj.updateDynamic("domainAliasName")(domainAliasName.asInstanceOf[js.Any])
    if (etag != null) __obj.updateDynamic("etag")(etag.asInstanceOf[js.Any])
    if (kind != null) __obj.updateDynamic("kind")(kind.asInstanceOf[js.Any])
    if (parentDomainName != null) __obj.updateDynamic("parentDomainName")(parentDomainName.asInstanceOf[js.Any])
    if (!js.isUndefined(verified)) __obj.updateDynamic("verified")(verified.asInstanceOf[js.Any])
    __obj.asInstanceOf[Schema$DomainAlias]
  }
}

