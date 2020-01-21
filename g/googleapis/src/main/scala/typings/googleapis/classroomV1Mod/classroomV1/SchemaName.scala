package typings.googleapis.classroomV1Mod.classroomV1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Details of the user&#39;s name.
  */
@js.native
trait SchemaName extends js.Object {
  /**
    * The user&#39;s last name.  Read-only.
    */
  var familyName: js.UndefOr[String] = js.native
  /**
    * The user&#39;s full name formed by concatenating the first and last name
    * values.  Read-only.
    */
  var fullName: js.UndefOr[String] = js.native
  /**
    * The user&#39;s first name.  Read-only.
    */
  var givenName: js.UndefOr[String] = js.native
}

object SchemaName {
  @scala.inline
  def apply(familyName: String = null, fullName: String = null, givenName: String = null): SchemaName = {
    val __obj = js.Dynamic.literal()
    if (familyName != null) __obj.updateDynamic("familyName")(familyName.asInstanceOf[js.Any])
    if (fullName != null) __obj.updateDynamic("fullName")(fullName.asInstanceOf[js.Any])
    if (givenName != null) __obj.updateDynamic("givenName")(givenName.asInstanceOf[js.Any])
    __obj.asInstanceOf[SchemaName]
  }
}

