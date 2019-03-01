package typings
package gapiDotClientDotStorageLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_ProjectNumber extends js.Object {
  /** The project number. */
  var projectNumber: js.UndefOr[java.lang.String] = js.undefined
  /** The team. */
  var team: js.UndefOr[java.lang.String] = js.undefined
}

object Anon_ProjectNumber {
  @scala.inline
  def apply(projectNumber: java.lang.String = null, team: java.lang.String = null): Anon_ProjectNumber = {
    val __obj = js.Dynamic.literal()
    if (projectNumber != null) __obj.updateDynamic("projectNumber")(projectNumber)
    if (team != null) __obj.updateDynamic("team")(team)
    __obj.asInstanceOf[Anon_ProjectNumber]
  }
}

