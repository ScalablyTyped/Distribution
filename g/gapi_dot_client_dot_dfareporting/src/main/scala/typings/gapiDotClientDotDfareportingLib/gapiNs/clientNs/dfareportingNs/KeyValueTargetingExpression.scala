package typings
package gapiDotClientDotDfareportingLib.gapiNs.clientNs.dfareportingNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait KeyValueTargetingExpression extends js.Object {
  /** Keyword expression being targeted by the ad. */
  var expression: js.UndefOr[java.lang.String] = js.undefined
}

object KeyValueTargetingExpression {
  @scala.inline
  def apply(expression: java.lang.String = null): KeyValueTargetingExpression = {
    val __obj = js.Dynamic.literal()
    if (expression != null) __obj.updateDynamic("expression")(expression)
    __obj.asInstanceOf[KeyValueTargetingExpression]
  }
}

