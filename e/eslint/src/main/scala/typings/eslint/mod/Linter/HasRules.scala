package typings.eslint.mod.Linter

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait HasRules extends js.Object {
  var rules: js.UndefOr[js.Object] = js.undefined
}

object HasRules {
  @scala.inline
  def apply(rules: js.Object = null): HasRules = {
    val __obj = js.Dynamic.literal()
    if (rules != null) __obj.updateDynamic("rules")(rules.asInstanceOf[js.Any])
    __obj.asInstanceOf[HasRules]
  }
}

