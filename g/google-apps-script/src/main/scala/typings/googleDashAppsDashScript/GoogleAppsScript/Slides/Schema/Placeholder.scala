package typings.googleDashAppsDashScript.GoogleAppsScript.Slides.Schema

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Placeholder extends js.Object {
  var index: js.UndefOr[Double] = js.undefined
  var parentObjectId: js.UndefOr[String] = js.undefined
  var `type`: js.UndefOr[String] = js.undefined
}

object Placeholder {
  @scala.inline
  def apply(index: Int | Double = null, parentObjectId: String = null, `type`: String = null): Placeholder = {
    val __obj = js.Dynamic.literal()
    if (index != null) __obj.updateDynamic("index")(index.asInstanceOf[js.Any])
    if (parentObjectId != null) __obj.updateDynamic("parentObjectId")(parentObjectId)
    if (`type` != null) __obj.updateDynamic("type")(`type`)
    __obj.asInstanceOf[Placeholder]
  }
}

