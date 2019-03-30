package typings
package googleDashAppsDashScriptLib.GoogleAppsScriptNs.DocsUnderscoreV1Ns.SchemaNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SubstringMatchCriteria extends js.Object {
  var matchCase: js.UndefOr[scala.Boolean] = js.undefined
  var text: js.UndefOr[java.lang.String] = js.undefined
}

object SubstringMatchCriteria {
  @scala.inline
  def apply(matchCase: js.UndefOr[scala.Boolean] = js.undefined, text: java.lang.String = null): SubstringMatchCriteria = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(matchCase)) __obj.updateDynamic("matchCase")(matchCase)
    if (text != null) __obj.updateDynamic("text")(text)
    __obj.asInstanceOf[SubstringMatchCriteria]
  }
}

