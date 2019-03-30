package typings
package googleDashAppsDashScriptLib.GoogleAppsScriptNs.DriveUnderscoreV2Ns.SchemaNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ParentReference extends js.Object {
  var id: js.UndefOr[java.lang.String] = js.undefined
  var isRoot: js.UndefOr[scala.Boolean] = js.undefined
  var kind: js.UndefOr[java.lang.String] = js.undefined
  var parentLink: js.UndefOr[java.lang.String] = js.undefined
  var selfLink: js.UndefOr[java.lang.String] = js.undefined
}

object ParentReference {
  @scala.inline
  def apply(
    id: java.lang.String = null,
    isRoot: js.UndefOr[scala.Boolean] = js.undefined,
    kind: java.lang.String = null,
    parentLink: java.lang.String = null,
    selfLink: java.lang.String = null
  ): ParentReference = {
    val __obj = js.Dynamic.literal()
    if (id != null) __obj.updateDynamic("id")(id)
    if (!js.isUndefined(isRoot)) __obj.updateDynamic("isRoot")(isRoot)
    if (kind != null) __obj.updateDynamic("kind")(kind)
    if (parentLink != null) __obj.updateDynamic("parentLink")(parentLink)
    if (selfLink != null) __obj.updateDynamic("selfLink")(selfLink)
    __obj.asInstanceOf[ParentReference]
  }
}

