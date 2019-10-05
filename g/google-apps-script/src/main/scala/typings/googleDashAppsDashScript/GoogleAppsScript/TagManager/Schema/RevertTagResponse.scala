package typings.googleDashAppsDashScript.GoogleAppsScript.TagManager.Schema

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RevertTagResponse extends js.Object {
  var tag: js.UndefOr[Tag] = js.undefined
}

object RevertTagResponse {
  @scala.inline
  def apply(tag: Tag = null): RevertTagResponse = {
    val __obj = js.Dynamic.literal()
    if (tag != null) __obj.updateDynamic("tag")(tag)
    __obj.asInstanceOf[RevertTagResponse]
  }
}

