package typings.gapiClientTagmanager.gapi.client.tagmanager

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait MergeConflict extends js.Object {
  /**
    * The base version entity (since the latest sync operation) that has conflicting changes compared to the workspace. If this field is missing, it means
    * the workspace entity is deleted from the base version.
    */
  var entityInBaseVersion: js.UndefOr[Entity] = js.native
  /**
    * The workspace entity that has conflicting changes compared to the base version. If an entity is deleted in a workspace, it will still appear with a
    * deleted change status.
    */
  var entityInWorkspace: js.UndefOr[Entity] = js.native
}

object MergeConflict {
  @scala.inline
  def apply(): MergeConflict = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[MergeConflict]
  }
  @scala.inline
  implicit class MergeConflictOps[Self <: MergeConflict] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setEntityInBaseVersion(value: Entity): Self = this.set("entityInBaseVersion", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteEntityInBaseVersion: Self = this.set("entityInBaseVersion", js.undefined)
    @scala.inline
    def setEntityInWorkspace(value: Entity): Self = this.set("entityInWorkspace", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteEntityInWorkspace: Self = this.set("entityInWorkspace", js.undefined)
  }
  
}

