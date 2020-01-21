package typings.googleAppsScript.GoogleAppsScript.TagManager.Schema

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RevertVariableResponse extends js.Object {
  var variable: js.UndefOr[Variable] = js.undefined
}

object RevertVariableResponse {
  @scala.inline
  def apply(variable: Variable = null): RevertVariableResponse = {
    val __obj = js.Dynamic.literal()
    if (variable != null) __obj.updateDynamic("variable")(variable.asInstanceOf[js.Any])
    __obj.asInstanceOf[RevertVariableResponse]
  }
}

