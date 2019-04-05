package typings
package googleDashAppsDashScriptLib.GoogleAppsScriptNs.SlidesNs.SchemaNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ReplaceAllTextRequest extends js.Object {
  var containsText: js.UndefOr[SubstringMatchCriteria] = js.undefined
  var pageObjectIds: js.UndefOr[js.Array[java.lang.String]] = js.undefined
  var replaceText: js.UndefOr[java.lang.String] = js.undefined
}

object ReplaceAllTextRequest {
  @scala.inline
  def apply(
    containsText: SubstringMatchCriteria = null,
    pageObjectIds: js.Array[java.lang.String] = null,
    replaceText: java.lang.String = null
  ): ReplaceAllTextRequest = {
    val __obj = js.Dynamic.literal()
    if (containsText != null) __obj.updateDynamic("containsText")(containsText)
    if (pageObjectIds != null) __obj.updateDynamic("pageObjectIds")(pageObjectIds)
    if (replaceText != null) __obj.updateDynamic("replaceText")(replaceText)
    __obj.asInstanceOf[ReplaceAllTextRequest]
  }
}

