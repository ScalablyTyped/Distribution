package typings
package googleDashAppsDashScriptLib.GoogleAppsScriptNs.DfareportingNs.SchemaNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait FloodlightActivityDynamicTag extends js.Object {
  var id: js.UndefOr[java.lang.String] = js.undefined
  var name: js.UndefOr[java.lang.String] = js.undefined
  var tag: js.UndefOr[java.lang.String] = js.undefined
}

object FloodlightActivityDynamicTag {
  @scala.inline
  def apply(id: java.lang.String = null, name: java.lang.String = null, tag: java.lang.String = null): FloodlightActivityDynamicTag = {
    val __obj = js.Dynamic.literal()
    if (id != null) __obj.updateDynamic("id")(id)
    if (name != null) __obj.updateDynamic("name")(name)
    if (tag != null) __obj.updateDynamic("tag")(tag)
    __obj.asInstanceOf[FloodlightActivityDynamicTag]
  }
}

