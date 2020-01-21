package typings.gapiClientDfareporting.gapi.client.dfareporting

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait KeyValueTargetingExpression extends js.Object {
  /** Keyword expression being targeted by the ad. */
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

