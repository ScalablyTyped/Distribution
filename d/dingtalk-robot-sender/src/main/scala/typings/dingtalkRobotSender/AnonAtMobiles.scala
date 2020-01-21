package typings.dingtalkRobotSender

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonAtMobiles extends js.Object {
  var atMobiles: js.Array[String]
  var isAtAll: Boolean
}

object AnonAtMobiles {
  @scala.inline
  def apply(atMobiles: js.Array[String], isAtAll: Boolean): AnonAtMobiles = {
    val __obj = js.Dynamic.literal(atMobiles = atMobiles.asInstanceOf[js.Any], isAtAll = isAtAll.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AnonAtMobiles]
  }
}

