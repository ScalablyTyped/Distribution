package typings.gapiDotClientDotClassroom.gapiNs.clientNs.classroomNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Name extends js.Object {
  /**
    * The user's last name.
    *
    * Read-only.
    */
  var familyName: js.UndefOr[String] = js.undefined
  /**
    * The user's full name formed by concatenating the first and last name
    * values.
    *
    * Read-only.
    */
  var fullName: js.UndefOr[String] = js.undefined
  /**
    * The user's first name.
    *
    * Read-only.
    */
  var givenName: js.UndefOr[String] = js.undefined
}

object Name {
  @scala.inline
  def apply(familyName: String = null, fullName: String = null, givenName: String = null): Name = {
    val __obj = js.Dynamic.literal()
    if (familyName != null) __obj.updateDynamic("familyName")(familyName)
    if (fullName != null) __obj.updateDynamic("fullName")(fullName)
    if (givenName != null) __obj.updateDynamic("givenName")(givenName)
    __obj.asInstanceOf[Name]
  }
}

