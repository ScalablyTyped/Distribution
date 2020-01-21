package typings.dingtalkRobotSender

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonAtMobilesIsAtAll extends js.Object {
  var atMobiles: js.Array[String]
  var isAtAll: Boolean
  var text: String
  var title: String
}

object AnonAtMobilesIsAtAll {
  @scala.inline
  def apply(atMobiles: js.Array[String], isAtAll: Boolean, text: String, title: String): AnonAtMobilesIsAtAll = {
    val __obj = js.Dynamic.literal(atMobiles = atMobiles.asInstanceOf[js.Any], isAtAll = isAtAll.asInstanceOf[js.Any], text = text.asInstanceOf[js.Any], title = title.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AnonAtMobilesIsAtAll]
  }
}

