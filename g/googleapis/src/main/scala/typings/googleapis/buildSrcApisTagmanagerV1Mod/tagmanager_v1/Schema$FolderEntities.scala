package typings.googleapis.buildSrcApisTagmanagerV1Mod.tagmanager_v1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Represents a Google Tag Manager Folder&#39;s contents.
  */
@js.native
trait Schema$FolderEntities extends js.Object {
  /**
    * The list of tags inside the folder.
    */
  var tag: js.UndefOr[js.Array[Schema$Tag]] = js.native
  /**
    * The list of triggers inside the folder.
    */
  var trigger: js.UndefOr[js.Array[Schema$Trigger]] = js.native
  /**
    * The list of variables inside the folder.
    */
  var variable: js.UndefOr[js.Array[Schema$Variable]] = js.native
}

object Schema$FolderEntities {
  @scala.inline
  def apply(
    tag: js.Array[Schema$Tag] = null,
    trigger: js.Array[Schema$Trigger] = null,
    variable: js.Array[Schema$Variable] = null
  ): Schema$FolderEntities = {
    val __obj = js.Dynamic.literal()
    if (tag != null) __obj.updateDynamic("tag")(tag.asInstanceOf[js.Any])
    if (trigger != null) __obj.updateDynamic("trigger")(trigger.asInstanceOf[js.Any])
    if (variable != null) __obj.updateDynamic("variable")(variable.asInstanceOf[js.Any])
    __obj.asInstanceOf[Schema$FolderEntities]
  }
}

