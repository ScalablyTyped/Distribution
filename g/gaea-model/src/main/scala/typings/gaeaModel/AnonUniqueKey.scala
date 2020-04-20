package typings.gaeaModel

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonUniqueKey extends js.Object {
  // 唯一 key，用来实例化组件
  var uniqueKey: String
}

object AnonUniqueKey {
  @scala.inline
  def apply(uniqueKey: String): AnonUniqueKey = {
    val __obj = js.Dynamic.literal(uniqueKey = uniqueKey.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonUniqueKey]
  }
}

