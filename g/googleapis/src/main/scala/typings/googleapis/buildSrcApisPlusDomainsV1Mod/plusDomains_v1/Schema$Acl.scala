package typings.googleapis.buildSrcApisPlusDomainsV1Mod.plusDomains_v1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Schema$Acl extends js.Object {
  /**
    * Description of the access granted, suitable for display.
    */
  var description: js.UndefOr[String] = js.native
  /**
    * Whether access is restricted to the domain.
    */
  var domainRestricted: js.UndefOr[Boolean] = js.native
  /**
    * The list of access entries.
    */
  var items: js.UndefOr[js.Array[Schema$PlusDomainsAclentryResource]] = js.native
  /**
    * Identifies this resource as a collection of access controls. Value:
    * &quot;plus#acl&quot;.
    */
  var kind: js.UndefOr[String] = js.native
}

object Schema$Acl {
  @scala.inline
  def apply(
    description: String = null,
    domainRestricted: js.UndefOr[Boolean] = js.undefined,
    items: js.Array[Schema$PlusDomainsAclentryResource] = null,
    kind: String = null
  ): Schema$Acl = {
    val __obj = js.Dynamic.literal()
    if (description != null) __obj.updateDynamic("description")(description.asInstanceOf[js.Any])
    if (!js.isUndefined(domainRestricted)) __obj.updateDynamic("domainRestricted")(domainRestricted.asInstanceOf[js.Any])
    if (items != null) __obj.updateDynamic("items")(items.asInstanceOf[js.Any])
    if (kind != null) __obj.updateDynamic("kind")(kind.asInstanceOf[js.Any])
    __obj.asInstanceOf[Schema$Acl]
  }
}

