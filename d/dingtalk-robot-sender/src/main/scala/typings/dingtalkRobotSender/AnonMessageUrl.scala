package typings.dingtalkRobotSender

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonMessageUrl extends js.Object {
  var messageUrl: String
  var picUrl: String
  var text: String
  var title: String
}

object AnonMessageUrl {
  @scala.inline
  def apply(messageUrl: String, picUrl: String, text: String, title: String): AnonMessageUrl = {
    val __obj = js.Dynamic.literal(messageUrl = messageUrl.asInstanceOf[js.Any], picUrl = picUrl.asInstanceOf[js.Any], text = text.asInstanceOf[js.Any], title = title.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AnonMessageUrl]
  }
}

