package typings.googleapis

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonFamilyName extends js.Object {
  var familyName: js.UndefOr[String] = js.native
  var givenName: js.UndefOr[String] = js.native
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

