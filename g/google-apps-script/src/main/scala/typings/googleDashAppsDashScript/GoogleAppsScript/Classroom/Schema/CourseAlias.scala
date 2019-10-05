package typings.googleDashAppsDashScript.GoogleAppsScript.Classroom.Schema

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CourseAlias extends js.Object {
  var alias: js.UndefOr[String] = js.undefined
}

object CourseAlias {
  @scala.inline
  def apply(alias: String = null): CourseAlias = {
    val __obj = js.Dynamic.literal()
    if (alias != null) __obj.updateDynamic("alias")(alias)
    __obj.asInstanceOf[CourseAlias]
  }
}

