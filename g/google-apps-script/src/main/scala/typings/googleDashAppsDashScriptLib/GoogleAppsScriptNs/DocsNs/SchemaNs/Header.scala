package typings
package googleDashAppsDashScriptLib.GoogleAppsScriptNs.DocsNs.SchemaNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Header extends js.Object {
  var content: js.UndefOr[js.Array[StructuralElement]] = js.undefined
  var headerId: js.UndefOr[java.lang.String] = js.undefined
}

object Header {
  @scala.inline
  def apply(content: js.Array[StructuralElement] = null, headerId: java.lang.String = null): Header = {
    val __obj = js.Dynamic.literal()
    if (content != null) __obj.updateDynamic("content")(content)
    if (headerId != null) __obj.updateDynamic("headerId")(headerId)
    __obj.asInstanceOf[Header]
  }
}

