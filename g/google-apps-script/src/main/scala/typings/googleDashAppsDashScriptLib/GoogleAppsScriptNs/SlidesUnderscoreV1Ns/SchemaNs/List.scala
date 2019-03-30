package typings
package googleDashAppsDashScriptLib.GoogleAppsScriptNs.SlidesUnderscoreV1Ns.SchemaNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait List extends js.Object {
  var listId: js.UndefOr[java.lang.String] = js.undefined
  var nestingLevel: js.UndefOr[js.Object] = js.undefined
}

object List {
  @scala.inline
  def apply(listId: java.lang.String = null, nestingLevel: js.Object = null): List = {
    val __obj = js.Dynamic.literal()
    if (listId != null) __obj.updateDynamic("listId")(listId)
    if (nestingLevel != null) __obj.updateDynamic("nestingLevel")(nestingLevel)
    __obj.asInstanceOf[List]
  }
}

