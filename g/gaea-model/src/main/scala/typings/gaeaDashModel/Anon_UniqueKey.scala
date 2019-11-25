package typings.gaeaDashModel

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_UniqueKey extends js.Object {
  // 唯一 key，用来实例化组件
  var uniqueKey: String
}

object Anon_UniqueKey {
  @scala.inline
  def apply(uniqueKey: String): Anon_UniqueKey = {
    val __obj = js.Dynamic.literal(uniqueKey = uniqueKey.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[Anon_UniqueKey]
  }
}

