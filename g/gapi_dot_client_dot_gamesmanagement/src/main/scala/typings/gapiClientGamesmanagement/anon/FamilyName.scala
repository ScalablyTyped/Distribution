package typings.gapiClientGamesmanagement.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait FamilyName extends js.Object {
  /** The family name of this player. In some places, this is known as the last name. */
  var familyName: js.UndefOr[String] = js.undefined
  /** The given name of this player. In some places, this is known as the first name. */
  var givenName: js.UndefOr[String] = js.undefined
}

object FamilyName {
  @scala.inline
  def apply(familyName: String = null, givenName: String = null): FamilyName = {
    val __obj = js.Dynamic.literal()
    if (familyName != null) __obj.updateDynamic("familyName")(familyName.asInstanceOf[js.Any])
    if (givenName != null) __obj.updateDynamic("givenName")(givenName.asInstanceOf[js.Any])
    __obj.asInstanceOf[FamilyName]
  }
}

