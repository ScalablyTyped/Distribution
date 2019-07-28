package typings.googleDashAppsDashScript.GoogleAppsScriptNs.DocsNs.SchemaNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SubstringMatchCriteria extends js.Object {
  var matchCase: js.UndefOr[Boolean] = js.undefined
  var text: js.UndefOr[String] = js.undefined
}

object SubstringMatchCriteria {
  @scala.inline
  def apply(matchCase: js.UndefOr[Boolean] = js.undefined, text: String = null): SubstringMatchCriteria = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(matchCase)) __obj.updateDynamic("matchCase")(matchCase)
    if (text != null) __obj.updateDynamic("text")(text)
    __obj.asInstanceOf[SubstringMatchCriteria]
  }
}

