package typings.gapiClientPlusdomains

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonFamilyName extends js.Object {
  /** The family name ("last name") of the actor. */
  var familyName: js.UndefOr[String] = js.undefined
  /** The given name ("first name") of the actor. */
  var givenName: js.UndefOr[String] = js.undefined
}

object AnonFamilyName {
  @scala.inline
  def apply(familyName: String = null, givenName: String = null): AnonFamilyName = {
    val __obj = js.Dynamic.literal()
    if (familyName != null) __obj.updateDynamic("familyName")(familyName.asInstanceOf[js.Any])
    if (givenName != null) __obj.updateDynamic("givenName")(givenName.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonFamilyName]
  }
}

