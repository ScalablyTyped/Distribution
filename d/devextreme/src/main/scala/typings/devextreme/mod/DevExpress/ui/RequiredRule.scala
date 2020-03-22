package typings.devextreme.mod.DevExpress.ui

import typings.devextreme.devextremeStrings.async
import typings.devextreme.devextremeStrings.compare
import typings.devextreme.devextremeStrings.custom
import typings.devextreme.devextremeStrings.email
import typings.devextreme.devextremeStrings.numeric
import typings.devextreme.devextremeStrings.pattern
import typings.devextreme.devextremeStrings.range
import typings.devextreme.devextremeStrings.required
import typings.devextreme.devextremeStrings.stringLength
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RequiredRule extends js.Object {
  /** Specifies the message that is shown if the rule is broken. */
  var message: js.UndefOr[String] = js.undefined
  /** Indicates whether to remove the Space characters from the validated value. */
  var trim: js.UndefOr[Boolean] = js.undefined
  /** Specifies the rule type. Set it to "required" to use the RequiredRule. */
  var `type`: js.UndefOr[
    required | numeric | range | stringLength | custom | compare | pattern | email | async
  ] = js.undefined
}

object RequiredRule {
  @scala.inline
  def apply(
    message: String = null,
    trim: js.UndefOr[Boolean] = js.undefined,
    `type`: required | numeric | range | stringLength | custom | compare | pattern | email | async = null
  ): RequiredRule = {
    val __obj = js.Dynamic.literal()
    if (message != null) __obj.updateDynamic("message")(message.asInstanceOf[js.Any])
    if (!js.isUndefined(trim)) __obj.updateDynamic("trim")(trim.asInstanceOf[js.Any])
    if (`type` != null) __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[RequiredRule]
  }
}

