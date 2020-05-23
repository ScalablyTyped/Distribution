package typings.dingtalkRobotSender.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AtMobiles extends js.Object {
  var atMobiles: js.Array[String]
  var isAtAll: Boolean
}

object AtMobiles {
  @scala.inline
  def apply(atMobiles: js.Array[String], isAtAll: Boolean): AtMobiles = {
    val __obj = js.Dynamic.literal(atMobiles = atMobiles.asInstanceOf[js.Any], isAtAll = isAtAll.asInstanceOf[js.Any])
    __obj.asInstanceOf[AtMobiles]
  }
}

