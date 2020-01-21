package typings.googleAppsScript.GoogleAppsScript.TagManager.Schema

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Condition extends js.Object {
  var parameter: js.UndefOr[js.Array[Parameter]] = js.undefined
  var `type`: js.UndefOr[String] = js.undefined
}

object Condition {
  @scala.inline
  def apply(parameter: js.Array[Parameter] = null, `type`: String = null): Condition = {
    val __obj = js.Dynamic.literal()
    if (parameter != null) __obj.updateDynamic("parameter")(parameter.asInstanceOf[js.Any])
    if (`type` != null) __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Condition]
  }
}

