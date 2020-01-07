package typings.googleapis.buildSrcApisTagmanagerV2Mod.tagmanager_v2

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Represents a merge conflict.
  */
@js.native
trait Schema$MergeConflict extends js.Object {
  /**
    * The base version entity (since the latest sync operation) that has
    * conflicting changes compared to the workspace. If this field is missing,
    * it means the workspace entity is deleted from the base version.
    */
  var entityInBaseVersion: js.UndefOr[Schema$Entity] = js.native
  /**
    * The workspace entity that has conflicting changes compared to the base
    * version. If an entity is deleted in a workspace, it will still appear
    * with a deleted change status.
    */
  var entityInWorkspace: js.UndefOr[Schema$Entity] = js.native
}

object Schema$MergeConflict {
  @scala.inline
  def apply(entityInBaseVersion: Schema$Entity = null, entityInWorkspace: Schema$Entity = null): Schema$MergeConflict = {
    val __obj = js.Dynamic.literal()
    if (entityInBaseVersion != null) __obj.updateDynamic("entityInBaseVersion")(entityInBaseVersion.asInstanceOf[js.Any])
    if (entityInWorkspace != null) __obj.updateDynamic("entityInWorkspace")(entityInWorkspace.asInstanceOf[js.Any])
    __obj.asInstanceOf[Schema$MergeConflict]
  }
}

