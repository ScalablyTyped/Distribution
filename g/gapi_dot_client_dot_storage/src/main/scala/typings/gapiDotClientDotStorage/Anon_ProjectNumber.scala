package typings.gapiDotClientDotStorage

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_ProjectNumber extends js.Object {
  /** The project number. */
  var projectNumber: js.UndefOr[String] = js.undefined
  /** The team. */
  var team: js.UndefOr[String] = js.undefined
}

object Anon_ProjectNumber {
  @scala.inline
  def apply(projectNumber: String = null, team: String = null): Anon_ProjectNumber = {
    val __obj = js.Dynamic.literal()
    if (projectNumber != null) __obj.updateDynamic("projectNumber")(projectNumber.asInstanceOf[js.Any])
    if (team != null) __obj.updateDynamic("team")(team.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_ProjectNumber]
  }
}

