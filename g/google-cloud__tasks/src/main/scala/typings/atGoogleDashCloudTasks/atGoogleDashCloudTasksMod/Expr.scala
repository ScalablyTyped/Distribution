package typings.atGoogleDashCloudTasks.atGoogleDashCloudTasksMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Expr extends js.Object {
  var description: String
  var expression: String
  var location: String
  var title: String
}

object Expr {
  @scala.inline
  def apply(description: String, expression: String, location: String, title: String): Expr = {
    val __obj = js.Dynamic.literal(description = description, expression = expression, location = location, title = title)
  
    __obj.asInstanceOf[Expr]
  }
}

