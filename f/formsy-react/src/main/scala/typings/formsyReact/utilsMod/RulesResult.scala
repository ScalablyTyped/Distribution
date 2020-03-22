package typings.formsyReact.utilsMod

import typings.formsyReact.interfacesMod.ValidationError
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RulesResult extends js.Object {
  var errors: js.Array[ValidationError]
  var failed: js.Array[String]
  var success: js.Array[String]
}

object RulesResult {
  @scala.inline
  def apply(errors: js.Array[ValidationError], failed: js.Array[String], success: js.Array[String]): RulesResult = {
    val __obj = js.Dynamic.literal(errors = errors.asInstanceOf[js.Any], failed = failed.asInstanceOf[js.Any], success = success.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[RulesResult]
  }
}

