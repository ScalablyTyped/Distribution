package typings.dingtalkRobotSender.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ActionURL extends js.Object {
  var actionURL: String
  var title: String
}

object ActionURL {
  @scala.inline
  def apply(actionURL: String, title: String): ActionURL = {
    val __obj = js.Dynamic.literal(actionURL = actionURL.asInstanceOf[js.Any], title = title.asInstanceOf[js.Any])
    __obj.asInstanceOf[ActionURL]
  }
}

