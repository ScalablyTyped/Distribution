package typings.gapiClientTagmanager.gapi.client.tagmanager

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Entity extends js.Object {
  /** Represents how the entity has been changed in the workspace. */
  var changeStatus: js.UndefOr[String] = js.undefined
  /** The Folder being represented by the entity. */
  var folder: js.UndefOr[Folder] = js.undefined
  /** The tag being represented by the entity. */
  var tag: js.UndefOr[Tag] = js.undefined
  /** The trigger being represented by the entity. */
  var trigger: js.UndefOr[Trigger] = js.undefined
  /** The variable being represented by the entity. */
  var variable: js.UndefOr[Variable] = js.undefined
}

object Entity {
  @scala.inline
  def apply(
    changeStatus: String = null,
    folder: Folder = null,
    tag: Tag = null,
    trigger: Trigger = null,
    variable: Variable = null
  ): Entity = {
    val __obj = js.Dynamic.literal()
    if (changeStatus != null) __obj.updateDynamic("changeStatus")(changeStatus.asInstanceOf[js.Any])
    if (folder != null) __obj.updateDynamic("folder")(folder.asInstanceOf[js.Any])
    if (tag != null) __obj.updateDynamic("tag")(tag.asInstanceOf[js.Any])
    if (trigger != null) __obj.updateDynamic("trigger")(trigger.asInstanceOf[js.Any])
    if (variable != null) __obj.updateDynamic("variable")(variable.asInstanceOf[js.Any])
    __obj.asInstanceOf[Entity]
  }
}

