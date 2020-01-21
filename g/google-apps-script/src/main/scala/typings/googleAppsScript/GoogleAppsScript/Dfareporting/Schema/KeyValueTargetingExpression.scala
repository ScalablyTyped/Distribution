package typings.googleAppsScript.GoogleAppsScript.Dfareporting.Schema

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait KeyValueTargetingExpression extends js.Object {
  var expression: js.UndefOr[String] = js.undefined
}

object KeyValueTargetingExpression {
  @scala.inline
  def apply(expression: String = null): KeyValueTargetingExpression = {
    val __obj = js.Dynamic.literal()
    if (expression != null) __obj.updateDynamic("expression")(expression.asInstanceOf[js.Any])
    __obj.asInstanceOf[KeyValueTargetingExpression]
  }
}

