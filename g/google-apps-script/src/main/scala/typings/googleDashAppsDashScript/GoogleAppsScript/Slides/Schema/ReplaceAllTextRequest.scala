package typings.googleDashAppsDashScript.GoogleAppsScript.Slides.Schema

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ReplaceAllTextRequest extends js.Object {
  var containsText: js.UndefOr[SubstringMatchCriteria] = js.undefined
  var pageObjectIds: js.UndefOr[js.Array[String]] = js.undefined
  var replaceText: js.UndefOr[String] = js.undefined
}

object ReplaceAllTextRequest {
  @scala.inline
  def apply(
    containsText: SubstringMatchCriteria = null,
    pageObjectIds: js.Array[String] = null,
    replaceText: String = null
  ): ReplaceAllTextRequest = {
    val __obj = js.Dynamic.literal()
    if (containsText != null) __obj.updateDynamic("containsText")(containsText)
    if (pageObjectIds != null) __obj.updateDynamic("pageObjectIds")(pageObjectIds)
    if (replaceText != null) __obj.updateDynamic("replaceText")(replaceText)
    __obj.asInstanceOf[ReplaceAllTextRequest]
  }
}

