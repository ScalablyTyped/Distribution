package typings.gapiDotClientDotTagmanager.gapi.client.tagmanager

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait MergeConflict extends js.Object {
  /**
    * The base version entity (since the latest sync operation) that has conflicting changes compared to the workspace. If this field is missing, it means
    * the workspace entity is deleted from the base version.
    */
  var entityInBaseVersion: js.UndefOr[Entity] = js.undefined
  /**
    * The workspace entity that has conflicting changes compared to the base version. If an entity is deleted in a workspace, it will still appear with a
    * deleted change status.
    */
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

