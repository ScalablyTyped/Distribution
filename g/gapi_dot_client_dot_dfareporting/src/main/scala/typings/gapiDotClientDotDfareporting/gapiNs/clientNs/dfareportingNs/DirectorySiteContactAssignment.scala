package typings.gapiDotClientDotDfareporting.gapiNs.clientNs.dfareportingNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DirectorySiteContactAssignment extends js.Object {
  /** ID of this directory site contact. This is a read-only, auto-generated field. */
  var contactId: js.UndefOr[String] = js.undefined
  /**
    * Visibility of this directory site contact assignment. When set to PUBLIC this contact assignment is visible to all account and agency users; when set
    * to PRIVATE it is visible only to the site.
    */
  var visibility: js.UndefOr[String] = js.undefined
}

object DirectorySiteContactAssignment {
  @scala.inline
  def apply(contactId: String = null, visibility: String = null): DirectorySiteContactAssignment = {
    val __obj = js.Dynamic.literal()
    if (contactId != null) __obj.updateDynamic("contactId")(contactId)
    if (visibility != null) __obj.updateDynamic("visibility")(visibility)
    __obj.asInstanceOf[DirectorySiteContactAssignment]
  }
}

