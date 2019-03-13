package typings
package dingtalkDashRobotDashSenderLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_MessageURL extends js.Object {
  var messageURL: java.lang.String
  var picURL: java.lang.String
  var title: java.lang.String
}

trait Anon_MessageUrl extends js.Object {
  var messageUrl: java.lang.String
  var picUrl: java.lang.String
  var text: java.lang.String
  var title: java.lang.String
}

object Anon_MessageURL {
  @scala.inline
  def apply(messageURL: java.lang.String, picURL: java.lang.String, title: java.lang.String): Anon_MessageURL = {
    val __obj = js.Dynamic.literal(messageURL = messageURL, picURL = picURL, title = title)
  
    __obj.asInstanceOf[Anon_MessageURL]
  }
}

object Anon_MessageUrl {
  @scala.inline
  def apply(
    messageUrl: java.lang.String,
    picUrl: java.lang.String,
    text: java.lang.String,
    title: java.lang.String
  ): Anon_MessageUrl = {
    val __obj = js.Dynamic.literal(messageUrl = messageUrl, picUrl = picUrl, text = text, title = title)
  
    __obj.asInstanceOf[Anon_MessageUrl]
  }
}

