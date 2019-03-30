package typings
package googleDashAppsDashScriptLib.GoogleAppsScriptNs.PeopleapiUnderscoreV1Ns.SchemaNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Membership extends js.Object {
  var contactGroupMembership: js.UndefOr[ContactGroupMembership] = js.undefined
  var domainMembership: js.UndefOr[DomainMembership] = js.undefined
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

