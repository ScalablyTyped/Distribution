package typings.dingtalkRobotSender.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait MessageURL_ extends js.Object {
  var messageURL: String
  var picURL: String
  var title: String
}

object MessageURL_ {
  @scala.inline
  def apply(messageURL: String, picURL: String, title: String): MessageURL_ = {
    val __obj = js.Dynamic.literal(messageURL = messageURL.asInstanceOf[js.Any], picURL = picURL.asInstanceOf[js.Any], title = title.asInstanceOf[js.Any])
    __obj.asInstanceOf[MessageURL_]
  }
}

