package typings.gapiDotClientDotPlusdomains.gapi.client.plusdomains

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PlusDomainsAclentryResource extends js.Object {
  /** A descriptive name for this entry. Suitable for display. */
  var displayName: js.UndefOr[String] = js.undefined
  /** The ID of the entry. For entries of type "person" or "circle", this is the ID of the resource. For other types, this property is not set. */
  var id: js.UndefOr[String] = js.undefined
  /**
    * The type of entry describing to whom access is granted. Possible values are:
    * - "person" - Access to an individual.
    * - "circle" - Access to members of a circle.
    * - "myCircles" - Access to members of all the person's circles.
    * - "extendedCircles" - Access to members of all the person's circles, plus all of the people in their circles.
    * - "domain" - Access to members of the person's Google Apps domain.
    * - "public" - Access to anyone on the web.
    */
  var `type`: js.UndefOr[String] = js.undefined
}

object PlusDomainsAclentryResource {
  @scala.inline
  def apply(displayName: String = null, id: String = null, `type`: String = null): PlusDomainsAclentryResource = {
    val __obj = js.Dynamic.literal()
    if (displayName != null) __obj.updateDynamic("displayName")(displayName.asInstanceOf[js.Any])
    if (id != null) __obj.updateDynamic("id")(id.asInstanceOf[js.Any])
    if (`type` != null) __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[PlusDomainsAclentryResource]
  }
}

