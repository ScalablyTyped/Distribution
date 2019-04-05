package typings
package googleDashAppsDashScriptLib.GoogleAppsScriptNs.DocsNs.SchemaNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Footnote extends js.Object {
  var content: js.UndefOr[js.Array[StructuralElement]] = js.undefined
  var footnoteId: js.UndefOr[java.lang.String] = js.undefined
}

object Footnote {
  @scala.inline
  def apply(content: js.Array[StructuralElement] = null, footnoteId: java.lang.String = null): Footnote = {
    val __obj = js.Dynamic.literal()
    if (content != null) __obj.updateDynamic("content")(content)
    if (footnoteId != null) __obj.updateDynamic("footnoteId")(footnoteId)
    __obj.asInstanceOf[Footnote]
  }
}

