package typings
package gapiDotClientDotPeopleLib.gapiNs.clientNs.peopleNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Membership extends js.Object {
  /** The contact group membership. */
  var contactGroupMembership: js.UndefOr[ContactGroupMembership] = js.undefined
  /** The domain membership. */
  var domainMembership: js.UndefOr[DomainMembership] = js.undefined
  /** Metadata about the membership. */
  var metadata: js.UndefOr[FieldMetadata] = js.undefined
}

object Membership {
  @scala.inline
  def apply(
    contactGroupMembership: ContactGroupMembership = null,
    domainMembership: DomainMembership = null,
    metadata: FieldMetadata = null
  ): Membership = {
    val __obj = js.Dynamic.literal()
    if (contactGroupMembership != null) __obj.updateDynamic("contactGroupMembership")(contactGroupMembership)
    if (domainMembership != null) __obj.updateDynamic("domainMembership")(domainMembership)
    if (metadata != null) __obj.updateDynamic("metadata")(metadata)
    __obj.asInstanceOf[Membership]
  }
}

