package typings.gapiDotClientDotClassroom.gapiNs.clientNs.classroomNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CourseAlias extends js.Object {
  /**
    * Alias string. The format of the string indicates the desired alias scoping.
    *
    * &#42; `d:<name>` indicates a domain-scoped alias.
    * Example: `d:math_101`
    * &#42; `p:<name>` indicates a project-scoped alias.
    * Example: `p:abc123`
    *
    * This field has a maximum length of 256 characters.
    */
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

