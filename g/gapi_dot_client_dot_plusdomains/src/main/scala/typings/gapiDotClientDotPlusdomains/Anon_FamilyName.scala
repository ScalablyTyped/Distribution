package typings.gapiDotClientDotPlusdomains

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_FamilyName extends js.Object {
  /** The family name ("last name") of the actor. */
  var familyName: js.UndefOr[String] = js.undefined
  /** The given name ("first name") of the actor. */
  var givenName: js.UndefOr[String] = js.undefined
}

object Anon_FamilyName {
  @scala.inline
  def apply(familyName: String = null, givenName: String = null): Anon_FamilyName = {
    val __obj = js.Dynamic.literal()
    if (familyName != null) __obj.updateDynamic("familyName")(familyName)
    if (givenName != null) __obj.updateDynamic("givenName")(givenName)
    __obj.asInstanceOf[Anon_FamilyName]
  }
}

