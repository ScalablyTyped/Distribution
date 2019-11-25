package typings.gapiDotClientDotTagmanager.gapi.client.tagmanager

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RevertTagResponse extends js.Object {
  /**
    * Tag as it appears in the latest container version since the last workspace synchronization operation. If no tag is present, that means the tag was
    * deleted in the latest container version.
    */
  var tag: js.UndefOr[Tag] = js.undefined
}

object RevertTagResponse {
  @scala.inline
  def apply(tag: Tag = null): RevertTagResponse = {
    val __obj = js.Dynamic.literal()
    if (tag != null) __obj.updateDynamic("tag")(tag.asInstanceOf[js.Any])
    __obj.asInstanceOf[RevertTagResponse]
  }
}

