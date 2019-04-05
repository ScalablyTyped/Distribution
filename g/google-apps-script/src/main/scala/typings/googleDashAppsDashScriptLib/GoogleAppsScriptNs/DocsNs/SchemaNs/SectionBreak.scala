package typings
package googleDashAppsDashScriptLib.GoogleAppsScriptNs.DocsNs.SchemaNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SectionBreak extends js.Object {
  var sectionStyle: js.UndefOr[SectionStyle] = js.undefined
  var suggestedDeletionIds: js.UndefOr[js.Array[java.lang.String]] = js.undefined
  var suggestedInsertionIds: js.UndefOr[js.Array[java.lang.String]] = js.undefined
}

object SectionBreak {
  @scala.inline
  def apply(
    sectionStyle: SectionStyle = null,
    suggestedDeletionIds: js.Array[java.lang.String] = null,
    suggestedInsertionIds: js.Array[java.lang.String] = null
  ): SectionBreak = {
    val __obj = js.Dynamic.literal()
    if (sectionStyle != null) __obj.updateDynamic("sectionStyle")(sectionStyle)
    if (suggestedDeletionIds != null) __obj.updateDynamic("suggestedDeletionIds")(suggestedDeletionIds)
    if (suggestedInsertionIds != null) __obj.updateDynamic("suggestedInsertionIds")(suggestedInsertionIds)
    __obj.asInstanceOf[SectionBreak]
  }
}

