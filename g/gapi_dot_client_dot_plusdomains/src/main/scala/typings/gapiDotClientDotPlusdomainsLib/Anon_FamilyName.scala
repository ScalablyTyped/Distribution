package typings
package gapiDotClientDotPlusdomainsLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_FamilyName extends js.Object {
  /** The family name ("last name") of the actor. */
  var familyName: js.UndefOr[java.lang.String] = js.undefined
  /** The given name ("first name") of the actor. */
  var givenName: js.UndefOr[java.lang.String] = js.undefined
}

object Anon_FamilyName {
  @scala.inline
  def apply(familyName: java.lang.String = null, givenName: java.lang.String = null): Anon_FamilyName = {
    val __obj = js.Dynamic.literal()
    if (familyName != null) __obj.updateDynamic("familyName")(familyName)
    if (givenName != null) __obj.updateDynamic("givenName")(givenName)
    __obj.asInstanceOf[Anon_FamilyName]
  }
}

