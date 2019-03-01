package typings
package gapiDotClientDotStorageLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Rule extends js.Object {
  /** A lifecycle management rule, which is made of an action to take and the condition(s) under which the action will be taken. */
  var rule: js.UndefOr[js.Array[Anon_Action]] = js.undefined
}

object Anon_Rule {
  @scala.inline
  def apply(rule: js.Array[Anon_Action] = null): Anon_Rule = {
    val __obj = js.Dynamic.literal()
    if (rule != null) __obj.updateDynamic("rule")(rule)
    __obj.asInstanceOf[Anon_Rule]
  }
}

