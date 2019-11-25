package typings.googleDashAppsDashScript.GoogleAppsScript.DriveActivity.Schema

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Copy extends js.Object {
  var originalObject: js.UndefOr[TargetReference] = js.undefined
}

object Copy {
  @scala.inline
  def apply(originalObject: TargetReference = null): Copy = {
    val __obj = js.Dynamic.literal()
    if (originalObject != null) __obj.updateDynamic("originalObject")(originalObject.asInstanceOf[js.Any])
    __obj.asInstanceOf[Copy]
  }
}

