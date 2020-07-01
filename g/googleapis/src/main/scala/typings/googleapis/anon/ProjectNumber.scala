package typings.googleapis.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ProjectNumber extends js.Object {
  var projectNumber: js.UndefOr[String] = js.native
  var team: js.UndefOr[String] = js.native
}

object ProjectNumber {
  @scala.inline
  def apply(projectNumber: String = null, team: String = null): ProjectNumber = {
    val __obj = js.Dynamic.literal()
    if (projectNumber != null) __obj.updateDynamic("projectNumber")(projectNumber.asInstanceOf[js.Any])
    if (team != null) __obj.updateDynamic("team")(team.asInstanceOf[js.Any])
    __obj.asInstanceOf[ProjectNumber]
  }
}

