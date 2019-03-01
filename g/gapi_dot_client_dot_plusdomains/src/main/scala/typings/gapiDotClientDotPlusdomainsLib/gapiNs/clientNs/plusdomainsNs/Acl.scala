package typings
package gapiDotClientDotPlusdomainsLib.gapiNs.clientNs.plusdomainsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Acl extends js.Object {
  /** Description of the access granted, suitable for display. */
  var description: js.UndefOr[java.lang.String] = js.undefined
  /** Whether access is restricted to the domain. */
  var domainRestricted: js.UndefOr[scala.Boolean] = js.undefined
  /** The list of access entries. */
  var items: js.UndefOr[js.Array[PlusDomainsAclentryResource]] = js.undefined
  /** Identifies this resource as a collection of access controls. Value: "plus#acl". */
  var kind: js.UndefOr[java.lang.String] = js.undefined
}

object Acl {
  @scala.inline
  def apply(
    description: java.lang.String = null,
    domainRestricted: js.UndefOr[scala.Boolean] = js.undefined,
    items: js.Array[PlusDomainsAclentryResource] = null,
    kind: java.lang.String = null
  ): Acl = {
    val __obj = js.Dynamic.literal()
    if (description != null) __obj.updateDynamic("description")(description)
    if (!js.isUndefined(domainRestricted)) __obj.updateDynamic("domainRestricted")(domainRestricted)
    if (items != null) __obj.updateDynamic("items")(items)
    if (kind != null) __obj.updateDynamic("kind")(kind)
    __obj.asInstanceOf[Acl]
  }
}

