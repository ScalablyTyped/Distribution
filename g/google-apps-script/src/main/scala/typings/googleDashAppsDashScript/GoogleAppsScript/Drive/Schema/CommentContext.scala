package typings.googleDashAppsDashScript.GoogleAppsScript.Drive.Schema

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CommentContext extends js.Object {
  var `type`: js.UndefOr[String] = js.undefined
  var value: js.UndefOr[String] = js.undefined
}

object CommentContext {
  @scala.inline
  def apply(`type`: String = null, value: String = null): CommentContext = {
    val __obj = js.Dynamic.literal()
    if (`type` != null) __obj.updateDynamic("type")(`type`)
    if (value != null) __obj.updateDynamic("value")(value)
    __obj.asInstanceOf[CommentContext]
  }
}

