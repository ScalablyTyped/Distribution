package typings
package googleDashAppsDashScriptLib.GoogleAppsScriptNs.AppsactivityUnderscoreV1Ns.SchemaNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Parent extends js.Object {
  var id: js.UndefOr[java.lang.String] = js.undefined
  var isRoot: js.UndefOr[scala.Boolean] = js.undefined
  var title: js.UndefOr[java.lang.String] = js.undefined
}

object Parent {
  @scala.inline
  def apply(
    id: java.lang.String = null,
    isRoot: js.UndefOr[scala.Boolean] = js.undefined,
    title: java.lang.String = null
  ): Parent = {
    val __obj = js.Dynamic.literal()
    if (id != null) __obj.updateDynamic("id")(id)
    if (!js.isUndefined(isRoot)) __obj.updateDynamic("isRoot")(isRoot)
    if (title != null) __obj.updateDynamic("title")(title)
    __obj.asInstanceOf[Parent]
  }
}

