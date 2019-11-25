package typings.atGoogleDashCloudTasks.atGoogleDashCloudTasksMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Binding extends js.Object {
  var condition: Expr
  var members: js.Array[String]
  var role: String
}

object Binding {
  @scala.inline
  def apply(condition: Expr, members: js.Array[String], role: String): Binding = {
    val __obj = js.Dynamic.literal(condition = condition.asInstanceOf[js.Any], members = members.asInstanceOf[js.Any], role = role.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[Binding]
  }
}

