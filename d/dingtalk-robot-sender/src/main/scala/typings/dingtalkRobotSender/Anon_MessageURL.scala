package typings.dingtalkRobotSender

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_MessageURL extends js.Object {
  var messageURL: String
  var picURL: String
  var title: String
}

object Anon_MessageURL {
  @scala.inline
  def apply(messageURL: String, picURL: String, title: String): Anon_MessageURL = {
    val __obj = js.Dynamic.literal(messageURL = messageURL.asInstanceOf[js.Any], picURL = picURL.asInstanceOf[js.Any], title = title.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[Anon_MessageURL]
  }
}

