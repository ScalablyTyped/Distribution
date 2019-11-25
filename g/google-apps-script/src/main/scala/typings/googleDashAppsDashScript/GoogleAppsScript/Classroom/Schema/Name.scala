package typings.googleDashAppsDashScript.GoogleAppsScript.Classroom.Schema

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Name extends js.Object {
  var familyName: js.UndefOr[String] = js.undefined
  var fullName: js.UndefOr[String] = js.undefined
  var givenName: js.UndefOr[String] = js.undefined
}

object Name {
  @scala.inline
  def apply(familyName: String = null, fullName: String = null, givenName: String = null): Name = {
    val __obj = js.Dynamic.literal()
    if (familyName != null) __obj.updateDynamic("familyName")(familyName.asInstanceOf[js.Any])
    if (fullName != null) __obj.updateDynamic("fullName")(fullName.asInstanceOf[js.Any])
    if (givenName != null) __obj.updateDynamic("givenName")(givenName.asInstanceOf[js.Any])
    __obj.asInstanceOf[Name]
  }
}

