package typings.googleCloudStorage.iamMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Expr extends js.Object {
  var description: js.UndefOr[String] = js.undefined
  var expression: String
  var title: js.UndefOr[String] = js.undefined
}

object Expr {
  @scala.inline
  def apply(expression: String, description: String = null, title: String = null): Expr = {
    val __obj = js.Dynamic.literal(expression = expression.asInstanceOf[js.Any])
    if (description != null) __obj.updateDynamic("description")(description.asInstanceOf[js.Any])
    if (title != null) __obj.updateDynamic("title")(title.asInstanceOf[js.Any])
    __obj.asInstanceOf[Expr]
  }
}

