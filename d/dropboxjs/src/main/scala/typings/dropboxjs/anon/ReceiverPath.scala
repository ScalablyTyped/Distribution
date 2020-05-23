package typings.dropboxjs.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ReceiverPath extends js.Object {
  var receiverPath: String
  var scope: String
}

object ReceiverPath {
  @scala.inline
  def apply(receiverPath: String, scope: String): ReceiverPath = {
    val __obj = js.Dynamic.literal(receiverPath = receiverPath.asInstanceOf[js.Any], scope = scope.asInstanceOf[js.Any])
    __obj.asInstanceOf[ReceiverPath]
  }
}

