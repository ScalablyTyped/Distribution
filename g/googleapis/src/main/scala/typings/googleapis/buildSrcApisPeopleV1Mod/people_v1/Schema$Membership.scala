package typings.googleapis.buildSrcApisPeopleV1Mod.people_v1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * A person&#39;s read-only membership in a group.
  */
@js.native
trait Schema$Membership extends js.Object {
  /**
    * The contact group membership.
    */
  var contactGroupMembership: js.UndefOr[Schema$ContactGroupMembership] = js.native
  /**
    * The domain membership.
    */
  var domainMembership: js.UndefOr[Schema$DomainMembership] = js.native
  /**
    * Metadata about the membership.
    */
  var metadata: js.UndefOr[Schema$FieldMetadata] = js.native
}

object Schema$Membership {
  @scala.inline
  def apply(
    contactGroupMembership: Schema$ContactGroupMembership = null,
    domainMembership: Schema$DomainMembership = null,
    metadata: Schema$FieldMetadata = null
  ): Schema$Membership = {
    val __obj = js.Dynamic.literal()
    if (contactGroupMembership != null) __obj.updateDynamic("contactGroupMembership")(contactGroupMembership.asInstanceOf[js.Any])
    if (domainMembership != null) __obj.updateDynamic("domainMembership")(domainMembership.asInstanceOf[js.Any])
    if (metadata != null) __obj.updateDynamic("metadata")(metadata.asInstanceOf[js.Any])
    __obj.asInstanceOf[Schema$Membership]
  }
}

