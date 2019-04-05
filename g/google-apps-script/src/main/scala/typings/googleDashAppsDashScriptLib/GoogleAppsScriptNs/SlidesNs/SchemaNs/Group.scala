package typings
package googleDashAppsDashScriptLib.GoogleAppsScriptNs.SlidesNs.SchemaNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Group extends js.Object {
  var children: js.UndefOr[js.Array[PageElement]] = js.undefined
}

object Group {
  @scala.inline
  def apply(children: js.Array[PageElement] = null): Group = {
    val __obj = js.Dynamic.literal()
    if (children != null) __obj.updateDynamic("children")(children)
    __obj.asInstanceOf[Group]
  }
}

