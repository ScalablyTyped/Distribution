package typings
package gapiDotClientDotPlusdomainsLib.gapiNs.clientNs.plusdomainsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PlusDomainsAclentryResource extends js.Object {
  /** A descriptive name for this entry. Suitable for display. */
  var displayName: js.UndefOr[java.lang.String] = js.undefined
  /** The ID of the entry. For entries of type "person" or "circle", this is the ID of the resource. For other types, this property is not set. */
  var id: js.UndefOr[java.lang.String] = js.undefined
  /**
    * The type of entry describing to whom access is granted. Possible values are:
    * - "person" - Access to an individual.
    * - "circle" - Access to members of a circle.
    * - "myCircles" - Access to members of all the person's circles.
    * - "extendedCircles" - Access to members of all the person's circles, plus all of the people in their circles.
    * - "domain" - Access to members of the person's Google Apps domain.
    * - "public" - Access to anyone on the web.
    */
  var `type`: js.UndefOr[java.lang.String] = js.undefined
}

object PlusDomainsAclentryResource {
  @scala.inline
  def apply(displayName: java.lang.String = null, id: java.lang.String = null, `type`: java.lang.String = null): PlusDomainsAclentryResource = {
    val __obj = js.Dynamic.literal()
    if (displayName != null) __obj.updateDynamic("displayName")(displayName)
    if (id != null) __obj.updateDynamic("id")(id)
    if (`type` != null) __obj.updateDynamic("type")(`type`)
    __obj.asInstanceOf[PlusDomainsAclentryResource]
  }
}

