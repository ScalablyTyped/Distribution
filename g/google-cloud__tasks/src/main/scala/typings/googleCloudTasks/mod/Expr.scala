package typings.googleCloudTasks.mod

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
    val __obj = js.Dynamic.literal(description = description.asInstanceOf[js.Any], expression = expression.asInstanceOf[js.Any], location = location.asInstanceOf[js.Any], title = title.asInstanceOf[js.Any])
    __obj.asInstanceOf[Expr]
  }
}

