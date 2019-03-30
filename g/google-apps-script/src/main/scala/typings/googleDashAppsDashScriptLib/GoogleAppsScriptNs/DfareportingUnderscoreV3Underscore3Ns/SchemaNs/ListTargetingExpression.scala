package typings
package googleDashAppsDashScriptLib.GoogleAppsScriptNs.DfareportingUnderscoreV3Underscore3Ns.SchemaNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ListTargetingExpression extends js.Object {
  var expression: js.UndefOr[java.lang.String] = js.undefined
}

object ListTargetingExpression {
  @scala.inline
  def apply(expression: java.lang.String = null): ListTargetingExpression = {
    val __obj = js.Dynamic.literal()
    if (expression != null) __obj.updateDynamic("expression")(expression)
    __obj.asInstanceOf[ListTargetingExpression]
  }
}

