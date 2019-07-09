package typings
package expressDashValidatorLib.srcOptionsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IsISSNOptions extends js.Object {
  var case_sensitive: js.UndefOr[scala.Boolean] = js.undefined
  var require_hyphen: js.UndefOr[scala.Boolean] = js.undefined
}

object IsISSNOptions {
  @scala.inline
  def apply(
    case_sensitive: js.UndefOr[scala.Boolean] = js.undefined,
    require_hyphen: js.UndefOr[scala.Boolean] = js.undefined
  ): IsISSNOptions = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(case_sensitive)) __obj.updateDynamic("case_sensitive")(case_sensitive)
    if (!js.isUndefined(require_hyphen)) __obj.updateDynamic("require_hyphen")(require_hyphen)
    __obj.asInstanceOf[IsISSNOptions]
  }
}

