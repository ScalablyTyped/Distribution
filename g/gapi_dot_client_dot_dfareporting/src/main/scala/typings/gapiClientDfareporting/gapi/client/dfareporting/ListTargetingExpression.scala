package typings.gapiClientDfareporting.gapi.client.dfareporting

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ListTargetingExpression extends js.Object {
  /** Expression describing which lists are being targeted by the ad. */
  var expression: js.UndefOr[String] = js.undefined
}

object ListTargetingExpression {
  @scala.inline
  def apply(expression: String = null): ListTargetingExpression = {
    val __obj = js.Dynamic.literal()
    if (expression != null) __obj.updateDynamic("expression")(expression.asInstanceOf[js.Any])
    __obj.asInstanceOf[ListTargetingExpression]
  }
}

