package typings.googleapis.buildSrcApisTagmanagerV2Mod.tagmanager_v2

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * The result of reverting a tag in a workspace.
  */
@js.native
trait Schema$RevertTagResponse extends js.Object {
  /**
    * Tag as it appears in the latest container version since the last
    * workspace synchronization operation. If no tag is present, that means the
    * tag was deleted in the latest container version.
    */
  var tag: js.UndefOr[Schema$Tag] = js.native
}

object Schema$RevertTagResponse {
  @scala.inline
  def apply(tag: Schema$Tag = null): Schema$RevertTagResponse = {
    val __obj = js.Dynamic.literal()
    if (tag != null) __obj.updateDynamic("tag")(tag.asInstanceOf[js.Any])
    __obj.asInstanceOf[Schema$RevertTagResponse]
  }
}

