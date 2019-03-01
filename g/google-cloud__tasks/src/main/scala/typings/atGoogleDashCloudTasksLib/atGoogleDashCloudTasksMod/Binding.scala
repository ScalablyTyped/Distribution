package typings
package atGoogleDashCloudTasksLib.atGoogleDashCloudTasksMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Binding extends js.Object {
  var condition: Expr
  var members: js.Array[java.lang.String]
  var role: java.lang.String
}

object Binding {
  @scala.inline
  def apply(condition: Expr, members: js.Array[java.lang.String], role: java.lang.String): Binding = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("condition")(condition)
    __obj.updateDynamic("members")(members)
    __obj.updateDynamic("role")(role)
    __obj.asInstanceOf[Binding]
  }
}

