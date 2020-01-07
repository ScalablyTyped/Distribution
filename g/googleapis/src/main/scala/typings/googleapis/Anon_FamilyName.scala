package typings.googleapis

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Anon_FamilyName extends js.Object {
  var familyName: js.UndefOr[String] = js.native
  var givenName: js.UndefOr[String] = js.native
}

object Anon_FamilyName {
  @scala.inline
  def apply(familyName: String = null, givenName: String = null): Anon_FamilyName = {
    val __obj = js.Dynamic.literal()
    if (familyName != null) __obj.updateDynamic("familyName")(familyName.asInstanceOf[js.Any])
    if (givenName != null) __obj.updateDynamic("givenName")(givenName.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_FamilyName]
  }
}

