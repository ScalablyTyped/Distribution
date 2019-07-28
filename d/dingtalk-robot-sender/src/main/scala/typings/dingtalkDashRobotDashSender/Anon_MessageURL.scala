package typings.dingtalkDashRobotDashSender

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_MessageURL extends js.Object {
  var messageURL: String
  var picURL: String
  var title: String
}

trait Anon_MessageUrl extends js.Object {
  var messageUrl: String
  var picUrl: String
  var text: String
  var title: String
}

object Anon_MessageURL {
  @scala.inline
  def apply(messageURL: String, picURL: String, title: String): Anon_MessageURL = {
    val __obj = js.Dynamic.literal(messageURL = messageURL, picURL = picURL, title = title)
  
    __obj.asInstanceOf[Anon_MessageURL]
  }
}

object Anon_MessageUrl {
  @scala.inline
  def apply(messageUrl: String, picUrl: String, text: String, title: String): Anon_MessageUrl = {
    val __obj = js.Dynamic.literal(messageUrl = messageUrl, picUrl = picUrl, text = text, title = title)
  
    __obj.asInstanceOf[Anon_MessageUrl]
  }
}

