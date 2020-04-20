package typings.dingtalkRobotSender

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonActionURL extends js.Object {
  var actionURL: String
  var title: String
}

object AnonActionURL {
  @scala.inline
  def apply(actionURL: String, title: String): AnonActionURL = {
    val __obj = js.Dynamic.literal(actionURL = actionURL.asInstanceOf[js.Any], title = title.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonActionURL]
  }
}

