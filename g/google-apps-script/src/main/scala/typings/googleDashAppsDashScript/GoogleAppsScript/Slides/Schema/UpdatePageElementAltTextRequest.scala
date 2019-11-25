package typings.googleDashAppsDashScript.GoogleAppsScript.Slides.Schema

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait UpdatePageElementAltTextRequest extends js.Object {
  var description: js.UndefOr[String] = js.undefined
  var objectId: js.UndefOr[String] = js.undefined
  var title: js.UndefOr[String] = js.undefined
}

object UpdatePageElementAltTextRequest {
  @scala.inline
  def apply(description: String = null, objectId: String = null, title: String = null): UpdatePageElementAltTextRequest = {
    val __obj = js.Dynamic.literal()
    if (description != null) __obj.updateDynamic("description")(description.asInstanceOf[js.Any])
    if (objectId != null) __obj.updateDynamic("objectId")(objectId.asInstanceOf[js.Any])
    if (title != null) __obj.updateDynamic("title")(title.asInstanceOf[js.Any])
    __obj.asInstanceOf[UpdatePageElementAltTextRequest]
  }
}

