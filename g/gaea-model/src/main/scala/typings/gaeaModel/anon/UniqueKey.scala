package typings.gaeaModel.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait UniqueKey extends js.Object {
  // 唯一 key，用来实例化组件
  var uniqueKey: String
}

object UniqueKey {
  @scala.inline
  def apply(uniqueKey: String): UniqueKey = {
    val __obj = js.Dynamic.literal(uniqueKey = uniqueKey.asInstanceOf[js.Any])
    __obj.asInstanceOf[UniqueKey]
  }
}

