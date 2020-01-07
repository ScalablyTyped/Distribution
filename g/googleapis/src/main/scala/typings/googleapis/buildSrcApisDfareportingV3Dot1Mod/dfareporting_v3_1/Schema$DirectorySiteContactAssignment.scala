package typings.googleapis.buildSrcApisDfareportingV3Dot1Mod.dfareporting_v3_1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Directory Site Contact Assignment
  */
@js.native
trait Schema$DirectorySiteContactAssignment extends js.Object {
  /**
    * ID of this directory site contact. This is a read-only, auto-generated
    * field.
    */
  var contactId: js.UndefOr[String] = js.native
  /**
    * Visibility of this directory site contact assignment. When set to PUBLIC
    * this contact assignment is visible to all account and agency users; when
    * set to PRIVATE it is visible only to the site.
    */
  var visibility: js.UndefOr[String] = js.native
}

object Schema$DirectorySiteContactAssignment {
  @scala.inline
  def apply(contactId: String = null, visibility: String = null): Schema$DirectorySiteContactAssignment = {
    val __obj = js.Dynamic.literal()
    if (contactId != null) __obj.updateDynamic("contactId")(contactId.asInstanceOf[js.Any])
    if (visibility != null) __obj.updateDynamic("visibility")(visibility.asInstanceOf[js.Any])
    __obj.asInstanceOf[Schema$DirectorySiteContactAssignment]
  }
}

