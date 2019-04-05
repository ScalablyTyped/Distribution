package typings
package googleDashAppsDashScriptLib.GoogleAppsScriptNs.TagManagerNs.SchemaNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait MergeConflict extends js.Object {
  var entityInBaseVersion: js.UndefOr[Entity] = js.undefined
  var entityInWorkspace: js.UndefOr[Entity] = js.undefined
}

object MergeConflict {
  @scala.inline
  def apply(entityInBaseVersion: Entity = null, entityInWorkspace: Entity = null): MergeConflict = {
    val __obj = js.Dynamic.literal()
    if (entityInBaseVersion != null) __obj.updateDynamic("entityInBaseVersion")(entityInBaseVersion)
    if (entityInWorkspace != null) __obj.updateDynamic("entityInWorkspace")(entityInWorkspace)
    __obj.asInstanceOf[MergeConflict]
  }
}

