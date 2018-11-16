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

