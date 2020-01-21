package typings.googleAppsScript.GoogleAppsScript.YouTube.Schema

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait VideoProjectDetails extends js.Object {
  var tags: js.UndefOr[js.Array[String]] = js.undefined
}

object VideoProjectDetails {
  @scala.inline
  def apply(tags: js.Array[String] = null): VideoProjectDetails = {
    val __obj = js.Dynamic.literal()
    if (tags != null) __obj.updateDynamic("tags")(tags.asInstanceOf[js.Any])
    __obj.asInstanceOf[VideoProjectDetails]
  }
}

